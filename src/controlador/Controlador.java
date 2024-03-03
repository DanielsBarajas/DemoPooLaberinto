/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modeloCamino.ListaEnlazadaPreguntas;
import modeloCamino.ListaPreguntas;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Vista view;
    
    int llaves = 0;
    boolean confir = false;
    
    public Controlador(Vista view){
        this.view = view;
    }
    public void iniciar(){
        int op = view.MenuInicio();
        view.preguntasRespuestas();
        
        
        switch (op) {
            case 1:
                
                while(view.confirPreguntaSig() != null){
                    
                    confir = view.ImprimirPregunta();
                    if(confir == true){
                        llaves++;
                    }   
                }
                view.mostrarLlaves(llaves);
                view.mensajeFinal();
             
                break;
            case 2:
                view.seraLaProxima();
                break;
            default:
                System.out.println("Opcion fuera del rango");
        }
        
        
        
        
        
        
    }
}
