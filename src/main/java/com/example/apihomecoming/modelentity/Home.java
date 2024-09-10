package com.example.apihomecoming.modelentity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity()
@Table(name="home")
@Data()
public class Home implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter()
    @Setter()
    private Long id;
    @Column()
    @Getter()
    @Setter()
    private String name;
    @Column()
    @Getter()
    @Setter()
    private int numerohabitaciones;
    @Column()
    @Getter()
    @Setter()
    private int numerobanos;
    @Column()
    @Getter()
    @Setter()
    private boolean parqueadero;
    @Column()
    @Getter()
    @Setter()
    private boolean vigilancia;
    @Column()
    @Getter()
    @Setter()
    private boolean piscina;
    @Column()
    @Getter()
    @Setter()
    private boolean gimnasio;
    @Column()
    @Getter()
    @Setter()
    private boolean wifi;
    @Column()
    @Getter()
    @Setter()
    private boolean lavanderia;
    @Column()
    @Getter()
    @Setter()
    private String direccion;
    @Column()
    @Getter()
    @Setter()
    private Long precio;
    @Column()
    @Getter()
    @Setter()
    private boolean EIA;
    @Column()
    @Getter()
    @Setter()
    private boolean EAFIT;
    @Column()
    @Getter()
    @Setter()
    private boolean UPB;
    @Column()
    @Getter()
    @Setter()
    private String Descripcion;
    @Column()
    @Getter()
    @Setter()
    private String Imagen;
}
