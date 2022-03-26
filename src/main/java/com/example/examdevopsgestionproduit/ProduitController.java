package com.example.examdevopsgestionproduit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "produit")
public class ProduitController {

    @Autowired
    private ProduitService produitService;
    @GetMapping
    public List<Produit> getPageReports(){
        return produitService.getAllProduit();
    }

}
