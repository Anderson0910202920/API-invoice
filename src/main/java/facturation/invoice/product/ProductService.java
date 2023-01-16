package facturation.invoice.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository entityRepository;

    public Product save(Product entity) {
        return entityRepository.save(entity);
    }

    public Product findById(Long id) {
        return entityRepository.findById(id).orElse(new Product());
    }

    public void deleteById(Long id) {
        entityRepository.deleteById(id);
    }

    public List<Product> findAll() {
        return entityRepository.findAll();
    }

}
