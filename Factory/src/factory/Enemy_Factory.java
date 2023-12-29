package factory;

import Enemy.GBL;
import Enemy.JS;
import Enemy.KL;

public interface Enemy_Factory {
    KL Creat_KL();

    GBL Creat_GBL();

    JS Creat_JS();
}
