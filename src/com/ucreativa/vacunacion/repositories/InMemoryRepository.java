package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
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

    public List<String> getDB() {
        SimpleDateFormat format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        List<String> lines = new ArrayList<>();
        for (BitacoraVacunas item : db){
            lines.add(item.getPersona().getNombre() + " - " + item.getMarca() + " - " + format.format(item.getFecha()));
        }
        return lines;
    }
}
