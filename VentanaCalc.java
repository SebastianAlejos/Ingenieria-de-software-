import javax.swing.JFrame;

public class VentanaCalc extends JFrame {
    public VentanaCalc() {
        super("Calculadora binaria");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new PanelCalc());
        this.pack();
        this.setVisible(true);
    }
    public static void main(String[] args) {
        VentanaCalc ventana=new VentanaCalc();
    }
}