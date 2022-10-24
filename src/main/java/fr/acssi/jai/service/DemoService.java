package fr.acssi.jai.service;

import fr.acssi.jai.entities.DemoEntity;
import fr.acssi.jai.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;


    public DemoEntity save(DemoEntity demo) {
        return demoRepository.save(demo);
    }

    public List<DemoEntity> getAllDemoEntities() {
        return demoRepository.findAll();
    }

    public DemoEntity findDemoEntitybyId(Integer id) {
        Optional<DemoEntity> optionalDemoEntity = demoRepository.findById(id);
        return optionalDemoEntity.isPresent() ? optionalDemoEntity.get() : null;
    }

    public void initDatabase() {
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            DemoEntity demo = new DemoEntity(random.nextInt());
            demoRepository.save(demo);
        }

    }
}
