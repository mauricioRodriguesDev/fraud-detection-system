package com.fraud.transaction_service.business.service;


import com.fraud.transaction_service.business.dto.TransactionDTO;
import com.fraud.transaction_service.business.mapper.TransactionMapper;
import com.fraud.transaction_service.infrastructure.entity.Transaction;
import com.fraud.transaction_service.infrastructure.respository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionDTO newTransaction(TransactionDTO dto) {

        dto.setCratedAt(LocalDateTime.now());
        Transaction transaction = transactionMapper.toEntity(dto);
        return transactionMapper.toDto(transactionRepository.save(transaction));


    }

}
