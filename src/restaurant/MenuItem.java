package restaurant;

import java.util.ArrayList;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }
}

//        public void setPrice(double price) {
//            this.price = price;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public void setCategory(String category) {
//            this.category = category;
//        }
//
//        public void setNew(boolean aNew) {
//            isNew = aNew;
//        }
//
//
//
//
//
//
//        private String itemName;
//    private double price;
//    private String description;
//    private ArrayList<String> category = new ArrayList<>();
//    private boolean isNew = false;
//    private double dateUpdated;
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCategory(ArrayList<String> category) { this.category = category; }
//
//    public void setIsNew(boolean isNew) { this.isNew = isNew; }
//
//    public void setDateUpdated(double dateUpdated) { this.dateUpdated = dateUpdated;}
//
//    public class Menu {
//        private Date lastUpdated;
//        private ArrayList<MenuItem> items;
//
//        public Menu(Date d, ArrayList<MenuItem> i) {
//            this.lastUpdated = d;
//            this.items = i;
//        }
//
//        public void setLastUpdated(Date lastUpdated) {
//            this.lastUpdated = lastUpdated;
//        }
//
//        public void setItems(ArrayList<MenuItem> items) {
//            this.items = items;
//        }
//
//        public Date getLastUpdated() {
//            return lastUpdated;
//        }
//
//        public ArrayList<MenuItem> getItems() {
//            return items;
//        }
//    }
//
//}

