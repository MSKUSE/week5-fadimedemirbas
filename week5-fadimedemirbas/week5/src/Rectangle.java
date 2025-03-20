public class Rectangle {


   private Point topLeft;
   private int sideA, sideB;


    public Rectangle(Point topLeft, int sideB, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideA(sideA);
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0){
        this.sideB = sideB;
        System.out.println("Side B can't be negative ");
    }else{
            this.sideB = sideB;
        }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
       if (sideA < 0){
        this.sideA = sideA;
        System.out.println(" Side A can't be negative");
    }else{
           this.sideA = sideA;
       }
}
        public int perimeter(){
            return (2*sideA + 2*sideB){
        }
