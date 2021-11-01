public class NinthGrader extends Student{ // SOME CODE NEEDED IN THIS LINE

    public NinthGrader(String x, String y) {
        super(x,y);
    }
    public NinthGrader(){
        super ("Yuvi","martini", 2059);
    }

    public void doSomething(String x){
        System.out.println("I am currently" + x);
    }

    public String toString(){
        return this.getFirst_name() + " " + this.getLast_name() + ", " + 2025;
    }


}
