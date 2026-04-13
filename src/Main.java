import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta(1000,50);

        int opcao;
        do {
            System.out.println("\n --- Menu da Conta Bancária --- ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar um boleto");
            System.out.println("6. Verificar se está usando cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
                    break;
                case 2:
                    System.out.printf("Limite do cheque especial: R$ %.2f%n", conta.getLimiteChequeEspecial());
                    break;
                case 3:
                    System.out.print("Digite o valor a depositar: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.print("Digite o valor a sacar: R$" );
                    double sacar = scanner.nextDouble();
                    conta.sacar(sacar);
                    break;
                case 5:
                    System.out.print("Digite o valor do Boleto a pagar: R$");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                    break;
                case 6:
                    if (conta.estaChequeEspecial()){
                        System.out.println("A conta está usando cheque especial");
                    } else {
                        System.out.println("A conta não está usando o cheque especial");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
        scanner.close();
    }
}