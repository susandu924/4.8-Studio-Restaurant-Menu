package restaurant;

public class Restaurant {

    public static void main (String[] ars) {
        MenuItem item1 = new MenuItem("Salad","Delicious Greens", 4.95, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad","Delicious Greens", 4.95, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake","Delicious Dessert", 5.50, "Unhealthy", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

//        myMenu.removeMenuItem(item3);

        System.out.println(myMenu.toString());

//        System.out.println(item1.toString());
//
//        System.out.println(item1.equals(item2));
//        System.out.println(item1.equals(item3));
    }
}
