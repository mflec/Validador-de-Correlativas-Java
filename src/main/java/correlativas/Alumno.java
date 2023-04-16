package correlativas;

import java.util.List;

class Alumno {
    private String nombre;
    private String legajo;
    public List<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
