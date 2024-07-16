package metier;

public class TuileMinerai extends Tuile
{

	/** quality : impure   -> 0 - 40
	 *            mid      -> 40 - 70
	 *            pure     -> 70 - 90
	 *            perfect  -> 90 - 100
	 *
	 */
	private int quality;
	private int quantity;
	private Minerai minerai;
	public TuileMinerai(int x, int y, Minerai minerai)
	{
		super(x, y);
		this.quality = (int)(Math.random() * 100);
	}

	public void produire()
	{
		if (this.quality > 0 || this.quality < 40)
		{
			this.quantity++;
		}

		if (this.quality > 40 || this.quality < 70)
		{
			this.quantity += 3;
		}

		if (this.quality > 70 || this.quality < 90)
		{
			this.quantity += 6;
		}

		if (this.quality > 90 || this.quality < 100)
		{
			this.quantity += 10;
		}
	}
}
