package daytwo;

public class ControlFlow {
    public static void main(String[] args){

        int age = 20;

        if(age > 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        int marks = 90;

        if(marks > 90){
            System.out.println("Grade A+");
        } else if (marks > 75) {
            System.out.println("Grade A");
        } else if (marks > 60) {
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }

        //Switch case

        String day = "Tuesday";
        switch (day) {
            case "Monday"-> System.out.println("Today is Monday");
            case "Tuesday"-> System.out.println("Today is Tuesday");
        }

        //Loops

        //FOR LOOP
        for(int i = 1; i<=10; i++){
            System.out.println("Count: "+i);
        }

        //WHILE LOOP
        int num = 5;
        while (num>0) {
            System.out.println("Number: "+num);
            num--;
        }

        do{
            System.out.println("Do-While Number: "+num);
            num++;
        } while (num<5);

        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
