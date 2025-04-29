package com.Grazioso;

public class Monkey extends RescueAnimal {	/* Joshua Garcia 08/18/2024. */
	
	// Instance variable for Monkey class
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	/* Monkey Contructor containing monkey specific attributes and from RescueAnimal */ 
	public Monkey(String name, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, 
	String tailLength, String height, String bodyLength, String species)	{
		setName(name);
		setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		
		this.species = species;	/* Monkey specific attributes */
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
	
	}
	
	public String getSpecies()	{ /* Accessor Method for Species */
		
		return species;
	}
	
	public void setSpecies(String species)	{ /* Mutator Method for Species */
		
		this.species = species;
		
	}
	
	public String getTailLength()	{ /* Accessor Method for Tail Length */
		
		return tailLength;
	
	}
	
	public void setTailLength(String tailLength)	{ /* Mutator Method for Tail Length */
		
		this.tailLength = tailLength;
	
	}
	
	public String getHeight()	{ /* Accessor Method for Height */
		
		return height;
		
	}
	
	public void setHeight(String height)	{ /* Mutator Method for Height */
		
		this.height = height;
		
	}
	
	public String getBodyLength()	{ /* Accessor Method for Body Length */
		
		return bodyLength;
		
	}
	
	public void setBodyLength(String bodyLength)	{ /* Mutator Method for Body Length */ 
		
		this.bodyLength = bodyLength;
		
	}
	
	
		
		
	}


