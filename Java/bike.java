class bike
{
	private String name;
    private String model;
    private int cc;
    private int bikeno;

    public void setName(String name)
    {
    	this.name=name;
    }
    public  void setModel(String model)
    {
    	this.model=model;
    }
    public void  setCc(int cc)
    {
    	this.cc=cc;
    }
    public void setBikeno(int bikeno)
    {
    	this.bikeno=bikeno;
    }

     public String getName()
    {
    	return name;
    }
    public String getModel()
    {
    	return model;
    }
    public int getCc()
    {
    	return cc;
    }
    public int getBikeno()
    {
    	return bikeno;
    }

}