package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

            private Date lastUpdated;
            private ArrayList<MenuItem> items;

            public Menu(Date d, ArrayList<MenuItem> i) {
                this.lastUpdated = d;
                this.items = i;
            }

            public void setLastUpdated(Date lastUpdated) {
                this.lastUpdated = lastUpdated;
            }

            public void setItems(ArrayList<MenuItem> items) {
                this.items = items;
            }

            public Date getLastUpdated() {
                return lastUpdated;
            }

            public ArrayList<MenuItem> getItems() {
                return items;
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




