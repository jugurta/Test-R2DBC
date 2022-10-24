package fr.acssi.jai.controller;


import fr.acssi.jai.entities.DemoEntity;
import fr.acssi.jai.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/demo")

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @PostMapping
    public ResponseEntity<DemoEntity> createDemoEntity(@RequestBody DemoEntity demo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(demoService.save(demo));
    }

    @GetMapping
    public ResponseEntity<List<DemoEntity>> getDemoEntities(){
        return ResponseEntity.status(HttpStatus.OK).body(demoService.getAllDemoEntities());
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<DemoEntity> getResourceById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(demoService.findDemoEntitybyId(id));

    }
    @PutMapping
    public void initDatabase()
    {
        demoService.initDatabase();
    }

}

