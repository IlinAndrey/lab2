package ru.mirea.laba2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args){
        author n= new author("Pushkin", "pushkin@mail.ru",'m');
        author n1= new author("Turgenev", "turgenev@mail.ru",'m');
        author n2= new author("Agata Christi", "a.Christi@gmail.ru",'g');

        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
    }
}
