package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        moveHorizontally(robot, toX);
        moveVertically(robot, toY);
    }

    private void moveHorizontally(Robot robot, int toX) {
        int currentX = robot.getX();

        if (currentX < toX) {
            turnToDirection(robot, Direction.RIGHT);
            int stepsToTake = toX - currentX;
            for (int i = 0; i < stepsToTake; i++) {
                robot.stepForward();
            }
        } else if (currentX > toX) {
            turnToDirection(robot, Direction.LEFT);
            int stepsToTake = currentX - toX;
            for (int i = 0; i < stepsToTake; i++) {
                robot.stepForward();
            }
        }
    }

    private void moveVertically(Robot robot, int toY) {
        int currentY = robot.getY();

        if (currentY < toY) {
            turnToDirection(robot, Direction.UP);
            int stepsToTake = toY - currentY;
            for (int i = 0; i < stepsToTake; i++) {
                robot.stepForward();
            }
        } else if (currentY > toY) {
            turnToDirection(robot, Direction.DOWN);
            int stepsToTake = currentY - toY;
            for (int i = 0; i < stepsToTake; i++) {
                robot.stepForward();
            }
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

}