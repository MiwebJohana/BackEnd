package com.portfolio.SpringBoot.controller;

import com.portfolio.SpringBoot.interfaz.IAcercaDeService;
import com.portfolio.SpringBoot.models.AcercaDe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("acercade")
@CrossOrigin(origins = "http://localhost:4200")

public class AcercaDeController {

    @Autowired
    private IAcercaDeService iacercaDe;

    @GetMapping("/lista")
    @ResponseBody

    public List<AcercaDe> getAcercaDe() {
        return iacercaDe.getAcercaDe();
    }

    @PostMapping("/crear")
    public String createAcercaDe(@RequestBody AcercaDe acercaDe) {
        iacercaDe.saveAcercaDe(acercaDe);
        return "La información fue agregada correctamente";
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteAcercaDe(@PathVariable int id) {
        iacercaDe.deleteAcercaDe(id);
        return "La información fue eliminada correctamente";
    }

    @PutMapping("/editar")
    public AcercaDe editAcercaDe(@PathVariable int id,
            @RequestParam("info") String nuevaInfo) {

        AcercaDe acercaDe = iacercaDe.findAcercaDe(id);
        acercaDe.setInfoAcercaDe(nuevaInfo);

        iacercaDe.saveAcercaDe(acercaDe);

        return acercaDe;

    }
    @GetMapping("/buscar/{id}")
    public AcercaDe findAcercaDe(@PathVariable int id) {
        return iacercaDe.findAcercaDe(id);
    }
}
