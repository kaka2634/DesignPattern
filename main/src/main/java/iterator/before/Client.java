package iterator.before;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        // The problem is that when you want to traverse different menus,
        // Need to use different method according to the collections' implementation
        // Which coupled client with implementation
        for (int i = 0; i < breakfastItems.size(); i++) {
             MenuItem menuItem = breakfastItems.get(i);
             System.out.println(menuItem.getName() + " ");
             System.out.println(menuItem.getPrice() + " ");
             System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
