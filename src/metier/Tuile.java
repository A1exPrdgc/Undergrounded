package metier;

public class Tuile
{
	private int x;
	private int y;
	private boolean isVisited;

	public Tuile(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX(){return x;}
	public int getY(){return y;}

	public void setVisited(boolean visited){isVisited=visited;}
	public void setX(int x){this.x=x;}
	public void setY(int y){this.y=y;}
}

