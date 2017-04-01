package br.com.triadworks.bugtracker.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.triadworks.bugtracker.dao.UsuarioDao;
import br.com.triadworks.bugtracker.modelo.Usuario;

@ManagedBean
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios;
	
	private String nome;
	private String login;
	private String senha;
	
	public void excluir(Usuario usuario) {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.remove(usuario);
		this.usuarios = usuarioDao.lista();
	}
	
	public void listar() {
		UsuarioDao dao = new UsuarioDao();
		this.usuarios = dao.lista();
	}
	
	public void salvar() {
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.adiciona(usuario);
		this.usuario = new Usuario();
	}
	
	public void altera() {
		UsuarioDao dao = new UsuarioDao();
		dao.atualiza(usuario);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
