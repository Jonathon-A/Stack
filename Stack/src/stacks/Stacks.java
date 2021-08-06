package stacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Stacks {

    public ArrayList<Integer> stacks = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Stacks Run = new Stacks();
        Run.Start();
        Run.GetInput();
    }

    public void Start() {
        stacks.add(0);
        System.out.println("Stack: " + stacks.toString());
    }

    public void GetInput() {
        String answer = null;
        System.out.println("");
        System.out.println("Push or Pop:");
        System.out.println("");
        try {
            answer = input.next();
        } catch (Exception e) {
            System.out.println("Invalid input");
            GetInput();
        }
        if (answer.equalsIgnoreCase("push")) {
            Push();
        } else {
            if (answer.equalsIgnoreCase("pop")) {
                Pop();
            } else {
                System.out.println("Invalid input");
                GetInput();
            }
        }
    }

    public void Push() {
        stacks.add(stacks.size());
        System.out.println(stacks.toString());
        GetInput();
    }

    public void Pop() {
        if (stacks.size() <= 1) {
            System.out.println("You cannot Pop an empty stack.");
            System.out.println("Stack: " + stacks.toString());
        } else {
            stacks.remove(stacks.size() - 1);
            System.out.println("Stack: " + stacks.toString());
        }
        GetInput();
    }

}
