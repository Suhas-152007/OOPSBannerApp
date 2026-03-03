public class OOPSBannerApp {

    
    public static String pad(String s, int width) {
        return String.format("%-" + width + "s", s);
    }

    
    public static String[] getOPattern() {
        return new String[] {
            "  *  ",
            " * * ",
            "*   *",
            "*   *",
            "*   *",
            " * * ",
            "  *  "
        };
    }

    
    public static String[] getPPattern() {
        return new String[] {
            "** ",
            "*  * ",
            "*  * ",
            "** ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    
    public static String[] getSPattern() {
        return new String[] {
            "*** ",
            "**     ",
            "**     ",
            " *   ",
            "   **  ",
            "   **  ",
            "*** "
        };
    }

    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        int width = 7;

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                pad(oPattern[i], width) + "  " +
                pad(oPattern[i], width) + "  " +
                pad(pPattern[i], width) + "  " +
                pad(sPattern[i], width)
            );
        }
    }
}