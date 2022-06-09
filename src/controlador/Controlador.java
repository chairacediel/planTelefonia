/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Telefonia;
import vista.VentanaPrincipal;

/**
 *
 * @author njpae
 */
public class Controlador implements ActionListener
{
    //Atributos
    private VentanaPrincipal venPrin;
    private Telefonia model;
    
    
    public Controlador(VentanaPrincipal pVenPrin, Telefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btCalcular.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
        this.venPrin.miPanelEntradaDatos.op.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         String comando = e.getActionCommand();
        
        if(comando.equals("calcular"))
       {
            model.setOperador((venPrin.miPanelEntradaDatos.getOperador()));
            model.setNumero(Long.parseLong(venPrin.miPanelEntradaDatos.getTelefono()));
            model.setValorMin(Integer.parseInt(venPrin.miPanelEntradaDatos.getValorMin()));
            model.setMinutos(Integer.parseInt(venPrin.miPanelEntradaDatos.getNumeroMin()));
            model.calcularCostoPlan();
            venPrin.miPanelResultado.mostrarResultado(model.getNumero(), model.getOperador(), model.getCostoPlan());
            
       }
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultado.borrar();
        }
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
    }
}
