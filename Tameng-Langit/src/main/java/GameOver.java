import javax.swing.ImageIcon;

/**
 * 
 * @author
 */

// Class untuk mengatur saat game selesai
public class GameOver extends Sprite implements Commons {

	private final String gameOver = "/img/KoenCupu.png";
	private int width;

	/*
	 * Constructor
	 */
	public GameOver() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(gameOver));

		setWidth(ii.getImage().getWidth(null));

		setImage(ii.getImage());
		setX(0);
		setY(0);
	}

	/*
	 * Getters & Setters
	 */

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
