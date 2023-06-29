package com.registro.usuarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedorID")
    private Long proveedorID;
    
    @Column(name = "proveedorNombre")
    private String proveedorNombre;
    
    @Column(name = "proveedorRuc")
    private String proveedorRuc;
    
    @Column(name = "proveedorRsocial")
    private String proveedorRsocial;
    
    @Column(name = "proveedorTelefono")
    private String proveedorTelefono;
    
    @Column(name = "proveedorDireccion")
    private String proveedorDireccion;
    
    @Column(name = "proveedorContacto")
    private String proveedorContacto;
    
    @Column(name = "estadoProveedor")
    private String estadoProveedor;
    
    @JoinColumn(name ="direccionProvID")
    @OneToOne(fetch = FetchType.LAZY)
    private DireccionProveedor direccion_proveedor;
    
 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pagoID")
    private PagoProveedor pagoProveedor;

 
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tproveedorID")
    private TipoProveedor tproveedorID;
    
    @OneToOne(mappedBy = "proveedor")
    private Solicitud solicitud;
    
	public Long getProveedorID() {
		return proveedorID;
	}

	public void setProveedorID(Long proveedorID) {
		this.proveedorID = proveedorID;
	}

	public String getProveedorNombre() {
		return proveedorNombre;
	}

	public void setProveedorNombre(String proveedorNombre) {
		this.proveedorNombre = proveedorNombre;
	}

	public String getProveedorRuc() {
		return proveedorRuc;
	}

	public void setProveedorRuc(String proveedorRuc) {
		this.proveedorRuc = proveedorRuc;
	}

	public String getProveedorRsocial() {
		return proveedorRsocial;
	}

	public void setProveedorRsocial(String proveedorRsocial) {
		this.proveedorRsocial = proveedorRsocial;
	}

	public String getProveedorTelefono() {
		return proveedorTelefono;
	}

	public void setProveedorTelefono(String proveedorTelefono) {
		this.proveedorTelefono = proveedorTelefono;
	}

	public String getProveedorDireccion() {
		return proveedorDireccion;
	}

	public void setProveedorDireccion(String proveedorDireccion) {
		this.proveedorDireccion = proveedorDireccion;
	}

	public String getProveedorContacto() {
		return proveedorContacto;
	}

	public void setProveedorContacto(String proveedorContacto) {
		this.proveedorContacto = proveedorContacto;
	}

	public String getEstadoProveedor() {
		return estadoProveedor;
	}

	public void setEstadoProveedor(String estadoProveedor) {
		this.estadoProveedor = estadoProveedor;
	}
	
	
	public DireccionProveedor getDireccion_proveedor() {
		return direccion_proveedor;
	}

	public void setDireccion_proveedor(DireccionProveedor direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}

	public TipoProveedor getTproveedorID() {
		return tproveedorID;
	}

	public void setTproveedorID(TipoProveedor tproveedorID) {
		this.tproveedorID = tproveedorID;
	}

		public PagoProveedor getPagoProveedor() {
		return pagoProveedor;
	}

	public void setPagoProveedor(PagoProveedor pagoProveedor) {
		this.pagoProveedor = pagoProveedor;
	}

	
		

	public Proveedor(String proveedorNombre, String proveedorRuc, String proveedorRsocial, String proveedorTelefono,
			String proveedorDireccion, String proveedorContacto, String estadoProveedor,
			DireccionProveedor direccion_proveedor, PagoProveedor pagoProveedor, TipoProveedor tproveedorID) {
		super();
		this.proveedorNombre = proveedorNombre;
		this.proveedorRuc = proveedorRuc;
		this.proveedorRsocial = proveedorRsocial;
		this.proveedorTelefono = proveedorTelefono;
		this.proveedorDireccion = proveedorDireccion;
		this.proveedorContacto = proveedorContacto;
		this.estadoProveedor = estadoProveedor;
		this.direccion_proveedor = direccion_proveedor;
		this.pagoProveedor = pagoProveedor;
		this.tproveedorID = tproveedorID;
	}

	public Proveedor(Long proveedorID, String proveedorNombre, String proveedorRuc, String proveedorRsocial,
			String proveedorTelefono, String proveedorDireccion, String proveedorContacto, String estadoProveedor,
			DireccionProveedor direccion_proveedor, PagoProveedor pagoProveedor, TipoProveedor tproveedorID) {
		super();
		this.proveedorID = proveedorID;
		this.proveedorNombre = proveedorNombre;
		this.proveedorRuc = proveedorRuc;
		this.proveedorRsocial = proveedorRsocial;
		this.proveedorTelefono = proveedorTelefono;
		this.proveedorDireccion = proveedorDireccion;
		this.proveedorContacto = proveedorContacto;
		this.estadoProveedor = estadoProveedor;
		this.direccion_proveedor = direccion_proveedor;
		this.pagoProveedor = pagoProveedor;
		this.tproveedorID = tproveedorID;
	}

	public Proveedor() {
	}
    
    // Constructor, getters, setters, etc.
}

