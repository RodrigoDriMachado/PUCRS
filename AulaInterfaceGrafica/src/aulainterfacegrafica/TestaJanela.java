/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulainterfacegrafica;

/**
 *
 * @author 12280437
 */
import javax.swing.*;

public class TestaJanela extends JFrame {

    public TestaJanela() {
        super("Título da janela");
        this.setBounds(50, 100, 400, 150);//Seta posicao e tamanho
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel painelCustomizado = new JPanel(); // Cria contêiner
        for (int i = 1; i <= 6; i++) {
            painelCustomizado.add(new JButton("Aperte " + i));// Adiciona botão
        }
        this.setContentPane(painelCustomizado);
        this.setVisible(true); // Exibe a janela
    }

    public static void main(String[] args) {
        TestaJanela t = new TestaJanela();
    }
}
