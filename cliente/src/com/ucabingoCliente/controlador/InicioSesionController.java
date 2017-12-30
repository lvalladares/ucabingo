package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.InicioSesion;
import com.ucabingoCliente.vista.Menu;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class InicioSesionController implements ActionListener {

		private InicioSesion ventana;
		
		public InicioSesionController(InicioSesion ventana) {
			this.ventana = ventana;
			this.ventana.frame.setVisible(true);
			
			this.ventana.ingresarBoton.addActionListener(this);
			this.ventana.salirBoton.addActionListener(this);
		}
		
		public boolean verificarCampos(String texto, char[] clave) {
			if ((texto.equals(""))&&(clave.length == 0)) {
				return false;
			}
			if ((!(texto.equals("")))&&(clave.length == 0)) {
				return false;
			}
			if ((texto.equals(""))&&(clave.length != 0)) {
				return false;
			}
			return true;
		}
		
		public void actionPerformed(ActionEvent accion) {
			if(this.ventana.ingresarBoton == accion.getSource()) {
				if (verificarCampos(this.ventana.usuarioTxt.getText(),this.ventana.passTxt.getPassword())) {
					Menu ventanaMenu = new Menu();
					MenuController controladorMenu = new MenuController(ventanaMenu);
					this.ventana.frame.dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Campo inválido o vacío");
				}
			}
			if(this.ventana.salirBoton == accion.getSource()) {
				this.ventana.frame.dispose();
			}
		}

}
