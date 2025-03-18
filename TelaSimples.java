import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaSimples {

    public static void main(String[] args) {
        // Criando uma nova instância da janela (JFrame)
        JFrame janela = new JFrame("Calculadora");

        JPanel painel = new JPanel();

        // Definindo o comportamento de fechamento da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um rótulo (JLabel) e adicionando texto
        JLabel rotulo = new JLabel("Digite um numero inteiro:");
        janela.add(rotulo); // Adicionando o rótulo à janela
        JTextField num_inteiro = new JTextField(15);
        painel.add(num_inteiro);
        JTextField num_inteiro2 = new JTextField(15);
        painel.add(num_inteiro2);
        JLabel resultadoLabel = new JLabel("Resultado: ");
        painel.add(resultadoLabel);

        JButton botao = new JButton("+");
        painel.add(botao);
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = num_inteiro.getText();
                String num2 = num_inteiro2.getText();

                try{
                    double numero1 = Double.parseDouble(num);
                    double numero2 = Double.parseDouble(num2);
                    double soma=numero1+numero2;
                    resultadoLabel.setText("Resultado: " + soma);

                }catch(NumberFormatException ex){
                    resultadoLabel.setText("Resultado invalido");
                }
            }

        });
        //Botão -
        JButton botao_menos = new JButton("-");
        painel.add(botao_menos);
        botao_menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = num_inteiro.getText();
                String num2 = num_inteiro2.getText();

                try{
                    double numero1 = Double.parseDouble(num);
                    double numero2 = Double.parseDouble(num2);
                    double subtracao=numero1-numero2;
                    resultadoLabel.setText("Resultado: " + subtracao);

                }catch(NumberFormatException ex){
                    resultadoLabel.setText("Resultado invalido");
                }
            }

        });

        painel.setLayout(new java.awt.FlowLayout());

        janela.add(painel);
        // Definindo o tamanho da janela
        janela.setSize(400, 300);

        // Tornando a janela visível
        janela.setVisible(true);
    }
}
