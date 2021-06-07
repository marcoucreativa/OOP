package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.Date;
import java.util.List;

public interface IRepository {

    boolean save(Persona persona, String marca, Date date);

    List<BitacoraVacunas> getDB();
}
