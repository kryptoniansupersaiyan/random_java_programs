public static void main(String[] args) {
    String[] multiChoice1;
	String[] Answer;
    Scanner input = new Scanner(System.in);

    multiChoice1 = new String[10];
    multiChoice1[0] = "1. Capital of Russia?\n";
    multiChoice1[1] = "2. capital of india?\n";
    multiChoice1[2] = "3. capital of pakistan\n?";
    multiChoice1[3] = "4. capital of srilanka\n?";
    multiChoice1[4] = "5. capital of japan\n?";
	multiChoice1[0] = "1. Capital of saudi arabia?\n";
    multiChoice1[1] = "2. capital of taiwan?\n";
    multiChoice1[2] = "3. capital of china\n?";
    multiChoice1[3] = "4. capital of australia\n?";
    multiChoice1[4] = "5. capital of canada\n?";

    String userSelect1 ;
	userSelect1= multiChoice1[0];

    if(userSelect1==multiChoice1[0]){
        System.out.println(multiChoice1[0]);
        System.out.println("A. bejing");
        System.out.println("B. Moscow");
        System.out.println("C. Chennai");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        switch (uSelect1.toUpperCase()){
            case "A":
                uSelect1 = "bejing";
                System.out.println("Incorrect!\n\n");
                break;
            case "B":
                uSelect1 = "moscow";
                System.out.println("Correct!\n\n");
                scorePro++;
                score++;
                break;
            case "C":
                uSelect1 = "chennai";
                System.out.println("Incorrect!\n\n");
                break;
            default: 
                uSelect1 = "Incorrect, choice.\n\n";
                break;
        }
    }

    if(userSelect1==multiChoice1[2]){
        System.out.println(multiChoice1[2]);
        System.out.println("A. bejing");
        System.out.println("B. moscow");
        System.out.println("C. islamabad");
        System.out.println();
        System.out.print("Your answer: ");
        String uSelect1 = input.next();

        switch (uSelect1.toUpperCase()){
            case "A":
                uSelect1 = "bejing";
                System.out.println("Incorrect!\n\n");
                break;
            case "B":
                uSelect1 = "moscow";
                System.out.println("inCorrect!\n\n");
               
                break;
            case "C":
                uSelect1 = "islamabad";
                System.out.println("correct!\n\n");
				 scorePro++;
                score++;
                break;
            default: 
                uSelect1 = "correct, choice.\n\n";
                break;
}
}
 
