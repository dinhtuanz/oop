public class RollLoadedDie {
    public static void main(String[] args) {
        int [] dice=new int [8];
        for(int i = 1 ; i <= 5 ; i ++) {
            dice[i-1]=i;
        }
        dice[6]=dice[7]=dice[5]=6;
        int a= (int)(Math.random()*7);
        System.out.println(dice[a]);
    }
    
}
