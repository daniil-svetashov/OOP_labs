package ai205.svetashov;


public class Main {
    public static void main(String[] args) {

        IntStack s1 = new IntStack();
        s1.addElement(1);
        System.out.println(s1.readTopElement());
        s1.addElement(2);
        s1.addElement(3);
        s1.addElement(4);
        s1.addElement(5);

        //Проверка работы Cart (стек). Item класс
       /* //I create an object called Item
        Item i1 = new Item("TV", 2050);
        Item i2 = new Item("PC", 3200);
        Item i3 = new Item("DISPLAY", 1200);
        Cart mainCart=new Cart(4);//CAPACITY
        mainCart.addItem(i1);
        mainCart.addItem(i2);
        mainCart.addItem(i3);
        System.out.println(mainCart.addItem(i3));
        System.out.println(mainCart.addItem(i3));
        mainCart.deleteLastAddedItem();*/


    }
}
