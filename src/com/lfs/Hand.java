package com.lfs;

public class Hand {
    private boolean isNormal;

    public Hand() {
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
