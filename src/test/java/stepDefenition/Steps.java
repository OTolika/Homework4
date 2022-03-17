package stepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Step;

public class Steps
{
    int a;
    int b;
    double value;
    String typeOperation;

    @Step("Загружаем 2 числа")
    @Дано("^два числа (.*) и (.*)$")
    public void given (int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Step("Находим сумму 2 чисел")
    @Тогда("^находим сумму двух чисел$")
    public void summa()
    {
        value = a + b;
        typeOperation = "Сумма";
    }

    @Step("Находим разность 2 чисел")
    @Тогда("^находим разность двух чисел$")
    public void difference()
    {
        value = a - b;
        typeOperation = "Разность";
    }

    @Step("Находим произведение 2 чисел")
    @Тогда("^находим произведение двух чисел$")
    public void multiply()
    {
        value = a * b;
        typeOperation = "Произведение";
    }

    @Step("Находим частное 2 чисел")
    @Тогда("^находим частное двух чисел$")
    public void division()
    {
        value = a / (double)b;
        typeOperation = "Частное";
    }

    @Step("Вывод результала калькуляции на экран")
    @И("^выводим число на экран$")
    public void printResult()
    {
        System.out.println(typeOperation + " чисел " + a + " и " + b + " равняется " + value);
    }
}














