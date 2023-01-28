package transport;

public enum CapacityType {
    VerySmall(null, 10),
    Small(null, 25),
    Middle(40, 50),
    Big(60, 80),
    VeryBig(100, 120);
    private Integer bottomValue;
    private Integer topValue;

    CapacityType(Integer bottomValue, Integer topValue) {
        this.bottomValue = bottomValue;
        this.topValue = topValue;
    }

    public Integer getBottomValue() {
        return bottomValue;
    }

    public Integer getTopValue() {
        return topValue;
    }

    @Override
    public String toString() {
        if(bottomValue == null){
            return "Вместимость: до " + getTopValue() + " мест";
        } else if ( topValue == null) {
            return  "Вместимость: от " + getBottomValue() + " мест";
        } else {
           return  "Вместимость: от " + getBottomValue() + " до " + getTopValue() + " мест";
        }
    }
}
