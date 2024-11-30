package com.mycompany.minhacasaminhavida.cozinha;

import quarto.quarto;
import com.mycompany.minhacasaminhavida.quintal;
import com.mycompany.minhacasaminhavida.BackgroundPanel;
import com.mycompany.minhacasaminhavida.Minhacasaminhavida;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class cozinha extends JFrame implements ActionListener {
    
    JButton bFogão, bPia, bGeladeira, bIrProQuarto, bIrProQuintal, bMinhaCasa;
    
    public cozinha(){
        setLayout(new FlowLayout());
        setSize(800,700);
        setTitle("Cozinha");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\cozinha.jpg"));
        setVisible(true);
        
        bFogão = new JButton("Fogão");
        bFogão.addActionListener(this);
        add(bFogão);
        
        bPia = new JButton("Pia");
        bPia.addActionListener(this);
        add(bPia);
        
        bGeladeira = new JButton("Geladeira");
        bGeladeira.addActionListener(this);
        add(bGeladeira);
        
        bIrProQuarto = new JButton("Ir pro quarto");
        bIrProQuarto.addActionListener(this);
        add(bIrProQuarto);
        
        bIrProQuintal = new JButton("Ir pro quintal");
        bIrProQuintal.addActionListener(this);
        add(bIrProQuintal);
        
        bMinhaCasa = new JButton("Ir pra sala");
        bMinhaCasa.addActionListener(this);
        add(bMinhaCasa);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bPia){
            new pia();
        } else if(e.getSource() == bGeladeira){
            new geladeira();
        } else if(e.getSource() == bFogão){
            new fogão();
        } else if(e.getSource() == bIrProQuarto){
            new quarto();
            ((JFrame) SwingUtilities.getWindowAncestor(bIrProQuarto)).dispose();
        }else if(e.getSource() == bIrProQuintal){
            new quintal();
            ((JFrame) SwingUtilities.getWindowAncestor(bIrProQuintal)).dispose();
        }else if(e.getSource() == bMinhaCasa){
            new Minhacasaminhavida();
            ((JFrame) SwingUtilities.getWindowAncestor(bMinhaCasa)).dispose();
        }
    }
}
