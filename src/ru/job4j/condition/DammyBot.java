package ru.job4j.condition;

public class DammyBot {

    public static void bot(String question) {
        if (question.equals("Hi bot")) {
            System.out.println("Hi smart ass");
        } else if (question.equals("bye")) {
            System.out.println("see you later");
        } else  {
            System.out.println("i do not know answer!");
        }
    }

    public static void main(String[] args) {
    DammyBot.bot("Сколько тебе лет?");
    }
}