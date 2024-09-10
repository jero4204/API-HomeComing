package com.example.apihomecoming.dao;

import com.example.apihomecoming.modelentity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface IHomeDAO
        extends JpaRepository<Home, Long> {
    @Query("SELECT e FROM Home e WHERE "
            + "(e.field1 = ?1) AND " + "(e.field2 = ?2) AND " + "(e.field3 = ?3) AND "
            + "(e.field4 = ?4) AND " + "(e.field5 = ?5) AND "+ "(e.field6 = ?6) AND "
            + "(e.field7 = ?7) AND " + "(e.field8 = ?8) AND " + "(e.field9 = ?9) AND "
            + "(e.field10 = ?10) AND " + "(e.field11 = ?11)" )
    List<Home> findHomeByFilters(int numerohabitaciones, int numerobanos,
                                 boolean parqueadero, boolean vigilancia,
                                 boolean piscina, boolean gimnasio, boolean wifi,
                                 boolean lavanderia, boolean EIA, boolean EAFIT,
                                 boolean UPB);
}
