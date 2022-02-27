/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_202113378;

/**
 *
 * @author dabra
 */
public class Lista_Usuarios {
    public Usuarios cabeza;
    public int tamano;
    
    public Lista_Usuarios() {
        tamano = 0;
        this.cabeza = null;
    }
    
    public Lista_Usuarios(Usuarios cab) {
        tamano = 1;
        this.cabeza = cab;
    }
    
    public void poner_primero(Usuarios us){
        this.cabeza = us;
        tamano++;
    }
    
    public void poner_siguiente(Usuarios us){
        Usuarios ahora = this.cabeza;
        for(int i=0; i<tamano; i++){
            ahora = ahora.getSig();
        }
        ahora.setSig(us);
        tamano++;
    }
    
    public void eliminar(int id){
        Usuarios anterior = this.cabeza;
        Usuarios ahora = anterior.getSig();
        
        if(anterior.ID == id){
            this.cabeza = anterior.getSig();
            anterior.setSig(null);
            tamano --;
        }
        else{  
            for(int i=0; i<tamano; i++){
                if(ahora.ID == id){
                    anterior.setSig(ahora.getSig());
                    ahora.setSig(null);
                    tamano --;
                    break;
                }
                ahora = ahora.getSig();
                anterior = anterior.getSig();
            }
        }
    }
    
    public Usuarios buscar(String busca){
        Usuarios ahora = this.cabeza;
        long id =-10000;
        String buscado = "";
        
        try{
            id = Long.parseLong(busca);
        }catch(Exception e){
            buscado = busca;
        }
        
        if(buscado.equals(busca)){
            for(int i=0;i<tamano;i++){
                if(ahora.getNombre().equals(busca)){
                    return ahora;
                }
                ahora = ahora.getSig();    
            }
        }else{
            for(int i=0;i<tamano;i++){
                if(ahora.getID() == id){
                    return ahora;
                }
                ahora = ahora.getSig();
            }
        }
        return null;  
    }
    
    public void imprimir(){    
        Usuarios ahora = this.cabeza;
        ahora.imprimir();
        for(int i=1; i<tamano; i++){
            ahora = ahora.getSig();
            ahora.imprimir();
        }    
    }
}
