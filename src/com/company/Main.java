package com.company;
//от a до b (даны 2 целых числа.выведите все числа от a до b включительно в порядке возрастания и убывания)
public class Main
{
    public static String recursion(int a, int b)
    {
        //условие a > b
        if (a > b)
        {
            // Базовое условие для убывания
            if (a == b)
            {
                return Integer.toString(a);
            }
            // Шаг рекурсии
            return a + " " + recursion(a - 1, b);
        }
        else //иначе для чисел от 5 до 15
        {
            // Базовое условие для возрастания
            if (a == b)
            {
                return Integer.toString(a);
            }
            // Шаг рекурсии
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("От 25 до 15: "+recursion(25, 15)); // вызов рекурсивной функции
        System.out.println("От 5 до 15: "+recursion(5, 15)); // вызов рекурсивной функции
    }
}