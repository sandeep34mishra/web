public class MegaBytesConverter {

        public static void main(String[] args) {
            int kiloBytes= 3000;
            printMegaBytesAndKiloBytes(kiloBytes);
        }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Values");
        }
        else if(kiloBytes>=0){
            int MB = (kiloBytes / 1024);
            int KB = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + MB +
                    "MB and " + KB +
                    " KB");

        }
    }
}
