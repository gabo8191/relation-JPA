
package co.edu.uptc.eisc.swii.bilbioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.uptc.eisc.swii.bilbioteca.domain.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

  @Query("from Libro l order by l.nombre")
  List<Libro> buscarTodos();

  @Query("from Libro l where l.editorial.id = ?1 order by l.nombre")
  List<Libro> buscarPorEditorial(int editorialId);

  @Query("from Libro l where l.nombre like %?1%")
  List<Libro> buscar(String consulta);

}
