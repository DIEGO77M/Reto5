package mintic.unal.art.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mintic.unal.art.modelos.Pelicula;

@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Integer> {

}