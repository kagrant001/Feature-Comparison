
/**
 * makes a device, ability to add feature names and values
 * methods: add feature, get feature value, show features
 *
 * @author Kayden Grant
 * @version 11/24/20
 */
public class GrantKayden_HW7 //device
{
    private String name;
    private String[][] featureList;

    public void setName(String name)
    {
        if(name.length() > 2)
        {
            System.out.println("Setting name to: "+name);
            this.name = name;
        }
        else
        {
            System.out.println("Invalid name, setting default name: New Device");
            this.name = "New Device";
        }
    }

    public String getName()
    {
        return this.name;
    }

    /**
     * Constructor for objects of class GrantKayden_HW7
     */
    public GrantKayden_HW7(String name) //device
    {
        setName(name);
        this.featureList = new String[10][3];        
    }

    public GrantKayden_HW7(String name, String[][] featureList)
    {
        setName(name);
        int countArrayOne = 0;
        int countArrayTwo = 0;
        for(int i=0; i<featureList.length; i++)
        {
            countArrayOne++;
            for(int j=0; j<featureList[i].length; j++)
            {
                countArrayTwo++;
            }
        }
        //countArrayTwo must be less that or equal to countArrayOne*2 because
        //countArrayTwo is counted by ever value in i's length for i many times
        if(countArrayOne <= 10 && countArrayTwo <= countArrayOne*3) 
        {
            this.featureList = featureList;
        } 
        else
        {
            System.out.println("Invalid array size, setting default size: [10][2]");
            this.featureList = new String[10][2];
        }
    }

    public void addFeature(String featureName, String value)
    {
        boolean nameCheck = true; //must be true in order to pass
        for(int i=0; i<this.featureList.length; i++)
        {
            if(this.featureList[i][0] != null)
            {
                if(this.featureList[i][0].equals(featureName))
                {
                    this.featureList[i][2] = value; //update value
                    nameCheck = false;
                }
            }
            else if(this.featureList[i][0] == null)
            {
                if(nameCheck == true)
                {
                    this.featureList[i][0] = featureName;
                    this.featureList[i][1] = value;
                    break;
                }
            }
        }
    }

    public String getFeatureValue(String featureName)
    {
        for(int i=0; i<this.featureList.length; i++)
        {
            if(this.featureList[i][0] != null)
            {
                if(this.featureList[i][0].equals(featureName))
                {
                    if(this.featureList[i][2] != null)
                    {
                        return this.featureList[i][2];
                    }
                    else if(this.featureList[i][1] != null)
                    {
                        return this.featureList[i][1];
                    }
                }
            }
        }
        return "Feature not found";
    }

    public String getFeatureValue(int index)
    {
        if(index < 0)
        {
            return "Feature not found";
        }
        else if(this.featureList[index-1][2] != null)
        {
            return this.featureList[index-1][2];
        }
        else if(this.featureList[index-1][1] != null)
        {
            return this.featureList[index-1][1];
        }      
        return "Feature not found";
    }

    public void showFeatures()
    {
        if(this.featureList[0][0] == null)
        {
            System.out.println(this.name+" currently has no features");
        }
        else
        {
            System.out.println("Feature Table:");
            System.out.println("--------------");
            for(int i=0; i<this.featureList.length; i++)
            {
                if(this.featureList[i][0] != null)
                {
                    System.out.println("Feature: "+this.featureList[i][0]);
                    System.out.println("Feature Value One: "+this.featureList[i][1]);
                    if(this.featureList[i][2] != null)
                    {
                        System.out.println("Feature Value Two: "+this.featureList[i][2]);
                    }
                }
            }
        }
    }
}
