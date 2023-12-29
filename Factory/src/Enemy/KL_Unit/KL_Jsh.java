package Enemy.KL_Unit;

import Enemy.KL;

public class KL_Jsh extends KL {
    public KL_Jsh(int x, int y) {
        super(8, 8,x,y);
    }

    @Override
    public void show() {
        System.out.println("剑士骷髅出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("剑士骷髅出现在 " + x + ", " + y);
    }
}
