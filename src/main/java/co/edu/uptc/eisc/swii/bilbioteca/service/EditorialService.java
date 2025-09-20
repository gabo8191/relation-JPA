package co.edu.uptc.eisc.swii.bilbioteca.service;

import co.edu.uptc.eisc.swii.bilbioteca.domain.Editorial;
import co.edu.uptc.eisc.swii.bilbioteca.repository.EditorialRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {
    
    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }
    
    public List<Editorial> buscarTodos(){
        return editorialRepository.findAll();
    }
    
}
