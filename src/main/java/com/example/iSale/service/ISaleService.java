package com.example.iSale.service;

import com.example.iSale.dto.request.ISaleRequest;
import com.example.iSale.global.domain.entity.ISale;
import java.util.List;

public interface ISaleService {
    void addISale(ISaleRequest req);
    ISale getISaleById(Long id);
    List<ISale> getAllISale();
}
