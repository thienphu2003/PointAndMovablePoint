public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed =0.0f;
    public MovablePoint()
    {};
    public MovablePoint(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x , float y , float xSpeed ,float ySpeed)
    {
        this.setXY(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getXSpeed()
    {
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed)
    {
        this.xSpeed=xSpeed;
    }
    public float getYSpeed()
    {
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed)
    {
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed() {
        float[] arr = new float[2];
        arr[0] = this.getXSpeed();
        arr[1] = this.getYSpeed();
        return arr;
    }
    @Override
    public String toString()
    {
        return "("+super.getXY()[0]+","+super.getXY()[1]+")"+", speed = "+"("+this.getSpeed()[0]+","+this.getSpeed()[1]+")";
    }
    public MovablePoint move()
    {
        float temp = this.getX();
        temp=temp+this.xSpeed;
        this.setX(temp);
        float temp2=this.getY();
        temp2=temp2+this.ySpeed;
        this.setY(temp2);
        return this;
    }

}
