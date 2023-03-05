class test{
    public int x,y;
    public void show()
    {
        System.out.println("Values are "+x+" "+y);
    }
}
class use extends test
{
    void setData()
    {
        x=10;
        y=20;
    }
}
class testing {
    public static void main(String[] args) {
        use u1 = new use();
        u1.setData();
        u1.show();
    }
}
