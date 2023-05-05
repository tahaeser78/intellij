package com.tahaeser.hesap;

public class matematik implements matemattik {

    @Override
    public void toplama(int a, int b) {

        System.out.println("Toplama işlemi sonucu = " + (a + b ));
    }

    @Override
    public void çıkarma(int a, int b) {
        System.out.println("çıkarma işlemi sonucu = " + (a - b ));

    }

    @Override
    public void çarpma(int a, int b) {
        System.out.println("çarpma işlemi sonucu = " + (a * b));

    }

    @Override
    public void bölme(int a, int b) {
        System.out.println("bölme işlemi sonucu = " + ((double)a / b ));

    }
}
