package com.ucreativa;

import com.ucreativa.familia.Marco;
import com.ucreativa.familia.Mary;


public class Main {

    public static void main(String[] args) {

        Marco yo = new Marco("Hola", 12);
        yo.edad = 13;

        Mary mama = new Mary("Hola Chiquillos");

        System.out.println("Bye Class " + yo.edad);
    }
};


