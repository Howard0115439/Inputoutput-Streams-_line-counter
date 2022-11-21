import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class LineCounts
{
    public static void main(String args[])
    {
        for (int i = 0; i < args.length; i++)
            counter(args[i]);
    }

    public static void counter(String str)
    {
        try
        {
            File file = new File(str);
            if (file.exists())
            {
                FileReader fr = new FileReader(file);
                LineNumberReader line_number = new LineNumberReader(fr);
                int nums = 0;

                while (line_number.readLine() != null)
                {
                    nums++;
                }
                System.out.println(str + ": " + nums);
                line_number.close();
            }
            else
            {
                System.out.println("File \'" + str + "\' does not exists!");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}