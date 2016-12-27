import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        private JButton botaoMais;
        private JButton botaoMenos;
        private JButton botaoVezes;
        private JButton botaoDividi;
        private JTextField campo;

    public Calculadora() {
        this.setTitle("Exemplo");
        this.setBounds(0,0,250,250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        botaoMais = new JButton();
        botaoMais.setText("Soma");
        botaoMais.setBounds(30,60,60,30);
        this.add(botaoMais);

        botaoMenos = new JButton();
        botaoMenos.setText("Subtrai");
        botaoMenos.setBounds(30,60,60,30);
        this.add(botaoMenos);

        botaoVezes = new JButton();
        botaoVezes.setText("Multiplica");
        botaoVezes.setBounds(30,60,60,30);
        this.add(botaoVezes);

        botaoDividi = new JButton();
        botaoDividi.setText("Dividir");
        botaoDividi.setBounds(30,60,60,30);
        this.add(botaoDividi);

        campo = new JTextField();
        campo.setBounds(40,50,100,30);
        this.add(campo);

        botaoMais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        }
    }

}

