package metier;

public enum Materiaux
{
	PLAQUE_EN_FER("Plaque en fer", "fer", 75, 'M'),
	BOUTEILLE_PLASTIQUE("Bouteille en plastique", "plastique", 35, 'M'),
	ACIER("Plaque d'acier","acier", 95, 'M'),
	VIANDE("Viande","organique", 55, 'M'),
	BOIS("Baton de bois","bois", 50, 'M'),
	ALLIAGE_BIZARRE("Alliage bizarre","Metal", 70, 'M'),
	TUNGSTEN("Tungsten", "tungsten", 120, 'M'),

	KIT_ASSEMBLAGE_BIZARRE("Kit d'assemblage bizarre",25, 'K'),
	KIT_ASSEMBLAGE("Kit d'assemblage", 30, 'K'),
	KIT_ASSEMBLAGE_AVANCE("Kit d'assemblage avancé", 45, 'K'),

	BRAS_HUMAIN("Bras humain","organique", 55, 'O'),
	RESSORT("Ressort","rebondissant", 65, 'O'),
	REACTEUR("Réacteur","propulsé", 75, 'O'),
	COUTEAU("Couteau","tranchant", 70, 'O'),
	ENCLUME("Enclume","broyeur", 75, 'O'),
	BATTERIE("Générateur","électrique", 65, 'O'),
	CANON("Canon", "destructeur", 70, 'O'),
	BRIQUET("Briquet", "brulant", 70, 'O'),
	BOMBE("Bombe", "explosif", 75, 'O'),
	ANTIMATIERE("Flacon d'antimatière", "instable", 1, 'O');


	private int vie;
	private String attribut;
	private String nomAssemble;
	private char type;

	private Materiaux(String nom, String attribut, int vie, char type)
	{
		this.attribut = attribut;
		this.vie = vie;
		this.nomAssemble = nom;
		this.type = type;
	}

	private Materiaux(String nom, int vie, char type)
	{
		this.type = type;
		this.vie = vie;
		this.nomAssemble = "";
	}

	public int getVie(){return this.vie;}
	public String getAttribut(){return this.attribut;}
	public String getNomAssemble(){return this.nomAssemble;}
	public char getType(){return type;}
}

