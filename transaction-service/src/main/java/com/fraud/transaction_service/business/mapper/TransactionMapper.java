package com.fraud.transaction_service.business.mapper;


import com.fraud.transaction_service.business.dto.TransactionDTO;
import com.fraud.transaction_service.infrastructure.entity.Transaction;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TransactionMapper {


    TransactionDTO toDto(Transaction transaction);

    Transaction toEntity(TransactionDTO dto);


}
