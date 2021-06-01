package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

          Familiar mama = new Familiar("Mary", "123", 70,
                true, "Mama");

        Familiar hermano = new Familiar("Roberto", "345", 48,
                false, "Hermano");

        Amigo compaTrabajo = new Amigo("Rafa", "987", 30,
                false, "Compa Trabajo", "No se");


        List<BitacoraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacunas(mama, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(hermano, "AstraZeneca", new Date()));
        bitacora.add(new BitacoraVacunas(compaTrabajo, "Johnson", new Date()));











    }
}


