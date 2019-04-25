package boletin_30_1;

import java.util.ArrayList;

public class Seleccionador extends SeleccionFutbol{
    
    public Seleccionador(int id, int edad, String nombre, String apellidos){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("El seleccionador se concentra.");
    }

    @Override
    public void viajar(){
        System.out.println("El seleccionador viaja.");
    }

    @Override
    public void entrenar(){
        System.out.println("El seleccionador asiste al entreno.");
    }

    @Override
    public void jugarPartido(){
        System.out.println("El seleccionador asiste al partido.");
    }
    
    public void seleccionarJugador(ArrayList<SeleccionFutbol> l){
        for(SeleccionFutbol sf : l){
            System.out.println(sf.toString());
        }
    }
    
    @Override
    public String toString(){
        return "Seleccionador{id=" + super.id + ", edad=" + super.edad + ", nombre=" + super.nombre + ", apellidos=" + super.apellidos + '}';
    }
}