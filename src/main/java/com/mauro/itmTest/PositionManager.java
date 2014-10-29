package com.mauro.itmTest;

/**
 * Created with IntelliJ IDEA.
 * User: mauro
 * Date: 17/10/2014
 * Time: 15:20
 * To change this template use File | Settings | File Templates.
 */
public class PositionManager {
    private int horizontalPosition = 0;
    private int verticalPosition = 0;
    public PositionManager initialize() {
        horizontalPosition = verticalPosition = 1;
        return this;
    }
    public PositionManager andMoveRight(int horizontalDisplacement) {
        horizontalPosition += horizontalDisplacement;
        return this;
    }
    public PositionManager andMoveUp(int verticalDisplacement) {
        verticalPosition += verticalDisplacement;
        return this;
    }
    public PositionManager andPrintPosition() {
        switch (horizontalPosition % 2) {
            case 0:
                System.out.print("zoneA;");
                break;
            case 1:
                System.out.print("zoneB;");
                break;
        }
        switch (verticalPosition % 2) {
            case 0:
                System.out.print("zoneC;");
                break;
            case 1:
                System.out.print("zoneD;");
                break;
        }
        return this;
    }

    public static void main(String[] args) {
        new PositionManager()
                .initialize()
                .andMoveRight(-3)
                .andMoveUp(9)
                .andPrintPosition();
    }
}
