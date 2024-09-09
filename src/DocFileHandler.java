public class DocFileHandler implements Handler{
    private Handler nextHandler;
    private final String handlerName;

    public DocFileHandler() {
        this.handlerName = "Doc Handler";
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("doc") || file.getFileType().equals("docx")) {
            System.out.println(this.handlerName + " is processing " + file.getFilePath());
        } else if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }

}
