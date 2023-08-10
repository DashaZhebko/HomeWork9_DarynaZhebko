public class HomeWork9 {
    public static boolean numberFilter(int num) {

        while (num > 0) {
            int result = num % 10;
            if (result == 4 || result == 9) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int shuttleNum = 1;
        int count = 0;
        System.out.println("Shuttle numbers: ");
        while (true) {
            if (!HomeWork9.numberFilter(shuttleNum)) {
                System.out.print(shuttleNum + ", ");
                count++;
            }
            shuttleNum++;
            if (count == 100) {
                break;
            }
        }
    }
}

