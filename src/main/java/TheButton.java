public class TheButton {

    Command command;

    public TheButton(Command newCommand){

        command = newCommand;

    }

    public void press(){
        command.execute();
    }
    public static String pressed(){
        return "button is pressed";
    }
}
