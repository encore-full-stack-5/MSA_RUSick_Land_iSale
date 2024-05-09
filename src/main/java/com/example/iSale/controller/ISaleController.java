package com.example.iSale.controller;

import com.example.iSale.dto.request.ISaleRequest;
import com.example.iSale.global.domain.entity.ISale;
import com.example.iSale.service.ISaleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/iSale")
@RequiredArgsConstructor
public class ISaleController {

    private final ISaleService iSaleService;

    @PostMapping("/add/")
    public void addISale(@RequestBody ISaleRequest req){
        iSaleService.addISale(req);
    }

    @GetMapping("{id}")
    public ISale getISale(@PathVariable Long id){
        return iSaleService.getISaleById(id);
    }

    @GetMapping()
    public List<ISale> getAllISale(){
        return iSaleService.getAllISale();
    }
}