package Enemy.GBL_Unit;

import Enemy.GBL;

public class GBL_JY extends GBL {
    public GBL_JY(int x, int y) {
        super(10, 9,x,y);
    }
    @Override
    public void show() {
        System.out.println("精英哥布林出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("精英哥布林攻击力为: "+attack);
    }
}
