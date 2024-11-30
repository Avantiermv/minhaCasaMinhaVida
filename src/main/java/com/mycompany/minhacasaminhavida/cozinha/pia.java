package com.mycompany.minhacasaminhavida.cozinha;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import com.mycompany.minhacasaminhavida.BackgroundPanel;
import javax.swing.table.DefaultTableModel;

public class pia extends JFrame implements ActionListener{
    
    JLabel lLouça;
    JButton bLavarLouça, bGuardarLouça;
    JTextField tfNomeDaLouça;
    DefaultTableModel modeloTabela;
    JTable tabelaDelouças;
    
    public pia(){
        setLayout(new FlowLayout());
        setSize(800,700);
        setTitle("Pia");
        setVisible(true);
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\pia.jpg"));
        
        lLouça = new JLabel("O que vai lavar: ");
        add(lLouça);
        tfNomeDaLouça = new JTextField(10);
        add(tfNomeDaLouça);
        
        bLavarLouça = new JButton("Lavar");
        bLavarLouça.addActionListener(this);
        add(bLavarLouça);
        bGuardarLouça = new JButton("Guardar a louça");
        bGuardarLouça.addActionListener(this);
        add(bGuardarLouça);
        
        modeloTabela = new DefaultTableModel();
        modeloTabela.addColumn("Louça"); 
        modeloTabela.addColumn("Status");
        
         tabelaDelouças = new JTable(modeloTabela); 
         JScrollPane scrollPane = new JScrollPane(tabelaDelouças); 
         add(scrollPane);
    }
    
    public void guardarTodasAsLouças(){
        modeloTabela.setRowCount(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bLavarLouça){
            String louça = tfNomeDaLouça.getText();
            if(tfNomeDaLouça.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Sem louça pra lavar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                { modeloTabela.addRow(new Object[]{louça, "Lavado"});}
                tfNomeDaLouça.setText("");
            }
        } 
        
        if(e.getSource() == bGuardarLouça){
            if(modeloTabela.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Sem louça pra guardar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                guardarTodasAsLouças();
            }
        }
    }
}
