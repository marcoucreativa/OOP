package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.repositories.impl.InMemoryRepository;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args){

        InMemoryRepository repo = new InMemoryRepository();

        repo.saveAmigo("Rafa", "123", 30, false, "Trabajo", "No se",
                "Pfizer",
                new Date());
        List<BitacoraVacunas> byID = repo.getByID("123");
    }
}
