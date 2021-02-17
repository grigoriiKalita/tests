public class DishWasher {

    private int maxDishNumber;
    private int currentNumberOfDishes;
    private boolean isRunned;

    /**
     * @param maxDishNumber
     * Set maximum number of dishes for this object. This value should be more than 0
     * @throws IllegalArgumentException
     */
    DishWasher(int maxDishNumber) throws IllegalArgumentException {
        if (maxDishNumber <= 0) {
            throw new IllegalArgumentException("Max dishwasher size should be more than 0");
        }
        this.maxDishNumber = maxDishNumber;
    }

    /**
     * Add one to currentNumberOfDishes variable
     * @throws DishWasherStateException
     * @throws DishwasherSizeException
     */
    public void addOneDish() throws DishWasherStateException, DishwasherSizeException {
        if (isRunned) {
            throw new DishWasherStateException("Dishwasher currently is running");
        } else if (currentNumberOfDishes >= maxDishNumber)
            throw new DishwasherSizeException("Dish cannot be added, max size of dishwasher is: " + maxDishNumber);
        currentNumberOfDishes++;
    }

    /**
     * Start dishwasher, set isRunned to true
     * @throws DishWasherStateException
     */
    public void run() throws DishWasherStateException {
        if (isRunned) throw new DishWasherStateException("Dishwasher is already runned");
        this.isRunned = true;
    }

    /**
     * Stop dishwasher, set isRunned to false
     * @throws DishWasherStateException
     */
    public void stop() throws DishWasherStateException {
        if (!isRunned) throw new DishWasherStateException("Dishwasher is already stopped");
        this.isRunned = false;
    }

    /**
     * Empty a dishwasher, set currentNumberOfDishes to 0
     * @throws DishWasherStateException
     * @throws DishWasherLoadException
     */
    public void takeOutDishes() throws DishWasherStateException, DishWasherLoadException {
        if (isRunned) throw new DishWasherStateException("Dishwasher is running now, cannot take out dishes");
        else if (currentNumberOfDishes == 0) {
            throw new DishWasherLoadException("Dishwasher is already empty");
        }
        this.currentNumberOfDishes = 0;
    }

}
