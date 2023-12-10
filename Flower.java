//Q10
public class Flower {
    static String FlowerName;
    static int petalsNo;
    static float price;

    public Flower(String flowerName, int petalsNo, float price) {
        FlowerName = flowerName;
        this.petalsNo = petalsNo;
        this.price = price;
    }

    public String getFlowerName() {
        return FlowerName;
    }

    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

    public int getPetalsNo() {
        return petalsNo;
    }

    public void setPetalsNo(int petalsNo) {
        this.petalsNo = petalsNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String toString() {
        return "Flower{" +
                "FlowerName='" + FlowerName + '\'' +
                ", petalsNo=" + petalsNo +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Flower f=new Flower("Yasmeen",9,18.0f);

        System.out.println(f.toString());
    }
}
