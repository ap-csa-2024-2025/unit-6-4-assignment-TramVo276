import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] = {"abc". "123", "def", "a"} 
    System.out.print(countLength)
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0 ;
    for (int i = 0; i < arr.length; i++)
    {
      String elem = arr[i];
      if(elem.length() == targetLength)
      {
        count++;
      }
      return count;
    }
    
    

  }

  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++)
    {
        double tar = arr[i];
        if (tar == target)
        {
          return i;
        }
    }
  }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      int target = arr[i];
      for (int j = i+1; j < arr.length; j++)
      {
        int elem = arr[j]
        if(target == elem && i != j)
        return true;
      }
    }
    return false
    
  }

  public static String findMode(String[] arr)
  {
    int count = 0;
    int mode = arr[0];
    int max_count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      // counting alrigothm 
      String target = arr[i];
      count = 0;
      for (int j = 0; j < arr.length; j++)
      {
        if (arr[j].equals(target))
        {
          count++;
        }
        // finding the max
        if (count > max_count)
        {
          max_count = count;
          mode = arr[i]
        }

      }


      
    }
    return null;
  }


