package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class FileRepository implements IRepository{

    private final String FILE_PATH = "db.txt";

    public FileRepository(){
        File myObj = new File(this.FILE_PATH);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean save(Persona persona, String marca, Date date) {
        try {
            FileWriter myWriter = new FileWriter(this.FILE_PATH);
            myWriter.write(persona.getNombre() + " - " + marca + date.toString());
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<BitacoraVacunas> getDB() {
        return null;
    }
}
