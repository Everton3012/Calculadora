package br.com.Everton3012.calc.visao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setBackground(cor);
        setOpaque(true);
        setFont(new Font("Arial", Font.PLAIN, 25));
        setForeground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
