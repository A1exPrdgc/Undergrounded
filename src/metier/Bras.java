package metier;

public enum Bras
{
	BRAS_GRIFFE_METAL(Attack.LACERATION, 200),
	BRAS_CANON(Attack.LASER, 170),
	BRAS_ORGANIQUE(Attack.UPPERCUT, 120),
	BRAS_MISSILE(Attack.MISSILE, 150);

	private char cote;
	private int vie;
	private Attack attack;
	private Bras(Attack attack, int vie)
	{
		this.attack = attack;
		this.vie = vie;
	}

	public void setCote(char cote){this.cote=cote;}
	public int getVie(){return this.vie;}
	public Attack getAttack(){return this.attack;}
	public String toString()
	{
		switch(this.cote)
		{
			case 'R' -> {return "}-=o== " + this.name().charAt(5);}
			case 'L' -> {return this.name().charAt(5) + " ==o=-{";}
			default -> {return "0";}
		}
	}
}
