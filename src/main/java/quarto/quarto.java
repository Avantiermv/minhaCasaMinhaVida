package quarto;

import com.mycompany.minhacasaminhavida.BackgroundPanel;
import com.mycompany.minhacasaminhavida.Minhacasaminhavida;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class quarto extends JFrame implements ActionListener{

    JButton bCama, bArmário, bIrPraSala;
    
    public quarto(){
        setLayout(new FlowLayout());
        setSize(800,700);
        setTitle("Quarto");
        setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\quarto.jpg"));
        setVisible(true);
        
        bCama = new JButton("Dormir");
        bCama.addActionListener(this);
        add(bCama);
        
        bArmário = new JButton("Armário");
        bArmário.addActionListener(this);
        add(bArmário);
        
        bIrPraSala = new JButton("Ir pra Sala");
        bIrPraSala.addActionListener(this);
        add(bIrPraSala);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bIrPraSala){
            new Minhacasaminhavida();
            ((JFrame) SwingUtilities.getWindowAncestor(bIrPraSala)).dispose();
        } else if(e.getSource() == bArmário){
            new armario();
        }
        
        if(e.getSource() == bCama){
            getContentPane().removeAll();
            setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\"));
            getContentPane().setBackground(Color.BLACK);
            getContentPane().setLayout(new BorderLayout());
            
            JLabel textoBranco = new JLabel("Dormindo a noite toda");
            textoBranco.setForeground(Color.WHITE);
            textoBranco.setHorizontalAlignment(SwingConstants.CENTER);
            add(textoBranco, BorderLayout.CENTER);
            
            revalidate(); 
            repaint();
            
            Timer timer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    getContentPane().removeAll();
                    setContentPane(new BackgroundPanel("C:\\\\Users\\\\marco\\\\OneDrive\\\\Documentos\\\\IFMA\\\\atividades\\\\projetodepoo\\\\minhacasaminhavida\\\\imagens\\\\quarto.jpg"));
                    
                    add(bCama); 
                    add(bArmário);
                    add(bIrPraSala);
                    
                    revalidate();
                    repaint();
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }
    
    
    
}
