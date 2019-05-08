package com.empresa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-07T08:45:16.278-0600")
@StaticMetamodel(Beneficiario.class)
public class Beneficiario_ {
	public static volatile SingularAttribute<Beneficiario, Integer> idBeneficiario;
	public static volatile SingularAttribute<Beneficiario, Integer> edad;
	public static volatile SingularAttribute<Beneficiario, String> parentesco;
	public static volatile SingularAttribute<Beneficiario, Float> porcentaje;
	public static volatile SingularAttribute<Beneficiario, Cliente> cliente;
	public static volatile SingularAttribute<Beneficiario, Persona> persona;
}
