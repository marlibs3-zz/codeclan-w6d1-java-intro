public class Runner {
    public static void main(String[] args){
        Bear myBear = new Bear("Paddington", 23, 650.0, 'm');
        String bearName = myBear.getName();
        System.out.println(bearName);
    }
}
