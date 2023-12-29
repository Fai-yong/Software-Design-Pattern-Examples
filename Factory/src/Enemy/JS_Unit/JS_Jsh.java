package Enemy.JS_Unit;

import Enemy.JS;

public class JS_Jsh extends JS {
    public JS_Jsh(int x, int y) {
        super(10, 8, x, y);
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
