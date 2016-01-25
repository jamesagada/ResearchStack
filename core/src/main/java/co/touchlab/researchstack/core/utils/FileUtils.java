package co.touchlab.researchstack.core.utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class is deprecated. Util methods not used in code base.
 */
@Deprecated
public class FileUtils
{

    //    /**
    //     * TODO Move this to somewhere more appropriate (e.g. {@link co.touchlab.researchstack.core.StorageManager})
    //     */
    //    private void copyDbFile(Context context)
    //    {
    //        try
    //        {
    //            File folder = new File(Environment.getExternalStorageDirectory(), "researchstack");
    //            folder.mkdirs();
    //            File databasePath = context.getDatabasePath(DatabaseHelper.DB_NAME);
    //            File outFile = new File(folder, databasePath.getName());
    //            FileOutputStream output = new FileOutputStream(outFile);
    //            Files.copy(databasePath, output);
    //            output.close();
    //        }
    //        catch(IOException e)
    //        {
    //            LogExt.e(getClass(), e);
    //        }
    //    }

    /**
     * TODO Replace method with something that exists within system classes
     */
    public static void copy(InputStream inputStream, File output) throws IOException
    {
        OutputStream outputStream = null;
        try
        {
            outputStream = new FileOutputStream(output);
            int read = 0;
            byte[] bytes = new byte[1024];
            while((read = inputStream.read(bytes)) != - 1)
            {
                outputStream.write(bytes, 0, read);
            }
        }
        finally
        {
            try
            {
                if(inputStream != null)
                {
                    inputStream.close();
                }
            }
            finally
            {
                if(outputStream != null)
                {
                    outputStream.close();
                }
            }
        }
    }
}