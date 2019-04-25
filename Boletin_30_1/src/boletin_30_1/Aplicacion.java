package boletin_30_1;

import java.util.ArrayList;

public class Aplicacion{
    public static void main(String[] args){
        System.out.println("*** FUTBOLISTA ***");
        Futbolista futbolista = new Futbolista(1,30,"Cristiano","Ronaldo",7,"delantero");
        futbolista.concentrarse();
        futbolista.entrenar();
        futbolista.viajar();
        futbolista.jugarPartido();
        futbolista.entrevista();
        
        System.out.println("\n*** ENTRENADOR ***");
        Entrenador entrenador = new Entrenador(2,60,"Vicente","Del Bosque",12345);
        entrenador.concentrarse();
        entrenador.entrenar();
        entrenador.viajar();
        entrenador.jugarPartido();
        entrenador.planificarEntrenamiento();
        
        System.out.println("\n*** MASAJISTA ***");
        Masajista masajista = new Masajista(3,22,"Pepe","Botella",4,"Fisioterapeuta");
        masajista.concentrarse();
        masajista.entrenar();
        masajista.viajar();
        masajista.jugarPartido();
        masajista.darMasaje();
        
        System.out.println("\n*** SELECCIONADOR ***");
        Seleccionador seleccionador = new Seleccionador(4,25,"Manolo","El Del Bombo");
        seleccionador.concentrarse();
        seleccionador.entrenar();
        seleccionador.viajar();
        seleccionador.jugarPartido();
        
        System.out.println("\n************************************************\n");
        ArrayList<SeleccionFutbol> listaJugadores = new ArrayList<>();
        listaJugadores.add(futbolista);
        listaJugadores.add(entrenador);
        listaJugadores.add(masajista);
        listaJugadores.add(seleccionador);
        seleccionador.seleccionarJugador(listaJugadores);
    }
}