package Business.Restaurant;

public class MenuItem {
    private String menuItemName;
    private int menuItemPrice;

    public MenuItem(String menuItemName, int menuItemPrice) {
        this.menuItemName = menuItemName;
        this.menuItemPrice = menuItemPrice;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }

    public int getMenuItemPrice() {
        return menuItemPrice;
    }

    public void setMenuItemPrice(int menuItemPrice) {
        this.menuItemPrice = menuItemPrice;
    }
}
