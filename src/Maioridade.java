import java.util.Scanner;

public class Maioridade {
	
	public static void main(String[] args) { 
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite a idade: ");
	
	int age;
	age = scan.nextInt();
	
	if (age >= 18){
		System.out.printf("É de maior, tem %d anos", age);
	} else {
		System.out.printf("Não passa, tem %d anos", age);
	}

	scan.close();
}
}