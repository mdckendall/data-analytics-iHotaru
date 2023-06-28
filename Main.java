import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner choice = new Scanner(System.in);

    int num = 0;

    while(num != 5){
      choices();
      num = choice.nextInt();
      switch (num) {
        case 1:
          System.out.println("$98,345");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          option4Helper(fileScanner);
          fr.close();
          fileScanner.close();
          fr = new FileReader("names.txt");
          fileScanner = new Scanner(fr);
          break;
        case 5:
          break;
        default:
          System.out.println("please select a valid number");
          break;
      }
    }
		
	}

  public static void choices(){
    System.out.println("Press 1 to learn about salary.");
    System.out.println("Press 2 to learn the job.");
    System.out.println("Press 3 to learn about demand.");
    System.out.println("Press 4 to view current students.");
    System.out.println("Press 5 to quit.");
  }

  public static void option4Helper(Scanner hiImSpongebob){
    while(hiImSpongebob.hasNextLine()){
      System.out.println(hiImSpongebob.nextLine());
    }
  }
}