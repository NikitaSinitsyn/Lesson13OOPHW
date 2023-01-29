package transport;

public enum CapacityType {
    VERYSMALL(null, 10),
    SMALL(null, 25),
    MIDDLE(40, 50),
    BIG(60, 80),
    VERYBIG(100, 120);
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
