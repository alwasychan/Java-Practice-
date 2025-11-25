import java.util.Scanner;

interface Bonus {
    double calcBonus(double salary);
}

class Manager implements Bonus {
    @Override
    public double calcBonus(double salary) {  
        return salary * 0.20;
    }
}

class Developer implements Bonus {
    @Override
    public double calcBonus(double salary) {  
        return salary * 0.10;
    }
}

public class BonusCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");        
        String name = input.nextLine();
        
        System.out.print("Enter employee type (Manager/Developer): ");
        String type = input.nextLine();
        
        System.out.print("Enter employee's salary: ");
        double salary = input.nextDouble();
        
        Bonus bonusCalc;  
        
        if (type.equalsIgnoreCase("Manager")) {
            bonusCalc = new Manager();
        } else if (type.equalsIgnoreCase("Developer")) {
            bonusCalc = new Developer();
        } else {
            System.out.println("Invalid Employee Type!!!");
            input.close();
            return;  
        }
        
        double bonus = bonusCalc.calcBonus(salary);
        System.out.println("Employee: " + name);
        System.out.println("Bonus: " + bonus);
        
        input.close();
    }
}