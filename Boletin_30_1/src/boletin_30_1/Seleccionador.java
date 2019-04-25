package boletin_30_1;

public class Seleccionador extends SeleccionFutbol{
    
    public Seleccionador(int id, int edad, String nombre, String apellidos){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("\t=> El seleccionador se concentra.");
    }

    @Override
    public void viajar(){
        System.out.println("\t=> El seleccionador viaja.");
    }

    @Override
    public void entrenar(){
        System.out.println("\t=> El seleccionador asiste al entreno.");
    }

    @Override
    public void jugarPartido(){
        System.out.println("\t=> El seleccionador asiste al partido.");
    }
    
    public void seleccionarJugador(){
        System.out.println("\t=> El seleccionador elije un jugador.");
    }
    
    @Override
    public String toString(){
        return "Seleccionador{" + super.toString() + '}';
    }
}