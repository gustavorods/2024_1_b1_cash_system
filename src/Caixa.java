import javax.swing.*;

public class Caixa {
    // Atributo
    private double saldo;

    // Construção
    // Inicializando com atributo vazio
    public Caixa() {
        this(0);
    }

    // Inicializando com parâmetros
    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    // Getter e setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos da função
    public void entrar() {
        // Recebe um valor, e converte de strign para double, dps atribui esse valor a variavel valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada: "));
        /* Soma o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro
        para o método setSaldo ()
        */
        this.setSaldo(this.getSaldo() + valor);
    }

    public void retirar() {
        // Recebe um valor, e converte de strign para double, dps atribui esse valor a variavel valor
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da retirada: "));
        /* Subtrai o conteúdo do atributo saldo com a variável valor e passa o resultado por parametro
        para o método setSaldo ()
        */
        this.setSaldo(this.getSaldo() - valor);
    }
}
