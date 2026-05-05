import javax.swing.JOptionPane;

public class InterfazGUI implements Interfaz {

    @Override
    public void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public int pedirOpcion(String prompt, int max) {
        int opcion = 0;
        while (opcion < 1 || opcion > max) {
            String entrada = JOptionPane.showInputDialog(prompt + " [1-" + max + "]");
            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = 0;
            }
        }
        return opcion;
    }

    @Override
    public String pedirTexto(String prompt) {
        String entrada = "";
        while (entrada.equals("")) {
            entrada = JOptionPane.showInputDialog(prompt);
            if (entrada == null) {
                entrada = "";
            }
        }
        return entrada;
    }

    @Override
    public int pedirEnteroPositivo(String prompt) {
        int numero = 0;
        while (numero <= 0) {
            String entrada = JOptionPane.showInputDialog(prompt);
            try {
                numero = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                numero = 0;
            }
        }
        return numero;
    }
}
