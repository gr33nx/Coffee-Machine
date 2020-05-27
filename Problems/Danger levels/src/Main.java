enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int levelInd;

    DangerLevel(int levelInd) {
        this.levelInd = levelInd;
    }

    public  int getLevel() {
        return levelInd;
    }
}