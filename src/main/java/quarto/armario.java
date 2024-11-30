package quarto;

import com.mycompany.minhacasaminhavida.BackgroundPanel;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class armario extends JFrame implements ActionListener{
    
    JButton bGuardarRoupa, bTirarRoupa;
    JTextField tfNomeDaRoupa;
    JLabel lRoupa;
    JTable tabelaRoupas;
    DefaultTableModel modeloTabela;

    public armario(){
        setLayout(new FlowLayout());
        setSize(800,700);
        setTitle("Armário");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\armario.jpg"));
        setVisible(true);

        lRoupa = new JLabel("Nome da roupa");
        add(lRoupa);
        
        tfNomeDaRoupa = new JTextField(10);
        add(tfNomeDaRoupa);
        
        bGuardarRoupa = new JButton("Guardar");
        bGuardarRoupa.addActionListener(this);
        add(bGuardarRoupa);
        bTirarRoupa = new JButton("Tirar");
        bTirarRoupa.addActionListener(this);
        add(bTirarRoupa);
        
         modeloTabela = new DefaultTableModel();
         modeloTabela.addColumn("Roupa"); 
         modeloTabela.addColumn("Status");
         
         tabelaRoupas = new JTable(modeloTabela); 
         JScrollPane scrollPane = new JScrollPane(tabelaRoupas); 
         add(scrollPane);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bGuardarRoupa){
            String roupa = tfNomeDaRoupa.getText();
            if(tfNomeDaRoupa.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Sem roupa pra guardar", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                { modeloTabela.addRow(new Object[]{roupa, "Guardado"});}
                tfNomeDaRoupa.setText("");
            }
        } else if (e.getSource() == bTirarRoupa){
            String roupa = tfNomeDaRoupa.getText();
            if(tfNomeDaRoupa.getText().isEmpty() || modeloTabela.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Sem roupa pra remover", "ERRO!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean encontrado = false;
                for(int i = 0; i < modeloTabela.getRowCount(); i++){
                    if(modeloTabela.getValueAt(i, 0).equals(roupa)){
                        modeloTabela.removeRow(i);
                        encontrado = true;
                        tfNomeDaRoupa.setText("");
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
