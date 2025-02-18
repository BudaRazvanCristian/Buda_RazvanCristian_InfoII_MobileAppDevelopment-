public class Main {
    public static void main(String[] args) {
        System.out.println(countValleys("UDDDUDUU"));
    }

    public static int countValleys(String path) {
        int level = 0;
        int valleyCount = 0;


        for (char step : path.toCharArray()) {
            if (step == 'U') {
                level++;
            } else if (step == 'D') {
                level--;
            }

            if (level == 0 && step == 'U') {
                valleyCount++;
            }
        }

        return valleyCount;
    }
}
