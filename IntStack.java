package ai205.svetashov;


        /*при реализации класса вам необходимо указать область видимости для полей и методов.Подумайте о том,какие методы необходимо отнести к"интерфейсу",а какие к реализации;
        размер стека для внешнего пользователя не имеет значения и теоретически неограничен;
        внешний пользователь не должен знать и догадываться,что стек"внутри"реализован с помощью обычного статического массива;
        вы должны написать"реализацию"класса таким образом,чтобы можно моделировать динамическое поведение стека с помощью обычного статического массива;
        продумайте,какие аргументы методы должны принимать и какие значения возвращать.*/

public class IntStack {
    private static int[] stack = new int[1];//изначально инициализиурем 1 //static?
    private int topIndex = -1;

    public IntStack() {// пустой конструктор как и указано в условии
    }



    public int deleteLastElement() {
        return pop();
    }

    private int pop() {
        return stack[topIndex--];
    }



    public boolean addElement(int element) {
        return push(element);

    }

    private boolean push(int element) {
        if (topIndex < stack.length - 1) { //мы реализуем stack через массив, поэтому stack lenght длина массива.
            stack[++topIndex] = element;// скорее всего так, тут ничего не было
            return true;
        } else
            return false;// или false если стек переполнен
    }



    public int readTopElement() {
        return peek();
    }

    private int peek() {
        return stack[topIndex];
    }



    public int showNumberOfElements() {
        return size();
    }

    private int size() {
        return topIndex;
    }



    public boolean checkIfEmpty()
    {
        return isEmpty();
    }

    private boolean isEmpty() {
        if (topIndex == -1)
            return true;
        else
            return false;
    }


    //короче, если операция успешна, то возвращаем true, а нафига собственно

    public void clear()
    {
        topIndex=-1; //вот бы все остальное пошло в garbage collector
    }


}
