package restaurant;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, Double price, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {

        return this.name;
    }

    public void setName() {

        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setPrice (Double price) {
        this.price = price;
    }
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }
    @Override
    public String toString(){
        String returnString = "";
        returnString = "Item Name: " + this.name + "\n" +
        "Item Description: " + this.description + "\n"+
        "Item Price: " + this.price + "\n"+
        "Item Category: " + this.category + "\n" +
        "Item is New?: " + this.isNew + "\n";
        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;

        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        else return false;
    }
}
//    public MenuItem(String name, String description, Double price) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//
//        this.category = "Not Categorized";
//        this.isNew = false;
//    }
//
//    public MenuItem(String name, String description, Double price) {
//        this.name = name;
//        this.description = description;
//        this.price = price;
//
//        this.category = "Not Categorized";
//        this.isNew = false;
//}

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

