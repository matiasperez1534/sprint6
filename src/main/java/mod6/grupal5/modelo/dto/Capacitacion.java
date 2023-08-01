package mod6.grupal5.modelo.dto;

public class Capacitacion {

    private int id;
    private String Nombre;
    private String Detalle;
    private String Fecha;
    private String Hora;
    private String Lugar;
    private String Duracion;
    private int Cantidad;

    public Capacitacion() {
    }

    public Capacitacion(int id, String nombre, String detalle, String fecha, String hora, String lugar, String duracion, int cantidad) {
        this.id = id;
        Nombre = nombre;
        Detalle = detalle;
        Fecha = fecha;
        Hora = hora;
        Lugar = lugar;
        Duracion = duracion;
        Cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String duracion) {
        Duracion = duracion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Detalle='" + Detalle + '\'' +
                ", Fecha=" + Fecha +
                ", Hora=" + Hora +
                ", Lugar='" + Lugar + '\'' +
                ", Duracion='" + Duracion + '\'' +
                ", Cantidad=" + Cantidad +
                '}';
    }
}
