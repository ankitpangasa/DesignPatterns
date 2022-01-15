package structural.facade;

public class PdfFile implements File{
    @Override
    public void fileName(String fileName) {
        System.out.println("File name : " + fileName);
    }

    @Override
    public void fileType() {
        System.out.println("File type : PDF");
    }

    @Override
    public void fileSize(int fileSize) {
        System.out.println("File size : " + fileSize + "kb");
    }
}
