package Day10;

public class LockerSystemMain {
    public static void main(String[] args) {
        LockerSystem system = new LockerSystem(3);

        Locker l1 = system.allocateLocker();
        System.out.println("Allocated: " + l1.getLockerId());

        Locker l2 = system.allocateLocker();
        System.out.println("Allocated: " + l2.getLockerId());

        system.freeLocker(l1.getLockerId());
        System.out.println("Freed: " + l1.getLockerId());

        Locker l3 = system.allocateLocker();
        System.out.println("Allocated: " + l3.getLockerId());
    }
}
