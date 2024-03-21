import javax.swing.JOptionPane; // Importanddo API do swing

public class Main {
    public static void main(String[] args) {
        Caixa cx1 = new Caixa(); // Criando uma instância da classe "caixa"
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Entrada " + "\n2 - Retirada \n3 - Consultar saldo \n0 - Sair "));
            switch (op) {
                case 1:
                    cx1.entrar();
                    break;
                case 2:
                    cx1.retirar();
                    break;
                case 3: // Mostra o saldo atual
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + cx1.getSaldo());
                    break;
                case 0: // Finalizando o sistema
                    JOptionPane.showMessageDialog(null, "Finalizando progama... ");
                    break;
                default: // Opções inválidas
                    JOptionPane.showMessageDialog(null, "Opção inválida ");
            }

        } while (op != 0);
    }
}