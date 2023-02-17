package com.ntt.demo2.controller;

import com.ntt.demo2.domain.Canale;
import com.ntt.demo2.domain.Monitor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class MonitorController {
    @GetMapping("/monitor")
    public ResponseEntity<Monitor> returnMonitor() {
        Monitor monitor = new Monitor();
        monitor.setColore("rosa");
        monitor.setMarca("huawei");
        return new ResponseEntity<>(monitor, HttpStatus.OK);
    }

    @PostMapping("/canale")
    public ResponseEntity<?> createMonitor(@RequestBody Monitor monitor){
        Monitor monitor1 = monitor;
        return new ResponseEntity<>(monitor1, HttpStatus.CREATED);
    }

    @PutMapping("/monitor")
    public ResponseEntity<?> updateMonitor(@RequestBody Monitor monitor) {
        Monitor monitor2 = new Monitor();
        return new ResponseEntity<>(monitor2, HttpStatus.OK);
    }




}
