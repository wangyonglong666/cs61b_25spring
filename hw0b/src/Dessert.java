public class Dessert {
    public int flavor;//味道
    public int price;//价格
    public static int numDessert;//迄今为止做出来甜点的数量

    public Dessert(int f, int p) {
        this.flavor = f;
        this.price = p;
        Dessert.numDessert++;
    }

    public void printDessert() {

        System.out.println(this.flavor+" "+this.price+" "+Dessert.numDessert);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

}
