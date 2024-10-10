import java.util.Scanner;
public static void main(String[] args) {
    public class New{
        Scanner citizen= new Scanner(System.in);
        String name, citizenship;
        int current_year, yearOfBirth, age;
        System.out.println("Enter your full name");
        name= citizen.nextLine();
        System.out.println("Enter Citizenship or Country of Birth:");
        citizenship=citizen.nextLine();
        System.out.println("Enter year of birth: ");
        yearOfBirth= citizen.nextInt();
        System.out.println("Enter current year: ");
        current_year= citizen.nextInt();
        age= current_year- yearOfBirth;
        System.out.println("====PERSONAL INFORMATION====");
        System.out.println("Full Name: "+name);
        System.out.println("Citizenship: "+citizenship);
        System.out.println("Age: "+age);
        //if ("Kenya".equals(citizenship) || "kenya".equals(citizenship) || "KENYA".equals(citizenship)){
        //use of equalsIgnoreCase() to return 'true' for "Kenya" while ignoring upper/lower cases
        if(citizenship.equalsIgnoreCase("Kenyan")){
        if(age>=0 && age<=12){
        System.out.println("Citizen is a child");
        }
        else if(age>=13 && age<=19){
        System.out.println("Citizen is a teenager");
        }
        else if(age>=20 && age<=35){
        System.out.println("Citizen is a youth");
        }
        else if(age>=36 && age<=60){
        System.out.println("Citizen is an adult");
        }
        else {
        System.out.println("Citizen is a Senior Citizen");
        }
        }
        else{
        System.out.println("Not Kenyan. Please go to the "+citizenship+" embassy for processing.");
        }
    }
}