package com.lfs;

public class Head {
    private boolean isNormal;

    public Head() {
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
