package com.mycompany.minhacasaminhavida.cozinha;

import com.mycompany.minhacasaminhavida.BackgroundPanel;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class fogão extends JFrame implements ActionListener{
    
    JLabel lInserirAlimento;
    JTextField tfAlimento;
    JButton bAssarAlimento, bCozinharAlimento, bDesligarFogão;
    JTable tabelaAlimentos;
    DefaultTableModel modeloTabela;
    
    public fogão(){
        setSize(1400, 900);
        setVisible(true);
        setTitle("Fogão");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\fogão.jpg"));
        
        lInserirAlimento = new JLabel("Insira um alimento: ");
        add(lInserirAlimento);
        tfAlimento = new JTextField(8);
        add(tfAlimento);
        lInserirAlimento.setForeground(Color.WHITE);
        
        bAssarAlimento = new JButton("Assar");
        bAssarAlimento.addActionListener(this);
        add(bAssarAlimento);
        
        bCozinharAlimento = new JButton("Cozinhar");
        bCozinharAlimento.addActionListener(this);
        add(bCozinharAlimento);
        
        bDesligarFogão = new JButton("Desligar Fogão");
        bDesligarFogão.addActionListener(this);
        add(bDesligarFogão);
        
         modeloTabela = new DefaultTableModel();
         modeloTabela.addColumn("Alimento"); 
         modeloTabela.addColumn("Status");
         modeloTabela.addColumn("comida2");
         
         tabelaAlimentos = new JTable(modeloTabela); 
         JScrollPane scrollPane = new JScrollPane(tabelaAlimentos); 
         add(scrollPane);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bAssarAlimento){
            String alimento = tfAlimento.getText();
            if(tfAlimento.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Sem Alimento pra Assar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                { modeloTabela.addRow(new Object[]{alimento, "Assando " + alimento});}
                tfAlimento.setText("");
            }   
        } else if(e.getSource() == bCozinharAlimento){
            String alimento = tfAlimento.getText();
            if(tfAlimento.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Sem Alimento pra cozinhar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                { modeloTabela.addRow(new Object[]{alimento, "Cozinhando " + alimento});}
                tfAlimento.setText("");
            }
        } else if(e.getSource() == bDesligarFogão){
            ((JFrame) SwingUtilities.getWindowAncestor(bDesligarFogão)).dispose();
        }
    }
}