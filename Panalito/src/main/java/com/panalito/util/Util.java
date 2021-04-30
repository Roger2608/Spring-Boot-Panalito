package com.panalito.util;

import java.util.ResourceBundle;

public class Util {

	public static int SUELDO_VENDEDOR;
	public static int SUELDO_REPARTIDOR;
	public static int COSTO_PRODUCTO;
	public static int COSTO_ENVIO;

	public static int opc;

	static {
		ResourceBundle properties = ResourceBundle.getBundle("util.config");
		SUELDO_VENDEDOR = Integer.parseInt(properties.getString("sVendedor"));
		SUELDO_REPARTIDOR = Integer.parseInt(properties.getString("sRepartidor"));
		COSTO_PRODUCTO = Integer.parseInt(properties.getString("cProducto"));
		COSTO_ENVIO = Integer.parseInt(properties.getString("cEnvio"));
		opc = Integer.parseInt(properties.getString("opc"));
		
	}
}
