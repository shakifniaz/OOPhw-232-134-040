import java.util.Scanner;

public class MovieStore{
    private static String accountName;
    private static double accountCredit;

    public static void setAccountName(String name){
        accountName = name;
    }

    public static String getAccountName(){
        return accountName;
    }


    public static void setAccountCredit(double credit){
        accountCredit = credit;
    }

    public static void addAccountCredit(double credit){
        accountCredit += credit;
    }

    public static double getAccountCredit(){
        return accountCredit;
    }

    public static void firstScreen(){
        Scanner input = new Scanner(System.in);
        System.out.printf("1. Select Movie %n2. Set/Change Account Name %n3. Add Account Credits " +
                " %n4. Account Info %n5. Exit %nEnter number(1-5): ");
        int option = input.nextInt();
        System.out.println();
        if(option == 1){
            genre();
        }
        if(option == 2){
            System.out.print("Enter new name: ");
            input.nextLine();
            String name = input.nextLine();
            MovieStore.setAccountName(name);
            System.out.println("Account name has been set to "+ name+".");
            System.out.println();
            firstScreen();
        }
        if(option == 3){
            System.out.println("Only store employees can add credits. Please enter password to confirm identity.");
            System.out.print("Password: ");
            int password = input.nextInt();
            if(password==12345678) System.out.println("Identity Verified.");
            else{
                System.out.println("Wrong Password.");
                firstScreen();
            }
            System.out.print("Enter credits: ");
            double credit = input.nextDouble();
            if(accountCredit == 0 && credit > 0) {
                MovieStore.setAccountCredit(credit);
                System.out.println("Credits " + credit + " has been added to account.");
            }
            else if(accountCredit > 0 && credit > 0) {
                MovieStore.addAccountCredit(credit);
                System.out.println("Credits " + credit + " has been added to account.");
            }
            else if(credit < 0)
                System.out.print("Invalid input.");
            System.out.println();
            System.out.println();
            firstScreen();
        }
        if(option == 4){
            System.out.printf("Account Name: %s%nAccount Credits: %.2f", getAccountName(), getAccountCredit());
        }
        if(option == 5) return;

    }

    public static void genre(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Select Genre: %n1. Action %n2. Comedy %n3. Romantic " +
                " %n4. Horror %n5. Thriller %n6. Back %nEnter number(1-6): ");

        int option = input.nextInt();
        System.out.println();
        if(option == 1){
            System.out.printf("Select Action Movie: %n1. Superman: 2500 Credits%n2. The Fantastic 4: 2500 Credits%n3. Fast & Furious: 2500 Credits" +
                    " %n4. Shazam: 1500 Credits%n5. The Flash: 500 Credits%n6. Back %nEnter number(1-6): ");
            int option2 = input.nextInt();
            if(option2 >= 1 && option2 <=3){
                System.out.println("Cost: 2500 Credits");
                if(accountCredit>=2500){
                    MovieStore.addAccountCredit(-2500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 4){
                System.out.println("Cost: 1500 Credits");
                if(accountCredit>=1500){
                    MovieStore.addAccountCredit(-1500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 5){
                System.out.println("Cost: 500 Credits");
                if(accountCredit>=500){
                    MovieStore.addAccountCredit(-500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 6) genre();
        }
        if(option == 2){
            System.out.printf("Select Comedy Movie: %n1. The Nice Guys: 2500 Credits%n2. The Big Lebowski: 2500 Credits%n3. Meet the Parents: 2500 Credits" +
                    " %n4. Groundhog Day: 1500 Credits%n5. Click: 500 Credits%n6. Back %nEnter number(1-6): ");
            int option2 = input.nextInt();
            if(option2 >= 1 && option2 <=3){
                System.out.println("Cost: 2000 Credits");
                if(accountCredit>=2500){
                    MovieStore.addAccountCredit(-2500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 4){
                System.out.println("Cost: 1500 Credits");
                if(accountCredit>=1500){
                    MovieStore.addAccountCredit(-1500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 5){
                System.out.println("Cost: 500 Credits");
                if(accountCredit>=500){
                    MovieStore.addAccountCredit(-500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 6) genre();
        }
        if(option == 3){
            System.out.printf("Select Romantic Movie: %n1. The Notebook : 2500 Credits%n2. Love Actually: 2500 Credits %n3. Crazy, Stupid, Love: 2500 Credits" +
                    " %n4. After: 1500 Credits%n5. Twilight: 500 Credits%n6. Back %nEnter number(1-6): ");
            int option2 = input.nextInt();
            if(option2 >= 1 && option2 <=3){
                System.out.println("Cost: 2500 Credits");
                if(accountCredit>=2500){
                    MovieStore.addAccountCredit(-2500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 4){
                System.out.println("Cost: 1500 Credits");
                if(accountCredit>=1500){
                    MovieStore.addAccountCredit(-1500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 5){
                System.out.println("Cost: 500 Credits");
                if(accountCredit>=500){
                    MovieStore.addAccountCredit(-500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 6) genre();
        }
        if(option == 4){
            System.out.printf("Select Horror Movie: %n1. IT: 2500 Credits %n2. The Conjuring: 2500 Credits %n3. Texas Chainsaw Massacre: 2500 Credits" +
                    " %n4. Five Night at Freddy's: 1500 Credits %n5. Birdemic: 500 Credits %n6. Back %nEnter number(1-6): ");
            int option2 = input.nextInt();
            if(option2 >= 1 && option2 <=3){
                System.out.println("Cost: 2500 Credits");
                if(accountCredit>=2500){
                    MovieStore.addAccountCredit(-2500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 4){
                System.out.println("Cost: 1500 Credits");
                if(accountCredit>=1500){
                    MovieStore.addAccountCredit(-1500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 5){
                System.out.println("Cost: 500 Credits");
                if(accountCredit>=500){
                    MovieStore.addAccountCredit(-500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 6) genre();
        }
        if(option == 5){
            System.out.printf("Select Thriller Movie: %n1. Psycho: 2500 Credits%n2. The Silence of the Lambs: 2500 Credits%n3. Pulp Fiction: 2500 Credits" +
                    " %n4. Mimic: 1500 Credits%n5. Doom: 500 Credits%n6. Back %nEnter number(1-6): ");
            int option2 = input.nextInt();
            if(option2 >= 1 && option2 <=3){
                System.out.println("Cost: 2500 Credits");
                if(accountCredit>=2500){
                    MovieStore.addAccountCredit(-2500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 4){
                System.out.println("Cost: 1500 Credits");
                if(accountCredit>=1500){
                    MovieStore.addAccountCredit(-1500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 5){
                System.out.println("Cost: 500 Credits");
                if(accountCredit>=500){
                    MovieStore.addAccountCredit(-500);
                    System.out.println("Successfully Bought!");
                }
                else
                    System.out.println("Not enough Credits. Please buy more credits.");
                firstScreen();
            }
            else if(option2 == 6) genre();
        }
        if(option == 6) firstScreen();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        firstScreen();
    }
}
