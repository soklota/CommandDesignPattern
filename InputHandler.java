import java.util.HashMap;

public class InputHandler {

    private HashMap<String, Command> commands;

    public InputHandler(Robot robot){

        commands = new HashMap<String, Command>();
        commands.put("heal", new HealCommand(robot));
        commands.put("fire", new FireCommand(robot));
        commands.put("jump", new JumpCommand(robot));
        commands.put("pickup", new PickupCommand(robot));
    }

    public void inputEntered(String data){
        if (commands.containsKey(data)) {
            commands.get(data).execute();
        }
    }
    
    
}
