package boletin_30_1;

import java.util.ArrayList;

public class Aplicacion{
    public static void main(String[] args){
        Futbolista f = new Futbolista(1,30,"Cristiano","Ronaldo",7,"delantero");
        System.out.println(f.toString());
        f.concentrarse();
        f.viajar();
        f.entrenar();
        f.jugarPartido();
        f.entrevista();
        Entrenador e = new Entrenador(2,60,"Vicente","Del Bosque",12345);
        System.out.println(e.toString());
        e.concentrarse();
        e.viajar();
        e.entrenar();
        e.jugarPartido();
        e.planificarEntrenamiento();
        Masajista m = new Masajista(3,22,"Pepe","Botella",4,"Fisioterapeuta");
        System.out.println(m.toString());
        m.concentrarse();
        m.viajar();
        m.entrenar();
        m.jugarPartido();
        m.darMasaje();
        Seleccionador s = new Seleccionador(4,25,"Manolo","El Del Bombo");
        System.out.println(s.toString());
        s.concentrarse();
        s.viajar();
        s.entrenar();
        s.jugarPartido();
        s.seleccionarJugador();
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        lista.add(f);
        lista.add(e);
        lista.add(m);
        lista.add(s);
        System.out.println("Lista de jugadores:");
        for(SeleccionFutbol jugador : lista){
            System.out.println("\t- " + jugador.toString());
        }
    }
}