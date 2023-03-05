class circle{
    int x=0, y=0;
    float radius;
    public void show(){
        System.out.println("Coordinates of center are : " + x + " "+y);
        System.out.println("Length of the radius is : " + radius);
    }
}

class shape {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.x=10;
        c1.y=20;
        c1.radius=13;
        c1.show();
    }
}
