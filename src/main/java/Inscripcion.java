package main.java;

public class Inscripcion {
    private int id;
    private int idUsuario;
    private int idEvento;
    private boolean cancelado;

    // Constructores
    public Inscripcion() {}

    public Inscripcion(int id, int idUsuario, int idEvento, boolean cancelado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
        this.cancelado = cancelado;
    }

    // Métodos adicionales
    public void cancelar() {
        this.cancelado = true;
    }

    public void reactivar() {
        this.cancelado = false;
    }

    public String obtenerEstado() {
        return cancelado ? "Cancelada" : "Activa";
    }

    // Getters y Setters
    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public int getIdUsuario() { 
        return idUsuario; 
    }

    public void setIdUsuario(int idUsuario) { 
        this.idUsuario = idUsuario; 
    }

    public int getIdEvento() { 
        return idEvento; 
    }

    public void setIdEvento(int idEvento) { 
        this.idEvento = idEvento; 
    }

    public boolean isCancelado() { 
        return cancelado; 
    }

    public void setCancelado(boolean cancelado) { 
        this.cancelado = cancelado; 
    }

    @Override
    public String toString() {
        return "Inscripcion [id=" + id + ", idUsuario=" + idUsuario + ", idEvento=" + idEvento + ", cancelado=" + cancelado + "]";
    }
}