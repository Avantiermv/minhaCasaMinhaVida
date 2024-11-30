package com.mycompany.minhacasaminhavida;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class sobre extends JFrame {
    
    JLabel lSobreProjeto;
    
    public sobre(){
        setSize(900, 900);
        setTitle("Sobre o Projeto");
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        lSobreProjeto = new JLabel("<html><div style='text-align: justify;'>Esse aplicativo consiste em uma 'casa' com funções que te levam para os comôdos da casa e com certas funções! Os botões Cozinha, Quarto, Porta da Rua,Vender casa e Quintal, levam o usuário para certos comôdos da casa e nesses comôdos ele pode intergir com eles.</div></html>");
        lSobreProjeto.setHorizontalAlignment(SwingConstants.CENTER);
        
        gbc.gridx = 0; 
        gbc.gridy = 0; 
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0; 
        gbc.anchor = GridBagConstraints.CENTER; 
        gbc.fill = GridBagConstraints.BOTH;
        
        panel.add(lSobreProjeto, gbc);
        add(panel);
        
        setVisible(true);
    }  
}
