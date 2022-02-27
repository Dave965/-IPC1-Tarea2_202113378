/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_202113378;

/**
 *
 * @author dabra
 */
public class Usuarios {
    public long ID;
    public String nombre;
    public String apellido;
    public String user;
    public String rol;
    public String password;
    public Usuarios sig;

    public Usuarios(long ID, String nombre, String apellido, String user, String rol, String password) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.rol = rol;
        this.password = password;
        this.sig = this;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
    }

    public double getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuarios getSig() {
        return sig;
    }

    public void setSig(Usuarios sig) {
        this.sig = sig;
    }

}
