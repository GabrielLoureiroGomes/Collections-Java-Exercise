import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Contatos {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        Pessoa pessoa5 = new Pessoa();
        Pessoa pessoa6 = new Pessoa();
        Pessoa pessoa7 = new Pessoa();
        Pessoa pessoa8 = new Pessoa();
        Pessoa pessoa9 = new Pessoa();
        Pessoa pessoa10 = new Pessoa();
        List<Pessoa> contatos = new ArrayList();

        pessoa1.setContato("Barbara Napoleao", "barbara.napoleao@ambev.com.br", 'F', "Vendedor");
        pessoa2.setContato("Antonio Carlos", "antonio.carlos@outlook.com", 'M', "Cliente");
        pessoa3.setContato("Maria Julia", "maria.julia@outlook.com", 'F', "Vendedor");
        pessoa4.setContato("Marcos Felipe", "marcos.felipe@outlook.com", 'M', "Vendedor");
        pessoa5.setContato("Debora Santos", "debora.santos@outlook.com", 'F', "Cliente");
        pessoa6.setContato("Bernardo Alves", "bernardo.alves@outlook.com", 'M', "Cliente");
        pessoa7.setContato("Aurora Lima", "aurora.lima@outlook.com", 'F', "Cliente");
        pessoa8.setContato("Joana Silva", "joana.silva@outlook.com", 'F', "Vendedor");
        pessoa9.setContato("Bruna Oliveira", "bruna.oliveira@outlook.com", 'F', "Cliente");
        pessoa10.setContato("Isabelli Lopes", "isabelli.lopes@outlook.com", 'F', "Cliente");

        List<Pessoa> pessoas = Arrays.asList(
                pessoa1,
                pessoa2,
                pessoa3,
                pessoa4,
                pessoa5,
                pessoa6,
                pessoa7,
                pessoa8,
                pessoa9,
                pessoa10);

        contatos.addAll(pessoas);

        Collections.sort(contatos, (p1, p2) -> p1.getNome()
                .compareToIgnoreCase(p2.getNome()));

        System.out.println("Contatos do sexo feminino do grupo Cliente: ");
        contatos.stream().filter(pessoa -> pessoa.getGrupo().equals("Cliente") && pessoa.getSexo() == 'F').forEach(System.out::println);

        System.out.println();
        System.out.println();

        System.out.println("Contatos do sexo feminino do grupo Vendedor: ");
        contatos.stream().filter(pessoa -> pessoa.getGrupo().equals("Vendedor") && pessoa.getSexo() == 'F').forEach(System.out::println);
    }
}
