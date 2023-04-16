# Validador-de-Correlativas-Java


Ejercicio Integrador Intermedio
Validador de Correlativas
Introducción
Nos han solicitado el desarrollo de un Validador de Correlativas. En las carreras terciarias y
universitarias, para ordenar la currícula y asegurar que que cuando se inicia una materia se
tienen todos los conocimientos necesarios para entenderla, se establece lo que se llama
comúnmente materias correlativas. Básicamente, son materias que hay que cursar antes de
cursar la materia en cuestión. Por ejemplo antes de cursar Programación III hay que cursar
Programación II y antes de esta hay que cursar Programación I, donde esta última, no tiene
correlativas.
Consigna
La propuesta del trabajo integrador consiste en implementar un programa que tome como
argumento una lista de inscripciones, y escriba en un archivo otro con la misma cantidad de
renglones, indicando que la inscripción fue aceptada o rechazada.
Partiendo del siguiente diagrama de clases:
Se proponen los siguientes pasos:
![image](https://user-images.githubusercontent.com/80794759/232348833-06ac6f6b-9b5b-4903-b47a-ef4063459e81.png)

1. Implementar el diseño en un proyecto Maven.
2. Generar 2 tests para el método Inscripción#aprobada:
a. Una materia sin correlativas
b. Una materia con correlativas y que el alumno las tenga
c. Otra materia sin correlativas, y que el alumno no las tenga
3. Finalmente implementar el programa, puede seguir el siguiente esquema:
public static void main(String[] args) {
// Inicializar materias: crear 3 o 4 materias, con y sin correlativas
entre ellas
Collection<Materia> materias = … ;
// Inicializar los alumnos, crear 2 o 3 alumnos, con y sin materias
aprobadas.
// Usar para las materias los MISMOS objetos de la colección de más
arriba
Collection<Alumno> alumnos = … ;
// Leer el archivo parado por parámetros de args y por cada línea
// instanciar un objeto Inscripción, pero para llenar las materias y
alumnos DEBE usar los objetos que creo más arriba
// Imprimir la línea, con el resultado si la inscripción está o no ok
}
Ejemplo del archivo de inscripciones
inscripciones.csv
Alumno Materia
José Rodríguez Programación I
Vanesa Sosa Bases de datos I
Lucia Pérez Bases de datos I
Vanesa Sosa Programación II
4. Puede agregar una validación, que si el alumno o la materia del csv no está en la
colección que usted creó, ese renglón marque un error.
Un ejemplo de salida:
José Rodríguez Programación I Aprobado
Vanesa Sosa Bases de datos I Aprobado
Lucia Perez Bases de datos I No existe el/la alumno/a
Vanesa Sosa Programación II Rechazado
