package structural.facade;

public class WordFile implements File{
    @Override
    public void fileName(String fileName) {
        System.out.println("File name : " + fileName);
    }

    @Override
    public void fileType() {
        System.out.println("File type : DOCX");
    }

    @Override
    public void fileSize(int fileSize) {
        System.out.println("File size : " + fileSize + "kb");
    }
}
