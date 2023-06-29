package com.registro.usuarios.modelo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="direccion_proveedor")
public class DireccionProveedor {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "direccionProvID")	
	    private Long direccionprovid;

	    @Column(name = "domicilio_fiscal")
	    private String domicilioFiscal;

	    @Column(name = "pais")
	    private String pais;

	    @Column(name = "ciudad")
	    private String ciudad;


	    @OneToOne(mappedBy = "direccion_proveedor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	    private Proveedor proveedor;


	    

		public Long getDireccionprovid() {
			return direccionprovid;
		}




		public void setDireccionprovid(Long direccionprovid) {
			this.direccionprovid = direccionprovid;
		}




		public String getDomicilioFiscal() {
			return domicilioFiscal;
		}




		public void setDomicilioFiscal(String domicilioFiscal) {
			this.domicilioFiscal = domicilioFiscal;
		}




		public String getPais() {
			return pais;
		}




		public void setPais(String pais) {
			this.pais = pais;
		}




		public String getCiudad() {
			return ciudad;
		}




		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}




		public Proveedor getProveedor() {
			return proveedor;
		}




		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}



		


		public DireccionProveedor(Long direccionprovid, String domicilioFiscal, String pais, String ciudad,
				Proveedor proveedor) {
			super();
			this.direccionprovid = direccionprovid;
			this.domicilioFiscal = domicilioFiscal;
			this.pais = pais;
			this.ciudad = ciudad;
			this.proveedor = proveedor;
		}




		public DireccionProveedor() {
		}


	    
	
}

