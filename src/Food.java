public interface Food {
    public String getType();
}

/*
 A factory pattern is simply an object that returns
 another object from some other method call, which is assumed
 to be "new"
 ------------------------------------------------------
 The main function in the Main class creates an instance
 of the FoodFactory class.
 The FoodFactory class contains a method getFood(String)
 that returns a new instance of Pizza or Cake,
 according to its parameter.
 */
