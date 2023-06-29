package com.registro.usuarios.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_proveedor")
public class TipoProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tproveedorID")
    private Long tproveedorID;
    
    @Column(name = "tipoproveedor")
    private Long tipoproveedor;
 
    
    @OneToOne(mappedBy = "tproveedorID", fetch = FetchType.LAZY)
    private Proveedor proveedor;

    
	public Long getTproveedorID() {
		return tproveedorID;
	}




	public void setTproveedorID(Long tproveedorID) {
		this.tproveedorID = tproveedorID;
	}




	public Long getTipoproveedor() {
		return tipoproveedor;
	}




	public void setTipoproveedor(Long tipoproveedor) {
		this.tipoproveedor = tipoproveedor;
	}




	public Proveedor getProveedor() {
		return proveedor;
	}




	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}




	public TipoProveedor(Long tipoproveedor, Proveedor proveedor) {
		super();
		this.tipoproveedor = tipoproveedor;
		this.proveedor = proveedor;
	}




	public TipoProveedor(Long tproveedorID, Long tipoproveedor, Proveedor proveedor) {
		super();
		this.tproveedorID = tproveedorID;
		this.tipoproveedor = tipoproveedor;
		this.proveedor = proveedor;
	}




	public TipoProveedor() {
	}
		
	
}