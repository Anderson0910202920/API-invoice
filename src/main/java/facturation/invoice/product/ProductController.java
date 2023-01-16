package facturation.invoice.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin({"*"})
public class ProductController {
    @Autowired
    ProductService productoService;

    @GetMapping("/")
    public List<Product> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}/")
    public Product findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping("/")
    public Product save(@RequestBody Product entity) {
        return productoService.save(entity);
    }

    @PutMapping("/{id}/")
    public Product update(@RequestBody Product entity) {
        return productoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }

}
