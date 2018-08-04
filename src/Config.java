import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Config {

	public Config(){};
	
	private int resolution = 800;
	private int larguraTela = resolution;
	private int alturaTela = ((resolution/100)*75);
	
	//private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	//private int larguraTela = (int) screenSde.getWidth();
	//private int alturaTela = (int) screenSize.getHeight();

	public int getResolution(){
		return this.resolution;
	}
	public int getLarguraTela(){
		return this.larguraTela;
	}
	public int getAlturaTela(){
		return this.alturaTela;
	}
	
}
