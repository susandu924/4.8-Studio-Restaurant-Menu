package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    private Date lastUpdated;

            public Menu(){
//                this.menuItems = menuItems; CONSTRUCTOR since this sob wont let me make a comment @ line 11,!@#$*&^wonky mess
                this.lastUpdated = new Date();
            }

            public ArrayList<MenuItem>getMenuItems() {
                return this.menuItems;
            }
            public  void setMenuItems(ArrayList<MenuItem>menuItems){
                this.menuItems = menuItems;
            }

            public Date getLastUpdated() {
                return this.lastUpdated;
            }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem item) {

//                loop through each item, in menuitemslist, if we find a match, display a warning, dont add to list
        for(MenuItem menuItem: this.menuItems)
            if(item.equals(menuItem)) {
                System.out.println("WARNING: This item already exists!");
                return;
            }

                this.menuItems.add(item);
                this.lastUpdated = new Date();
            }

            public void removeMenuItem(MenuItem item){
                this.menuItems.remove(item);

                this.lastUpdated = new Date();
            }

    @Override
    public String toString() {
                String returnString ="";
//                lop through each menu item
        for (MenuItem item: this.menuItems){
            returnString += item.toString() + "\n\n";

        }
        return returnString;
    }
}








//        MenuItem menuItem= new MenuItem();
//        menuItem.setItemName();
//        menuItem.setPrice();
//        menuItem.setDescription();
//        menuItem.setCategory();
//        menuItem.setIsNew();
//        menuItem.setDateUpdated();
//
//
//
//        System.out.println();




