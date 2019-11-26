public class Eagle extends Bird implements Fly {

	private boolean flying;
	private int altitude;

	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	@Override
	public int ascend(int meters) {
		if (!this.isFlying()) {
			System.out.println(this.getName() + " can't ascend. "+this.getName()+" is not flying.");
		} else {
			System.out.print(this.getName() + " ascends " + meters + " meters.");	
			this.altitude+=meters;
			System.out.println(" New altitude: "+this.getAltitude());
		}
		return this.getAltitude();
	}

	@Override
	public int descend(int meters) {
		if (!this.isFlying()) {
			System.out.println(this.getName() + " can't descend. "+this.getName()+" is not flying.");
		} else if (this.getAltitude() <= meters) {
			System.out.println(this.getName() + " descends " + this.getAltitude() + " meters.");
			this.altitude = 0;
			this.land();
		} else {
			System.out.print(this.getName() + " descends " + meters + " meters.");	
			this.altitude-=meters;
			System.out.println(" New altitude: "+this.getAltitude());
		}

		return this.getAltitude();
	}

	@Override
	public void land() {
		if (!this.isFlying()) {
			System.out.println(this.getName() + " is not flying.");
		} else {
			System.out.println(this.getName() + " is landing!!");
			this.flying = false;
		}
	}

	@Override
	public void takeOff() {
		if (this.isFlying()) {
			System.out.println(this.getName() + " is already flying.");
		} else {
			this.flying = true;
			System.out.println(this.getName() + " takes off :)))");
		}
	}

	public int getAltitude() {
		return altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	@Override
	public String sing() {
		return "Screech!";
	}
}
