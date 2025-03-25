package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class Fatorial {
    PilhaInt p = new PilhaInt();

    public int calcFatorial (int valor) {
        int total = 1;
        int a = 0;

        if (valor > 0 && valor <= 10) {
            for(int i = 1; i <= valor; i++) {
                p.push(i);
            }

            while(!p.isEmpty()) {
                try {
                    a = p.pop();
                    total = total * a;
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
            }
            return total;
        }
        return 0;
    }
}