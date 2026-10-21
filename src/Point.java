public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int newX, int newY){
        // this. indica que se refiere al atributo, no al parametro principal
        this.y = newY;
        this.x = newX;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setOffset(int offX, int offY){
        x = x + offX;
        y = y + offY;
        // Se puede simplificar con x += offX;
    }
}

