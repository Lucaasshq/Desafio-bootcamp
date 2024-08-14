package br.com.dio.desafio.dominio;

public class Curso {
    private String Titulo;
    private String Descricao;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
