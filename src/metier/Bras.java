package metier;

public class Bras
{
	private Materiaux matiere;
	private Materiaux kit;
	private Materiaux objet;

	private Attack attack;

	public Bras FabriqueBras(Materiaux matiere, Materiaux kit, Materiaux objet)
	{
		if (matiere.getType() == 'M' && kit.getType() == 'K' && objet.getType() == 'O')
		{
			return new Bras(matiere, kit, objet);
		}
		return null;
	}

	private Bras(Materiaux matiere, Materiaux kit, Materiaux objet)
	{
		this.kit = kit;
		this.matiere = matiere;
		this.objet = objet;
	}
}
