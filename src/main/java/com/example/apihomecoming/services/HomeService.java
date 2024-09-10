package com.example.apihomecoming.services;

import com.example.apihomecoming.dao.IHomeDAO;
import com.example.apihomecoming.modelentity.Home;
import com.example.apihomecoming.modelentity.MyEntitySpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HomeService implements IHomeService {

    @Autowired
    private IHomeDAO homeDao;

    @Override
    public Home saveHome(Home home) {
        return homeDao.save(home);
    }

    @Override
    public List<Home> findHomeByFilters(int numerohabitaciones, int numerobanos,
                                        boolean parqueadero, boolean vigilancia,
                                        boolean piscina, boolean gimnasio, boolean wifi,
                                        boolean lavanderia, boolean EIA, boolean EAFIT,
                                        boolean UPB){
        return homeDao.findAll(MyEntitySpecification.withFilters(numerohabitaciones, numerobanos, parqueadero,
                                        vigilancia, piscina, gimnasio, wifi, lavanderia,
                                        EIA, EAFIT, UPB));
    }

    @Override
    public void deleteHomeById(Long id) {
        homeDao.deleteById(id);
    }


}
