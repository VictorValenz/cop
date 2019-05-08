package com.empresa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-07T08:45:16.297-0600")
@StaticMetamodel(Cuentatipo.class)
public class Cuentatipo_ {
	public static volatile SingularAttribute<Cuentatipo, Integer> idCuentatipo;
	public static volatile SingularAttribute<Cuentatipo, String> nombre;
	public static volatile ListAttribute<Cuentatipo, Cuenta> cuentas;
}
