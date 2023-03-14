package encaplution.java;

class main{
    public static void main(String[] args) {
        RWOnly obj1=new RWOnly();
        System.out.println(obj1.name);

        obj1.set("anubhav");
       String ans= obj1.getName();
        System.out.println(ans);
    }
}