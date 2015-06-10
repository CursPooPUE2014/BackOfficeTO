package friki.tienda.com.Persistencia;

import org.apache.struts.action.ActionForm;
//test
public class AdministradorBean extends ActionForm{
	private int idUsuario;
	private String email;
	private String contrasenya;
	private String rol;
	
	
	public AdministradorBean() {
	}
	public AdministradorBean(int idUsuario, String email, String contrasenya,
			String rol) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.contrasenya = contrasenya;
		this.rol = rol;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

}
