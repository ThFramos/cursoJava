package applicationExec03;

import java.util.Locale;
import java.util.Scanner;
import entities.students;

public class programExe03 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		students students = new students();
		
		System.out.print("Student´s name: ");
		students.name=sc.nextLine();
		
		System.out.print("1º grade: ");
		students.nota1=sc.nextDouble();
		System.out.print("2º grade: ");
		students.nota2=sc.nextDouble();
		System.out.print("3º grade: ");
		students.nota3=sc.nextDouble();
		
		if (students.media()>60) {
			
			System.out.print("Final Grade= "+students.media() +"\n"
							+	"PASS ");
		}else {
			System.out.print("Final Grade= "+students.media() +"\n"
			+	"FAILED \n"
			+ "MISSING "+ (60-students.media())+ " POINTS");
		}
	}

}
