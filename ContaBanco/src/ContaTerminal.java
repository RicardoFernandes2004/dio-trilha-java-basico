import com.dio.ContaBanco.Models.User;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Brasileiro!");
        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Agora digite sua agência: ");
        String agencia = sc.nextLine();
        System.out.print("Agora digite o numero da sua conta");
        int numeroConta = sc.nextInt();

        User cliente = new User(nomeCliente,numeroConta,agencia);
        System.out.println("Olá,"+cliente.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+cliente.getAgencia()+", conta "+cliente.getNumeroConta()+" e seu saldo "+"R$"+cliente.getSaldo()+" já está disponível para saque");
        System.out.println("Selecione uma opção: \n1. Pagar \n2. Receber \n3. Sair");
        int opcao = 0;
        while (opcao != 3){
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.print("Insira o valor a pagar: ");
                double valorAPagar= sc.nextDouble();
                cliente.pagar(valorAPagar);
            } else if (opcao == 2) {
                System.out.print("Insira o valor a receber: ");
                double valorAReceber = sc.nextDouble();
                cliente.receba(valorAReceber);
            } else if (opcao==3) {
                System.out.println("Saindo...");
                System.exit(0);
            }else {
                System.out.println("Opção invalida.");
            }
            System.out.println("Selecione uma opção: \n1. Pagar \n2. Receber \n3. Sair");
        }





    }

}
