package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "envio")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnvio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProducto", referencedColumnName = "IdProducto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private String direccion;
    private String estado;

    public Long getIdEnvio() {
        return idEnvio;
    }

    public void setId(Long idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
