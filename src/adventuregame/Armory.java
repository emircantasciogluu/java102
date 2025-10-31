package adventuregame;

public class Armory {
    private String name;
    private int id;
    private int block;
    private int price;

    public Armory(int id, String name, int block, int price){
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }

    public static Armory[] armors(){
        Armory[] armorList = new Armory[3];
        armorList[0] = new Armory(1, "Light", 1, 10);
        armorList[1] = new Armory(2, "Medium", 3, 25);
        armorList[2] = new Armory(3, "Heavy", 5, 40);
        return armorList;
    }

    public static Armory getArmoryObjById(int id){
        for (Armory a: Armory.armors()){
            if (a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}