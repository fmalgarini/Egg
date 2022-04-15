package ejerciciospoo9.entidades;

public class Matematica {

    private double numeroUno;
    private double numeroDos;
    private String atrib1;

    public Matematica() {
    }

    public Matematica(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numeroUno=" + numeroUno + ", numeroDos=" + numeroDos + '}';
    }

}
