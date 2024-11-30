package com.mycompany.minhacasaminhavida;

import com.mycompany.minhacasaminhavida.cozinha.cozinha;
import quarto.quarto;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

//COZINHA PRONTA
//PORTA DA RUA PRONTA
//QUINTAL PRONTO
//QUARTO PRONTO
//SOBRE PRONTO

public class Minhacasaminhavida extends JFrame implements ActionListener{
    
    JButton bCozinha, bQuarto, bQuintal, bSobre, bPortaDaRua, bVenderCasa;  
    
    public Minhacasaminhavida(){
        setSize(1420, 900);
        setLayout(new FlowLayout()); 
        setTitle("Minha casa, Minha vida - Mais que mudar de endereço, é mudar de vida");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\minhacasavidaminha.jpg"));
        setVisible(true);
        
        bCozinha = new JButton("Cozinha");
        bCozinha.addActionListener(this);
        add(bCozinha);
        
        bQuarto = new JButton("Quarto");
        bQuarto.addActionListener(this);
        add(bQuarto);
        
        bQuintal = new JButton("Quintal");
        bQuintal.addActionListener(this);
        add(bQuintal);
        
        bPortaDaRua = new JButton("Porta da Rua");
        bPortaDaRua.addActionListener(this);
        add(bPortaDaRua);
        
        bVenderCasa = new JButton("Vender casa");
        bVenderCasa.addActionListener(this);
        add(bVenderCasa);
        
        bSobre = new JButton("Sobre o projeto");
        bSobre.addActionListener(this);
        add(bSobre);
    }

    public static void main(String[] args) {
        Minhacasaminhavida app = new Minhacasaminhavida();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bCozinha){
            new cozinha();
            ((JFrame) SwingUtilities.getWindowAncestor(bCozinha)).dispose();
        }
        
        if(e.getSource() == bQuarto){
            new quarto();
            ((JFrame) SwingUtilities.getWindowAncestor(bQuarto)).dispose();
        }
        
         if(e.getSource() == bQuintal){
            new quintal();
            ((JFrame) SwingUtilities.getWindowAncestor(bQuintal)).dispose();
        }
         if(e.getSource() == bSobre){
            new sobre();
        }
         
         if(e.getSource() == bPortaDaRua){
             new portadarua();
             ((JFrame) SwingUtilities.getWindowAncestor(bPortaDaRua)).dispose();
         }
         
         if(e.getSource() == bVenderCasa){
             System.exit(0);
         }
    }
}