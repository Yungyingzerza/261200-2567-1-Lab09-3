public interface Handler {
    public void process(File file);
    public void setNext(Handler nextHandler);
    public String getHandlerName();
}
