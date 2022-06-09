/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author njpae
 */
public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbh;
    private JLabel lbn;
    private JLabel lbi;
    private JLabel lbvh;
    private JTextField tfh;
    private JTextField tfn;   
    private JTextField tfi;
    public JComboBox op;
    //Metodo Constructor
    public PanelEntradaDatos()
    {
         //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/telefono.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(0,15,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas X e Y
        lbh = new JLabel("Telefono: ");
        lbh.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        lbh.setForeground(Color.ORANGE);
        lbh.setBounds(230,20,160,70);
        add(lbh);
        
        lbn = new JLabel("Número min: ");
        lbn.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        lbn.setForeground(Color.ORANGE);
        lbn.setBounds(230,50,160,70);
        add(lbn);
        
        lbi = new JLabel("Valor min: ");
        lbi.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        lbi.setForeground(Color.ORANGE);
        lbi.setBounds(230,80,160,70);
        add(lbi);
        
        lbvh = new JLabel("Operador: ");
        lbvh.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
        lbvh.setForeground(Color.ORANGE);
        lbvh.setBounds(230,110,160,70);
        add(lbvh);
        
        //Creación y adición de campos de texto
        tfh = new JTextField();
        tfh.setBounds(310, 40, 100, 30);
        tfh.setFont(new Font("Arial", Font.ITALIC, 14));
        add(tfh);
        
        tfn = new JTextField();
        tfn.setBounds(310, 70, 100, 30);
        tfn.setFont(new Font("Arial", Font.ITALIC, 14));
        add(tfn);
        
        tfi = new JTextField();
        tfi.setBounds(310, 100, 80, 30);
        tfi.setFont(new Font("Arial", Font.ITALIC, 14));
        add(tfi);
        
        op = new JComboBox();
        add(op);
	op.addItem("Claro");
	op.addItem("Movil Lujo");		
        op.addItem("Tigo");
        op.addItem("Wong");
        op.setBounds(310, 130, 100, 30);
        
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);  
    }
    
    
    public String getNumeroMin()
    {
        return tfn.getText();
    }
    
    public String getTelefono()
    {
        return tfh.getText();
    }
    
    public Object getOperador()
    {
        return op.getSelectedItem();
    }
    
    public String getValorMin()
    {
        return tfi.getText();
    }
    
    public void borrar()
    {
       
        tfh.setText("");
        tfn.setText("");
        
        tfi.setText("");
        
    }
}
