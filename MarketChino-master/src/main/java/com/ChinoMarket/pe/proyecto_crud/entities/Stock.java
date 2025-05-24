package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdProducto", referencedColumnName = "IdProducto")
    private Producto producto;

    private String descripcion;
    private Integer entradas;
    private Integer salidas;
    private Integer balance;


    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEntradas() {
        return entradas;
    }

    public void setEntradas(Integer entradas) {
        this.entradas = entradas;
    }

    public Integer getSalidas() {
        return salidas;
    }

    public void setSalidas(Integer salidas) {
        this.salidas = salidas;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
