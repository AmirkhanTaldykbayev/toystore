import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConstructorToy constructor = new ConstructorToy(1, "Lego", 1);
        ConstructorToy constructor2 = new ConstructorToy(2, "Lego", 1);
        Robot robot = new Robot(3, "Robot", 2);
        Robot robot2 = new Robot(4,"Robot", 2);
        Doll doll = new Doll(5, "Doll", 3);
        Doll doll2 = new Doll(6, "Doll", 3);
        Doll doll3 = new Doll(7, "Doll", 3);
        Doll doll4 = new Doll(8, "Doll", 3);
        Doll doll5  = new Doll(9, "Doll", 3);
        Doll doll6 = new Doll(10, "Doll", 3);
        


        Stack<Toy> stack = new Stack<>();
        stack.push(constructor);
        stack.push(constructor2);
        stack.push(robot);
        stack.push(robot2);
        stack.push(doll);
        stack.push(doll2);
        stack.push(doll3);
        stack.push(doll4);
        stack.push(doll5);
        stack.push(doll6);


        Collections.shuffle(stack);

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop().getName());
        }

    }
}