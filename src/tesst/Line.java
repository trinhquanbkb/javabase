package tesst;

class Line{
    private Point begin;
    private Point end;
    public Line(Point begin,Point end){
        this.begin = begin;
        this.end=end;
    }
    public void Line(int x1, int y1, int x2, int y2){
        this.begin=new Point(x1,y1);
        this.end=new Point(x2,y2);
    }
    public void setBegin(Point begin){
        this.begin=begin;
    }
    public void setEnd(Point begin){
        this.end=end;
    }
    public Point getBegin(){
        return this.begin;
    }
    public Point getEnd(){
        return this.end;
    }
    public double getLength(){
        int a= begin.getX() - end.getX();
        int b= begin.getY() - end.getY();
        return Math.sqrt(a*a+b*b);
    }
}