package com.empresa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.empresa.entities.Cuenta;
import com.empresa.entities.Persona;
import com.empresa.entities.Transaccion;

public class CuentaDao {
	
	private Persona afiliadoSeleccionado;
	private List<Persona> afiliados;
	private Cuenta cuentaSeleccionada;
	private List<Cuenta> cuentas;
	private List<Transaccion> transacciones;
	
	public List<Persona> getClientes(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
		EntityManager em = emf.createEntityManager();
		try {
			afiliados = new ArrayList<Persona>();
			afiliados = em.createNamedQuery("find.clientes").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return afiliados;
	}
}
