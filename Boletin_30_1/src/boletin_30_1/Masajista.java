package boletin_30_1;

public class Masajista extends SeleccionFutbol{
    private int aniosExperencia;
    private String titulacion;
    
    public Masajista(int id, int edad, String nombre, String apellidos, int aniosExperencia, String titulacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.aniosExperencia = aniosExperencia;
        this.titulacion = titulacion;
    }

    @Override
    public void concentrarse(){
        System.out.println("\t=> El masajista se concentra.");
    }

    @Override
    public void viajar(){
        System.out.println("\t=> El masajista viaja.");
    }

    @Override
    public void entrenar(){
        System.out.println("\t=> El masajista asiste al entreno.");
    }

    @Override
    public void jugarPartido(){
        System.out.println("\t=> El masajista asiste al partido.");
    }
    
    public void darMasaje(){
        System.out.println("\t=> El masajista realiza un masaje.");
    }

    @Override
    public String toString(){
        return "Masajista{" + super.toString() + ", aniosExperencia=" + aniosExperencia + ", titulacion=" + titulacion + '}';
    }
}