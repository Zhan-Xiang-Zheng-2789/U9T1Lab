public class AttackHelicopter extends Vehicle{

    private int bullet;

    public AttackHelicopter(String name, int wheel, int bullet) {
        super(name, wheel);
        this.bullet = bullet;
    }

    public int getBullet() {
        return bullet;
    }

    public void fire(int count) {
        bullet -= count;
        if (bullet < 0) {
            System.out.println("You do not have that many bullets");
        }
        else {
            System.out.println("You fired " + count + " bullets");
        }
    }
}
