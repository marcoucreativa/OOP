package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements IRepository {

    private List<BitacoraVacunas> db;

    public InMemoryRepository(){
        db = new ArrayList<>();
    }

    public boolean save(Persona persona, String marca, Date date){
        db.add(new BitacoraVacunas(persona, marca, date));
        return true;
    }

    public List<BitacoraVacunas> getDB() {
        return db;
    }
}
