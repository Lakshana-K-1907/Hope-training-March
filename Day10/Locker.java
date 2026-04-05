package Day10;

public class Locker {
    private int lockerId;
    private boolean isOccupied;

    public Locker(int lockerId) {
        this.lockerId = lockerId;
        this.isOccupied = false;
    }

    public int getLockerId() {
        return lockerId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void assignLocker() {
        isOccupied = true;
    }

    public void freeLocker() {
        isOccupied = false;
    }
}
