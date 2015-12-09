/**
 * p.421 #6
 * 
 *Abby Shah
 */
public class Numbers
{ 
    private int[] inputArray;
    private int numberUsed;
    private int[] distinctsArray;
    private int numberDistincts; 

    //default constructor
    public Numbers()
    {
        inputArray = new int[50];
        numberUsed = 0;
        distinctsArray = new int[50];
        numberDistincts = 0;
    }
    //constructor
    public Numbers(int[] initialArray)
    {
        // makes sure array isn't larger than 50 
        if(initialArray.length > 50)
        {
            System.out.println("Initial array length too long. Aborting.");
            //exits if is...
            System.exit(0);
        }
        //sets input array = to length of initial array. 
        inputArray = new int[initialArray.length];
        numberUsed = initialArray.length;
        distinctsArray = new int[50];
        numberDistincts = 0;
        //assigns initial array values to input array. 
        for(int i = 0; i < initialArray.length; i++)
            inputArray[i] = initialArray[i];
    }
    //constructor
    public Numbers(int[] initialArray, int initialNumberUsed)
    {
        if(initialNumberUsed > 50) 
        {
            System.out.println("Initial array length too long. Aborting.");
            System.exit(0);
        }
        inputArray = new int[initialArray.length];
        numberUsed = initialNumberUsed;
        distinctsArray = new int[50];
        numberDistincts = 0;

        for(int i = 0; i < initialNumberUsed; i++)
            inputArray[i] = initialArray[i];
    }
    //sorts from smallest to largest
    public void sort()
    {
        int temp;
        for(int i = 0; i < numberUsed; i++)
        {
            temp = inputArray[i];
            for(int j = i + 1; j < numberUsed; j++)
            {
                //if a previous value is larger than it it switches the two 
                if(inputArray[i] > inputArray[j])
                {
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                    temp = inputArray[i];
                }
            }
        }
    }

    public void getDistincts()
    {
        int j;
        int count;
        int distinctsArrayIndex =  -1;

        for(int i = 1; i <= numberUsed; i++)
        {
            i--; // so that the 1st of each distinct gets counted
            count = 0;
            j = inputArray[i];
            //while the values is repeated the count goes up by one and we move
            //to next number. 
            while((i < numberUsed) && (j == inputArray[i]))
            {
                count++;
                i++;
            }
            distinctsArrayIndex++; //the number that count will be assigned to 
            distinctsArray[distinctsArrayIndex] = count; //first iteration at [0]
        }
        numberDistincts = distinctsArrayIndex + 1;
    }

    public void deleteRepeats()
    {
        //create new array so inputArray is unchanged
        int[] temp = new int[inputArray.length];
        int j;
        int count = -1;

        for(int i = 1; i <= numberUsed; i++)
        {
            i--;
            count++;
            temp[count] = inputArray[i];
            j = inputArray[i];

            while((i < numberUsed) && (j == inputArray[i]))
            {
                i++;
            }
        }
        numberUsed = count + 1;
        for(int i = 0; i < numberUsed; i++)
            inputArray[i] = temp[i];
    }

    public void displayChart()
    {
        for(int i = 0; i < numberUsed; i++)
            System.out.println(inputArray[i] + "\t" + distinctsArray[i]);
    }

    public int[] getInputArray()
    {
        return inputArray;
    }

    public int getNumberUsed()
    {
        return numberUsed;
    }

    public void displayInputArray()
    {
        for(int i = 0; i < numberUsed; i++)
            System.out.println(inputArray[i]);
    }

    public void displayDistinctsArray()
    {
        for(int i = 0; i < numberDistincts; i++)
            System.out.println(distinctsArray[i]);
    }
}