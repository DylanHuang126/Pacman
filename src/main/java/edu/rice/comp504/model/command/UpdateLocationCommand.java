package edu.rice.comp504.model.command;

import edu.rice.comp504.model.board.IPacmanBoard;
import edu.rice.comp504.model.object.Ghost;
import edu.rice.comp504.model.object.IObject;

public class UpdateLocationCommand implements IUpdateCommand {

    private final IPacmanBoard board;

    public UpdateLocationCommand(IPacmanBoard board) {
        this.board = board;
    }

    /**
     * Execute certain command on the object.
     *
     * @param object object to execute command
     */
    @Override
    public void execute(IObject object) {
        if (object instanceof Ghost) {
            ((Ghost) object).getUpdateStrategy().update(object, board);
        }
    }
}
