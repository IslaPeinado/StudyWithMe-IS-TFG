package com.example.swm.repository;

import com.example.swm.entity.Alumnos;
import com.example.swm.entity.Profesores;
import com.example.swm.entity.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

public interface TareasRepository extends JpaRepository<Tareas, Integer> {
    @Query("SELECT t FROM Tareas t WHERE t.titulo_tarea = :titulo_tarea")
    Optional<Tareas> findTareasByTitulo(@Param("titulo_tarea") String titulo_tarea);

    @Query("SELECT t FROM Tareas t JOIN TareaAsignatura ta ON t.id_tarea = ta.idTarea WHERE ta.idAsignatura = :idAsignatura")
    List<Tareas> findByAsignaturaId(int idAsignatura);

    @Query("SELECT t FROM Tareas t JOIN TareaAsignatura ta ON t.id_tarea = ta.idTarea WHERE ta.idAsignatura = :id_asignatura")
    List<Tareas> findTareasByAsignaturaId(@Param("id_asignatura") int idAsignatura);



}
