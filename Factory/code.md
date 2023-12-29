<!-- 列出一系列的代码和图片 -->

## 代码

### 工厂接口

```java
package factory;

import Enemy.GBL;
import Enemy.JS;
import Enemy.KL;

public interface Enemy_Factory {
    KL Creat_KL();

    GBL Creat_GBL();

    JS Creat_JS();
}

```
### 工厂类
#### 法师工厂

```java
package factory;

import Enemy.GBL;
import Enemy.GBL_Unit.GBL_JY;
import Enemy.JS;
import Enemy.JS_Unit.JS_JY;
import Enemy.KL;
import Enemy.KL_Unit.KL_JY;

public class Fsh_Factory implements Enemy_Factory {
    private int x, y;

    public Fsh_Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public KL Creat_KL() {
        KL unit = new KL_JY(x, y);
        System.out.println("法师骷髅成功制造");
        return unit;
    }

    @Override
    public GBL Creat_GBL() {
        GBL unit = new GBL_JY(x, y);
        System.out.println("法师哥布林成功制作");
        return unit;
    }

    @Override
    public JS Creat_JS() {
        JS unit = new JS_JY(x, y);
        System.out.println("法师僵尸成功制作");
        return unit;
    }
}

```
#### 剑士工厂

```java
package factory;

import Enemy.GBL;
import Enemy.GBL_Unit.GBL_JY;
import Enemy.JS;
import Enemy.JS_Unit.JS_JY;
import Enemy.KL;
import Enemy.KL_Unit.KL_JY;

public class Jsh_Factory implements Enemy_Factory {
    private int x, y;

    public Jsh_Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public KL Creat_KL() {
        KL unit = new KL_JY(x, y);
        System.out.println("剑士骷髅成功制造");
        return unit;
    }

    @Override
    public GBL Creat_GBL() {
        GBL unit = new GBL_JY(x, y);
        System.out.println("剑士哥布林成功制作");
        return unit;
    }

    @Override
    public JS Creat_JS() {
        JS unit = new JS_JY(x, y);
        System.out.println("剑士僵尸成功制作");
        return unit;
    }
}
```
#### 精英工厂
```java
package factory;

import Enemy.GBL;
import Enemy.GBL_Unit.GBL_JY;
import Enemy.JS;
import Enemy.JS_Unit.JS_JY;
import Enemy.KL;
import Enemy.KL_Unit.KL_JY;

public class JY_Factory implements Enemy_Factory {
    private int x, y;

    public JY_Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public KL Creat_KL() {
        KL unit = new KL_JY(x, y);
        System.out.println("精英骷髅成功制造");
        return unit;
    }

    @Override
    public GBL Creat_GBL() {
        GBL unit = new GBL_JY(x, y);
        System.out.println("精英哥布林成功制作");
        return unit;
    }

    @Override
    public JS Creat_JS() {
        JS unit = new JS_JY(x, y);
        System.out.println("精英僵尸成功制作");
        return unit;
    }
}
```
### 抽象类

#### Enemy 抽象类
```java
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
```
#### 哥布林
```java
package Enemy;

public abstract class GBL extends Enemy {
    public GBL(int attack, int defence, int x, int y) {
        super(attack,defence,30,x,y);
    }

}
```
#### 骷髅
```java
package Enemy;

public abstract class KL extends Enemy {
    public KL(int attack, int defence, int x, int y) {
       super(attack,defence,35,x,y);
    }
}
```
#### 僵尸
```java
package Enemy;

public abstract class JS extends Enemy {
    public JS(int attack, int defence, int x, int y) {
        super(attack,defence,35,x,y);
    }
}

```

### 具体类
#### 哥布林法师
```java
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

```
#### 哥布林剑士
```java
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

```
#### 哥布林精英
```java
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

```
#### 僵尸法师
```java
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

```
#### 僵尸剑士
```java

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

```
#### 僵尸精英
```java
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

```
#### 骷髅法师
```java

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

```

#### 骷髅剑士
```java

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

```
#### 骷髅精英
```java

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

```