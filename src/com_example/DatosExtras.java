package com_example;

public class DatosExtras {

    byte numero1;
    short numero2;
    Float numero3;
    char caracter1;
    Integer numero0;
    Long numero;

    public DatosExtras(byte numero1, short numero2, float numero3, char caracter1, Integer numero0, Long numero) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.caracter1 = caracter1;
        this.numero0 = numero0;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "{Datos extras: " +
                " byte = "+numero1 +
                "short = "+numero2 +
                "float = "+numero3 +
                "char = "+caracter1 +
                "Integer = "+numero0 +
                "Long = "+numero +
                "}";
    }
}
