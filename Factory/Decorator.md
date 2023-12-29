<!-- 列出一系列的代码和图片 -->

## 代码


### IceCream 接口

```java
package taste;

public interface IceCream {
    public void show();
}
```
#### 橙子Class
```java
package taste;

public class Chengzi implements IceCream {
    @Override
    public void show() {
        System.out.println("橙子冰淇淋");
    }
}
```
#### 原味Class
```java
package taste;

public class Yuanwei implements IceCream {
    @Override
    public void show() {
        System.out.println("原味冰淇淋");
    }
}
```
#### 草莓Class
```java
package taste;

public class Caomei implements IceCream {
    @Override
    public void show() {
        System.out.print(" 草莓冰淇淋 ");
    }
}
```
### Decorator 类
```java
import taste.*;

public class Decorator implements IceCream {
    IceCream iceCream;

    public Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void show() {
        iceCream.show();

    }
}
```
### 饼干
```java
import taste.*;
public class BG extends Decorator {
    public BG(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("饼干【");
        iceCream.show();
        System.out.println("】");
    }
}
```
### 巧克力
```java
import taste.*;
public class QKL extends Decorator {
    public QKL(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("巧克力【");
        iceCream.show();
        System.out.print("】");
    }
}
```
### 花生
```java
import taste.*;
public class HSh extends Decorator {
    public HSh(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("花生【");
        iceCream.show();
        System.out.print("】");
    }
}
```
### 糖豆
```java
import taste.*;
public class TD extends Decorator {
    public TD(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("糖豆【");
        iceCream.show();
        System.out.print("】");
    }
}
```