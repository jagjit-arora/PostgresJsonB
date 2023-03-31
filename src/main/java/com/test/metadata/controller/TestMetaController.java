package com.test.metadata.controller;

import com.test.metadata.entities.TestMeta;
import com.test.metadata.repository.TestMetaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestMetaController {

    @Autowired
    private TestMetaRepository testMetaRepository;

    @GetMapping("test/{id}")
    public TestMeta getTestMeta(@PathVariable("id") Long id) {
        return testMetaRepository.findById(id).orElse(null);
    }

    @PostMapping("test")
    public TestMeta post(@RequestBody TestMeta testMeta) {
        log.info("request: {}", testMeta);
        return testMetaRepository.save(testMeta);
    }
}
