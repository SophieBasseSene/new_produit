package sn.esmt.vente.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.vente.entity.ProduitEntity;
import sn.esmt.vente.repository.ProduitRepository;
import sn.esmt.vente.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;

  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){
    return produitService.save(produitEntity);
  }

  @GetMapping
  public List<ProduitEntity> all(){
    return produitService.getALL().get();
  }
  @PutMapping
  public ProduitEntity update(String ref , ProduitEntity produitEntity){
    return produitService.update(ref, produitEntity);
  }

  @DeleteMapping
  public void delete(String ref ) {
    produitService.delete(ref);
  }

}
