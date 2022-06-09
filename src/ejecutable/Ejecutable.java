/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import controlador.Controlador;
import modelo.Telefonia;
import vista.VentanaPrincipal;

/**
 *
 * @author njpae
 */
public class Ejecutable 
{
    public static void main(String[] args)
    {
        Telefonia miModelo = new Telefonia();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Controlador miControlador = new Controlador (miVentana, miModelo);
    }
}
