package com.empresa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-08T14:07:57.907-0600")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Integer> idPersona;
	public static volatile SingularAttribute<Persona, String> apellidos;
	public static volatile SingularAttribute<Persona, String> nombres;
	public static volatile SingularAttribute<Persona, String> numeroDocumento;
	public static volatile ListAttribute<Persona, Beneficiario> beneficiarios;
	public static volatile ListAttribute<Persona, Cliente> clientes;
	public static volatile ListAttribute<Persona, Direccion> direccions;
	public static volatile ListAttribute<Persona, Referencia> referencias;
	public static volatile ListAttribute<Persona, Telefono> telefonos;
}
