/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This use case improves UC4 by declaring and initializing the array
 * in a single statement using String.join().
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in ONE statement
        String[] lines = {

            String.join(" ",
                    " *** ",
                    " *** ",
                    " ***** ",
                    " ***** "),

            String.join(" ",
                    "**   **",
                    "**   **",
                    "**   **",
                    "**     "),

            String.join(" ",
                    "**   **",
                    "**   **",
                    "*****  ",
                    " ***   "),

            String.join(" ",
                    "**   **",
                    "**   **",
                    "**      ",
                    "    **  "),

            String.join(" ",
                    "**   **",
                    "**   **",
                    "**      ",
                    "**   **"),

            String.join(" ",
                    "**   **",
                    "**   **",
                    "**      ",
                    "**   **"),

            String.join(" ",
                    " *** ",
                    " *** ",
                    "**      ",
                    " ***** ")
        };

        // Use enhanced for loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}