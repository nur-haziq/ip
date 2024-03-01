package mona.output;

import mona.task.Task;
import mona.util.Constants;

import java.util.ArrayList;

public class ConsolePrint {
    public static void printHorizontalLine() {
        for (int i = 0; i < 59; i++) {
            System.out.print("_");
        }
        System.out.println("_");
    }
    public static void printUnmarkStatement(Task task) {
        printHorizontalLine();

        System.out.println("OK, I've marked this as not done yet:");
        System.out.println(task);

        printHorizontalLine();
    }
    public static void printMarkStatement(Task task) {
        printHorizontalLine();

        System.out.println("Nice! I've marked this as done:");
        System.out.println(task);

        printHorizontalLine();
    }
    public static void printAddTaskStatement(Task task, int noOfTasks) {
        printHorizontalLine();

        System.out.println("Got it. I've added this task: " + System.lineSeparator() + task);
        System.out.println("Now you have " + Integer.toString(noOfTasks) + " tasks in the list.");

        printHorizontalLine();
    }
    public static void printDeleteTaskStatement(Task task, int noOfTasks) {
        printHorizontalLine();

        System.out.println("Noted. I've removed this task: " + System.lineSeparator() + task);
        System.out.println("Now you have " + Integer.toString(noOfTasks) + " tasks in the list.");

        printHorizontalLine();
    }
    public static void printList(ArrayList<Task> tasks) {
        printHorizontalLine();

        int index = 1;
        for (Task task: tasks) {
            if (task != null) {
                System.out.println(Integer.toString(index) + "." + task);
                index += 1;
            }
        }
        printHorizontalLine();
    }
    public static void printFilteredList(ArrayList<Task> tasks, String keyword) {
        printHorizontalLine();

        if (tasks.isEmpty()) {
            System.out.println("OOPS!! We couldn't find any tasks that contain" +
                    " '" + keyword + "'");
        } else {
            System.out.println("Here are the matching tasks in your list:");

            int index = 1;
            for (Task task: tasks) {
                if (task != null) {
                    System.out.println(Integer.toString(index) + "." + task);
                    index += 1;
                }
            }
        }
        printHorizontalLine();
    }
    public static void greet() {
        System.out.println("Hello from\n" + Constants.ASCII_LOGO);

        printHorizontalLine();

        System.out.println("Hello! I'm Mona");
        System.out.println("What can I do for you?");

        printHorizontalLine();
    }
    public static void exit() {
        printHorizontalLine();

        System.out.println("Bye. Hope to see you again soon!");

        printHorizontalLine();
    }
}
