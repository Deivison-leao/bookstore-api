package com.deivison.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livro {
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String descrição;

	private Categoria cotegoria;

	public Livro() {
		super();
	}

	public Livro(Integer id, String titulo, String nome_autor, String descrição, Categoria cotegoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.descrição = descrição;
		this.cotegoria = cotegoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Categoria getCotegoria() {
		return cotegoria;
	}

	public void setCotegoria(Categoria cotegoria) {
		this.cotegoria = cotegoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
