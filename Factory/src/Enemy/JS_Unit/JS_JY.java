package Enemy.JS_Unit;

import Enemy.JS;

public class JS_JY extends JS {
    public JS_JY(int x, int y) {
        super(12, 8, x, y);
    }

    @Override
    public void show() {
        System.out.println("精英僵尸出现在 " + x + ", " + y);
    }

    @Override
    public void attack() {
        System.out.println("精英僵尸攻击力为: "+attack);
    }
}
