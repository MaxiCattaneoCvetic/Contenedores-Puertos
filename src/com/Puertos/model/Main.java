package com.Puertos.model;

import model.Contenedor;

public class Main {
    public static void main(String[] args) {

        Contenedor contenedor1 = new Contenedor(2, "Africa", false);
        Contenedor contenedor2 = new Contenedor(5, "Islandia", false);
        Contenedor contenedor3 = new Contenedor(7, "Argentina", true);

        contenedor2.getIdentificador();
      
    }
}
