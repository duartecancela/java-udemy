package fundamento;

public class ConversaoNumerica {
    public static void main(String[] args) {
        // Exemplo 1 - Conversão explícita
        float f = (float)0.1;
        System.out.println(f);

        // Exermplo 2 - Converão explícita
        int i1 = (int) 7.9;
        System.out.println(i1);

        // Exemplo 3 - Conversão implícita
        int i2 = 'a';
        System.out.println(i2);

        // Exemplo 4 - Conversão implícita
        double d = 1001;
        System.out.println(d);
    }

}
