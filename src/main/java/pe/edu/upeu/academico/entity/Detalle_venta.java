package pe.edu.upeu.academico.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_venta")
public class Detalle_venta implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iddetalle_venta;
	private double precio;
	private int cantidad;
	private int idproducto;
	private int idventa;


	public long getIddetalle_venta() {
		return iddetalle_venta;
	}
	public void setIddetalle_venta(long iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa){
		this.idventa = idventa;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
