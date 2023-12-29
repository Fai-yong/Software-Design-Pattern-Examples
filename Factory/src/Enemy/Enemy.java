package Enemy;

public abstract class Enemy {
    protected int attack, defence, health, x, y;

    public Enemy(int attack, int defence, int health, int x, int y) {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x = x;
        this.y = y;

    }

    public abstract void show();

    public abstract void attack();
}
