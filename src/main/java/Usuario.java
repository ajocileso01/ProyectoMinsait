package main.java;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password;

    // Constructores
    public Usuario() {}

    public Usuario(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Métodos adicionales
    public boolean esEmailValido() {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String obtenerNombreUsuario() {
        if (email == null) return "";
        int index = email.indexOf("@");
        return index > 0 ? email.substring(0, index) : "";
    }

    // Getters y Setters
    public int getId() { 
        return id; 
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) { 
        this.password = password; 
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
    }
}