package com.Function;

import com.Utility.Utility;

public class WindChill 
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        Utility.windchill(t, v);
	}

}
