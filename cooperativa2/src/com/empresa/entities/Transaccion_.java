package com.empresa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-05-07T08:45:16.330-0600")
@StaticMetamodel(Transaccion.class)
public class Transaccion_ {
	public static volatile SingularAttribute<Transaccion, Integer> idTransaccion;
	public static volatile SingularAttribute<Transaccion, Date> fecha;
	public static volatile SingularAttribute<Transaccion, Float> montoabono;
	public static volatile SingularAttribute<Transaccion, Float> montocargo;
	public static volatile SingularAttribute<Transaccion, Cuenta> cuenta;
}
