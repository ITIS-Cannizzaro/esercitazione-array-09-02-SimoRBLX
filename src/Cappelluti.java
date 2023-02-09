import java.util.Scanner;

public class Cappelluti
{
    public static boolean ActiveBool = true;
    static Scanner sc = new Scanner(System.in);
    public static final String AnsiReset = "\u001B[0m";
    public static final String AnsiRedBackground = "\u001B[41m";

    public static void main(String[] args)
    {
        int Option;
        while (ActiveBool)
        {
            System.out.println("Inserire esercizio.\n1: Uno\n2: Due");
            Option = Integer.parseInt(sc.nextLine());
            switch (Option)
            {
                case 1:
                {
                    ExerciseOne();
                    ActiveBool = false;
                    break;
                }
                case 2:
                {
                    ExerciseTwo();
                    ActiveBool = false;
                    break;
                }
                default:
                    System.out.println(AnsiRedBackground + "Opziona invalida. Riprova." + AnsiReset);
            }
        }
        //System.out.println((int)(Math.random()*(10-(-10)-(-10))));
    }

    public static void ExerciseOne()
    {
        int[] ArrayOne = new int[ 5 ];
        int[] ArrayTwo = new int[ 5 ];
        int[] ArrayThree = new int[ ArrayOne.length + ArrayTwo.length ];
        for (int i = 0; i < ArrayOne.length; i++)
        {
            ArrayOne[ i ] = (int) Math.random() * (20 - 1 + 1) + 1;
            System.out.println("Il numero " + (i + 1) + " dell' Array1 è: " + ArrayOne[ i ]);
        }
        System.out.println("__________________________________________________________");
        for (int i = 0; i < ArrayTwo.length; i++)
        {
            ArrayTwo[ i ] = (int) Math.random() * (20 - 1 + 1) + 1;
            System.out.println("Il numero " + (i + 1) + " dell' Array2 è: " + ArrayTwo[ i ]);
        }
        System.out.println("__________________________________________________________");
        MergeIntArray(ArrayOne, ArrayTwo, ArrayThree);
        for (int i = 0; i < ArrayThree.length; i++)
        {
            System.out.println("Array3 non organizzato: " + ArrayThree[ i ]);
        }
        System.out.println("__________________________________________________________");
        Sort(ArrayThree);
        for (int i = 0; i < ArrayThree.length; i++)
        {
            System.out.println("Array3 Organizzato: " + ArrayThree[ i ]);
        }
    }

    public static void ExerciseTwo()
    {
        int[] RandomArray = new int[ 10 ];
        int ValueInt = 0;
        for (int i = 0; i < RandomArray.length; i++)
        {
            int range = (10 - (-10) + 1);
            RandomArray[ i ] = (int) (Math.random() * range) + (-10);
            System.out.println("Il primo numero dell'array è: " + RandomArray[ i ]);
            if (RandomArray[ i ] >= 0)
            {
                ValueInt += 1;
            }

        }
        int[] GreatArray = new int[ ValueInt ];
        for (int i = 0, j = 0; i < RandomArray.length; i++)
        {
            if (RandomArray[ i ] >= 0)
            {
                GreatArray[ j ] = RandomArray[ i ];
                j++;
            }
        }
        System.out.println("__________________________________________________________");
        for (int i = GreatArray.length - 1; i >= 0; i--)
        {
            System.out.println(GreatArray[ i ]);
        }
    }

    public static void MergeIntArray(int[] ParamArrOne, int[] ParamArrTwo, int[] ParamArrThree)
    {

        for (int i = 0; i < ParamArrOne.length; i++)
        {
            ParamArrThree[ i ] = ParamArrOne[ i ];
        }
        for (int i = 0; i < ParamArrTwo.length; i++)
        {
            ParamArrThree[ ParamArrOne.length + i ] = ParamArrTwo[ i ];
        }
    }

    public static void Sort(int[] ParamArray)
    {
        int TemporaryNumber;
        for (Integer i = 0; i < ParamArray.length - 1; i++)
        {
            for (int j = 0; j < ParamArray.length - 1 - i; j++)
            {
                if (ParamArray[ j + 1 ] < ParamArray[ j ])
                {
                    TemporaryNumber = ParamArray[ j + 1 ];
                    ParamArray[ j + 1 ] = ParamArray[ j ];
                    ParamArray[ j ] = TemporaryNumber;
                }
            }
        }
    }
}