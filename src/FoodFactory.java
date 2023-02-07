public class FoodFactory {

    public Food getFood(String order) {
        if(order == null) {
            return null;
        }
        if(order.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("Cake")) {
            return new Cake();
        }
        return null;
    }
}
