import java.util.Scanner;

public class bancoxyz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        String menu = ("""
                    Digite uma opção (1, 2, 3 ou 4 para sair)
                    1 - Visualização de saldo
                    2 - Enviar valor
                    3 - Receber valor
                    4 - Sair
                    """);

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}