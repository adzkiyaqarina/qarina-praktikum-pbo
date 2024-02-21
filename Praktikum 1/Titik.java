class Titik
{
	double absis, ordinat;
	static double counterTitik;
	
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	

	void setAbsis(double abs)
	{
		absis = abs;
	}
	
	double getAbsis()
	{
		return absis;
	}

	void setOrdinat(double ord)
	{
		ordinat = ord;
	}
	
	double getOrdinat()
	{
		return ordinat;
	}

	static double getCounterTitik()
	{
		return counterTitik;
	}

	Titik(double a, double o)
	{
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	
}