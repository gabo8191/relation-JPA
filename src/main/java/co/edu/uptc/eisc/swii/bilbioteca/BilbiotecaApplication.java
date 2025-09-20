package co.edu.uptc.eisc.swii.bilbioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BilbiotecaApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(BilbiotecaApplication.class, args);
    Environment env = context.getEnvironment();

    String port = env.getProperty("server.port", "8080");
    String contextPath = env.getProperty("server.servlet.context-path", "");

    System.out.println("\n" + "=".repeat(60));
    System.out.println("APLICACIÓN INICIADA CORRECTAMENTE");
    System.out.println("=".repeat(60));
    System.out.println("URL Principal: http://localhost:" + port + contextPath);
    System.out.println("Listado de Libros: http://localhost:" + port + contextPath + "/");
    System.out.println("Nuevo Libro: http://localhost:" + port + contextPath + "/libros/crear");
    System.out.println("Buscar Libros: http://localhost:" + port + contextPath + "/buscar");
    System.out.println("=".repeat(60));
    System.out.println("Presiona Ctrl+C para detener la aplicación");
    System.out.println("=".repeat(60) + "\n");
  }

}
