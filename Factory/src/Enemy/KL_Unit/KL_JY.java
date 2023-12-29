package Enemy.KL_Unit;

import Enemy.KL;

public class KL_JY extends KL {
    public KL_JY(int x, int y) {
        super(10, 9,x,y);
    }

    @Override
    public void show() {
        System.out.println("精英骷髅出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("精英骷髅攻击力为: "+attack);
    }
}
