package encapsulation.application;

class  RWOnly{
    String name="pankaj";

    public void setV(String name){
        this.name=name;
    }

    public String getV(){
        return this.name;
    }
}