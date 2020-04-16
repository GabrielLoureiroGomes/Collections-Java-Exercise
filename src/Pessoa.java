public class Pessoa {
    private String nome;
    private String email;
    private char sexo;
    private String grupo;

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setContato(String nome, String email, char sexo, String grupo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
