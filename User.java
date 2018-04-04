public class User
{
		private String name;
		private int experience;
		private int currency;
		
		private User()
		{
			//singleton implementation? final int value = 0
		}

		public String getName()
		{
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public int getExperience()
		{
			return experience;
		}
		public void setExperience(int experience)
		{
			this.experience=experience;
		}
		public int getCurrency()
		{
			return currency;
		}
		public void setCurrency(int currency)
		{
			this.currency=currency;
		}
		//Add methods: add funds, deduct funds, add experience
}
