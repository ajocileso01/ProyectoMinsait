package main.java;

public class Organizador {
    private int id;
    private String nombre;
    private String email;
    private String password;

    // Constructores
    public Organizador() {}

    public Organizador(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    // Métodos adicionales
    public boolean verificarCredenciales(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String obtenerIniciales() {
        if (nombre == null || nombre.isEmpty()) return "";
        String[] partes = nombre.split(" ");
        StringBuilder iniciales = new StringBuilder();
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                iniciales.append(parte.charAt(0));
            }
        }
        return iniciales.toString().toUpperCase();
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
        return "Organizador [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
    }
}