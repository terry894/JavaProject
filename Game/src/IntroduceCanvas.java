
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class IntroduceCanvas  {

	private static Toolkit tk;
	private static Image imgBefore;
	private boolean introduceMode;
	private static Color color = new Color(0f, 0f, 0f, 0.5f);
	private static int btnX = (800 - 255) / 2;
	private static int btnY = 400;
	private static int btnW = 255;
	private static int btnH = 400;
	private static int sX = 0;
	private static int sY = 0;
	private int getX;
	private int getY;


	public IntroduceCanvas() {
		tk = Toolkit.getDefaultToolkit();		
		imgBefore = tk.getImage("res/white.png");
		introduceMode = false;
	}

	public void introSwitch() {
		introduceMode = true;
	}

	public void draw(Graphics g2, IntroCanvas introCanvas) {
		
    System.out.println(introduceMode);
		if (introduceMode) {
			g2.setColor(color);
			g2.drawImage(imgBefore, btnX , btnY, btnX + btnW, btnY + btnH, sX + btnW, sY, sX + btnW, btnH, introCanvas);
		}	
	}

}
