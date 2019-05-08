package com.empresa.test;

import java.util.ArrayList;
import java.util.List;

import com.empresa.dao.PersonaDao;
import com.empresa.entities.Cliente;
import com.empresa.entities.Direccion;
import com.empresa.entities.Persona;
import com.empresa.entities.Telefono;

public class PersonaTest 
{
	public static void main(String[] args) 
	{
		Persona persona = new Persona();//cliente
		persona.setNombres("Luis");
		persona.setApellidos("Escobar");
		persona.setNumeroDocumento("ñ2-hgj133d34hd4");
		
		List<Cliente> cliList = new ArrayList<Cliente>();
		Cliente cli = new Cliente();
		cli.setEsMiembro("1");
		cli.setPersona(persona);
		cliList.add(cli);
		
		List<Telefono> telList = new ArrayList<Telefono>();
		Telefono telCli = new Telefono();
		telCli.setTelefono("2516564-354245");
		telCli.setPersona(persona);
		telList.add(telCli);
		telCli = new Telefono();
		telCli.setTelefono("215425-134354");
		telCli.setPersona(persona);
		telList.add(telCli);
		
		List<Direccion> dirList = new ArrayList<Direccion>();
		Direccion dic = new Direccion();
		dic.setDireccion("Direccion uno");
		dic.setPersona(persona);
		dirList.add(dic);
		
		persona.setDireccions(dirList);
		persona.setTelefonos(telList);
		persona.setClientes(cliList);
		
		//guardando persona
		PersonaDao perDao = new PersonaDao();
		Persona perRest = perDao.insertPersona(persona);
		System.out.println("id persona insertada :"+ perRest.getIdPersona());
		
		
	} 
}