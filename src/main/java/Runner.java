public class Runner {
    public static void main(String[] args){
        Bear myBear = new Bear("Yogi", 10, 650.0);
        myBear.setName("Booboo");
        String bearName = myBear.getName();
        System.out.println(bearName);
    }
}
