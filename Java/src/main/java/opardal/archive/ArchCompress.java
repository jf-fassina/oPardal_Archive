package opardal.archive;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ArchCompress {

    public static void start(int d) throws IOException {

        if (d == 1) {
            //Directory
            String sourceFile = "zipTest";
            FileOutputStream fos = new FileOutputStream("dirComp.zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            File ftoZip = new File(sourceFile);

            zipFile(ftoZip, ftoZip.getName(), zipOut);

            zipOut.close();
            fos.close();

        } else {
            //File

        }

    }


    private static void zipFile(File fileTozip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileTozip.isHidden()) return;

        if (fileTozip.isDirectory()) {

            if (fileName.endsWith("/")) {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else {
                zipOut.putNextEntry(new ZipEntry(fileName + "/"));
                zipOut.closeEntry();
            }

            File[] children = fileTozip.listFiles();
            for (File child : children) {
                zipFile(child, fileName + "/" + child.getName(), zipOut);
            }
            return;

        }
        FileInputStream fis = new FileInputStream(fileTozip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        fis.close();


    }


}