public class DishWasher {

    private int maxDishNumber;
    private int currentNumberOfDishes;
    private Status runStatus;

    /**
     * @param maxDishNumber
     * Set maximum number of dishes for this object. This value should be more than 0
     * @throws IllegalArgumentException
     */
    DishWasher(int maxDishNumber) {
        if (maxDishNumber <= 0) {
            throw new IllegalArgumentException("Max dishwasher size should be more than 0");
        }
        this.maxDishNumber = maxDishNumber;
    }

    /**
     * Add one to currentNumberOfDishes variable
     * @throws DishWasherWorngStateException
     */
    public void addOneDish() throws DishWasherWorngStateException {
        if (runStatus.equals(Status.ON)) {
            throw new DishWasherWorngStateException("Dishwasher currently is running");
        } else if (currentNumberOfDishes >= maxDishNumber)
            throw new DishWasherWorngStateException("Dish cannot be added, max size of dishwasher is: " + maxDishNumber);
        currentNumberOfDishes++;
    }

    /**
     * Start dishwasher, set isRunned to true
     * @throws DishWasherWorngStateException
     */
    public void run() throws DishWasherWorngStateException {
        if (runStatus.equals(Status.ON)) throw new DishWasherWorngStateException("Dishwasher is already runned");
        runStatus = Status.ON;
    }

    /**
     * Stop dishwasher, set isRunned to false
     * @throws DishWasherWorngStateException
     */
    public void stop() throws DishWasherWorngStateException {
        if (runStatus.equals(Status.OFF)) throw new DishWasherWorngStateException("Dishwasher is already stopped");
        runStatus = Status.OFF;
    }

    /**
     * Empty a dishwasher, set currentNumberOfDishes to 0
     * @throws DishWasherWorngStateException
     */
    public void takeOutDishes() throws DishWasherWorngStateException {
        if (runStatus.equals(Status.ON)) throw new DishWasherWorngStateException("Dishwasher is running now, cannot take out dishes");
        else if (currentNumberOfDishes == 0) {
            throw new DishWasherWorngStateException("Dishwasher is already empty");
        }
        this.currentNumberOfDishes = 0;
    }

}
