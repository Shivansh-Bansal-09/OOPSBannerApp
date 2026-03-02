import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Shivansh
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        // Message to render
        String message = "OOPS";

        // Display banner
        displayBanner(message, patternMap);
    }

    /**
     * Utility method to build character pattern map
     *
     * @return Map of character to ASCII pattern
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        });

        return map;
    }

    /**
     * Utility method to display banner message
     *
     * @param message Word to render
     * @param patternMap Map containing character patterns
     */
    private static void displayBanner(String message, Map<Character, String[]> patternMap) {

        // Banner has 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                lineBuilder.append(pattern[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }
}