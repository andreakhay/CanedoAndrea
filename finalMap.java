import java.util.Scanner; 
import java.io.IOException;
import java.util.Random;

public class finalMap {

        private static String[] allLocations = { "Naruto's House", "John Michael's House",
                        "Aaron Joshua's House", "Michael's House", // names of all locations
                        "Diomari's House", "CNSC Main Campus" };

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
                System.out.println(
                                "             /\\                                                 ___     /\\                                                    ________  /^\\ ________");
                System.out.println(
                                "            //\\\\       ____                                    |_ _|  ///\\\\\\                                                 /_/_/_/_ /// \\\\\\_\\_\\_\\_\\ ");
                System.out.println(
                                "          ///   \\\\\\   |_  _|                                    | | ///    \\\\\\                                             ///      ///     \\\\\\     \\\\\\");
                System.out.println(
                                "        ///       \\\\\\  |  |                                     | ///        \\\\\\                                         ///      ///   _ _   \\\\\\     \\\\\\");
                System.out.println(
                                "      ///           \\\\\\|  |                                     ///  __ __ __  \\\\\\                                     ///         |   |_|_|   |        \\\\\\");
                System.out.println(
                                "    ///               \\\\\\ |                                   ///|  |__|__|__|  |\\\\\\                                 ///           |___________|          \\\\\\");
                System.out.println(
                                "  ///                   \\\\\\                                      |  |__|__|__|  |                                  ///______________________________________\\\\\\");
                System.out.println(
                                "///______________________\\\\\\                                   __|______________|__                                |__________________________________________|");
                System.out.println(
                                "   |  ___          ___  |                                     |____________________|                                 |   _________              _________   |");
                System.out.println(
                                "   | |___|   __   |___| |                                       |  _          _  |                                   |  |  __ __  |            |  __ __  |  |");
                System.out.println(
                                "   | |_|_|  |  |  |_|_| |   ═════════════════════════════════   | |_|   __   |_| |   ═════════════════════════════   |  | |__|__| |     ___    | |__|__| |  |");
                System.out.println(
                                "   |        |' |        |   ────────────────────────────────    | |_|  |  |  |_| |   ─────────────────────────────   |  | |__|__| |    |   |   | |__|__| |  |");
                System.out.println(
                                "   |      __|__|__      |   ═════════════════════════════════   |      |' |      |   ═════════════════════════════   |  |_________|    |'  |   |_________|  |");
                System.out.println("   |_____|________|_____|                " + meterDistances[0]
                                + " meters              |______|__|______|             " + meterDistances[1]
                                + " meters             |_________________|___|________________|");
                System.out.println("       Kenet's House " + (selectedLocation == 0 ? "[You're Here]" : "  ")
                                + "                                             AJ's House "
                                + (selectedLocation == 2 ? "[You're Here]" : " ")
                                + "                                           Michael's House "
                                + (selectedLocation == 3 ? "[You're Here]" : " ") + "");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(meterDistances[4]
                                + " meters ║  |  ║                                                    ║  |  ║   "
                                + meterDistances[3]
                                + " meters                                              ║  |  ║  " + meterDistances[2]
                                + " meters");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "          ║  |  ║                                                    ║  |  ║                                                          ║  |  ║");
                System.out.println(
                                "                                ___                               ___________________________                              __________________________________________");
                System.out.println(
                                "          /\\                   |_ _|                             /_/_/_/_/_/_/_/_/_\\_\\_\\_\\_\\_\\                            /_   __       __       __   __       __   _\\");
                System.out.println(
                                "        ///\\\\\\__________________|_|__                          ///                           \\\\\\                           |  |__|     |   |\\ | |__  |        |__|  |");
                System.out.println(
                                "      ///    \\\\\\                   \\\\                        ///                               \\\\\\                         |  |__|     |__ | \\|  __| |__      |__|  |");
                System.out.println(
                                "    /// _____  \\\\\\                  \\\\                     ///___________________________________\\\\\\                       |________________________________________|       _____");
                System.out.println(
                                "  ///  |__|__|   \\\\\\                 \\\\                    \\\\_______________________________________/                     /                                         \\     ||\\____|");
                System.out.println(
                                "///|   |__|__|    |\\\\\\                \\\\                      |                                   |                      /___________________________________________\\    ||/____|");
                System.out.println(
                                "   ||              ||____________________\\\\                   |               __      ____ ____   |                       |   ___ ___   |             |   ___ ___   |     ||");
                System.out.println(
                                "   ||   __ __ __   ||           __ __  |                      |      ___     |__|    |____|____|  |                       |  |   |   |  |     ___     |  |   |   |  |     ||");
                System.out.println(
                                "   ||  |  |  |  |  ||    ___   |  |  | |                      |     |   |            |____|____|  |                       |  |___|___|  |    |   |    |  |___|___|  |     ||");
                System.out.println(
                                "   ||  |__|__|__|  ||   |   |  |__|__| |  ══════════════════  |     |'  |                         | ═════════════════════ |  |   |   |  |    |'  |    |  |   |   |  |     ||");
                System.out.println(
                                "   ||              ||   |'  |          |  ──────────────────  |    _|___|_                        | ───────────────────── |  |___|___|  |   _|___|_   |  |___|___|  |     ||");
                System.out.println(
                                "   ||______________||___|___|__________|  ══════════════════  |___|_______|_______________________| ═════════════════════ |_____________|__|_______|__|_____________|     ||");
                System.out.println("       JM's House " + (selectedLocation == 1 ? "[You're Here]" : " ")
                                + "                      " + meterDistances[5]
                                + " meters                       Diomari's House "
                                + (selectedLocation == 4 ? "[You're Here]" : " ") + "        " + meterDistances[6]
                                + " meters                     CNSC Main Campus "
                                + (selectedLocation == 5 ? "[You're Here]" : " "));

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
                                        String[] stringRoutes = { "Kenet -> JM", "Kenet -> AJ -> Diomari -> JM",
                                                        "Kenet -> AJ -> Michael -> CNSC Main Campus -> Diomari -> JM" };
                                        int[] intRoute1 = { meterDistances[4] },
                                                        intRoute2 = { meterDistances[0], meterDistances[3],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[0], meterDistances[1],
                                                                        meterDistances[2], meterDistances[6],
                                                                        meterDistances[5] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 2) {
                                        String[] stringRoute = { "Kenet -> AJ", "Kenet -> JM -> Diomari -> AJ",
                                                        "Kenet -> JM -> Diomari -> CNSC Main Campus -> Michael -> AJ" };
                                        int[] intRoute1 = { meterDistances[0] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[3] },
                                                        intRoute3 = { meterDistances[4], meterDistances[5],
                                                                        meterDistances[6], meterDistances[2],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "Kenet -> JM -> Michael ",
                                                        "Kenet -> JM -> Diomari -> AJ -> Michael",
                                                        "Kenet -> JM -> Diomari -> CNSC Main Campus -> Michael",
                                                        "Kenet -> AJ -> Diomari -> CNSC Main Campus -> Michael" };
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
                                        String[] StringRoutes = { "Kenet -> AJ -> Diomari ", "Kenet -> JM -> Diomari",
                                                        "Kenet -> AJ -> Michael -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[3] },
                                                        intRoute2 = { meterDistances[4], meterDistances[5] },
                                                        intRoute3 = { meterDistances[0], meterDistances[1],
                                                                        meterDistances[2], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Kenet -> AJ -> Michael -> CNSC Main Campus ",
                                                        "Kenet -> JM -> Diomari -> AJ -> Michael -> CNSC Main Campus",
                                                        "Kenet -> JM -> Diomari -> CNSC Main Campus",
                                                        "Kenet -> AJ -> Diomari -> CNSC Main Campus" };
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
                                        String[] stringRoutes = { "JM -> Kenet", "JM -> Diomari -> AJ -> Kenet",
                                                        "JM -> Diomari -> CNSC Main Campus -> Michael -> AJ -> Kenet" };
                                        int[] intRoute1 = { meterDistances[4] },
                                                        intRoute2 = { meterDistances[5], meterDistances[3],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[5], meterDistances[6],
                                                                        meterDistances[2], meterDistances[1],
                                                                        meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 2) {
                                        String[] stringRoute = { "JM -> Kenet -> AJ", "JM -> Diomari -> AJ",
                                                        "JM -> Diomari -> CNSC Main Campus -> Michael -> AJ" };
                                        int[] intRoute1 = { meterDistances[4], meterDistances[0] },
                                                        intRoute2 = { meterDistances[5], meterDistances[3] },
                                                        intRoute3 = { meterDistances[5], meterDistances[6],
                                                                        meterDistances[2], meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "JM -> Kenet -> AJ -> Michael ",
                                                        "JM -> Diomari -> AJ -> Michael",
                                                        "JM -> Diomari -> CNSC Main Campus -> Michael",
                                                        "JM -> Kenet -> AJ -> Diomari -> CNSC  Main Campus -> Michael" };
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
                                        String[] StringRoutes = { "JM -> Diomari ", "JM -> Kenet -> AJ -> Diomari",
                                                        "JM -> Kenet -> AJ -> Michael -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[5] },
                                                        intRoute2 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[3] },
                                                        intRoute3 = { meterDistances[4], meterDistances[0],
                                                                        meterDistances[1], meterDistances[2],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "JM -> Kenet -> AJ -> Michael -> CNSC Main Campus ",
                                                        "JM -> Kenet -> AJ -> Diomari -> CNSC Main Campus",
                                                        "JM -> Diomari -> AJ -> Michael -> CNSC Main Campus",
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
                                        String[] stringRoutes = { "AJ -> Kenet", "AJ -> Diomari -> JM -> Kenet",
                                                        "AJ -> Michael -> CNSC Main Campus -> Diomari -> JM -> Kenet" };
                                        int[] intRoute1 = { meterDistances[0] },
                                                        intRoute2 = { meterDistances[3], meterDistances[5],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6], meterDistances[5],
                                                                        meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "AJ -> Kenet -> JM", "AJ -> Diomari -> JM",
                                                        "AJ -> Michael -> CNSC Main Campus -> Diomari -> JM" };
                                        int[] intRoute1 = { meterDistances[0], meterDistances[4] },
                                                        intRoute2 = { meterDistances[3], meterDistances[5] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6], meterDistances[5] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "AJ -> Michael",
                                                        "AJ -> Diomari -> CNSC Main Campus -> Michael" };
                                        int[] intRoute1 = { meterDistances[1] },
                                                        intRoute2 = { meterDistances[3], meterDistances[6],
                                                                        meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "AJ -> Diomari ", "AJ -> Kenet -> JM -> Diomari",
                                                        "AJ -> Michael -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[3] },
                                                        intRoute2 = { meterDistances[0], meterDistances[4],
                                                                        meterDistances[5] },
                                                        intRoute3 = { meterDistances[1], meterDistances[2],
                                                                        meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "AJ -> Michael -> CNSC Main Campus",
                                                        "AJ -> Diomari -> CNSC Main Campus" };
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
                                        String[] stringRoutes = { "Michael -> AJ -> Kenet",
                                                        "Michael -> AJ -> Diomari -> JM -> Kenet",
                                                        "Michael -> CNSC Main Campus -> Diomari -> JM -> Kenet",
                                                        "Michael -> CNSC Main Campus -> Diomari -> AJ -> Kenet", };
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
                                        String[] stringRoute = { "Michael -> AJ -> Kenet -> JM",
                                                        "Michael -> AJ -> Diomari -> JM",
                                                        "Michael -> CNSC Main Campus -> Diomari -> JM",
                                                        "Michael -> CNSC Main Campus -> Diomari -> AJ -> Kenet -> JM" };
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
                                        String[] StringRoutes = { "Michael -> AJ",
                                                        "Michael -> CNSC Main Campus -> Diomari -> AJ" };
                                        int[] intRoute1 = { meterDistances[1] },
                                                        intRoute2 = { meterDistances[2], meterDistances[6],
                                                                        meterDistances[3] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "Michael -> AJ -> Diomari ",
                                                        "Michael -> AJ -> Kenet -> JM -> Diomari",
                                                        "Michael -> CNSC Main Campus -> Diomari" };
                                        int[] intRoute1 = { meterDistances[1], meterDistances[3] },
                                                        intRoute2 = { meterDistances[1], meterDistances[0],
                                                                        meterDistances[4], meterDistances[5] },
                                                        intRoute3 = { meterDistances[2], meterDistances[6] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Michael -> CNSC Main Campus",
                                                        "Michael -> AJ -> Kenet -> JM -> Diomari -> CNSC Main Campus",
                                                        "Michael -> AJ -> Diomari ->" +
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
                                        String[] stringRoutes = { "Diomari -> AJ -> Kenet", "Diomari -> JM -> Kenet",
                                                        "Diomari -> CNSC Main Campus -> Michael -> AJ -> Kenet" };
                                        int[] intRoute1 = { meterDistances[3], meterDistances[0] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1], meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoutes, total);
                                } else if (selectedLocation == 1) {
                                        String[] stringRoute = { "Diomari -> JM", "Diomari -> AJ -> Kenet -> JM",
                                                        "Diomari -> CNSC Main Campus -> Michael -> AJ -> Kenet -> JM" };
                                        int[] intRoute1 = { meterDistances[5] },
                                                        intRoute2 = { meterDistances[3], meterDistances[0],
                                                                        meterDistances[4] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1], meterDistances[0],
                                                                        meterDistances[4] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(stringRoute, total);
                                } else if (selectedLocation == 2) {
                                        String[] StringRoutes = { "Diomari -> AJ", "Diomari -> JM -> Kenet -> AJ",
                                                        "Diomari -> CNSC Main Campus -> Michael -> AJ" };
                                        int[] intRoute1 = { meterDistances[3] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4],
                                                                        meterDistances[0] },
                                                        intRoute3 = { meterDistances[6], meterDistances[2],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "Diomari -> AJ -> Michael ",
                                                        "Diomari -> JM -> Kenet -> AJ -> Michael",
                                                        "Diomari -> CNSC Main Campus -> Michael" };
                                        int[] intRoute1 = { meterDistances[3], meterDistances[1] },
                                                        intRoute2 = { meterDistances[5], meterDistances[4],
                                                                        meterDistances[0], meterDistances[1], },
                                                        intRoute3 = { meterDistances[6], meterDistances[2] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 5) {
                                        String[] StringRoutes = { "Diomari -> AJ -> Michael -> CNSC Main Campus",
                                                        "Diomari -> JM -> Kenet -> AJ -> Michael -> CNSC Main Campus",
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
                                        String[] stringRoutes = { "CNSC Main Campus -> Michael -> AJ -> Kenet",
                                                        "CNSC Main Campus -> Michael -> AJ -> Diomari -> JM -> Kenet",
                                                        "CNSC Main Campus -> Diomari -> JM -> Kenet",
                                                        "CNSC Main Campus -> Diomari -> AJ -> Kenet" };
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
                                        String[] stringRoute = { "CNSC Main Campus -> Michael -> AJ -> Kenet -> JM",
                                                        "CNSC Main Campus -> Michael -> AJ -> Diomari -> JM",
                                                        "CNSC Main Campus -> Diomari -> JM",
                                                        "CNSC Main Campus -> Diomari -> AJ -> Kenet -> JM" };
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
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael -> AJ",
                                                        "CNSC Main Campus -> Diomari -> AJ",
                                                        "CNSC Main Campus -> Diomari -> JM -> Kenet -> AJ" };
                                        int[] intRoute1 = { meterDistances[2], meterDistances[1] },
                                                        intRoute2 = { meterDistances[6], meterDistances[3] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5],
                                                                        meterDistances[4], meterDistances[0] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 3) {
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael",
                                                        "CNSC Main Campus -> Diomari -> AJ -> Michael",
                                                        "CNSC Main Campus -> Diomari -> JM -> Kenet -> AJ -> Michael" };
                                        int[] intRoute1 = { meterDistances[2] },
                                                        intRoute2 = { meterDistances[6], meterDistances[3],
                                                                        meterDistances[1] },
                                                        intRoute3 = { meterDistances[6], meterDistances[5],
                                                                        meterDistances[4], meterDistances[0],
                                                                        meterDistances[1] };
                                        int[] total = { getTotal(intRoute1), getTotal(intRoute2), getTotal(intRoute3) };
                                        possibleRoutes(StringRoutes, total);
                                } else if (selectedLocation == 4) {
                                        String[] StringRoutes = { "CNSC Main Campus -> Michael -> AJ -> Diomari",
                                                        "CNSC Main Campus -> Michael -> AJ -> Kenet -> JM -> Diomari",
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
                                Michael: Michael, an industrious student, resides in a modest boarding house just a stone's throw away from CNSC. His passion for computer science is unmatched, spending countless hours coding and working on innovative projects in the college's computer lab. Despite his intense focus on academics, Michael is always willing to lend a helping hand to his fellow boarders, whether it's debugging code or offering study tips.

                                Diomari: Diomari exudes warmth and vitality, residing in a bustling boarding house a few blocks from CNSC. A sports enthusiast, he dominates the basketball court with his agile moves and infectious energy. Diomari's jovial nature fosters camaraderie among his fellow boarders, often organizing friendly matches and outdoor adventures. Despite his love for sports, he maintains a balance, excelling in his studies and engaging in community service initiatives.

                                John Michael: John Michael, a contemplative soul, finds solace in a serene boarding house nestled on the outskirts of CNSC. His passion lies in the world of literature, where he delves into the depths of poetry and prose. Amidst the tranquility of his surroundings, John Michael crafts captivating narratives, drawing inspiration from his observations of human nature. He dreams of one day sharing his literary creations with a wider audience, weaving tales that resonate with the human experience.

                                Kenet: Kenet, a pragmatic thinker, calls a cozy boarding house near the campus library his home. His fervor for environmental science drives him to spearhead sustainability initiatives both on and off campus. Kenet's dedication to conservation extends beyond the classroom as he volunteers for local environmental organizations and leads community clean-up efforts. His unwavering commitment inspires his fellow boarders to adopt eco-friendly practices, fostering a greener future.

                                Aaron Joshua: Aaron Joshua, a charismatic leader, resides in a vibrant boarding house at the heart of the CNSC campus. His magnetic personality and persuasive charm propel him into student government and extracurricular activities. Aaron Joshua's vision for positive change ignites a sense of purpose among his peers, rallying them behind impactful causes. Despite his ambitious pursuits, he remains approachable, offering mentorship and guidance to his fellow boarders on their journey to success.

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
