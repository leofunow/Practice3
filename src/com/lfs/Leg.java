package com.lfs;

public class Leg {
    private boolean isNormal;

    public Leg() {
        isNormal = true;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }

    @Override
    public String toString() {
        if (isNormal)
            return "Normal";
        else
            return "Ill";
    }
}
