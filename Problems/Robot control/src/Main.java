class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        //robot.stepForward(); // your implementation here
        int x1 = robot.getX();
        int y1 = robot.getY();
        Direction direction = robot.getDirection();
        //System.out.println(direction);


        int xdiff = Math.abs(x1 - toX);
        int ydiff = Math.abs(y1 - toY);


       if (x1 > toX) {
            switch (direction) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;

            }
        }
        if (x1 < toX) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    break;

            }
        }

        while (xdiff != 0) {
            robot.stepForward();
            xdiff--;
        }

        direction = robot.getDirection();
        if (y1 < toY) {
            switch (direction) {
                case UP:
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
            }
        }
        if (y1 > toY) {
            switch (direction) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
            }
        }
        while (ydiff != 0) {
            robot.stepForward();
            ydiff--;
        }


    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
