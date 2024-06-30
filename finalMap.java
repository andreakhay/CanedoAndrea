import java.util.Random;
import java.util.Scanner;

public class finalMap {

        private static String[] allLocations = { "Naruto's House", "Supermarket",
                        "Barbershop", "Coffee shop", // names of all locations
                        "Gas Station", "CNSC" };

        private static int numLocations = 7;
        private static int[] meterDistances = new int[numLocations];

        private static String currentLocation;
        private static int currentLocationNum;
        private static Random rand = new Random();
        static int selectedLocation;
        static String shortestRoute;

        public finalMap() {
                currentLocationNum = rand.nextInt(numLocations);
                currentLocation = allLocations[currentLocationNum];
        }

        public static void Map(int selectedLocation) {
                // Map
        System.out.println("          ________________________________________________");
        System.out.println("          ║______________________║________________________║                              _______________________________________________________                        _______________________________________________________");
        System.out.println("         //______________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                            ║______________________________║_______________________║                      ║________________________║_____________________________║");
        System.out.println("        //________________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                           ║______________________________║________________________\\                     ║________________________║_____________________________\\");
        System.out.println("       //__________________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                         //_______________________________\\________________________\\                   //________________________\\______________________________\\");
        System.out.println("      //____________________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                      //_________________________________\\_________________________\\                 //__________________________\\______________________________\\");
        System.out.println("     //______________________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                   //___________________________________\\___________________________\\              //____________________________\\______________________________\\");
        System.out.println("    //________________________________\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\_\\                       ║                             ║                        ║                      ║                          ║                           ║");
        System.out.println("    ║                            ║                              ║                       ║      _______________        ║     ________________   ║                      ║    _______________       ║      ________________     ║");
        System.out.println("    ║      _______________       ║                              ║                       ║     |___|___|___|___|       ║   |                |   ║                      ║   |_______________|      ║     |____|______|____|    ║");
        System.out.println("    ║     |___|___|___|___|      ║                              ║                       ║     |___|___|___|___|       ║   |   SUPERMARKET  |   ║                      ║   |  BARBER SHOP  |      ║     |____|______|____|    ║");
        System.out.println("    ║     |___|___|___|___|      ║               _______        ║                       ║     |___|___|___|___|       ║   |________________|   ║                      ║   |_______________|      ║     |____|______|____|    ║");
        System.out.println("    ║                            ║              |___|___|       ║                       ║                             ║                        ║                      ║                          ║                           ║");
        System.out.println("    ║                            ║              |___|___|       ║                       ║                             ║     ______________     ║                      ║    ______________        ║                           ║");
        System.out.println("    ║                            ║              |___|___|       ║                       ║                             ║    |       ║      |    ║                      ║    |     ║      |        ║                           ║");
        System.out.println("    ║               ____         ║                              ║  ══════════════════   ║                             ║    |       ║      |    ║  ══════════════════  ║    |     ║      |        ║                           ║");
        System.out.println("    ║              |    |        ║                              ║  ------------------   ║                             ║    |       ║      |    ║  ------------------  ║    |     ║      |        ║                           ║");
        System.out.println("    ║              |    |        ║                              ║  ══════════════════   ║_____________________________║____|_______║______|____║  ══════════════════  ║____|_____║______|________║___________________________║");
        System.out.println("    ║______________|____|________║______________________________║  " + meterDistances[0] + " meters                                                                       " + meterDistances[1] + " meters                                  ");
        System.out.println("           Naruto's House " + (selectedLocation == 0 ? "[You're Here]" : "  ") + "                                                                              Supermarket " + (selectedLocation == 2 ? "[You're Here]" : " ") + "                                                  Barber Shop " + (selectedLocation == 3 ? "[You're Here]" : " ") + "");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println(meterDistances[4] + " meters ║  |  ║                                                                                                               ║  |  ║   " + meterDistances[3] + " meters                           ║  |  ║  " + meterDistances[2] + " meters");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("          ║  |  ║                                                                                                               ║  |  ║                                       ║  |  ║");
        System.out.println("                          /\\               	                                             _______________________________                                                                              /\\ ");				
        System.out.println("            ______________/__\\______________                                              /__________________________________\\		                                                                 /  \\");
        System.out.println("             ||                          ||                                           /____________________________________\\		                                                                /    \\");		
        System.out.println("             ||        COFFEE SHOP       ||                                       /______________________________________\\                                                           __________________/      \\_____________________");
        System.out.println("             ||__________________________||                                                                    ║   ║                                                                 |______________________________________________|");
        System.out.println("             /_/_/_/_/_/_/__\\_\\_\\_\\_\\_\\_\\_\\                                                                    ║   ║                                                                   |  ____  ____   __   __   __   ____  ____  |");
        System.out.println("            /_/_/_/_/_/_/____\\_\\_\\_\\_\\_\\_\\_\\                                                                   ║   ║                                                                   |  |  |  |  |  |  | |  | |  |  |  |  |  |  |");
        System.out.println("           /_/_/_/_/_/_/______\\_\\_\\_\\_\\_\\_\\_\\                                                                  ║   ║                                                                   |  |__|  |__|  |  | |  | |  |  |__|  |__|  |");
        System.out.println("           |                                 |                                                                 ║   ║                                                                   |  ____  ____  |  | |  | |  |  ____  ____  |");
        System.out.println("           |                                 |                                                                 ║   ║                                                                   |  |  |  |  |  |  | |  | |  |  |  |  |  |  |");
        System.out.println("           |            |   |   |   |   |    |                                                                 ║   ║                                                                   |  |__|  |__|  |  | |  | |  |  |__|  |__|  |");
        System.out.println("           |  _______   |___|___|___|___|    |                                                                 ║   ║                                                                   |  ____  ____  |  | |  | |  |  ____  ____  |");
        System.out.println("           |  |     |   |   |   |   |   |    |                                                            _____║   ║                                                                   |  |  |  |  |  |  | |  | |  |  |  |  |  |  |");
        System.out.println("           |  |     |   |___|___|___|___|    |                                                  __   __  ║ _ _ ║   ║                                                                   |  |__|  |__|  |  | |  | |  |  |__|  |__|  |");  
        System.out.println("           |  |    o|                        |    ═══════════════════════                      |  | |  | ║|_|_|║   ║             ═════════════════════════════════                    _|__________________________________________|_");
        System.out.println("           |  |     |                        |    ----------------------              _________|__|_|__|_║_____║___║_______       --------------------------------                   |______________________________________________|");
        System.out.println("           |__|____ |________________________|    ═══════════════════════                                                        ═════════════════════════════════ "); 
        System.out.println("                       Coffee Shop " + (selectedLocation == 1 ? "[You're Here]" : " ")  +  "                      " + meterDistances[5] + " meters                       Gas Station "  + (selectedLocation == 4 ? "[You're Here]" : " ") + "                                       " + meterDistances[6] + " meters                                           CNSC Main Campus " + (selectedLocation == 5 ? "[You're Here]" : " "));

        }

        public static void showLocations(String currentLocation) {
                System.out.println("You are currently in: " + currentLocation);
                for (int i = 0; i < allLocations.length; i++) {
                        if (allLocations[i].equals(currentLocation)) {

                                continue; // Skip the current location
                        }
                        System.out.println("[" + i + "]  " + allLocations[i]);

                }
        }

        public static void moveLocation(int selectedLocation) {
                switch (currentLocationNum) {
                        case 0:
                                if (selectedLocation == 1) {
                                        String[] stringRoutes = { "Naruto's house -> Coffee Shop", "Naruto's house -> Supermarket -> Gas Station -> Coffee Shop",
                                                        "Naruto's house -> Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari -> JM" };
                                        int[] intRoute1 = { meterDistances[4] },
                                                        intRoute2 = { meterDistances[0], meterDistances[3],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[0], meterDistances[1],
                                                                        meterDistances[2], meterDistances[6],
                                                                        meterDistances[5] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 2) {
                                        String[] stringRoute = {"Naruto's house -> Supermarket", "Naruto's house -> JM -> Diomari -> Supermarket",
                                                        "Naruto's house -> JM -> Diomari -> CNSC Main Campus -> Barber Shop -> Supermarket" };
                                        int[] intRoute1 = { meterDistances[0] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[3] },
                                                        intRoute3 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[6], meterDistances[2],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = {"Naruto's house -> JM -> Barber Shop ",
                                                        "Naruto's house -> JM -> Diomari -> Supermarket -> Barber Shop",
                                                        "Naruto's house -> JM -> Diomari -> CNSC Main Campus -> Barber Shop",
                                                        "Naruto's house -> Supermarket -> Diomari -> CNSC Main Campus -> Barber Shop" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[1] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[3], meterDistances[1] },
                                                        intRoute3 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[6], meterDistances[2] },
                                                        intRoute4 = { meterDistances[0], meterDistances[3],
                                                                        meterDistances[6], meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "Naruto's house -> Supermarket -> Diomari ", "Naruto's house -> JM -> Diomari",
                                                        "Naruto's house -> Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[3] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5] },
                                                        intRoute3 = { meterDistances[0], meterDistances[1],
                                                                        meterDistances[2], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Naruto's house -> Supermarket -> Barber Shop -> CNSC Main Campus ",
                                                        "Naruto's house -> JM -> Diomari -> Supermarket -> Barber Shop -> CNSC Main Campus",
                                                        "Naruto's house -> JM -> Diomari -> CNSC Main Campus",
                                                        "Naruto's house -> Supermarket -> Diomari -> CNSC Main Campus" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[1], meterDistances[2] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[3], meterDistances[1],
                                                                        meterDistances[2] },
                                                        intRoute3 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[6] },
                                                        intRoute4 = { meterDistances[0], meterDistances[3],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again");
                                }

                                break;

                        case 1:
                                if (selectedLocation == 0) {
                                        String[] stringRoutes = { "JM -> Naruto's house", "JM -> Diomari -> Supermarket ->Naruto's house",
                                                        "JM -> Diomari -> CNSC Main Campus -> Barber Shop -> Supermarket -> Naruto's house" };
                                        int[] intRoute1 = { meterDistances[4] },
                                                        intRoute2 = { meterDistances[5], meterDistances[3],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[5], meterDistances[6],
                                                                        meterDistances[2], meterDistances[1],
                                                                        meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 2) {
                                        String[] stringRoute = { "JM ->Naruto's house -> Supermarket", "JM -> Diomari -> AJ",
                                                        "JM -> Diomari -> CNSC Main Campus -> Barber Shop -> Supermarket" };
                                        int[] intRoute1 = { meterDistances[4], meterDistances[0] },
                                                        intRoute2 = { meterDistances[5], meterDistances[3] },
                                                        intRoute3 = { meterDistances[5], meterDistances[6],
                                                                        meterDistances[2], meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "JM -> Naruto's house -> Supermarket -> Barber Shop ",
                                                        "JM -> Diomari -> Supermarket -> Barber Shop",
                                                        "JM -> Diomari -> CNSC Main Campus -> Barber Shop",
                                                        "JM -> Naruto's house -> Supermarket -> Diomari -> CNSC  Main Campus -> Barber Shop" };
                                        int[] intRoute1 = { meterDistances[4], meterDistances[0], meterDistances[1] },
                                                        intRoute2 = { meterDistances[5], meterDistances[3],
                                                                        meterDistances[1] },
                                                        intRoute3 = { meterDistances[5], meterDistances[6],
                                                                        meterDistances[2] },
                                                        intRoute4 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[3], meterDistances[6],
                                                                        meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "JM -> Diomari ", "JM -> Naruto's house -> Supermarket -> Diomari",
                                                        "JM -> Naruto's house -> Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[5] },
                                                        intRoute2 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[3] },
                                                        intRoute3 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[1], meterDistances[2],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "JM -> Naruto's house -> Supermarket -> Barber Shop -> CNSC Main Campus ",
                                                        "JM -> Naruto's house -> Supermarket -> Diomari -> CNSC Main Campus",
                                                        "JM -> Diomari ->Supermarket -> Barber Shop -> CNSC Main Campus",
                                                        "JM -> Diomari -> CNSC Main Campus" };
                                        int[] intRoute1 = { meterDistances[4], meterDistances[0], meterDistances[1],
                                                        meterDistances[2] },
                                                        intRoute2 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[3], meterDistances[6] },
                                                        intRoute3 = { meterDistances[5], meterDistances[3],
                                                                        meterDistances[1], meterDistances[2] },
                                                        intRoute4 = { meterDistances[5], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again!");

                                }

                                break;

                        case 2:
                                if (selectedLocation == 0) {
                                        String[] stringRoutes = { "AJ -> Kenet", "Supermarket -> Diomari -> JM -> Naruto's house",
                                                        "Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari -> JM -> Naruto's house" };
                                        int[] intRoute1 = { meterDistances[0] },
                                                        intRoute2 = { meterDistances[3], meterDistances[5],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6], meterDistances[5],
                                                                        meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "Supermarket -> Naruto's house -> JM", "Supermarket -> Diomari -> JM",
                                                        "Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari -> JM" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[4] },
                                                        intRoute2 = { meterDistances[3], meterDistances[5] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6], meterDistances[5] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "Supermarket -> Barber Shop",
                                                        "Supermarket -> Diomari -> CNSC Main Campus -> Barber Shop" };
                                        int[] intRoute1 = { meterDistances[1] },
                                                        intRoute2 = { meterDistances[3], meterDistances[6],
                                                                        meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "AJ -> Diomari ", "Supermarket -> Kenet -> JM -> Diomari",
                                                        "Supermarket -> Barber Shop -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[3] },
                                                        intRoute2 = { meterDistances[0], meterDistances[4],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Supermarket -> Barber Shop -> CNSC Main Campus",
                                                        "Supermarket -> Diomari -> CNSC Main Campus" };
                                        int[] intRoute1 = { meterDistances[1], meterDistances[2] },
                                                        intRoute2 = { meterDistances[3], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again!");
                                }

                                break;

                        case 3:
                                if (selectedLocation == 0) {
                                        String[] stringRoutes = { "Barber Shop -> Supermarket -> Naruto's house",
                                                        "Barber Shop -> Supermarket -> Diomari -> JM -> Naruto's house",
                                                        "Barber Shop -> CNSC Main Campus -> Diomari -> JM -> Naruto's house",
                                                        "Barber Shop -> CNSC Main Campus -> Diomari -> AJ -> Naruto's house", };
                                        int[] intRoute1 = { meterDistances[1], meterDistances[0] },
                                                        intRoute2 = { meterDistances[1], meterDistances[3],
                                                                        meterDistances[5], meterDistances[4] },
                                                        intRoute3 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[5], meterDistances[4] },
                                                        intRoute4 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[3], meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "Michael -> Supermarket -> Naruto's house -> JM",
                                                        "Michael -> Supermarket -> Diomari -> JM",
                                                        "Michael -> CNSC Main Campus -> Diomari -> JM",
                                                        "Michael -> CNSC Main Campus -> Diomari -> Supermarket -> Naruto's house -> JM" };
                                        int[] intRoute1 = { meterDistances[1], meterDistances[0], meterDistances[4] },
                                                        intRoute2 = { meterDistances[1], meterDistances[3],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[5] },
                                                        intRoute4 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[3], meterDistances[0],
                                                                        meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 2) {
                                        String[] StringRoutes = { "Michael -> Supermarket",
                                                        "Michael -> CNSC Main Campus -> Diomari -> Supermarket" };
                                        int[] intRoute1 = { meterDistances[1] },
                                                        intRoute2 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[3] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "Michael -> Supermarket -> Diomari ",
                                                        "Michael -> Supermarket -> Naruto's house -> JM -> Diomari",
                                                        "Michael -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[1], meterDistances[3] },
                                                        intRoute2 = { meterDistances[1], meterDistances[0],
                                                                        meterDistances[4], meterDistances[5] },
                                                        intRoute3 = { meterDistances[2], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Michael -> CNSC Main Campus",
                                                        "Michael -> Supermarket -> Naruto's house -> JM -> Diomari -> CNSC Main Campus",
                                                        "Michael -> Supermarket -> Diomari ->" +
                                                                        "CNSC Main Campus" };
                                        int[] intRoute1 = { meterDistances[2] },
                                                        intRoute2 = { meterDistances[1], meterDistances[0],
                                                                        meterDistances[4], meterDistances[5],
                                                                        meterDistances[6] },
                                                        intRoute3 = { meterDistances[1], meterDistances[3],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again!");
                                }

                                break;

                        case 4:
                                if (selectedLocation == 0) {
                                        String[] stringRoutes = { "Diomari -> Supermarket -> Naruto's house", "Diomari -> JM -> Naruto's house",
                                                        "Diomari -> CNSC Main Campus -> Michael -> Supermarket -> Naruto's house" };
                                        int[] intRoute1 = { meterDistances[3], meterDistances[0] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1], meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "Diomari -> JM", "Diomari -> Supermarket -> Naruto's house -> JM",
                                                        "Diomari -> CNSC Main Campus -> Michael -> Supermarket -> Naruto's house -> JM" };
                                        int[] intRoute1 = { meterDistances[5] },
                                                        intRoute2 = { meterDistances[3], meterDistances[0],
                                                                        meterDistances[4] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1], meterDistances[0],
                                                                        meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 2) {
                                        String[] StringRoutes = { "Diomari -> Supermarket", "Diomari -> JM -> Naruto's house -> AJ",
                                                        "Diomari -> CNSC Main Campus -> Michael -> AJ" };
                                        int[] intRoute1 = { meterDistances[3] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "Diomari -> Supermarket -> Michael ",
                                                        "Diomari -> JM -> Naruto's house -> AJ -> Michael",
                                                        "Diomari -> CNSC Main Campus -> Michael" };
                                        int[] intRoute1 = { meterDistances[3], meterDistances[1] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4],
                                                                        meterDistances[0], meterDistances[1], },
                                                        intRoute3 = { meterDistances[6], meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Diomari -> Supermarket -> Michael -> CNSC Main Campus",
                                                        "Diomari -> JM -> Naruto's house -> Supermarket -> Michael -> CNSC Main Campus",
                                                        "Diomari -> CNSC" };
                                        int[] intRoute1 = { meterDistances[3], meterDistances[1], meterDistances[2] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4],
                                                                        meterDistances[0], meterDistances[1],
                                                                        meterDistances[2] },
                                                        intRoute3 = { meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again!");
                                }

                                break;

                        case 5:
                                if (selectedLocation == 0) {
                                        String[] stringRoutes = { "CNSC Main Campus -> Michael -> Supermarket -> Naruto's house",
                                                        "CNSC Main Campus -> Michael -> Supermarket -> Diomari -> JM -> Naruto's house",
                                                        "CNSC Main Campus -> Diomari -> JM -> Naruto's house",
                                                        "CNSC Main Campus -> Diomari -> Supermarket -> Naruto's house" };
                                        int[] intRoute1 = { meterDistances[2], meterDistances[1], meterDistances[0] },
                                                        intRoute2 = { meterDistances[2], meterDistances[1],
                                                                        meterDistances[3], meterDistances[5],
                                                                        meterDistances[4] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5],
                                                                        meterDistances[4] },
                                                        intRoute4 = { meterDistances[6], meterDistances[3],
                                                                        meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "CNSC Main Campus -> Michael -> Supermarket -> Kenet -> JM",
                                                        "CNSC Main Campus -> Michael -> Supermarket -> Diomari -> JM",
                                                        "CNSC Main Campus -> Diomari -> JM",
                                                        "CNSC Main Campus -> Diomari -> Supermarket -> Naruto's house -> JM" };
                                        int[] intRoute1 = { meterDistances[2], meterDistances[1], meterDistances[0],
                                                        meterDistances[4] },
                                                        intRoute2 = { meterDistances[2], meterDistances[1],
                                                                        meterDistances[3], meterDistances[5] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5] },
                                                        intRoute4 = { meterDistances[6], meterDistances[3],
                                                                        meterDistances[0], meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3),
                                                        getTotal(intRoute4) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 2) {
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael -> Supermarket",
                                                        "CNSC Main Campus -> Diomari -> Supermarket",
                                                        "CNSC Main Campus -> Diomari -> JM -> Naruto's house -> Supermarket" };
                                        int[] intRoute1 = { meterDistances[2], meterDistances[1] },
                                                        intRoute2 = { meterDistances[6], meterDistances[3] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5],
                                                                        meterDistances[4], meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael",
                                                        "CNSC Main Campus -> Diomari -> Supermarket -> Michael",
                                                        "CNSC Main Campus -> Diomari -> JM -> Naruto's house -> Supermarket -> Michael" };
                                        int[] intRoute1 = { meterDistances[2] },
                                                        intRoute2 = { meterDistances[6], meterDistances[3],
                                                                        meterDistances[1] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5],
                                                                        meterDistances[4], meterDistances[0],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael -> Supermarket -> Diomari",
                                                        "CNSC Main Campus -> Michael -> Supermarket -> Naruto's house -> JM -> Diomari",
                                                        "CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[2], meterDistances[1], meterDistances[3] },
                                                        intRoute2 = { meterDistances[2], meterDistances[1],
                                                                        meterDistances[0], meterDistances[4],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else {
                                        System.out.println("Invalid input. Please Try Again!");
                                }

                                break;
                        default:
                                System.out.println("Invalid input.");
                                break;
                }
        }

        public static void printWithDelay(String message, int delay) {
                for (int i = 0; i < message.length(); i++) {
                        System.out.print(message.charAt(i));
                        try {
                                Thread.sleep(delay);
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                String storyLine = """
                                Welcome Player...
                                                """;
                System.out.println();
                System.out.println();
                System.out.println();
                printWithDelay(storyLine, 15);

                String choice;

                for (int i = 0; i < meterDistances.length; i++) {
                        meterDistances[i] = random.nextInt(90) + 10;

                }

                int count = 0;
                int selectedLocation = 0;

                do {
                        while (count == 0) {
                                currentLocationNum = random.nextInt(numLocations - 1);
                                selectedLocation = currentLocationNum;
                                currentLocation = allLocations[currentLocationNum];
                                count++;
                        }

                        currentLocation = allLocations[selectedLocation];
                        Map(selectedLocation);
                        showLocations(currentLocation);
                        System.out.println(selectedLocation);
                        System.out.print("What's your next destination? : ");
                        while (!sc.hasNextInt()) {
                                System.out.println("Invalid input. Please enter a number.");
                                sc.next(); // invalid if its not integer
                        }
                        selectedLocation = sc.nextInt();
                        moveLocation(selectedLocation);

                        System.out.println(
                                        "\n\nAre you sure you want to continue? Enter 'yes' to continue or 'no' to exit: ");
                        choice = sc.next().toLowerCase(); // Read the choice and convert to lowercase

                        while (!choice.equals("yes") && !choice.equals("no")) {
                                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
                                System.out.println(
                                                "Are you sure you want to continue? Enter 'yes' to continue or 'no' to exit: ");
                                choice = sc.next().toLowerCase(); // Read the choice and convert to lowercase

                        }

                } while (choice.equals("yes"));

        }

        public static int getTotal(int[] array) {
                int sum = 0;
                for (int num : array) {
                        sum += num;
                }
                return sum;
        }

        public static int shortest(int[] array) {
                int min = array[0];

                for (int num : array) {
                        if (num < min) {
                                min = num;
                        }
                }

                return min;
        }

        public static float getTime(int shortestPath) {
                float min = (float) (shortestPath / 0.1);
                return min / 60;
        }

        public static void possibleRoutes(String[] routes, int[] totalDistances) {
                int shortestDistance = shortest(totalDistances);
                String shortestRoute = "";

                System.out.println("Possible Routes: ");
                for (int i = 0; i < routes.length; i++) {
                        System.out.print("\tPossible Route " + (i + 1) + ": " + routes[i] + " [ " + totalDistances[i]
                                        + " meters ] ");

                        convertTime(totalDistances[i]);

                        if (totalDistances[i] == shortestDistance)
                                shortestRoute = routes[i];
                }

                System.out.println("\nFastest Route: " + shortestRoute + " [ " + shortestDistance +
                                " meters ]");

        }

        public static void convertTime(int distance) {
                int hour = 0;
                int minutes = 0;

                if (distance > 60) {
                        hour = distance / 60;
                        minutes = distance % 60;
                        System.out.println("Time for travel: " + hour + " hour/s and " + minutes + " minutes");
                }
                if (distance < 60) {
                        minutes = distance % 60;
                        System.out.println("Time for travel: " + minutes + " minutes");
                }
        }

}
