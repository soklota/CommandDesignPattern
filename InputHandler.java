import java.util.*;
import java.util.Map.*;

public class InputHandler {

    private HashMap<String, Command> commands;

    public InputHandler(Robot robot){

        HashMap <String, Command> commands = new HashMap<String, Command>();
        commands.put("pickup", PickupCommand);
        commands.put("jump", JumpCommand);
        commands.put("fire", FireCommand);
        commands.put("heal", HealCommand);

    }

    public void inputEntered(String data){

    }
    
    
}
