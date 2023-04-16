package correlativas;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class InscripcionTest {
	private Alumno alumno;
	private Materia mate1;
	private Materia mate2;
	private Materia fisica2;
	private Inscripcion inscripcion1;
	private Inscripcion inscripcion2;
	private Inscripcion inscripcion3;

	@Before
	public void setUp() {
		Alumno alumno = new Alumno("Juan", "12345");

		Materia mate1 = new Materia("Matematica 1");

		Materia mate2 = new Materia("Matematica 2");
		mate2.setCorrelativas(mate1);
				
		Materia fisica2 = new Materia("Fisica 2");
		fisica2.setCorrelativas(new Materia("Fisica 1"));


		List<Materia> materiasAprobadasPorJuan = new ArrayList<Materia>();
		materiasAprobadasPorJuan.add(mate1);
		alumno.setMateriasAprobadas(materiasAprobadasPorJuan);

		inscripcion1 = new Inscripcion(alumno, mate1, LocalDateTime.now());
		inscripcion2 = new Inscripcion(alumno, mate2, LocalDateTime.now());
		inscripcion3 = new Inscripcion(alumno, fisica2, LocalDateTime.now());
	}

	@Test
	public void testAprobadaMateriaSinCorrelativas() {
		assertTrue(inscripcion1.aprobada());
	}

	@Test
	public void testAprobadaMateriaConCorrelativas() {
		assertTrue(inscripcion2.aprobada());
	}

	@Test
	public void testAprobadaMateriaSinCorrelativasAprobadas() {
		assertFalse(inscripcion3.aprobada());
	}
}
