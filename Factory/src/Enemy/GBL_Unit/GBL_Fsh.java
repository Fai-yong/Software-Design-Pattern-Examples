package Enemy.GBL_Unit;


import Enemy.GBL;


public class GBL_Fsh extends GBL {
    public GBL_Fsh(int x, int y) {
        super(10,6, x,y);
    }

    @Override
    public void show() {
        System.out.println("法师哥布林出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("法师哥布林攻击力为: "+attack);
    }
}
