package com.example.iSale.service;

import com.example.iSale.dto.request.ISaleRequest;
import com.example.iSale.global.domain.entity.ISale;
import com.example.iSale.global.domain.repository.ISaleRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ISaleServiceImpl implements ISaleService {
    private final ISaleRepository saleRepository;

    @Override
    public void addISale(ISaleRequest req) {
        saleRepository.save(req.toEntity());
    }

    @Override
    public ISale getISaleById(Long id) {
        Optional<ISale> byId = saleRepository.findById(id);
        return byId.orElseThrow(() -> new IllegalArgumentException("분양 정보 없음"));
        // return List.of();
    }

    @Override
    public List<ISale> getAllISale() {
        return saleRepository.findAll();
    }

    // 분양 신청
}
