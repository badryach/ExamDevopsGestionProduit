package com.example.examdevopsgestionproduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExamDevopsGestionProduitApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExamDevopsGestionProduitApplication.class, args);
    }
    @Autowired
    private ProduitService produitService;
    @Override
    public void run(String... args) throws Exception {
        Produit p1= new Produit(1L,"Ordinateur",4200.0);

        Produit p2= new Produit(2L,"Imprimante",1200.0);

        Produit p3= new Produit(3L,"Souris",200.0);
        produitService.SaveProduit(p1);
        produitService.SaveProduit(p2);
        produitService.SaveProduit(p3);
    }
}
