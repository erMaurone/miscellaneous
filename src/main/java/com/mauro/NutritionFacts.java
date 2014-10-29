package com.mauro;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 23/09/2014
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories;// = 0;
        private int fat;// = 0;
        private int carbohydrate;// = 0;
        private int sodium;// = 0;

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat (int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("calories = " + calories + '\n');
        output.append("servingSize = " + servingSize + '\n');
        output.append("servings = " + servings + '\n');
        output.append("fat = " + fat + '\n');
        output.append("sodium = " + sodium + '\n');
        output.append("carbohydrate = " + carbohydrate + '\n');

        return output.toString();
    }

}
