/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCamino;

/**
 *
 * @author Usuario
 */
public class ListaEnlazadaPreguntas {
    ListaPreguntas cabeza;
    ListaPreguntas tempo;
    
    public ListaEnlazadaPreguntas(){
        this.cabeza = null;
    }
    
    public void agregarPregunta(Object pregunta, Object respuesta ){
        
        ListaPreguntas nuevoNodo = new ListaPreguntas(pregunta, respuesta);
        if(cabeza == null){
            cabeza = nuevoNodo;
        }else{
            ListaPreguntas temporal = cabeza;
            while(temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
            
        }
        this.tempo = cabeza;
    }
    
    public void MostrarPregunt(){
        System.out.println(tempo.getPregunta());
    }
    public void SiguientePregunta(){
        tempo = tempo.getSiguiente();
        
    }
    public boolean verificarPregun(Object respuestaUsuario){
        boolean op = true;
        
        op = tempo.getRespuesta() == respuestaUsuario ? true : false;
        
        return op;
    }
    public Object PreguntaVacia(){
        return this.tempo;
    }
    
    
}
