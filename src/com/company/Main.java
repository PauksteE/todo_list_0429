package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        String input = "";
        do {
            System.out.println("Welcome! Please select an option below: ");
            System.out.println("""
                      1. Add item to Todo list
                      2. View all items of Todo list
                      3. View single item of Todo list
                      4. Mark single item as done
                      5. Delete single item of Todo list
                      6. Delete all items of Todo list
                      Enter quit to exit ap
                    """);

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    todoList.addTodo();
                    break;
                case "2":
                    todoList.viewAllTodo();
                    break;
                case "3":
                    todoList.viewSingleTodo();
                    break;
                case "4":
                    todoList.markTodoAsDone();
                    break;
                case "5":
                    todoList.deleteSingleTodo();
                    break;
                case "6":
                    todoList.deleteAllTodo();
                    break;
                case "quit":
                    System.out.println("Exiting Application!");
                    break;
                default:
                    System.out.println("Please provide a valid input");
            }
        } while (!input.equalsIgnoreCase("quit"));

    }
}
