package com.empresa.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.empresa.dao.CuentaDao;
import com.empresa.entities.Cuenta;
import com.empresa.entities.Persona;
import com.empresa.entities.Transaccion;

@ManagedBean
@ViewScoped
public class CuentasMB {
	private Persona afiliadoSeleccionado;
	private List<Persona> afiliados;
	private Cuenta cuentaSeleccionada;
	private List<Cuenta> cuentas;
	private List<Transaccion> transacciones;
	private CuentaDao cuDao;
	
	
	@PostConstruct
	public void init() {
		afiliadoSeleccionado = new Persona();
	    afiliados = new ArrayList<Persona>();
	    cuentaSeleccionada = new Cuenta();
		cuentas = new ArrayList<Cuenta>();
		transacciones = new ArrayList<Transaccion>();
		cuDao = new CuentaDao();
	}
	
	public void getClientes() {
		afiliados = cuDao.getClientes();
	}
	

}
