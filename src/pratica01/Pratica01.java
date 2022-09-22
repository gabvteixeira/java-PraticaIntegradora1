package pratica01;

public class Pratica01 {
    static final int MAXIMA_IDX = 1;
    static final int MINIMA_IDX = 0;
    static final String[] CIDADES = {"Londres","Madrid",
            "Nueva York", "Buenos Aires",
            "Asunción", "São Paulo",
            "Lima", "Santiago de Chile",
            "Lisboa", "Tokio"};

    public static void main(String[] args) {

        int[][] temperaturas = {{-2,33},{-3,32},{-8,27},{4,37},{6,42},{5,43},{0,39},{-7,26},{-1,31},{-10,35}};

        int maiorTemperaturaIdx = obterMaiorTemperatura(temperaturas);
        int menorTemperaturaIdx = obterMenorTemperatura(temperaturas);

        System.out.printf("A cidade com a maior temperatura é %s com %d graus\n",
                CIDADES[maiorTemperaturaIdx], temperaturas[maiorTemperaturaIdx][MAXIMA_IDX]);

        System.out.printf("A cidade com a menor temperatura é %s com %d graus\n",
                CIDADES[menorTemperaturaIdx], temperaturas[menorTemperaturaIdx][MINIMA_IDX]);
    }

    public static int obterMaiorTemperatura(int[][] temperaturas){
        int maxTemp = temperaturas[0][1];
        int index = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if(temperaturas[i][1] > maxTemp){
                index = i;
                maxTemp = temperaturas[i][MAXIMA_IDX];
            }
        }

        return index;
    }

    public static int obterMenorTemperatura(int[][] temperaturas){
        int minTemp = temperaturas[0][0];
        int index = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if(temperaturas[i][0] < minTemp){
                index = i;
                minTemp = temperaturas[i][MINIMA_IDX];
            }
        }

        return index;
    }
}
