package metier;

public enum Attack
{
	UPPERCUT(100, 100, 'P'),
	DRILL(80, 100, 'P'),
	FRAPPE(70, 100, 'P'),
	GRIFFE(70, 100, 'P'),
	LACERATION(90, 100, 'P'),
	LASER(120, 80, 'S'),
	MISSILE(110, 85, 'S');


	private int force;
	private int precision;
	private char type;
	private Attack(int force, int precision, char type)
	{
		this.force = force;
		this.precision = precision;
		this.type = type;
	}
}
