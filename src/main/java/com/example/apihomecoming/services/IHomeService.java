package com.example.apihomecoming.services;

import com.example.apihomecoming.modelentity.Home;
import java.util.*;

public interface IHomeService {
    public Home saveHome(Home home);
    public List<Home> findHomeByFilters(int numerohabitaciones, int numerobanos,
                                        boolean parqueadero, boolean vigilancia,
                                        boolean piscina, boolean gimnasio, boolean wifi,
                                        boolean lavanderia, boolean EIA, boolean EAFIT,
                                        boolean UPB);
    public void deleteHomeById(Long id);
}
