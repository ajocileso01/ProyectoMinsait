package main.java;

public class Ubicacion {
    private int id;
    private boolean online;
    private String direccion;

    // Constructores
    public Ubicacion() {}

    public Ubicacion(int id, boolean online, String direccion) {
        this.id = id;
        this.online = online;
        this.direccion = direccion;
    }

    // Métodos adicionales
    public String obtenerTipoUbicacion() {
        return online ? "Virtual" : "Presencial";
    }

    public boolean contienePalabraClave(String palabra) {
        return direccion.toLowerCase().contains(palabra.toLowerCase());
    }

    // Getters y Setters
    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public boolean isOnline() { 
        return online; 
    }

    public void setOnline(boolean online) { 
        this.online = online; 
    }

    public String getDireccion() { 
        return direccion; 
    }

    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }


    @Override
    public String toString() {
        return "Ubicacion [id=" + id + ", online=" + online + ", direccion=" + direccion + "]";
    }
}