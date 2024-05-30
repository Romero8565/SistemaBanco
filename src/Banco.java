import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Banco {


    private int numeroConta = 1;
    private ContaCorrente cc = new ContaCorrente();
    private ContaPoupanca poupanca = new ContaPoupanca();

    private List<Cliente> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarClienteCc(String nome, String cpf) {
        contas.add(new Cliente(nome, cpf, cc, numeroConta));
        numeroConta++;


    }

    public void adicionarClientePoupanca(String nome, String cpf) {
        contas.add(new Cliente(nome, cpf, poupanca, numeroConta));
        numeroConta++;


    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public List<Cliente> getContas() {
        return contas;
    }

    public void setContas(List<Cliente> contas) {
        this.contas = contas;
    }


    public void exibirClientes() {
        if (!contas.isEmpty()) {
            out.println(contas);
        } else {
            out.println("O conjunto está vazio!");
        }
    }

    public List<Cliente> extrato(String nome) {
        List<Cliente> extrato = new ArrayList<>();
        if (!contas.isEmpty()) {
            for (Cliente l : contas) {
                if (l.getNome().startsWith(nome)) {
                    extrato.add(l);
                    System.out.println(extrato);

                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        return extrato;
    }

    public Cliente depositar(double valor, int numero) {
        for (Cliente l : contas) {
            if (l.getNumero() == numero) {

                double novoSaldo = l.getSaldo() + valor;
                l.setSaldo(novoSaldo);


                return l;

            }
        }

        return null;
    }

    public Cliente sacar(double valor, int numero) {
        for (Cliente l : contas) {
            if (l.getNumero() == numero) {

                double novoSaldo = l.getSaldo() - valor;
                l.setSaldo(novoSaldo);

                return l;

            }
        }

        return null;
    }

    public Cliente transferir(double valor, int numeroSuaConta, int numeroTransferir) {

        for (Cliente l : contas) {
            if (l.getNumero() == numeroSuaConta) {

                double novoSaldo = l.getSaldo() - valor;
                l.setSaldo(novoSaldo);
                break;


            }

        }
        for (Cliente l : contas) {
            if (l.getNumero() == numeroTransferir) {
                double novoSaldo = l.getSaldo() + valor;
                l.setSaldo(novoSaldo);
                break;
            }
        }


        return null;
    }


}













