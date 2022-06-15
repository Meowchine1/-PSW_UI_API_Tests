public class DtoForBooking {
    private int ItemId;
    private int Count ;
    private String Name ;
    private String Email ;

    public DtoForBooking(int itemId, int count, String name, String email) {
        ItemId = itemId;
        Count = count;
        Name = name;
        Email = email;
    }

    public int getItemId() {
        return ItemId;
    }

    public int getCount() {
        return Count;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public void setCount(int count) {
        Count = count;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }
}