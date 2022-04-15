package ejerciciospoo9.Servicios;

import ejerciciospoo9.entidades.Matematica;

public class MatematicaServicio {

    public Matematica crearMatematica() {
        Matematica nuevaMatematica = new Matematica();
        nuevaMatematica.setNumeroUno(Math.random() * 10);
        nuevaMatematica.setNumeroDos(Math.random() * 10);

        return nuevaMatematica;

    }

    public float devolverMayor(Matematica nuevaMatematica) {

        return ((float) Math.max(nuevaMatematica.getNumeroUno(), nuevaMatematica.getNumeroDos()));

    }

    public float calcularPotencia(Matematica nuevaMatematica) {

        return ((float) Math.pow(nuevaMatematica.getNumeroUno(), nuevaMatematica.getNumeroDos()));

    }

    public float calculaRaiz(Matematica nuevaMatematica) {

        return ((float) Math.sqrt(Math.min(nuevaMatematica.getNumeroUno(), nuevaMatematica.getNumeroDos())));
    }

}
