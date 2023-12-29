import Enemy.Enemy;
import factory.Enemy_Factory;
import factory.Fsh_Factory;
import factory.JY_Factory;
import factory.Jsh_Factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("Game Begin!");

        Enemy_Factory factory1 = new JY_Factory(10, 10);
        Enemy KL_JY = factory1.Creat_KL();
        Enemy GBL_JY = factory1.Creat_GBL();
        Enemy JS_JY = factory1.Creat_JS();

        Enemy_Factory factory2 = new Fsh_Factory(5, 5);
        Enemy KL_Fsh = factory2.Creat_KL();
        Enemy GBL_Fsh = factory2.Creat_GBL();
        Enemy JS_Fsh = factory2.Creat_JS();

        Enemy_Factory factory3 = new Jsh_Factory(3, 3);
        Enemy KL_Jsh = factory3.Creat_KL();
        Enemy GBL_Jsh = factory3.Creat_GBL();
        Enemy JS_Jsh = factory3.Creat_JS();

        System.out.println("");

        KL_JY.show();
        KL_JY.attack();
        GBL_JY.show();
        GBL_JY.attack();
        JS_JY.show();
        JS_JY.attack();

        KL_Fsh.show();
        KL_Fsh.attack();
        GBL_Fsh.show();
        GBL_Fsh.attack();
        JS_Fsh.show();
        JS_Fsh.attack();

        KL_Jsh.show();
        KL_Jsh.attack();
        GBL_Jsh.show();
        GBL_Jsh.attack();
        JS_Jsh.show();
        JS_Jsh.attack();
        

    }
}