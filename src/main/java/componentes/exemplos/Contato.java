package componentes.exemplos;

import java.util.Date;

public class Contato {
	private String nome;
	private String email;
	private Date dataNascimento;
    // Getters e Setters
	public String getNome() { return nome; 	}
	public void setNome(String nome) { this.nome = nome; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public Date getDataNascimento() { return dataNascimento; }
	public void setDataNascimento(Date dataNascimento) { 
		this.dataNascimento = dataNascimento;
	}
}