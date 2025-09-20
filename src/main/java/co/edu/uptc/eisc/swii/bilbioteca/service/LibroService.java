package co.edu.uptc.eisc.swii.bilbioteca.service;

import co.edu.uptc.eisc.swii.bilbioteca.domain.Libro;
import co.edu.uptc.eisc.swii.bilbioteca.repository.LibroRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepsitory) {
        this.libroRepository = libroRepsitory;
    }
    
    public List<Libro> buscarDestacados(){  
        return libroRepository.buscarTodos();
    }
    
     public List<Libro> buscarPorEditorial(int editorialId){  
        return libroRepository.buscarPorEditorial(editorialId);
    }
     
     public List<Libro> buscar(String consulta){  
        return libroRepository.buscar(consulta);
    }    
     
     public Libro guardar(Libro libro){
         return libroRepository.save(libro);
     }
     
}
