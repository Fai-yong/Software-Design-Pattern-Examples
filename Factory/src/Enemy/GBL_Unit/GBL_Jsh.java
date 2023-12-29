package Enemy.GBL_Unit;

import Enemy.GBL;

public class GBL_Jsh extends GBL {
    public GBL_Jsh(int x, int y) {
        super(8, 9, x, y);
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
