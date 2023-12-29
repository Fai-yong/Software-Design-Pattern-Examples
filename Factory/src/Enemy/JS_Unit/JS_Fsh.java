package Enemy.JS_Unit;

import Enemy.JS;

public class JS_Fsh extends JS {
    public JS_Fsh(int x, int y) {
        super(12, 6, x, y);
    }

    @Override
    public void show() {
        System.out.println("法师僵尸出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("法师僵尸攻击力为: "+attack);
    }
}
