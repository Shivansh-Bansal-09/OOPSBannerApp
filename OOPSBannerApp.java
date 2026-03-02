/**
 * OOPS Banner App
 *
 * UC5: Render OOPS banner using Inline Array Initialization
 *
 * Refactors UC4 by combining array declaration and initialization
 * with String.join() calls for improved conciseness and readability.
 *
 * @author Shivansh
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline declaration and initialization of banner lines
        String[] bannerLines = {
            String.join(" ", " ***** ", "  ***** ", "  ***** ", "  ***** "),
            String.join(" ", "*     *", " *     *", " *     *", " *      "),
            String.join(" ", "*     *", " *     *", " *     *", " *      "),
            String.join(" ", "*     *", " *     *", " *****  ", "  ***** "),
            String.join(" ", "*     *", " *     *", " *      ", "       *"),
            String.join(" ", "*     *", " *     *", " *      ", "       *"),
            String.join(" ", " ***** ", "  ***** ", " *      ", "  ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}