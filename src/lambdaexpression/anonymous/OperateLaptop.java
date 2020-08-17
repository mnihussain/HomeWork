package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop() {
            @Override
            public void ramSize(int memorySize) {
                System.out.println("Size of memory is : " + memorySize*1000 + " MegaByte");
            }

            @Override
            public void monitorSize(int screenSize) {
                System.out.println("Screen size is : " + screenSize + " Inches");
            }
        };

        laptop.monitorSize(16);
        laptop.monitorSize(15);

        //please implement anonymous function for Phone FunctionalInterface
        Phone phone = new Phone() {
            @Override
            public void cellularNetwork(String network) {
                System.out.println("Cellular Network is : " + network);
            }
        };
        phone.cellularNetwork("At&t");

    }
}
