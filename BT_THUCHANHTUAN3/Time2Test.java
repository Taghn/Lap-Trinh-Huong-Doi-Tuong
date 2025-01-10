public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Cac khoi tao la:");
        displayTime("t1:Mac dinh tat ca: ", t1);
        displayTime("t2:Chi cai dat gio: ", t2);
        displayTime("t3:Cai dat gio va phut: ", t3);
        displayTime("t4:Cai dat day du gio, phut, giay: ", t4);
        displayTime("t5:Sao chep t4: ", t5);

        try {
            Time2 t6 = new Time2(27, 74, 99);
        }

        catch (IllegalArgumentException e) {
            System.out.printf("Canh bao trong qua trinh thiet lap t6 :%s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
        System.out.println();
    }
}
