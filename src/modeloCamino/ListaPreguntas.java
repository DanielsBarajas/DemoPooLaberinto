/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloCamino;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Usuario
 */
public class ListaPreguntas {
   public Object pregunta, respuesta;
   ListaPreguntas siguiente;

    public ListaPreguntas(Object pregunta, Object respuesta){
      this.pregunta = pregunta;
      this.respuesta = respuesta;
      this.siguiente = null;
    }
    public Object getPregunta() {
        return pregunta;
    }

    public void setPregunta(Object pregunta) {
        this.pregunta = pregunta;
    }

    public Object getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Object respuesta) {
        this.respuesta = respuesta;
    }

    public ListaPreguntas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaPreguntas siguiente) {
        this.siguiente = siguiente;
    }
    

  
  

    

    
}
