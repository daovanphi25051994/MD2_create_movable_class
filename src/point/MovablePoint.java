package point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xPos, float yPos, float xSpeed, float ySpeed) {
        this.setXYPos(xPos, yPos);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXYSpeed() {
        float[] arrSpeeds = new float[2];
        arrSpeeds[0] = this.xSpeed;
        arrSpeeds[1] = this.ySpeed;
        return arrSpeeds;
    }

    public void setXYSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " ; with speed (" + xSpeed + "," + this.ySpeed + ")";
    }

    public MovablePoint move() {
        float newXPos = super.getXPos() + this.xSpeed;
        float newYPos = super.getYPos() + this.ySpeed;
        super.setXPos(newXPos);
        super.setYPos(newYPos);
        return this;

    }
}
