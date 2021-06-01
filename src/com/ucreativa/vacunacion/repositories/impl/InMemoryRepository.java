package com.ucreativa.vacunacion.repositories.impl;

import com.ucreativa.vacunacion.repositories.Repository;
import java.util.Date;

public class InMemoryRepository implements Repository {
    @Override
    public void saveVacunaAmigo(String nombre, String cedula, int edad, boolean riesgo,
                                String relacion, String facebook,
                                String marca, Date fecha) {
        //TODO: Code Goes here
    }

    @Override
    public void saveVacunaFamiliar(String nombre, String cedula, int edad, boolean riesgo,
                                   String parentesco, String marca, Date fecha) {
        //TODO: Code Goes here
    }
}

