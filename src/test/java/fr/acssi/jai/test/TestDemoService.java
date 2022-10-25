package fr.acssi.jai.test;


import fr.acssi.jai.entities.DemoEntity;
import fr.acssi.jai.service.DemoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestDemoService {


    @Autowired
    DemoService demoService;


    @Test
    public void testSavingDataBase()
    {
        DemoEntity demoEntity = new DemoEntity(1);
        DemoEntity dataBaseDemoEntity = demoService.save(demoEntity);
        Assertions.assertEquals(demoEntity.getTestColumn(),dataBaseDemoEntity.getTestColumn());
    }
}
