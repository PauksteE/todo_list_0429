package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    ArrayList<Todo> todos = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    void addTodo(){

        System.out.println("Add single item to Todo list.");
        System.out.println("Provide the description.");
        String item = scan.nextLine();

        Todo todo = new Todo();
        todo.setDescripion(item);
        todo.setId(todos.size() + 1);

        System.out.println("To list added item: " + item + ", ID: " + todo.getId() +"\n");
        todos.add(todo);
    }

    void viewAllTodo() {

        System.out.println("View all items of Todo list: ");

        if (todos.isEmpty()){
            System.out.println("The list is empty");
        } else {
            for (Todo todo : todos) {
                if (todo.getDone()){
                    System.out.println(todo.getId() + " " + todo.getDescripion() + ", is done.");
                } else {
                    System.out.println(todo.getId() + " " + todo.getDescripion() + ", not done.");
                }
            }
            System.out.println("");
        }

    }

    void viewSingleTodo(){

            System.out.println("View single item of Todo list by ID.");
            System.out.println("Provide the ID of Todo item: ");
            int id = scan.nextInt();
            boolean flag = true;

            for (Todo todo : todos){
                if (todo.getId() == id){
                    System.out.println(id + " " + todo.getDescripion());
                    flag = false;
                }
            }

            if (flag){
                System.out.println("The ID is wrong.");
            }
    } // end of viewSingleTodo()


    void markTodoAsDone(){

        System.out.println("Mark a single item of Todo list as done.");
        System.out.println("Provide the ID of Todo item: ");
        int id = scan.nextInt();

       for (Todo todo : todos){
            if (todo.getId() == id){
                todo.setDone(true);
                System.out.println("Item ID " + id + " is done.");
            }
        }
    } //end of markTodoAsDone


    void deleteSingleTodo(){

        System.out.println("Delete a single item of Todo list by ID.");
        System.out.println("Provide the ID of Todo item: ");
        int id = scan.nextInt();

        boolean flag = true;

        for (int i = 0; i < todos.size(); i++){
            Todo todo = todos.get(i);
            if (todo.getId() == id){
                System.out.println("Item ID " + id + " was removed from list.\n");
                todos.remove(i);
                flag = false;
            }
        }

        if (flag){
            System.out.println("The ID is wrong.");
        }
    } // end of deleteSingleTodo()

    void deleteAllTodo(){

        System.out.println("Delete all items of Todo list.");
        todos.clear();
    } //end of deleteAllTodo


} //End of class





