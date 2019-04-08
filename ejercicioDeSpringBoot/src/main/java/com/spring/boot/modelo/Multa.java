package com.spring.boot.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Multa
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String matricula;
	private String categoria;
	private Integer cantidad;
	
	public Multa()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Multa(String matricula, String categoria, Integer cantidad)
	{
		super();
		this.matricula = matricula;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public String getCategoria()
	{
		return categoria;
	}

	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}

	public Integer getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(Integer cantidad)
	{
		this.cantidad = cantidad;
	}
}