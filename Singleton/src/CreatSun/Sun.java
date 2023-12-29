package CreatSun;

public class Sun {
	private static Sun sun;
	private Sun() {

	}
	public static  Sun getInstance() {
		if(sun == null) 
			synchronized(Sun.class) {
				if (sun == null) {
					sun = new Sun();
				}
			}
		return sun;
	}
}
