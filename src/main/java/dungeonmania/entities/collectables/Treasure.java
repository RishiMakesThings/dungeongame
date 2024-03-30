package dungeonmania.entities.collectables;

import dungeonmania.entities.Entity;
import dungeonmania.entities.enemies.snakestuff.SnakeHead;
import dungeonmania.map.GameMap;
import dungeonmania.util.Position;

public class Treasure extends Collectable {
    public Treasure(Position position) {
        super(position);
    }

    @Override
    public boolean canMoveOnto(GameMap map, Entity entity) {
        return true;
    }

    @Override
    public boolean isEdible() {
        return true;
    }

    public void whenEaten(SnakeHead head) {
        head.treasureBuffSnake();
    }
}
