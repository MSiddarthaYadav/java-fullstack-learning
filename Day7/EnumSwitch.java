enum Trafficlight{
    RED,
    YELLOW,
    GREEN
}
public class EnumSwitch{
    public static void main(String[] args) {
        Trafficlight signal=Trafficlight.GREEN;
        switch(signal){
        case RED:
            System.out.println("Stop");
            break;
        case YELLOW:
            System.out.println("Get Ready");
            break;
        case GREEN:
            System.out.println("Go");
            break;
        }

    }
}