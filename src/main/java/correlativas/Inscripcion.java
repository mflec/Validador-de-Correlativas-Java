package correlativas;

import java.time.LocalDateTime;
import java.util.List;

class Inscripcion {
    private Alumno alumno;
    private Materia materia;
    private LocalDateTime fecha;

    public Inscripcion(Alumno alumno, Materia materia, LocalDateTime localDateTime) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = localDateTime;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }
}

