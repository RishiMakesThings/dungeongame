package dungeonmania.goals;

import dungeonmania.Game;
import dungeonmania.entities.Switch;

public class BouldersGoal implements Goal {

    public boolean achieved(Game game) {
        if (game.getPlayer() == null)
            return false;
        return game.getMap().getEntities(Switch.class).stream().allMatch(s -> s.isActivated());
    }

    public String toString(Game game) {
        if (this.achieved(game))
            return "";
        return ":boulders";
    }
}
