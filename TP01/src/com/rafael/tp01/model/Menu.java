package com.rafael.tp01.model;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int opcao;
		int qntCadastros;
		String busca2 = null;
		String edicao;

		List<Cliente> listaClientes = new ArrayList<>();
		List<Produto> listaProdutos = new ArrayList<>();

		System.out.println("-----------CONTROLE DE CLIENTES E PRODUTOS-----------");
		System.out.println("Opcoes de MENU:");
		System.out.println(" 1 - Cadastrar novo cliente");
		System.out.println(" 2 - Buscar cliente");
		System.out.println(" 3 - Cadastrar novo produto");
		System.out.println(" 4 - Buscar produto");
		System.out.println(" 5 - Cadastrar venda");
		System.out.println(" 6 - Mostrar lista de estoque");
		System.out.println(" 7 - Sair");

		do {
			System.out.print("Digite o número da opcao: ");
			opcao = s.nextInt();

			Stream<Cliente> clienteBusca;

			switch (opcao) {
			
			case 1:
				
				System.out.println("Quantos clientes deseja cadastrar?");
				qntCadastros = s.nextInt();

				for (int i = 0; i < qntCadastros; i++) {

					Cliente cliente = new Cliente(); // chama a classe Cliente;
					
					s.nextLine();
					System.out.printf("Nome: \n");
					cliente.setNome(s.nextLine());
					System.out.printf("Endereço: \n");
					cliente.setEndereco(s.nextLine());
					System.out.printf("Telefone: \n");
					cliente.setTelefone(s.nextLine());
					
					// adiciona cliente a listaClientes
					listaClientes.add(cliente);
				}
				break;

			case 2: // faz busca na classe Cliente;
				System.out.println("Digite o NOME do CLIENTE que deseja BUSCAR: ");
				s.nextLine();
				busca2 = s.nextLine();

				for (Cliente cliente : listaClientes) {
					if (cliente.getNome().equals(busca2)) {

						System.out.println("Nome: " + cliente.getNome());
						System.out.println("Endereco: " + cliente.getEndereco());
						System.out.println("Telefone: " + cliente.getTelefone());

						// edita cliente
						System.out.println("Deseja alterar alguma informação?(S/N)");
						edicao = s.nextLine();

						if (edicao.equals("S")) {
							System.out.println("Nome: " + cliente.getNome());
							cliente.setNome(s.nextLine());
							System.out.println("Endereço: " + cliente.getEndereco());
							cliente.setEndereco(s.nextLine());
							System.out.println("Telefone: " + cliente.getTelefone());
							cliente.setTelefone(s.nextLine());
						}
						break;

					} else
						System.out.println("Cliente não cadastrado!");
					break;

				}

				break;

			case 3:
				System.out.println("Quantos produtos deseja cadastrar?");
				qntCadastros = s.nextInt();

				for (int i = 0; i < qntCadastros; i++) {

					Produto produto = new Produto(); // chama a classe Produto;

					s.nextLine();
					System.out.println("Nome: ");
					produto.setNome(s.nextLine());
					System.out.println("Descricao: ");
					produto.setDescricao(s.nextLine());
					System.out.println("Valor: ");
					produto.setValor(s.nextDouble());
					System.out.println("Porcentagem de lucro: ");
					produto.setPercentLucro(s.nextDouble());
					System.out.println("Estoque: ");
					produto.setEstoque(s.nextInt());

					// adiciona produto a listaProdutos
					listaProdutos.add(produto);
				}
				break;

			case 4: // faz busca em listaProdutos;
				
				System.out.println("Digite o NOME do PRODUTO que deseja BUSCAR: ");
				s.nextLine();
				busca2 = s.nextLine();

				for (Produto produto : listaProdutos) {
					if (produto.getNome().equals(busca2)) {

						System.out.println("Nome: " + produto.getNome());
						System.out.println("Descricao: " + produto.getDescricao());
						System.out.println("Valor: " + produto.getValor());
						System.out.println("Porcentagem de lucro: " + produto.getPercentLucro());
						System.out.println("Estoque: " + produto.getEstoque());

						// edita cliente
						System.out.println("Deseja alterar alguma informação?(S/N)");
						edicao = s.next();
						if (edicao.equals("S")) {
							System.out.println("Nome: " + produto.getNome());
							produto.setNome(s.next());
							System.out.println("Descrição: " + produto.getDescricao());
							produto.setDescricao(s.next());
							System.out.println("Valor: " + produto.getValor());
							produto.setValor(s.nextDouble());
							System.out.println("Porcentagem de lucro: " + produto.getPercentLucro());
							produto.setPercentLucro(s.nextDouble());
							System.out.println("Estoque: " + produto.getEstoque());
							produto.setEstoque(s.nextInt());
							break;
						}

					} else
						System.out.println("Produto não cadastrado!");
				}
				break;

			case 5: // chama classe Venda;
				break;
			case 6:
				for (Produto produto : listaProdutos) {
					System.out.println("Produto: " + produto.getNome() + "Estoque:" + produto.getEstoque());
					
				}
				break;
			case 7:
				break;
			default: 
				System.out.println("Digite uma opção válida (1-7): ");
			}

//		public void editaCliente(Cliente cliente) {
//							
//			System.out.println("Nome: %s",cliente.getNome());
//			cliente.setNome(s.next());
//			System.out.println("Endereço: %s",cliente.getEndereco());
//			cliente.setEndereco(s.next());
//			System.out.println("Telefone: %s",cliente.getTelefone());
//			cliente.setTelefone(s.next());
//		}
			// TODO Auto-generated method stub

		} while (opcao > 0 && opcao < 7);

	}
}
