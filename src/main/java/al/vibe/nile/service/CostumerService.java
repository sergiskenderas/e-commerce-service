package al.vibe.nile.service;

import al.vibe.nile.dto.CreateCostumerDto;
import al.vibe.nile.entity.Costumer;
import al.vibe.nile.repository.CostumerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CostumerService {
    public static final Logger log = LoggerFactory.getLogger(CostumerService.class);
    @Autowired
    private CostumerRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<Costumer> getList(){
        return(repository.findAll());
    }

    public Costumer getById(Long id)  {
        return repository.findById(id)
                .orElseThrow(
                        () -> new EntityNotFoundException("Costumer "
                                + id + " not found"));
    }

    public Costumer create(CreateCostumerDto createCostumerDto) {
        Costumer costumer = modelMapper.map(createCostumerDto, Costumer.class);
        return repository.save(costumer);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Costumer update(CreateCostumerDto createCostumerDto, Long id) {
        Costumer existingCostumer = getById(id);
        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.map(createCostumerDto, existingCostumer);
        return repository.save(existingCostumer);
    }

}
