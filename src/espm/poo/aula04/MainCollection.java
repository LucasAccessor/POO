package espm.poo.aula04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainCollection {
    public static void main(String[] args) {
        
        // não permite repetição
        Set<Integer> sinteiros = new TreeSet<Integer>();
        sinteiros.add(1);
        sinteiros.add(2);
        sinteiros.add(3);
        sinteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(sinteiros).toArray()));


        // permite repeição
        List<Integer> linteiros = new ArrayList<>();
        linteiros.add(1);
        linteiros.add(2);
        linteiros.add(3);
        linteiros.add(1);
        System.out.println(Arrays.toString(Arrays.asList(linteiros).toArray()));
        
        Set<Aluno> salunos = new HashSet<>();
        salunos.add(new Aluno(10L, "page"));
        salunos.add(new Aluno(37L, "buk"));
        salunos.add(new Aluno(98L, null));
        System.out.println(Arrays.toString(Arrays.asList(salunos).toArray()));

        List<Aluno> lalunos = new ArrayList<>();
        lalunos.add(new Aluno(10L, "page"));
        lalunos.add(new Aluno(37L, "buk"));
        lalunos.add(new Aluno(98L, null));
        System.out.println(Arrays.toString(Arrays.asList(lalunos).toArray()));

        Map<Integer, Aluno> mapa = new HashMap<>();
        mapa.put(10, new Aluno(10L, "page"));
        mapa.put(10, new Aluno(37L, "buk"));
        mapa.put(10, new Aluno(98L, null));
        mapa.forEach((k, v) -> System.out.println(k + " -> " + v));


    }
    
}
