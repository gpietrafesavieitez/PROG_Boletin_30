package boletin_30_1;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    protected int id, edad;
    protected String nombre, apellidos;

    @Override
    public String toString() {
        return "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos;
    }
}