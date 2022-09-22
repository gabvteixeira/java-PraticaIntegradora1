package bonus;

import java.util.HashMap;

public class Bonus {
    static final int MAXIMA_IDX = 1;
    static final int MINIMA_IDX = 0;

    public static void main(String[] args) {
        HashMap<String, int[]> cidades = new HashMap<>() {{
            put("Londres", new int[] {-2, 33});
            put("Madrid", new int[] {-3, 32});
            put("Nueva York", new int[] {-8, 27});
            put("Buenos Aires", new int[] {4, 37});
            put("Asunción", new int[] {6, 42});
            put("São Paulo", new int[] {5, 43});
            put("Lima", new int[] {0, 39});
            put("Santiago de Chile", new int[] {-7, 26});
            put("Lisboa", new int[] {-1, 31});
            put("Tokio", new int[] {-10, 35});
        }};

        String maiorTemperaturaKey = "Londres";
        String menorTemperaturaKey = "Londres";

        for(String cidade: cidades.keySet()){
            if(cidades.get(cidade)[MAXIMA_IDX] > cidades.get(maiorTemperaturaKey)[MAXIMA_IDX] ){
                maiorTemperaturaKey = cidade;
            }

            if(cidades.get(cidade)[MINIMA_IDX] < cidades.get(menorTemperaturaKey)[MINIMA_IDX] ){
                menorTemperaturaKey = cidade;
            }
        }

        System.out.printf("A cidade com a maior temperatura é %s com %d graus\n",
                maiorTemperaturaKey, cidades.get(maiorTemperaturaKey)[MAXIMA_IDX]);

        System.out.printf("A cidade com a menor temperatura é %s com %d graus\n",
                menorTemperaturaKey, cidades.get(menorTemperaturaKey)[MINIMA_IDX]);

    }
}
