package es.iescuravalera;

public class Empresa {

    public boolean activo (int edad) {
        if (edad<1 || edad>65)
            return false;
        if (edad<18)
            return false;
        else if (edad<=55)
            return true;
        return false;
    }
}
