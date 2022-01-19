import java.util.Scanner;
class AttendanceShortageException  extends RuntimeException{
public AttendanceShortageException() {
super();
System.out.println("AttendanceShortageException()");
}
public AttendanceShortageException(String msg) {
super(msg);
}
}
class CgpaException  extends RuntimeException{
public CgpaException() {
super();
System.out.println("CgpaException()");
}
public CgpaException(String msg) {
super(msg);
}
}

public class CustomisedExceptionDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter your attendance");
		int attendance = in.nextInt();
		System.out.println("enter your cgpa");
		double cgpa =in.nextDouble();
		
		
		if(attendance <= 75 ) {
			throw new AttendanceShortageException("Not eligible for next standard");
		}else {
			if(cgpa <=7) {
			 throw new CgpaException("Required cgpa not satisified ");
			}
			else {
				System.out.println("Eligible for next standard");
			}
			
		}
		
	}

}
