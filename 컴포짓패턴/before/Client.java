package 컴포짓패턴.before;

public class Client {

    public static void main(String[] args) {
        Item knife = new Item("칼", 250);
        Item potion = new Item("물약", 50);

        Bag bag = new Bag();
        bag.addItem(knife);
        bag.addItem(potion);

        Client client = new Client();
        client.getPrice(knife);
        client.getPrice(bag);
    }

    private void getPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void getPrice(Bag bag) {
        int price = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(price);
    }
}
