import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descricao curso JavaScrpt");
        curso2.setCargaHoraria(2);


        Mentoria mentoria1 = new Mentoria();
        

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setDate(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao bootcamp java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);


        Dev devLucas = new Dev();

        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp1);


        System.out.println("Conteudos inscritos Lucas " + devLucas.getConteudosIncritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteudos concluidos Lucas " + devLucas.getConteudosConcluidos());
        System.out.println("XP " + devLucas.calcularTotalXp() );

        System.out.println("=================");

        Dev devJoao = new Dev();

        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Joao " + devJoao.getConteudosIncritos());
        System.out.println("Conteudos concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp() );






    }
}
