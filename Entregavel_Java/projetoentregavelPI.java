package Entregavel_Java;

import java.util.Scanner;
import java.util.Arrays;

public class projetoentregavelPI {
    public static void main(String[] args) {
        /* Para a realização deste entregável, utilizamos como base
        a página de formulário, criada em nosso site com fins de
        armazenamento de informações para realização de eventos. */

        int Opcao;
        int numBolos = 0, numDocinhos = 0, numSalgados = 0, numCarrinhos = 0;
        String informacoesAdicionais = "";
        //Requisito 1: Interação com o usuário.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeUsuario = entrada.next();

        System.out.println("Digite seu endereço de email: ");
        String email = entrada.next();

        System.out.println("Digite a quantidade de convidados para a festa: ");
        int qtdConvidados = entrada.nextInt();

        while ((qtdConvidados < 0) || (qtdConvidados > 200)) {
            System.out.println("Digite um número válido de convidados, sendo o mínimo 0 e máximo 200: ");
            qtdConvidados = entrada.nextInt();
        }

        System.out.println("Digite o tipo de item desejado: (1)Bolos, (2)Docinhos, (3) Salgados e Lanches ou (4) Carrinhos Gourmet:");
        Opcao = entrada.nextInt();
        switch (Opcao) {
            case 1 -> {
                System.out.println("Você escolheu (1) Bolo. Quantos bolos deseja adicionar ao pedido?");
                numBolos = entrada.nextInt();
            }
            case 2 -> {
                System.out.println("Você escolheu (2) Docinhos. Quantos docinhos deseja adicionar ao pedido?");
                numDocinhos = entrada.nextInt();
            }
            case 3 -> {
                System.out.println("Você escolheu (3) Salgados e Lanches. Quantos salgados deseja adicionar ao pedido?");
                numSalgados = entrada.nextInt();
            }
            case 4 -> {
                System.out.println("Você escolheu (4) Carrinhos Gourmet. Quantos carrinhos gourmet deseja adicionar ao pedido?");
                numCarrinhos = entrada.nextInt();
            }
        }

        System.out.println("Deseja adicionar mais itens ao carrinho? Digite 'Sim' caso afirmativo ou 'Não', caso contrário.");
        String Escolha = entrada.next();

        if (!Escolha.equalsIgnoreCase("Sim")) {
            System.out.println(" ");
        } else {
            while (Escolha.equalsIgnoreCase("Sim")) {
                System.out.println("Digite o tipo de item desejado: (1)Bolos, (2)Docinhos, (3) Salgados e Lanches ou (4) Carrinhos Gourmet:");
                Opcao = entrada.nextInt();
                switch (Opcao) {
                    case 1:
                        System.out.println("Você escolheu (1) Bolo. Quantos bolos deseja adicionar ao pedido?");
                        numBolos += entrada.nextInt();
                        break;

                    case 2:
                        System.out.println("Você escolheu (2) Docinhos. Quantos docinhos deseja adicionar ao pedido?");
                        numDocinhos += entrada.nextInt();
                        break;

                    case 3:
                        System.out.println("Você escolheu (3) Salgados e Lanches. Quantos salgados deseja adicionar ao pedido?");
                        numSalgados += entrada.nextInt();
                        break;

                    case 4:
                        System.out.println("Você escolheu (4) Carrinhos Gourmet. Quantos carrinhos gourmet deseja adicionar ao pedido?");
                        numCarrinhos += entrada.nextInt();
                        break;
                }
                System.out.println("Deseja adicionar mais itens ao carrinho? Digite 'Sim' caso afirmativo ou 'Não', caso contrário.");
                Escolha = entrada.next();
            }
        }
        String dataFesta = entrada.next();
        System.out.println("Deseja adicionar mais informações sobre o pedido? Digite 'Sim' ou 'Não': ");
        String opcaoInformacoesAdicionais = entrada.next();

        if (opcaoInformacoesAdicionais.equalsIgnoreCase("Sim")) {
            System.out.println("Digite sua mensagem: ");
            informacoesAdicionais = entrada.next();
            System.out.println("Vamos confirmar o seu pedido, confira se as informações estão corretamente inseridas: ");
        } else {
            System.out.println("Vamos confirmar o seu pedido, confira se as informações estão corretamente inseridas: ");
        }

        //Requisito 3: Utilização de vetores e matrizes:
        String[][] dadosCliente = new String[10][1];

        dadosCliente[0][0] = "Nome: " + nomeUsuario; //Nome do cliente.
        dadosCliente[1][0] = "Endereço de Email: " + email; //Email do cliente.
        dadosCliente[2][0] = "Número de Convidados: " + qtdConvidados; //Número de convidados estimado pelo do cliente.
        dadosCliente[3][0] = "Número de bolos do pedido: " + numBolos; //Número total de itens.
        dadosCliente[4][0] = "Número de docinhos do pedido: " + numDocinhos; //Número total de itens.
        dadosCliente[5][0] = "Número de salgados do pedido: " + numSalgados; //Número total de itens.
        dadosCliente[6][0] = "Número de carrinhos gourmet do pedido: " + numCarrinhos; //Número total de itens.
        dadosCliente[7][0] = "Data estimada da festa: " + dataFesta; //Data da Festa.
        dadosCliente[8][0] = "Observações? " + opcaoInformacoesAdicionais; //Observações?
        dadosCliente[9][0] = "Informações adicionais: " + informacoesAdicionais; //Informações adicionais

        System.out.println(Arrays.deepToString(dadosCliente));

        System.out.println("Deseja alterar algum item? Digite 'Sim' ou 'Não'.");
        Escolha = entrada.next();

        if(Escolha.equalsIgnoreCase("Sim")) {
            while (true) {
                System.out.println("Digite a opção a ser alterada segundo o código: (0) Nome, (1) Email, (2) Quantidade de convidados, (3) Quantidade de Bolos, (4) Quantidade de Docinhos, (5) Quantidade de Salgados, (6) Quantidade de Carrinhos Gourmet, (7) Data da Festa ou (8) Informações adicionais.");
                Opcao = entrada.nextInt();
                switch (Opcao) {
                    case 0:
                        System.out.println("Você escolheu (0) Nome. Digite novamente o seu nome: ");
                        nomeUsuario = entrada.next();
                        dadosCliente[0][0] = "Nome: " + nomeUsuario; //Nome do cliente.
                        break;

                    case 1:
                        System.out.println("Você escolheu (1) Email. Digite novamente o seu email: ");
                        email = entrada.next();
                        dadosCliente[1][0] = "Endereço de Email: " + email; //Email do cliente.
                        break;

                    case 2:
                        System.out.println("Você escolheu (2) Número de Convidados. Digite novamente o número de convidados (0-200): ");
                        qtdConvidados = entrada.nextInt();
                        dadosCliente[2][0] = "Número de Convidados: " + qtdConvidados; //Número de convidados estimado pelo do cliente.
                        break;

                    case 3:
                        System.out.println("Você escolheu (3) Quantidade de Bolos. Digite novamente a quantidade de bolos desejada: ");
                        numBolos = entrada.nextInt();
                        dadosCliente[3][0] = "Número de bolos do pedido: " + numBolos; //Número total de itens.
                        break;

                    case 4:
                        System.out.println("Você escolheu (4) Quantidade de Docinhos. Digite novamente a quantidade de Doces desejada: ");
                        numDocinhos = entrada.nextInt();
                        dadosCliente[4][0] = "Número de docinhos do pedido: " + numDocinhos; //Número total de itens.
                        break;

                    case 5:
                        System.out.println("Você escolheu (5) Quantidade de Salgados. Digite novamente a quantidade de Salgados desejada: ");
                        numSalgados = entrada.nextInt();
                        dadosCliente[5][0] = "Número de salgados do pedido: " + numSalgados; //Número total de itens.
                        break;

                    case 6:
                        System.out.println("Você escolheu (6) Quantidade de Carrinhos Gourmet. Digite novamente a quantidade de Carrinhos Gourmet desejada: ");
                        numCarrinhos = entrada.nextInt();
                        dadosCliente[6][0] = "Número de carrinhos gourmet do pedido: " + numCarrinhos; //Número total de itens.
                        break;

                    case 7:
                        System.out.println("Você escolheu (7) Data da Festa. Digite novamente a Data da Festa: ");
                        dataFesta = entrada.next();
                        dadosCliente[7][0] = "Data estimada da festa: " + dataFesta; //Data da Festa.
                        break;

                    case 8:
                        System.out.println("Você escolheu (8) Informações adicionais. Digite novamente as informações adicionais: ");
                        informacoesAdicionais = entrada.next();
                        dadosCliente[9][0] = "Informações adicionais: " + informacoesAdicionais; //Informações adicionais
                        break;
                }
                System.out.println("Deseja alterar mais algum item? Digite 'Sim' ou 'Não'.");
                Escolha = entrada.next();
            }
        }
        else {
            System.out.println("Dados enviados! Programa finalizado.");
        }
    }
}