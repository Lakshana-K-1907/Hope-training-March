package Day10;

import java.util.*;

public class LockerSystem {
    private List<Locker> lockers;

    public LockerSystem(int size) {
        lockers = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            lockers.add(new Locker(i));
        }
    }

    public Locker allocateLocker() {
        for (Locker locker : lockers) {
            if (!locker.isOccupied()) {
                locker.assignLocker();
                return locker;
            }
        }
        return null;
    }

    public void freeLocker(int id) {
        for (Locker locker : lockers) {
            if (locker.getLockerId() == id) {
                locker.freeLocker();
            }
        }
    }
}
