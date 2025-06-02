package main.java;

public class Categoria {
    private int id;
    private String nombre;
    private int totalCategorias;

    // Constructores
    public Categoria() {}

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        totalCategorias++;
    }

    // Métodos adicionales
    public boolean esNombreValido() {
        return nombre != null && nombre.length() >= 3 && nombre.length() <= 50;
    }

    public int contadorDeCategorias() {
        return totalCategorias;
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

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nombre=" + nombre + "]";
    }
}