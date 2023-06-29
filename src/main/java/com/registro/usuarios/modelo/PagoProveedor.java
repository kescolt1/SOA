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
@Table(name = "pago_proveedor")
public class PagoProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pagoID")	
    private Long pagoID;
    
    @Column(name = "terminosPago")
    private String terminosPago;
    
    @Column(name = "nroCuentaCorriente")
    private String nroCuentaCorriente;
    
    @Column(name = "emailPago")
    private String emailPago;
    
    @OneToOne(mappedBy = "pagoProveedor", fetch = FetchType.LAZY)
    private Proveedor proveedor;


	public Long getPagoID() {
		return pagoID;
	}

	public void setPagoID(Long pagoID) {
		this.pagoID = pagoID;
	}

	public String getTerminosPago() {
		return terminosPago;
	}

	public void setTerminosPago(String terminosPago) {
		this.terminosPago = terminosPago;
	}

	public String getNroCuentaCorriente() {
		return nroCuentaCorriente;
	}

	public void setNroCuentaCorriente(String nroCuentaCorriente) {
		this.nroCuentaCorriente = nroCuentaCorriente;
	}

	public String getEmailPago() {
		return emailPago;
	}

	public void setEmailPago(String emailPago) {
		this.emailPago = emailPago;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	
	public PagoProveedor(String terminosPago, String nroCuentaCorriente, String emailPago, Proveedor proveedor) {
		super();
		this.terminosPago = terminosPago;
		this.nroCuentaCorriente = nroCuentaCorriente;
		this.emailPago = emailPago;
		this.proveedor = proveedor;
	}

	public PagoProveedor(Long pagoID, String terminosPago, String nroCuentaCorriente, String emailPago,
			Proveedor proveedor) {
		super();
		this.pagoID = pagoID;
		this.terminosPago = terminosPago;
		this.nroCuentaCorriente = nroCuentaCorriente;
		this.emailPago = emailPago;
		this.proveedor = proveedor;
	}

	public PagoProveedor() {
	}
    
    
}

