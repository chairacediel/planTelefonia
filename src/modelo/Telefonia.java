/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Telefonia
{
    //Atributos
    private long numero;
    private Object operador;
    private int valorMin;
    private int minutos;
    private double costoPlan;
    
    
    //Metodos
    public Telefonia()
    {
        this.numero = 0;
        this.operador = "";
        this.valorMin = 0;
        this.minutos = 0;
        this.costoPlan=0.0;
        
    }

    public Telefonia(long numero, String operador, int valorMin, int minutos) 
    {
        this.numero = numero;
        this.operador = operador;
        this.valorMin = valorMin;
        this.minutos = minutos;
        this.costoPlan = 0.0;
    }
    
 

    public long getNumero() 
    {
        return numero;
    }

    public void setNumero(long numero) 
    {
        this.numero = numero;
    }

    public Object getOperador() 
    {
        return operador;
    }

    public void setOperador(Object operador) 
    {
        this.operador = operador;
    }


    public void setMinutos(int minutos) 
    {
        this.minutos = minutos;
    }

    

    public void setValorMin(int valorMin) 
    {
        this.valorMin = valorMin;
    }
    
    public void setCostoPlan(double costoPlan) 
    {
        this.costoPlan = costoPlan;
    }
    
    public void calcularCostoPlan()
    {
        costoPlan = minutos * valorMin;
        if(operador.equals("Movil Lujo"))
        {
            costoPlan = costoPlan * 0.5;
        }
    }
    
    public double getCostoPlan() 
    {
        return costoPlan;
    }
    
    
}