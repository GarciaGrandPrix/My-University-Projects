package com.Grazioso;
import java.util.ArrayList;

import java.util.Scanner;

public class Driver {	/* Joshua Garcia 08/18/2024. */
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); /* The Monkey Array List is created. */
    public static void main(String[] args)	{
     

        initializeDogList();
        initializeMonkeyList();
        
        Scanner scnr = new Scanner(System.in); // Accepts input for menu options
        String menuOptions = "";
        
        while (!menuOptions.equals("q"))	{ /* Menu loop using a While Loop and if else statements
        										 for input validation. */ 
        	
        	displayMenu();
        	menuOptions = scnr.nextLine();	  
        	
        	switch (menuOptions)	{ /* "Switch" is used instead of a if-else statements, case numbers for menu options are set to strings.  */
        		case "1":
        			
        			intakeNewDog(scnr);			/* In takes a new dog into the system. */
        			break;
        	
        		case "2":							
        	
        			intakeNewMonkey(scnr);		/* In takes a new monkey into the system. */
        			break;
        	
        		case "3":							
        		
        			reserveAnimal(scnr);		/* Reserves an animal. */
        			break;
        	
        		case "4":		
        		
        			printAnimals(menuOptions);	/* Prints all dogs in dog list. */
        			break;
        	
        		case "5":		
        		
        			printAnimals(menuOptions);	/* Prints all monkeys in the monkey. */
        			break;
        
        		case "6":		
        		
        			printAnimals(menuOptions);	/* Prints all animals in service but NOT reserved. */
        			break;
        
        		case "q":		/* Quits from the program. */ 
        		
        			System.out.print("You have quit from the program.");
        			break;
        	
        		default:		
        		
        			System.out.print("Please input a valid option.");	/* Ensures the program accepts a stated option in the menu. */
        			break;
        	
        
        	} // Brace for switch.
        }
        
    }	
      
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

	

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dogOne = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dogTwo = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dogThree = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dogOne);	/* Dogs are inputed into the Dog list. */
        dogList.add(dogTwo);
        dogList.add(dogThree);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {	/* A method of innitializing monkeys is filled out. */
    	Monkey monkeyOne = new Monkey("King-Kong", "Male", "2", "3.0", "06-025-2021", "United States", "in service", false, "United States", "14.0", "15.0", "29.0", "Guenon");
    	Monkey monkeyTwo = new Monkey("George", "Male", "4", "5.0", "11-09-2019", "United States", "in service", true, "United States", "12.0", "13.0", "25.0", "Macaque");
    	Monkey monkeyThree = new Monkey("Bubbles", "Male", "7", "2.0", "03-06-2022", "United States", "in service", true, "United States", "9.0", "10.0", "19.0", "Marmoset");
    
    	monkeyList.add(monkeyOne);	/* Monkeys manually created and inputed into a Monkey list. */
    	monkeyList.add(monkeyTwo);
    	monkeyList.add(monkeyThree);
    	
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {	/* For every Dog in the dog class within the dog list. */
            if(dog.getName().equalsIgnoreCase(name)) {	/* If the Monkeys "get the name from the list" equals to a name already in the list. */
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What's the dogs breed?: "); /* Answers to question are stored into variables or objects. */
        String breed = scanner.nextLine();
        
        System.out.println("Is the dog Male or Female?: ");
        String gender = scanner.nextLine();
        
        System.out.println("Whats the dogs age?: ");
        String age = scanner.nextLine();
        
        System.out.println("Whats the dogs weight?: ");
        String weight = scanner.nextLine();
        
        System.out.println("When was the dogs accquired?: ");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Where was the dog accquired?: ");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("Whats the dogs training status?: ");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is this dog currently reserved?: ");
        boolean reserved = false;
        String booleanStringDog = scanner.nextLine();
        if (booleanStringDog.equals("in service"))	{	/* Since the answer involves a boolean data type, the answer in
         												   String data type sets the variable as either true or false. */
        	reserved = true;
        	
        }else if	(!booleanStringDog.equals("in service"))	{
        	reserved = false;
        }
        
        System.out.println("What country is the dog currently in service?: ");
        String inServiceCountry = scanner.nextLine();
        
        Dog dogFour = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dogFour);	/* Option to further input another dog to test program. */
        System.out.print("Your dog is now in our system, thanks for choosing Grazioso Salvare Animal Rescue and Training!");
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("Whats the monkey name?: ");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList)	{	/* For every Monkey in the monkey class within the monkey list. */
            	if (monkey.getName().equalsIgnoreCase(name))	{	/* If the Monkeys "get the name from the list" equals to a name already in the list. */
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            	
        }
       
        System.out.println("Is the monkey Male or Female?: ");	/* Answers to question are stored into variables or objects. */
        String gender = scanner.nextLine();
        
        System.out.println("Whats the age of the monkey?: ");
        String age = scanner.nextLine();
        
        System.out.println("Whats the monkeys weight?: ");
        String weight = scanner.nextLine();
        
        System.out.println("When was the monkey accquired?: ");
        String acquisitionDate = scanner.nextLine();
        
        System.out.println("Where was the monkey accquired?: ");
        String acquisitionCountry = scanner.nextLine();
        
        System.out.println("Whats the monkeys training status?: ");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is this monkey currently reserved?: ");	/* The answer also involves another boolean data type and is set by the answer 
        															   in its String format. */
        boolean reserved = false;
        String booleanStringMonkey = scanner.nextLine();
        if (booleanStringMonkey.equals("in service"))	{
        	reserved = true;
        	
        }else if	(!booleanStringMonkey.equals("in service"))	{
        	reserved = false;
        }
        
        	
        
        
        System.out.println("What country is the monkey currently in service?: ");
        String inServiceCountry = scanner.nextLine();
        
        System.out.println("Whats the monkeys Tail Length?: ");	/* Additional questioned to be asked for Monkeys. */
        String tailLength = scanner.nextLine();
        
        System.out.println("Whats the monkeys height?: ");
        String height = scanner.nextLine();
        
        System.out.println("Whats the monkeys total body length?: ");
        String bodyLength = scanner.nextLine();
        
        System.out.println("Whats the monkeys species?: ");
        String species = scanner.nextLine();
        
        Monkey monkeyFour = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, 
        							inServiceCountry, tailLength, height, bodyLength, species);
        monkeyList.add(monkeyFour);	/* Option to further input another Monkey to test program. */
        System.out.print("Your monkey is now in our system, thanks for choosing Grazioso Salvare Animal Rescue and Training!");
        
     
        
        
        
        
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the type of animal?: ");
            String animalType = scanner.nextLine();
            if (animalType.equalsIgnoreCase("Monkey"))	{	/* If the animal is equal to "Monkey". */
            	System.out.println("What is the country of origin?: ");
            	String countryOrigin = scanner.nextLine();
            	for (Monkey monkey: monkeyList)	{	/* For every Monkey in the monkey class within the monkey list. */
            		if (monkey.getAcquisitionLocation().equalsIgnoreCase(countryOrigin) && !monkey.getReserved())	{	/* If the Monkeys aquisition location matches the country of origin. */
            			monkey.setReserved(true);	/* Reserved status is set to True. */
            			System.out.print("Your monkey is now reserved, thank you!");
            			return;
            		}
            		else	{
            			System.out.println("We don't have that animal in " + countryOrigin + " or it's already reserved sorry.");
            			return;
            	}
           }
      }
            
            if (animalType.equalsIgnoreCase("Dog"))	{	/* If the animal is equal to "Dog". */
            	System.out.println("What is the country of origin?: ");
            	String countryOrigin = scanner.nextLine();
            	for (Dog dog: dogList)	{	/* For every Dog in the Dog class within the Dog list. */
            		if (dog.getAcquisitionLocation().equalsIgnoreCase(countryOrigin) && !dog.getReserved())	{	/* If the Dog aquisition location matches the country of origin. */
            			dog.setReserved(true);	/* Reserved status is set to True. */
            			System.out.print("Your dog is now reserved, thank you!");
            			return;
            		}
            		else	{
            			System.out.println("We don't have that animal in " + countryOrigin + " or it's already reserved sorry.");
            			return;
            		}
            	}
           }
        
            	else	{
            		System.out.println("We don't have that kind of animal here");
           }
      }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String menuOptions) { 
            if (menuOptions.equals("4"))	{	/* The For Loop prints a list of all the dogs within the Dog list. */
            	for(int i = 0; i < dogList.size(); i++)	{
            		System.out.println(dogList.get(i).getName());
            	}
            }
            
            if (menuOptions.equals("5"))	{	/* The For Loop prints a list of all the monkeys within the Monkey list. */
            	for(int i = 0; i < monkeyList.size(); i++)	{
            		System.out.println(monkeyList.get(i).getName());
            	}
            }
            
            if	(menuOptions.equals("6"))	{	/* This if statement contains two loops that print out animals in service but NOT RESERVED. */
            	
            	for (Dog dog: dogList)	{	

            		if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) 	{
            		System.out.println(dog.getName());
          
            		}
            	}
            		
            	for (Monkey monkey: monkeyList)	{
      
            		if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved())	{
                	System.out.println(monkey.getName());
              
            		}
            	}
           }
      }
}    
        

