import java.util.Scanner;

public class Main {
//Criei uma lista para cadastrar os clientes no banco, solicitando nome e cpf
    //assim que cria o cliente automaticamente ele gera a agencia e o numero da conta iniciando com saldo 0.0
    //após salvar os clientes na lista é possivel execultar uma consulta geral de todos os cliente
    //execultar um comanda para mostrar extrato, realizar depoistos, saque e transferencias

    public static void main(String[] args) {

        Banco listaClientes = new Banco();
        Scanner entrada = new Scanner(System.in);


        listaClientes.adicionarClienteCc("Bruno", "111.111.111-11");
        listaClientes.adicionarClienteCc("Jorge", "222.222.222-22");
        listaClientes.adicionarClientePoupanca("Eduarda", "333.333.333-33");
        listaClientes.adicionarClientePoupanca("Pedro", "444.444.444-44");
        listaClientes.adicionarClientePoupanca("Nala", "555.555.555-55");
        listaClientes.adicionarClienteCc("Cleo", "666.666.666-66");


        listaClientes.exibirClientes();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("Digite o nome da conta: ");
        listaClientes.extrato(entrada.next());

        System.out.println("Digite o valor para depositar e em seguida digita a conta destino:  ");
        listaClientes.depositar(entrada.nextDouble(), entrada.nextInt());

        System.out.println("Digite o valor para sacar e em seguida digita a conta que irá debitar:  ");
        listaClientes.sacar(entrada.nextDouble(), entrada.nextInt());

        System.out.println("Digite o nome da conta para exibir o extrato: ");
        listaClientes.extrato(entrada.next());

        System.out.println("Digite o valor para transferencia, em seguida digite o seu numero da conta e em seguida o numero da conta de destino ");
        listaClientes.transferir(entrada.nextDouble(), entrada.nextInt(), entrada.nextInt());

        System.out.println("Digite o nome da conta para exibir o extrato: ");
        listaClientes.extrato(entrada.next());

        System.out.println("Digite o nome da conta para exibir o extrato: ");
        listaClientes.extrato(entrada.next());


    }


}

