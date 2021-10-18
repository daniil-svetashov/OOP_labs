package ai205.svetashov;

public class Cart {

    // Item[] объект, подразумевается, что мы создаем массив объектов типа Item
    private Item[] stack; // массив для реализации стека (объявили массив)
    private int topIndex; // указатель на вершину стека (ТИП Integer)

    // При создании корзины мы должны
    // указать максимальное количество элементов
    // в корзине
    public Cart(int capacity) { //конструктор
        if (capacity >= 0) {
            stack = new Item[capacity];// размер стэка в элементах Item
            topIndex = -1;
        } else
            throw new IllegalArgumentException("capacity of stack must be bigger than 0");
    }

    // Добавление нового товара в корзину
    public boolean addItem(Item item) {
        return push(item);
    }

    // Приватный метод, который реализует добавление в стек
    private boolean push(Item item) {
        if (topIndex < stack.length - 1) { //мы реализуем stack через массив, поэтому stack lenght длина массива.
            stack[++topIndex] = item;// скорее всего так, тут ничего не было
            return true;
        } else
            return false;// или false если стек переполнен
    }

    // Удаление последнего добавленного товара в корзину
    public Item deleteLastAddedItem() {
        return pop();
    }

    // Приватный метод, который реализует извлечение из стека (удаление из стека) элемент будет удален с помощью Garbage Collector
    private Item pop() {
        return stack[topIndex--];//stack[topIndex--] имеет тип Item
        //return new Item(); // Извлеченный из стека товар // garbage collector

    }

    // причем я вижу смысл делать push и pop private, так как они подраззумивают внутренню структуру, но не вижу смысла делать таким же метод readTop, хотя может стоит?
    public Item readTopItem() {
        return readTop();
    }

    private Item readTop() {
        return stack[topIndex];
    }

    public boolean isEmpty()// возвращает элемент, находящийся на вершине стека
    {
        return topIndex==-1;
    }

    public boolean isFull()
    {
        return topIndex==-1;
    }



}