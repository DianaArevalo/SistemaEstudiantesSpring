package hagwoon.estudiantes.servicio;

import hagwoon.estudiantes.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {// metodos basicos
    public List<Estudiante> listarEstudiantes();

    public Estudiante buscarEstudiantePorId(Integer idEstudiante);

    public void guardarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);


}
