public class TowerOfHanoi {

public static void towerOfHanoi(int numDisks, char source, char auxiliary, char target) {
if (numDisks == 1) {
System.out.println("Move disk 1 from " + source + " to " + target);
return;
}
towerOfHanoi(numDisks - 1, source, target, auxiliary);
System.out.println("Move disk " + numDisks + " from " + source + " to " + target);
towerOfHanoi(numDisks - 1, auxiliary, source, target);
    }
public static void main(String[] args) {
int numDisks = 3; // Number of disks
char source = 'A';
char auxiliary = 'B';
char target = 'C';

System.out.println("Steps to solve Tower of Hanoi with " + numDisks + " disks:");
towerOfHanoi(numDisks, source, auxiliary, target);
    }
}
