package com.lfs;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private String name;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, String name) {
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    @Override
    public String toString() {
        return name + "{" +
                "head - " + head +
                ", leftHand - " + leftHand +
                ", rightHand - " + rightHand +
                ", leftLeg - " + leftLeg +
                ", rightLeg - " + rightLeg +
                '}';
    }
}
