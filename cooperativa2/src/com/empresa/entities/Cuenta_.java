package com.empresa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-07T08:45:16.291-0600")
@StaticMetamodel(Cuenta.class)
public class Cuenta_ {
	public static volatile SingularAttribute<Cuenta, Integer> idCuenta;
	public static volatile SingularAttribute<Cuenta, String> numerocuenta;
	public static volatile SingularAttribute<Cuenta, Float> saldo;
	public static volatile SingularAttribute<Cuenta, Float> totalAbonos;
	public static volatile SingularAttribute<Cuenta, Float> totalCargos;
	public static volatile SingularAttribute<Cuenta, Cliente> cliente;
	public static volatile SingularAttribute<Cuenta, Cuentatipo> cuentatipo;
	public static volatile ListAttribute<Cuenta, Transaccion> transaccions;
}
