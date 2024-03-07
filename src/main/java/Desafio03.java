public class Desafio03 {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___
        completaSequenciaA(7);

        // b) 2, 4, 8, 16, 32, 64, ___
        completaSequenciaB(64);

        // c) 0, 1, 4, 9, 16, 25, 36, ___
        completaSequenciaC(36);

        // d) 4, 16, 36, 64, ___
        completaSequenciaD(64);

        // e) 1, 1, 2, 3, 5, 8, ___
        completaSequenciaE(8);

        // f) 2, 10, 12, 16, 17, 18, 19, ___
        completaSequenciaF(19);
    }

    // a) 1, 3, 5, 7, ___
    public static void completaSequenciaA(int ultimoTermo) {
        int proximoTermo = ultimoTermo + 2;
        System.out.println("a) Próximo termo: " + proximoTermo);
    }

    // b) 2, 4, 8, 16, 32, 64, ...
    public static void completaSequenciaB(int ultimoTermo) {
        int proximoTermo = ultimoTermo * 2;
        System.out.println("b) Próximo termo: " + proximoTermo);
    }

    // c) 0, 1, 4, 9, 16, 25, 36, ...
    public static void completaSequenciaC(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo);
        int proximoTermo = (raizQuadrada + 1) * (raizQuadrada + 1);
        System.out.println("c) Próximo termo: " + proximoTermo);
    }

    // d) 4, 16, 36, 64, ...
    public static void completaSequenciaD(int ultimoTermo) {
        int raizQuadrada = (int) Math.sqrt(ultimoTermo);
        int proximoTermo = (raizQuadrada + 2) * (raizQuadrada + 2);
        System.out.println("d) Próximo termo: " + proximoTermo);
    }

    // e) 1, 1, 2, 3, 5, 8, ...
    public static void completaSequenciaE(int ultimoTermo) {
        int penultimoTermo = ultimoTermo - 5;
        int ultimoTermoNovo = ultimoTermo + penultimoTermo;
        System.out.println("e) Próximo termo: " + ultimoTermoNovo);
    }

    // f) 2, 10, 12, 16, 17, 18, 19, ...
    public static void completaSequenciaF(int ultimoTermo) {
        int[] adicoes = {8, 2, 4, 1, 1, 1};
        int proximoTermo = ultimoTermo + adicoes[ultimoTermo % adicoes.length];
        System.out.println("f) Próximo termo: " + proximoTermo);
    }
}
