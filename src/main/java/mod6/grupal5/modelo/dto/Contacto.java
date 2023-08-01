package mod6.grupal5.modelo.dto;

public class Contacto {
    private String nombre;
    private String correo;
    private String mensaje;

    public Contacto() {
    }

    public Contacto(String nombre, String correo, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
