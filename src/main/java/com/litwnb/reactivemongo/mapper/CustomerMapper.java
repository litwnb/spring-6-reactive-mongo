package com.litwnb.reactivemongo.mapper;

import com.litwnb.reactivemongo.domain.Customer;
import com.litwnb.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerToCustomerDto(Customer customer);

    CustomerDTO customerDTOToCustomer(CustomerDTO customerDTO);
}
