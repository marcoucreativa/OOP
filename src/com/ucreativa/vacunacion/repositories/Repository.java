package com.ucreativa.vacunacion.repositories;

import java.util.Date;

public interface Repository {

    void saveVacunaAmigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebook,
                         String marca,Date fecha);

    void saveVacunaFamiliar(String nombre,String cedula, int edad, boolean riesgo, String parentesco,
                            String marca,Date fecha);

}

