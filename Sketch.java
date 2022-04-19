import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet {
	PImage bkgd;  
  PImage img;
  float imgX = 320;
  float imgY = 180;
  float DirectionX = 2;
  float DirectionY = 1;
  float circleY = 200;
  float circleSpeed = 1;
  float circleSize = 20;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(640, 360);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    bkgd = loadImage("Requiem.jpg");
    bkgd.resize(640, 360);
    img = loadImage("Diavolo.png");
    img.resize(72,144);
  }

  public void draw() {
    image(bkgd, 0, 0);
    image(img, imgX, imgY);
    imgX += DirectionX;
    imgY += DirectionY;
    if (imgX <= 0 || imgX >= width - 72)
      DirectionX *= -1;
    if (imgY <= 0 || imgY >= height - 144)
      DirectionY *= -1;
    fill(240, 220, 50);
    ellipse(216, circleY, circleSize, circleSize);
    circleY += circleSpeed;
    circleSize -= circleSpeed/2;
    if(circleY < 160 || circleY > 200)
      circleSpeed *= -1;
  }
}