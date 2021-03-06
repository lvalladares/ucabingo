package com.ucabingo.cliente.controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ucabingo.cliente.vista.CompraCarton;
import com.ucabingo.cliente.vista.InicioSesion;
import com.ucabingo.cliente.vista.Menu;
import com.ucabingo.cliente.vista.RegistrarUsuario;
/**
 * @author antonio
 *
 */
public class MenuController implements ActionListener{
	private Menu ventana;
	
	public MenuController(Menu ventana) {
		this.ventana = ventana;
		this.ventana.frame.setVisible(true);
		//Recordatorio: se debe agregar el actionListener para que funcione los botones.
		this.ventana.registrarUsuario.addActionListener(this);
		this.ventana.comprarCarton.addActionListener(this);
		this.ventana.cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent accion) {
		// TODO Auto-generated method stub
		if(this.ventana.registrarUsuario == accion.getSource()) {
			RegistrarUsuario ventanaRegistrar = new RegistrarUsuario();
			RegistrarUsuarioController controladorRegistrar = new RegistrarUsuarioController(ventanaRegistrar);
			this.ventana.frame.dispose();
		}
		if (this.ventana.comprarCarton == accion.getSource()) {
			CompraCarton ventanaNueva = new CompraCarton();
			CompraCartonController controladorNuevo = new CompraCartonController(ventanaNueva);
			this.ventana.frame.dispose();
		}
		if (this.ventana.cerrar == accion.getSource()) {
			InicioSesion ventanaInicio = new InicioSesion();
			InicioSesionController inicioController = new InicioSesionController(ventanaInicio);
			this.ventana.frame.dispose();
		}
	}
}
