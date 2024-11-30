package com.mycompany.minhacasaminhavida;

import java.awt.event.*;
import javax.swing.*;

public class portadarua extends JFrame implements ActionListener{
    JButton bEntrarPraDentro;
    public portadarua(){
        setSize(1200, 600);
        setVisible(true);
        setTitle("Porta da rua");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\portadarua.png"));
    
        bEntrarPraDentro = new JButton("Entrar pra dentro");
        bEntrarPraDentro.addActionListener(this);
        add(bEntrarPraDentro);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bEntrarPraDentro){
            new Minhacasaminhavida();
            ((JFrame) SwingUtilities.getWindowAncestor(bEntrarPraDentro)).dispose();
        }
    }
}
