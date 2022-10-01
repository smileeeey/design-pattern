package 컴포짓패턴.after;

public class Client {

    public static void main(String[] args) {
        Item knife = new Item("칼", 250);
        Item potion = new Item("물약", 50);

        Bag bag = new Bag();
        bag.add(knife);
        bag.add(potion);

        Client client = new Client();
        client.printPrice(knife);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
