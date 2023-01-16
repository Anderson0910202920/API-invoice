package facturation.invoice.invoice;

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
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/invoices")
@CrossOrigin({"*"})
public class InvoiceController {
    @Autowired
    InvoiceService facturaService;

    @GetMapping("/")
    public List<Invoice> findAll() {
        return facturaService.findAll();
    }

    @GetMapping("/{id}/")
    public Invoice findById(@PathVariable Long id) {
        return facturaService.findById(id);
    }

    @PostMapping("/")
    public Invoice save(@RequestBody Invoice entity) {
        return facturaService.save(entity);
    }

    @PutMapping("/{id}/")
    public Invoice update(@RequestBody Invoice entity) {
        return facturaService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        facturaService.deleteById(id);
    }

}
