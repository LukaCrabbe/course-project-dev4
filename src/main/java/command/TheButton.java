package command;

import command.Command;

public class TheButton {

    Command command;

    public TheButton(Command newCommand){

        command = newCommand;

    }

    public void press(){
        command.execute();
    }
}
