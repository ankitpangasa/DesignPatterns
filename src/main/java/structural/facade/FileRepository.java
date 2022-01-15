package structural.facade;

import javax.swing.text.html.HTML;

public class FileRepository {
    private PdfFile pdfFile;
    private HTMLFile htmlFile;
    private PNGFile pngFile;
    private WordFile wordFile;

    public FileRepository() {
        pdfFile = new PdfFile();
        htmlFile = new HTMLFile();
        pngFile = new PNGFile();
        wordFile = new WordFile();
    }

    public void printPDFFile(String fileName, int fileSize){
        pdfFile.fileName(fileName);
        pdfFile.fileType();
        pdfFile.fileSize(fileSize);
    }

    public void printHTMLFile(String fileName, int fileSize){
        htmlFile.fileName(fileName);
        htmlFile.fileType();
        htmlFile.fileSize(fileSize);
    }

    public void printPNGFile(String fileName, int fileSize){
        pngFile.fileName(fileName);
        pngFile.fileType();
        pngFile.fileSize(fileSize);
    }

    public void printWordFile(String fileName, int fileSize){
        wordFile.fileName(fileName);
        wordFile.fileType();
        wordFile.fileSize(fileSize);
    }
}
