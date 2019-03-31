package Colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CojuntoComportado {
    public static void main(String[] args) {
        Set<String> aprovados = new LinkedHashSet<>();
        aprovados.add("João");
        aprovados.add("Pedro");
        aprovados.add("Maria");
        aprovados.add("Rafael");

        for(Object nome: aprovados) {
            System.out.println(nome);
        }


;    }
}
