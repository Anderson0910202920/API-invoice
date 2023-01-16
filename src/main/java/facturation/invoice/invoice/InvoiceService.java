package facturation.invoice.invoice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository facturaRepository;

    public Invoice save(Invoice entity) {
        return facturaRepository.save(entity);
    }

    public Invoice findById(Long id) {
        return facturaRepository.findById(id).orElse(new Invoice());
    }

    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    public List<Invoice> findAll() {
        return facturaRepository.findAll();
    }
}
