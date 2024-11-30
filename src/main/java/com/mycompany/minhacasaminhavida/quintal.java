package com.mycompany.minhacasaminhavida;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class quintal extends JFrame implements ActionListener{
    
    JButton bVoltarPraDentro;
    
    public quintal(){
        setLayout(new FlowLayout());
        setSize(1400, 900);
        setTitle("Quintal");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\quintal.png"));
        setVisible(true);
        
        bVoltarPraDentro = new JButton("Voltar");
        bVoltarPraDentro.addActionListener(this);
        add(bVoltarPraDentro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == bVoltarPraDentro){
           new Minhacasaminhavida();
           ((JFrame) SwingUtilities.getWindowAncestor(bVoltarPraDentro)).dispose();
       }
    }
}
