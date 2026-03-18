package interface7;

public class Main {
//	create "Createprnter" method in Main class
	public static void createprinter() {

//        createprinter() uses Printerclass as Annonymous class
		Printer p = new Printer() {
			
//			Override the printMessage of method
			@Override
			public void printMessage() {
				System.out.println("Anonymous class.....");
			}
		};
	 p.printMessage();
	}
	
	public static void main(String[] args) {
		
//		Medhod calling
		createprinter();
	}

}
