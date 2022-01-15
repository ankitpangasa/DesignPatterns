package structural.facade;

public class FileRepositoryClient {
    public static void main(String[] args) {
        FileRepository fileRepository = new FileRepository();
        fileRepository.printHTMLFile("Home.html", 23);
        fileRepository.printWordFile("AllDetails.docx", 168);
    }
}
