/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tema8ejemplo;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Tema8ejemplo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Videojuego videojuego1 = new Videojuego();
        
        String nombre = teclado.nextLine();//con next solo no puedes poner mas de una palabra 
        System.out.println("introduce el nombre del jeugo");
        String fechaDeLanzamiento = teclado.nextLine();//con next solo no puedes poner mas de una palabra 
        System.out.println("introduce la fechaDeLanzamiento del jeugo");
        String genero = teclado.nextLine();//con next solo no puedes poner mas de una palabra 
        System.out.println("introduce el genero del jeugo");
        int PEGI = teclado.nextInt();//con next solo no puedes poner mas de una palabra 
        System.out.println("introduce el PEGi del juego");

        //por escaner pones nombre de variable sinn comillas
        Videojuego videojuego2 = new Videojuego(nombre, fechaDeLanzamiento, genero, PEGI);//asignamos valores de la herencia 
        //esto es un objeto videojuego 2
        //ahora imprimos nombre del juego

        System.out.println("el nombre es: " + videojuego2.getNombre());
        System.out.println("introduce un nuevo nombre");

        System.out.println("introduce un nuevo nombre" + videojuego2.getNombre());
        nombre = teclado.nextLine();
        videojuego2.setNombre(nombre);//siempre setNombre en mayuscula el atributo

        System.out.println("introduce nombre");

        //por escaner pones nombre de variable sinn comillas
        //esto es un objeto videojuego 2
        //ahora imprimos nombre del juego
        System.out.println("fecha de lanzamiento es: " + videojuego2.getFechaDeLanzamiento());
        System.out.println("introduce un nueva fechaDeLanzamiento");

        System.out.println("introduce un nueva fechaDeLanzamiento" + videojuego2.getFechaDeLanzamiento());
        fechaDeLanzamiento = teclado.nextLine();
        videojuego2.setFechaDeLanzamiento(fechaDeLanzamiento);//siempre setNombre en mayuscula el atributo
////))))))HHHHHHHHHHHHHHHHHHHHHHHHHHHH

        System.out.println("introduce un genero  " + videojuego2.getGenero());
        genero = teclado.nextLine();
        videojuego2.setGenero(genero);//siempre setNombre en mayuscula el atributo

        System.out.println("introduce el nombre del jeugo");

        //por escaner pones nombre de variable sinn comillas
        //esto es un objeto videojuego 2
        //ahora imprimos nombre del juego
        System.out.println("el genero    es: " + videojuego2.getGenero());
        System.out.println("introduce un nuevo genero  ");

        System.out.println("introduce un nuevo genero" + videojuego2.getGenero());
        genero = teclado.nextLine();
        videojuego2.setGenero(genero);//siempre setNombre en mayuscula el atributo

        //YYYYYYYYYYYYYYYYYYYYYYYYY
        System.out.println("introduce el PEGI" + videojuego2.getPEGI());
        PEGI = teclado.nextInt();
        videojuego2.setPEGI(PEGI);//siempre setNombre en mayuscula el atributo

        System.out.println("introduce el PEGI");

        
    }
}
