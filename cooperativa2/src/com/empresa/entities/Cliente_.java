package com.empresa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-07T08:45:16.286-0600")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> idCliente;
	public static volatile SingularAttribute<Cliente, String> esMiembro;
	public static volatile ListAttribute<Cliente, Beneficiario> beneficiarios;
	public static volatile SingularAttribute<Cliente, Persona> persona;
	public static volatile ListAttribute<Cliente, Cuenta> cuentas;
	public static volatile ListAttribute<Cliente, Referencia> referencias;
}
