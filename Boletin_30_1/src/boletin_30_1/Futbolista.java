package boletin_30_1;

public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("\t=> El futbolista se concentra.");
    }

    @Override
    public void viajar(){
        System.out.println("\t=> El futbolista viaja.");
    }

    @Override
    public void entrenar(){
        System.out.println("\t=> El futbolista asiste al entreno.");
    }

    @Override
    public void jugarPartido(){
        System.out.println("\t=> El futbolista asiste al partido.");
    }
    
    public void entrevista(){
        System.out.println("\t=> El futbolista realiza una entrevista.");
    }

    @Override
    public String toString(){
        return "Futbolista{" + super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
}