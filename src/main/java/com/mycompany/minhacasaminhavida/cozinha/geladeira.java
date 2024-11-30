package com.mycompany.minhacasaminhavida.cozinha;

import com.mycompany.minhacasaminhavida.BackgroundPanel;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class geladeira extends JFrame implements ActionListener{
    
    JLabel lInserirAlimento;
    JTextField tfAlimento;
    JButton bGuardar, bRetirar;
    JTable tabelaAlimentos;
    DefaultTableModel modeloTabela;
    

    public geladeira(){
        setSize(1400, 900);
        setVisible(true);
        setTitle("Geladeira");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\geladeira.png"));
  
        
        lInserirAlimento = new JLabel("Nome do alimento");
        add(lInserirAlimento);
        tfAlimento = new JTextField(10);
        add(tfAlimento);
        
        bGuardar = new JButton("Guardar");
        bGuardar.addActionListener(this);
        add(bGuardar);
        bRetirar = new JButton("Tirar");
        bRetirar.addActionListener(this);
        add(bRetirar);
        
         modeloTabela = new DefaultTableModel();
         modeloTabela.addColumn("Alimento"); 
         modeloTabela.addColumn("Status");
         
         tabelaAlimentos = new JTable(modeloTabela); 
         JScrollPane scrollPane = new JScrollPane(tabelaAlimentos); 
         add(scrollPane);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bGuardar){
            String alimento = tfAlimento.getText();
            if(tfAlimento.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Nenhuma comida pra guardar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                { modeloTabela.addRow(new Object[]{alimento, "Guardado"});}
                tfAlimento.setText("");
            }
        } else if(e.getSource() == bRetirar){
            String alimento = tfAlimento.getText();
            if(tfAlimento.getText().isEmpty() || modeloTabela.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Sem Alimento pra Retirar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean encontrado = false;
                for(int i = 0; i < modeloTabela.getRowCount(); i++){
                    if(modeloTabela.getValueAt(i, 0).equals(alimento)){
                        modeloTabela.removeRow(i);
                        encontrado = true;
                        tfAlimento.setText("");
                        break;
                    }
                    if(!encontrado){
                        JOptionPane.showMessageDialog(null, "Alimento não encontrado", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }
    
}
