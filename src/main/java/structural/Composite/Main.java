package structural.Composite;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main menu", true, -1);
        Menu soups = new Menu("Soup", true, -1);
        Menu starters = new Menu("Starters", true, -1);
        mainMenu.add(soups);
        mainMenu.add(starters);
        Menu tomatoSoup = new Menu("Tomato Soup", true, 250);
        Menu manchowSoup = new Menu("Manchow Soup", true, 280);
        Menu sweetCorn = new Menu("Sweet Corn", true, 240);
        soups.add(tomatoSoup);
        soups.add(manchowSoup);
        soups.add(sweetCorn);
        Menu frenchFries = new Menu("French Fries", true, 350);
        Menu springRolls = new Menu("Spring Rolls", true, 300);
        starters.add(frenchFries);
        starters.add(springRolls);
        System.out.println(mainMenu.toString());
    }
}
