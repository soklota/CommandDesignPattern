import java.util.HashMap;

public class InputHandler {

    private HashMap<String, Command> commands;

    public InputHandler(Robot robot){

        commands = new HashMap<String, Command>();

    }

    public void inputEntered(String data){
        if (commands.containsKey(data)) {
            commands.get(data).execute();
        }
    }
    
    
}
