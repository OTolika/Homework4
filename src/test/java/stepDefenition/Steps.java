package stepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class Steps
{
    int a;
    int b;
    double value;
    String typeOperation;

    @Дано("^два числа (.*) и (.*)$")
    public void given (int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Тогда("^находим сумму двух чисел$")
    public void summa()
    {
        value = a + b;
        typeOperation = "Сумма";
    }

    @Тогда("^находим разность двух чисел$")
    public void difference()
    {
        value = a - b;
        typeOperation = "Разность";
    }

    @Тогда("^находим произведение двух чисел$")
    public void multiply()
    {
        value = a * b;
        typeOperation = "Произведение";
    }

    @Тогда("^находим частное двух чисел$")
    public void division()
    {
        value = a / (double)b;
        typeOperation = "Частное";
    }

    @И("^выводим число на экран$")
    public void printResult()
    {
        System.out.println(typeOperation + " чисел " + a + " и " + b + " равняется " + value);
    }
}














