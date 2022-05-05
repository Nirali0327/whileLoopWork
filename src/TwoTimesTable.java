public class TwoTimesTable {
    public static void myClass(int num, int i) {
        while (i <= 12) {
            System.out.println(num + " * " + i + " =  " + num * i);
            i++;
        }
    }
    public static void main(String[] args) {
        myClass(2,1);
    }
}

