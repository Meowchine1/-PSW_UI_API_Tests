package EntytiesAPI;

public class Item {
    private int ID;
    private String Name;
    private int AmountAll;
    private int SubCathegoryID;
    private int AmountAvailable;
    private String ItemDescription;
    private String Picture;
    private double  Price;

    public Item(int ID, String name, int amountAll, int subCathegoryID, int amountAvailable, String itemDescription, String picture, double price) {
        this.ID = ID;
        Name = name;
        AmountAll = amountAll;
        SubCathegoryID = subCathegoryID;
        AmountAvailable = amountAvailable;
        ItemDescription = itemDescription;
        Picture = picture;
        Price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAmountAll() {
        return AmountAll;
    }

    public int getSubCathegoryID() {
        return SubCathegoryID;
    }

    public int getAmountAvailable() {
        return AmountAvailable;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public String getPicture() {
        return Picture;
    }

    public double getPrice() {
        return Price;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAmountAll(int amountAll) {
        AmountAll = amountAll;
    }

    public void setSubCathegoryID(int subCathegoryID) {
        SubCathegoryID = subCathegoryID;
    }

    public void setAmountAvailable(int amountAvailable) {
        AmountAvailable = amountAvailable;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public void setPicture(String picture) {
        Picture = picture;
    }

    public void setPrice(double price) {
        Price = price;
    }
}