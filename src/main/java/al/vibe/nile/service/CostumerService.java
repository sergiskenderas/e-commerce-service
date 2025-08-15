package al.vibe.nile.service;

import al.vibe.nile.entity.Costumer;
import al.vibe.nile.repository.CostumerRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CostumerService {
    public static final Logger log = LoggerFactory.getLogger(CostumerService.class);

    private final CostumerRepository repository;

    public CostumerService(CostumerRepository costumerRepository){
        this.repository = costumerRepository;
    }

    public Set<Costumer> getList() {
       return Set.copyOf(repository.findAll());
    }

    public Costumer getById(Long id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException("Costumer "
                                + id + " not found"));
    }

    @Transactional
    public Costumer create(Costumer costumer) {
       return repository.saveAndFlush(costumer);
    }

    @Transactional
    public Costumer update(Long id, Costumer costumer) {
        return  repository.saveAndFlush(costumer);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
