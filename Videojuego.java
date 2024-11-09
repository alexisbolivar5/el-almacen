/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema8ejemplo;

/**
 *
 * @author Alexis
 */
public class Videojuego {
    
private String nombre;   
private String fechaDeLanzamiento;   
private String genero;   
private int PEGI;   
    
 public Videojuego(){ //constructor por defecto 
     nombre = "" ; // para String ""
     fechaDeLanzamiento = "" ; // para int 0
     genero = "" ;
     PEGI = 0 ;
     
 }   
 //Constructor por parametros   
public Videojuego(String nombre ,String fechaDeLanzamiento,String genero,int PEGI){// se ponen los atributos con sus tipos
   this. nombre = nombre;//this. ese nombre es el atributo de mi clase 
   this. fechaDeLanzamiento = fechaDeLanzamiento; // si cambiamos el nombre no nnecesitas this ejemplo n ombre = name 
   this. genero = genero;
   this. PEGI = PEGI;
    
    
}
//getters publicos seguido de tipo de dato y ahora nombre del metodo empieza con get seguido de nombre de atributo a devolver
    public String getNombre(){
        return nombre;
}    
   //setters modificar atributos siempre tipo void 
    public void  setNombre(String nombre){
        this.nombre = nombre;
    }
    //getters publicos seguido de tipo de dato y ahora nombre del metodo empieza con get seguido de nombre de atributo a devolver
    public String getFechaDeLanzamiento(){
        return fechaDeLanzamiento;
}    
   //setters modificar atributos siempre tipo void 
    public void  setFechaDeLanzamiento(String fechaDeLanzamiento){
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
        //getters publicos seguido de tipo de dato y ahora nombre del metodo empieza con get seguido de nombre de atributo a devolver
    public String getGenero(){
        return genero;
}    
   //setters modificar atributos siempre tipo void 
    public void  setGenero(String genero){
        this.genero = genero;
    }
        //getters publicos seguido de tipo de dato y ahora nombre del metodo empieza con get seguido de nombre de atributo a devolver
    public int getPEGI(){
        return PEGI;
}    
   //setters modificar atributos siempre tipo void 
    public void  setPEGI(int PEGI){
        this.PEGI = PEGI;
    }
}

