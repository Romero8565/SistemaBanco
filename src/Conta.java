import java.util.ArrayList;
import java.util.List;

public class Conta {

    private static final String agenciaPadrao = "0001";
    private static int sequencial = 1000;

    protected String agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = agenciaPadrao;
        this.numero = sequencial++;
        this.saldo = 0.0;
    }


    public static int getSequencial() {
        return sequencial;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
