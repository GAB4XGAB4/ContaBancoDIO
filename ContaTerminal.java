import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Menu inicial de cadastro
        System.out.println("""
                        Banco DIO
             
                Olá, Bem-vindo a sessão de cadastro.
               
                Para acessar, digite o número da conta:____
                """);
        int numero = scanner.nextInt();

        // Cadastro da agência
            System.out.println("\nDigite a agência:___");
            String agencia = scanner.next();

        //Cadastro do dígito especial
            System.out.println("\nDigite o dígito especial:_");
            int digito_especial = scanner.nextInt();

        // Cadastro do nome
            System.out.println("\nPara prosseguir, digite seu nome: ");
            String nome_cliente = scanner.next();

        //Alimentação do Saldo
            System.out.println("\nInsira um valor de saldo em sua conta para completar o cadastro:");
            float saldo = scanner.nextFloat();

        System.out.printf("\nOlá,"+ nome_cliente + " obrigado por criar uma conta em nosso banco." +
                "\nsua agência é " + agencia +"-%d. \nConta: %d. \nSaldo %2f já está disponível para saque",digito_especial,numero,saldo);
    }
}

//TODO: Usar a Classe Scanner
//TODO: Exibir mensagens via print.
//TODO: Obter valores via scanner e exibir no terminal


