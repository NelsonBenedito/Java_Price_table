import java.util.Arrays;

import javax.swing.UIManager;

/* Propósito:
 * Aplicação que auxilia o  Sr.Ninguem a:
 * 1 |Consultar o preço de um produto, informando seu código;
 * 2 |Alterar o preço de um produto, informando seu código;
 * 3 |Pesquisar o código do produto que possui maior preço;
 * Autor: Nelson Benedito José Maria
 */

public class PriceTable {

    public static void main(String[] args) {
        UIManager.put("swing.boldMetal", Boolean.FALSE);

        /* Vetores */
        int[] vetCod = { 32, 42, 55, 79, 87, 148, 243 };
        double[] vetPreco = { 1.10, 16.50, 2.00, 23.70, 15.20, 3.80, 17.20 };
        double mod = 0, preco = 0;
        int select = 0, maior = 0, cod1 = 0, cod2 = 0;
        String itens = "Produto ";

        /* Menu de seleções */
        while (select != 4) {
            select = InOut.leInt("1 | Consultar o preço de um produto, informando seu código" + "\n"
                    + "2 | Alterar o preço de um produto, informando seu código" + "\n"
                    + "3 | Pesquisar o código do produto que possui maior preço" + "\n"
                    + "4 | Finalizar o programa.");
            if (select == 1) {
                cod1 = InOut.leIntTab("Digite um código de um produto", "Códigos disponíveis \n"
                        + "------------------" + "\n" + Arrays.toString(vetCod) + "\n" + Arrays.toString(vetPreco));
                /* Produtos */
                switch (cod1) {
                    case 32:
                        preco = vetPreco[0];
                        InOut.MsgDeInformacao("ITEN 32", "Iten 32 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 42:
                        preco = vetPreco[1];
                        InOut.MsgDeInformacao("ITEN 42", "Iten 42 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 55:
                        preco = vetPreco[2];
                        InOut.MsgDeInformacao("ITEN 55", "Iten 55 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 79:
                        preco = vetPreco[3];
                        InOut.MsgDeInformacao("ITEN 79", "Iten 79 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 87:
                        preco = vetPreco[4];
                        InOut.MsgDeInformacao("ITEN 87", "Iten 87 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 148:
                        preco = vetPreco[5];
                        InOut.MsgDeInformacao("ITEN 148", "Iten 148 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    case 243:
                        preco = vetPreco[6];
                        InOut.MsgDeInformacao("ITEN 243", "Iten 243 - R$" + String.format("%.2f", preco));
                        cod1 = 0;
                        break;

                    default:
                        if (cod1 != vetCod[cod1]) {
                            InOut.MsgDeErro("ERR0RxCod1", "Valor inserido inválido");
                        } else if (cod1 == 0) {
                            break;
                        }
                }
                /* Modificacao Produtos */
            } else if (select == 2) {
                cod2 = InOut.leInt(
                        "<html><b>Digite o código do produto a ser alterado</b></html> " + "\n"
                                + "PRODUTOS | " + "PREÇO(R$)" + "\n"
                                + itens + vetCod[0] + " | R$" + String.format("%.2f", vetPreco[0]) + "\n"
                                + itens + vetCod[1] + " | R$" + String.format("%.2f", vetPreco[1]) + "\n"
                                + itens + vetCod[2] + " | R$" + String.format("%.2f", vetPreco[2]) + "\n"
                                + itens + vetCod[3] + " | R$" + String.format("%.2f", vetPreco[3]) + "\n"
                                + itens + vetCod[4] + " | R$" + String.format("%.2f", vetPreco[4]) + "\n"
                                + itens + vetCod[5] + " | R$" + String.format("%.2f", vetPreco[5]) + "\n"
                                + itens + vetCod[6] + " | R$" + String.format("%.2f", vetPreco[6]));

                mod = InOut.leDouble("Digite um novo valor para o produto" + cod2);
                switch (cod2) {
                    case 32:
                        vetPreco[0] = mod;
                        break;

                    case 42:
                        vetPreco[1] = mod;
                        break;

                    case 55:
                        vetPreco[2] = mod;
                        break;

                    case 79:
                        vetPreco[3] = mod;
                        break;

                    case 87:
                        vetPreco[4] = mod;
                        break;

                    case 148:
                        vetPreco[5] = mod;
                        break;

                    case 243:
                        vetPreco[6] = mod;
                        break;
                    default:
                        if (cod2 != vetCod[cod2]) {
                            InOut.MsgDeErro("ERR0RxCod2", "Valor inserido inválido");
                        } else if (cod2 == 0) {
                            break;
                        }
                }
            } else if (select == 3) {
                for (int i = 0; i < vetPreco.length; i++) {
                    if (vetPreco[i] > vetPreco[maior]) {
                        maior = i;
                    }
                }
                InOut.MsgDeInformacao("Mais caro",
                        "O produto mais caro custa R$" + String.format("%.2f", vetPreco[maior]));
            } else if (select == 4) {
                InOut.MsgSemIcone("Encerrando", "O programa foi encerrado.");
            }
        }
    }
}
