package correlativas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Materia materia1 = new Materia("Materia1");
		Materia materia2 = new Materia("Materia2");
		Materia materia3 = new Materia("Materia3");

		materia2.setCorrelativas(materia1);

		materia3.setCorrelativas(materia1);
		materia3.setCorrelativas(materia2);

		Collection<Materia> materias = new ArrayList<>();
		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);

		Alumno juan = new Alumno("Juan", "12345");
		Alumno maria = new Alumno("Maria", "67890");
		Alumno pedro = new Alumno("Pedro", "54321");

		List<Materia> materiasAprobadasJuan = new ArrayList<>();
		materiasAprobadasJuan.add(materia1);
		juan.setMateriasAprobadas(materiasAprobadasJuan);

		List<Materia> materiasAprobadasMaria = new ArrayList<>();
		materiasAprobadasMaria.add(materia2);
		maria.setMateriasAprobadas(materiasAprobadasMaria);

		Collection<Alumno> alumnos = new ArrayList<>();
		alumnos.add(juan);
		alumnos.add(maria);
		alumnos.add(pedro);
		
		for (Materia materia : materias) {
			System.out.println(materia.getNombre());
		}
		
		System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Materias aprobadas:");
            for (Materia materia : alumno.getMateriasAprobadas()) {
                System.out.println("- " + materia.getNombre());
            }
        }
		// TODO
		// Leer el archivo pasado por parámetro en args y por cada línea
		// instanciar un objeto Inscripcion, pero para llenar las materias y alumnos
		// DEBE usar los objetos que se crearon más arriba
	}
}
