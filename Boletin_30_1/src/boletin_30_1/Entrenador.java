package boletin_30_1;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;
    
    public Entrenador(int id, int edad, String nombre, String apellidos, int idFederacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse(){
        System.out.println("\t=> El entrenador se concentra.");
    }

    @Override
    public void viajar(){
        System.out.println("\t=> El entrenador viaja.");
    }

    @Override
    public void entrenar(){
        System.out.println("\t=> El entrenador asiste al entreno.");
    }

    @Override
    public void jugarPartido(){
        System.out.println("\t=> El entrenador asiste al partido.");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("\t=> El entrenador planifica un entrenamiento.");
    }

    @Override
    public String toString(){
        return "Entrenador{" + super.toString() + ", idFederacion=" + idFederacion + '}';
    }
}