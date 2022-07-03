package aplicacion.software.controller;

import aplicacion.software.entity.Nota;
import aplicacion.software.repository.NotaReoisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class NotaController {

    @Autowired
    private NotaReoisitory notaReoisitory;

    @GetMapping("/nota")
    public List<Nota> fetchNota(){
        return notaReoisitory.findAll();
    }
}
