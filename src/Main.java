public class Main {
    public static void main(String[] args) {
        File file1 = new File("my-file.zip", "zip", "src/my-file.zip");
        File file2 = new File("my-file2.txt", "txt", "src/my-file2.txt");
        File file3 = new File("my-file3.doc", "doc", "src/my-file3.doc");
        File file4 = new File("my-file4.png", "png", "src/my-file4.png");

        Handler handler = new TextFileHandler();
        Handler handler2 = new DocFileHandler();
        Handler handler3 = new ImageFileHandler();

        //chain of responsibility Text -> Doc -> Image
        handler.setNext(handler2);
        handler2.setNext(handler3);

        handler.process(file1); //test zip file
        handler.process(file2); //test txt file
        handler.process(file3); //test doc file
        handler.process(file4); //test png file
    }
}