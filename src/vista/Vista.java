/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modeloCamino.ListaEnlazadaPreguntas;

/**
 *
 * @author Usuario
 */
public class Vista {
    ListaEnlazadaPreguntas list = new ListaEnlazadaPreguntas();
    Scanner leer = new Scanner(System.in);
    
    
    public void preguntasRespuestas(){
        list.agregarPregunta("¿Cuál es la capital de Francia? \n1. Berlín \n2. París \n3. Londres \n4. Roma", 2);
        list.agregarPregunta("¿Cuál es el animal más grande del mundo? \n1. Ballena azul \n2. Elefante \n3. Jirafa \n4. Rinoceronte", 1);
        list.agregarPregunta("¿Cuál es el océano más grande del mundo?\n1. Océano Atlántico  \n2. Océano Índico \n3. Océano Antártico \n4. Océano Pacífico ",4);
        list.agregarPregunta("¿Cuál es el metal más precioso? \n1. Plata \n2. Platino  \n3. Oro \n4. Cobre ",3);
        list.agregarPregunta("¿Cuál es la capital de Australia? \n1.  Sídney  \n2. Canberra \n3. Melbourne \n 4. Brisbane ", 2 );
        list.agregarPregunta("¿Quién escribió 'Romeo y Julieta'? \n1. William Shakespeare \n2. Charles Dickens \n3. Jane Austen  \n4. Ernest Hemingway", 1);
        list.agregarPregunta("¿Cuál es el metal más abundante en la corteza terrestre? \n1. Hierro \n2. Cobre \n3. Plomo \n4. Aluminio ", 4 );
        list.agregarPregunta("¿Quién pintó la obra 'La noche estrellada'? \n1. Vincent van Gogh  \n2. Pablo Picasso \n3. Leonardo da Vinci  \n4. Claude Monet ", 1 );
        list.agregarPregunta("¿En qué año comenzó la Primera Guerra Mundial? \n1. 1905 \n2. 1914  \n3. 1918  \n4. 1939", 2);
        list.agregarPregunta("¿Quién fue el primer ser humano en viajar al espacio? \n1. Yuri Gagarin \n2. Neil Armstrong \n3. Buzz Aldrin \n4. Alan Shepard", 1);
    }
    
    public int MenuInicio(){
        int op = 0;
        System.out.println("------------------------------------------------------------");
        System.out.println("           Bienvendo al laberinto de tu vida                ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Para poder llegar al final del laberito y obtener la recompensa \n"
                         + "deberas resolver cada acertijo para poder obtener una llave que \n"
                         + "desbloqueara el siguiente acertijo.");
        System.out.println("                                                            ");
        System.out.println("¿Estas Listo?");
        System.out.println("1. SI");
        System.out.println("2. No");
        op = leer.nextInt();
        
        leer.nextLine();
        
        return op;
    }
    public boolean ImprimirPregunta(){
        int respUsuario = 0;
        boolean confir = false;
        while(confir == false){
            
            list.MostrarPregunt();
            respUsuario = leer.nextInt();
            confir = list.verificarPregun(respUsuario);
            if(confir == false){
                System.out.println("---Respuesta incorrecta---     "
                + "\nSigue intentando hasta acertar");
            }
        }
        list.SiguientePregunta();
        if(list.PreguntaVacia() != null){
            RespuestaCorrecta();
            
        }
        
        return confir;
    }
    public Object confirPreguntaSig(){       
        return list.PreguntaVacia();
    }
    public void mostrarLlaves(int llaves){
        System.out.println("Las llaves que obtubste son: " +llaves);
    }
    public void RespuestaCorrecta(){
        System.out.println("Respuesta correcta, obtienes una llave"
                + "\n------------------------------------------------"
                + "\nAvanzas a la siguiente pregunta del laberinto"
                + "\n------------------------------------------------");
    }
    public void seraLaProxima(){
        System.out.println("Esta bien espero estes mas preparado la proxima vez");
    }
    public void mensajeFinal(){
        System.out.println("----Lo lograste alcanzaste la meta y lograste llegar al final del camino----");
    }
}
