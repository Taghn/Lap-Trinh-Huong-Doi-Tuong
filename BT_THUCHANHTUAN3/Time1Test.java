public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("Truoc khi cai dat thoi gian",time);
        System.out.println();

        time.setTime(13,27,6);
        displayTime("Sau khi cai dat thoi gian",time);
        System.out.println();

        try{
            time.setTime(99,99,99);
        }

        catch(IllegalArgumentException e) {
            System.out.printf("Canh bao: %s%n%n", e.getMessage());
        }

        displayTime("Sau khi chung ta thiet lap thoi gian sai", time);
    }

    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",header,t.toUniversalString(),t.toString());
    }
}
