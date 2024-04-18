package com.diallo.lab10.service;


import com.diallo.lab10.model.Address;
import com.diallo.lab10.repository.AddressRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private AddressRespository addressRespository;

    public AddressService(AddressRespository addressRespository) {
        this.addressRespository = addressRespository;
    }

    public Address save(Address address) {
        return addressRespository.save(address);
    }

    public List<Address> getAll() {
        return addressRespository.findAll();
    }
}
