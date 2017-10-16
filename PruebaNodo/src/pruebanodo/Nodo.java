/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanodo;

/**
 *
 * @author ricar
 */
public class Nodo 
{
    private int id;
    private String descripcion;
    private Nodo siguiente;
    private Nodo ultimo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.siguiente = null;
        this.ultimo = null;
    }

    public Nodo() {
    }
    
 
    
    
}
