package encapsulation.application;

class main{
    public static void main(String[] args) {
        RWOnly obj1=new RWOnly();
        String ans= obj1.name;
        System.out.println(ans);

        obj1.setV("sapan");
        String ans1=obj1.getV();
        System.out.println(ans1);

    }
}