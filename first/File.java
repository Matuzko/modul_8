package lecture8.first;


public abstract class File {
    private int size;
    private String format;
    private boolean empty;

    protected void openFile(){

    }

    public File(String format, int size, boolean empty) {
        this.format = format;
        this.size = size;
        this.empty = empty;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
