package main.java;

import java.util.Date;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private int duracion;
    private int idUbicacion;
    private int idOrganizador;
    private int idCategoria;

    // Constructores
    public Evento() {}

    public Evento(int id, String nombre, Date fecha, int duracion, int idUbicacion, int idOrganizador, int idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.idUbicacion = idUbicacion;
        this.idOrganizador = idOrganizador;
        this.idCategoria = idCategoria;
    }

    // Métodos adicionales
    public boolean esEventoFuturo() {
        return fecha != null && fecha.after(new Date());
    }

    public String obtenerDuracionFormateada() {
        return duracion + " horas";
    }

    // Getters y Setters

    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public Date getFecha() { 
        return fecha; 
    }

    public void setFecha(Date fecha) { 
        this.fecha = fecha; 
    }

    public int getDuracion() { 
        return duracion; 
    }

    public void setDuracion(int duracion) { 
        this.duracion = duracion; 
    }

    public int getIdUbicacion() { 
        return idUbicacion; 
    }

    public void setIdUbicacion(int idUbicacion) { 
        this.idUbicacion = idUbicacion; 
    }

    public int getIdOrganizador() { 
        return idOrganizador; 
    }

    public void setIdOrganizador(int idOrganizador) { 
        this.idOrganizador = idOrganizador; 
    }

    public int getIdCategoria() { 
        return idCategoria; 
    }

    public void setIdCategoria(int idCategoria) { 
        this.idCategoria = idCategoria; 
    }

    @Override
    public String toString() {
        return "Evento [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion + "]";
    }
}