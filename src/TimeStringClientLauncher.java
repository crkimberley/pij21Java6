import java.rmi.Naming;

/**
 * @author crkimberley on 29/11/2016.
 */
public class TimeStringClientLauncher {

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            TimeService timeService = (TimeService) Naming.lookup("//192.168.1.65:1099/Date");
            System.out.println(timeService.currentTimeAndDate());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}