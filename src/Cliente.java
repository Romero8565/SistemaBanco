public class Cliente extends Conta {

    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf, Conta conta, int numeroConta) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "\n" + "NOME = " + nome +
                " -- CPF = " + cpf +
                " -- AGENCIA = " + agencia +
                " -- NUMERO = " + numero +
                " -- SALDO = " + saldo;
    }
}
