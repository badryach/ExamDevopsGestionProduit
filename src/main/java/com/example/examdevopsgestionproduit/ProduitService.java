package com.example.examdevopsgestionproduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAllProduit() {
        return this.produitRepository.findAll(Sort.by(Sort.Direction.DESC, "libelle"));
    }
    public void SaveProduit(Produit p)
    {
        produitRepository.save(p);

    }
}
