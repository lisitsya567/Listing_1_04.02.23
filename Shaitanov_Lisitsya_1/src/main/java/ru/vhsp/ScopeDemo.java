package ru.vhsp;

public class ScopeDemo {
    public static void main (String[] args) {
        int x;

        x = 1;
        System.out.println("До вложенного блока: x равно" + x);
        { // новый блок создает новую обл. видимости
            // переменная y доступна только внутри текущего блока, но этоне мешает ее использованию вместе с переменной x из внешнего блока

        */
            int y = 3;
        // десь действуют обе переменных, х и у
            System.out.println("Внутрений блок: x равно " + x + ", y равно" + y);
            x = y * 3;


        } // конец вложенного блока

    } // main(String[]) method
} // ScopeDemo class
