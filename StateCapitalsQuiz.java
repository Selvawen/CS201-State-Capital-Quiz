import java.util.*;

public class StateCapitalsQuiz {

     /**
    The main method is where our Java program starts running.
    Here is what it does step by step:
    It makes a list of U.S. states and their capitals.
    Then, it shows us everything that's in that list.
    Next, it organizes the list by putting the states in order.
    After that, it asks us to type in the name of a state.
    Finally, it tells us the capital city of the state we typed in. 
    */

    public static void main(String[] args) {
        
        // Create a HashMap to store U.S. states and their capitals

        Map<String, String> statesAndCapitals = new HashMap<>();

        // Populate the map with state and capital pairs

        statesAndCapitals.put("Alabama", "Montgomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", "Little Rock");
        statesAndCapitals.put("California", "Sacramento");
        statesAndCapitals.put("Colorado", "Denver");
        statesAndCapitals.put("Connecticut", "Hartford");
        statesAndCapitals.put("Delaware", "Dover");
        statesAndCapitals.put("Florida", "Tallahassee");
        statesAndCapitals.put("Georgia", "Atlanta");
        statesAndCapitals.put("Hawaii", "Honolulu");
        statesAndCapitals.put("Idaho", "Boise");
        statesAndCapitals.put("Illinois", "Springfield");
        statesAndCapitals.put("Indiana", "Indianapolis");
        statesAndCapitals.put("Iowa", "Des Moines");
        statesAndCapitals.put("Kansas", "Topeka");
        statesAndCapitals.put("Kentucky", "Frankfort");
        statesAndCapitals.put("Louisiana", "Baton Rouge");
        statesAndCapitals.put("Maine", "Augusta");
        statesAndCapitals.put("Maryland", "Annapolis");
        statesAndCapitals.put("Massachusetts", "Boston");
        statesAndCapitals.put("Michigan", "Lansing");
        statesAndCapitals.put("Minnesota", "Saint Paul");
        statesAndCapitals.put("Mississippi", "Jackson");
        statesAndCapitals.put("Missouri", "Jefferson City");
        statesAndCapitals.put("Montana", "Helena");
        statesAndCapitals.put("Nebraska", "Lincoln");
        statesAndCapitals.put("Nevada", "Carson City");
        statesAndCapitals.put("New Hampshire", "Concord");
        statesAndCapitals.put("New Jersey", "Trenton");
        statesAndCapitals.put("New Mexico", "Santa Fe");
        statesAndCapitals.put("New York", "Albany");
        statesAndCapitals.put("North Carolina", "Raleigh");
        statesAndCapitals.put("North Dakota", "Bismarck");
        statesAndCapitals.put("Ohio", "Columbus");
        statesAndCapitals.put("Oklahoma", "Oklahoma City");
        statesAndCapitals.put("Oregon", "Salem");
        statesAndCapitals.put("Pennsylvania", "Harrisburg");
        statesAndCapitals.put("Rhode Island", "Providence");
        statesAndCapitals.put("South Carolina", "Columbia");
        statesAndCapitals.put("South Dakota", "Pierre");
        statesAndCapitals.put("Tennessee", "Nashville");
        statesAndCapitals.put("Texas", "Austin");
        statesAndCapitals.put("Utah", "Salt Lake City");
        statesAndCapitals.put("Vermont", "Montpelier");
        statesAndCapitals.put("Virginia", "Richmond");
        statesAndCapitals.put("Washington", "Olympia");
        statesAndCapitals.put("West Virginia", "Charleston");
        statesAndCapitals.put("Wisconsin", "Madison");
        statesAndCapitals.put("Wyoming", "Cheyenne");

         // Displays the content of the map

        System.out.println("Content of the Map:");
        for (Map.Entry<String, String> entry : statesAndCapitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

         // Sorts the map by state names

        Map<String, String> sortedStatesAndCapitals = new TreeMap<>(statesAndCapitals);

        // Displays the sorted map

        System.out.println("\nSorted Map:");
        for (Map.Entry<String, String> entry : sortedStatesAndCapitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Prompts the user to input a state name

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a state to get its capital: ");
        String stateInput = scanner.nextLine().trim();

        // Checks if the entered state exists in the sorted map

        if (sortedStatesAndCapitals.containsKey(stateInput)) {

             // If the state exists, retrieves and displays its capital

            String capital = sortedStatesAndCapitals.get(stateInput);
            System.out.println("Capital of " + stateInput + " is: " + capital);

        } else {

             // If the state does not exist, displays an error message

            System.out.println("State not found!");
        }

        // Closes the Scanner

        scanner.close();
    }
}
