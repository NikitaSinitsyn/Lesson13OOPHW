package Enums;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, null);
    private Float bottomValue;
    private  Float topValue;

    LoadCapacity(Float bottomValue, Float topValue) {
        this.bottomValue = bottomValue;
        this.topValue = topValue;
    }

    public Float getBottomValue() {
        return bottomValue;
    }

    public Float getTopValue() {
        return topValue;
    }

    @Override
    public String toString() {
        if(bottomValue == null){
            return ", Грузоподъемность: до " + getTopValue() + " тонн";
        } else if (topValue == null) {
            return ", Грузоподъемность: от " + getBottomValue() + " тонн";
        }else {
            return ", Грузоподъемность: от " + getBottomValue() + " тонн до " + getTopValue() + "тонн";
        }

    }
}
