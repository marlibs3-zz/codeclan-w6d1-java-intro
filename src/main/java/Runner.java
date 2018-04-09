public class Runner {
    public static void main(String[] args){
        Bear myBear = new Bear("Paddington", 23, 650.0, 'm');
        String bearName = myBear.getName();
        System.out.println(bearName);
    }
}

//public class Runner {
//    public static void main(String[] args){
//        Bear lightBear = new Bear("Boo", 21, 400.0, 'f');
//
//        Bear cloneOfABear = lightBear;
//
//        cloneOfABear.setAge(22);
//
//        System.out.println(lightBear.getAge());
//
//    }
//}
