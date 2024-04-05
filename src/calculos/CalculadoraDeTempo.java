package calculos;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTitulo (Titulo tiluto) {
        tempoTotal += tiluto.getDuracaoEmMinutos();
    }
}
