package al.vibe.nile.service;

import al.vibe.nile.entity.Business;
import al.vibe.nile.entity.Costumer;
import al.vibe.nile.repository.BusinessRepository;
import jakarta.persistence.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class BusinessService {
    public static final Logger log = LoggerFactory.getLogger(BusinessService.class);

    private BusinessRepository repository;

    public BusinessService(BusinessRepository businessRepository) {
        this.repository = businessRepository;
    }

    public Set<Business> getList() {
        return Set.copyOf(repository.findAll());
    }

    public Business getById(Long id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException("Business "
                                + id + " not found"));
    }
}
