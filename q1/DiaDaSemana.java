package q1;

public class DiaDaSemana {
    private DiaSemana dia;

    public enum DiaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }

    public Boolean ehDiaUtil() {
        return (this.dia != DiaSemana.DOMINGO && this.dia != DiaSemana.SABADO);
    }
}
