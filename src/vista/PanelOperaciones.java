/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author njpae
 */
public class PanelOperaciones extends JPanel
{
   //Atributos
    public JButton btCalcular;
    public JButton btSalir;
    public JButton btBorrar;
    
    
    //Metodo constructor
    
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(10,20,100,20);
        add(btCalcular);
        btCalcular.setActionCommand("calcular");
        
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(140,20,100,20);
        add(btBorrar);
        btBorrar.setActionCommand("borrar");
        
        btSalir = new JButton("Salir");
        btSalir.setBounds(270,20,100,20);
        add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}
