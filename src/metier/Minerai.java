package metier;

import java.awt.*;

public enum Minerai
{
	HOUILLE(new Color(13,17,13)),
	SOUFRE(new Color(138, 163, 13)),
	ETAIN(new Color(123, 130, 115)),
	CUIVRE(new Color(198, 84, 14)),
	PLOMB(new Color(10, 27, 81)),
	QUARTZ(new Color(241, 245, 221)),
	AMETHYSTE(new Color(91, 9, 124));

	private Color color;
	private Minerai(Color color)
	{
		this.color = color;
	}

	public Color getC(){
		return color;
	}
}
