package co.edu.uptc.eisc.swii.bilbioteca.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uptc.eisc.swii.bilbioteca.domain.Libro;
import co.edu.uptc.eisc.swii.bilbioteca.service.LibroService;

@Controller
public class ListadoController {

  private final LibroService libroService;

  public ListadoController(LibroService libroService) {
    this.libroService = libroService;
  }

  @RequestMapping("/")
  public String listarLibros(Model model) {
    List<Libro> destacados = libroService.buscarDestacados();
    model.addAttribute("libros", destacados);
    return "listado";
  }

  @RequestMapping("/librosPorEditorial")
  public String listarLibrosPorEditorial(int editorialId, Model model) {
    List<Libro> libros = libroService.buscarPorEditorial(editorialId);
    model.addAttribute("libros", libros);
    return "listado";
  }

  @RequestMapping("/buscar")
  public String buscar(String consulta, Model model) {
    List<Libro> libros = libroService.buscar(consulta);
    model.addAttribute("libros", libros);
    return "listado";
  }
}
