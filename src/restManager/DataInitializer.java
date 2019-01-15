package restManager;


public class DataInitializer {
	
	private static DataInitializer instance = null;
	
	protected DataInitializer ()
	{
		new BInit();
		new PInit();
		new SInit();
		new DInit();
		new VInit();
		new LInit();
	}
	
	public static DataInitializer getInstance ()
	{
		if (instance == null)
			instance = new DataInitializer();
		return instance;
	}
	
	
}
