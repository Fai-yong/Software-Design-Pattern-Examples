package Enemy.KL_Unit;

import Enemy.KL;

public class KL_Fsh extends KL {
    public KL_Fsh(int x, int y) {
        super(8, 5,x,y);
    }

    @Override
    public void show() {
        System.out.println("法师骷髅出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("法师骷髅攻击力为: "+attack);
    }
}
