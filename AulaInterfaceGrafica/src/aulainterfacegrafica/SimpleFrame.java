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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleFrame extends JFrame {

    private int cont;
    private JButton but;
    private JLabel texto;

    public SimpleFrame() {
        super("Aplicacao Swing");
        but = new JButton("Botão Swing");
        texto = new JLabel("Numero de cliques no botão: 0");
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cont++;
                texto.setText("Numero de cliques no botão: " + cont);
            }
        });
        JPanel painel = new JPanel();
        painel.add(but);
        painel.add(texto);
        this.setContentPane(painel);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleFrame sp = new SimpleFrame();
    }

}
