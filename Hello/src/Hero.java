public class Hero {

    String name;  // 英雄姓名
    float hp;       // 血量
    float armor;    // 护甲值
    int moveSpeed;  // 移动速度

    // 获取护甲值的方法
    float getArmor() {
        return armor;
    }

    // 超神方法
    void legendary() {
        System.out.println("超神了！！");
    }

    // 获取hp的方法
    float getHp() {
        return hp;
    }

    // 增加血量的方法
    void addHp(float blood) {
        hp = hp + blood;
    }

    public static void main(String[] args) {
        Hero gaiLun = new Hero();
        gaiLun.name = "盖伦";
        gaiLun.hp = 200;
        System.out.println(gaiLun.name + "的血量为：" + gaiLun.getHp());
        gaiLun.addHp(100);
        System.out.println(gaiLun.name + "增加之后的血量：" + gaiLun.getHp());
    }
}
