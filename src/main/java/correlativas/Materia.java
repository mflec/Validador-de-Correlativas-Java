package correlativas;

import java.util.ArrayList;
import java.util.List;

class Materia {
    private String nombre;
    public List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Materia materia) {
        this.correlativas.add(materia);
    }

    public boolean puedeCursar(Alumno alumno) {
    	List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
        return materiasAprobadas.containsAll(correlativas);
    }
}

