package lecture8.first;


public class AudioFile extends File {
    public AudioFile(String format, int size, boolean empty) {
        super(format, size, empty);
    }

    @Override
    protected void openFile() {
        super.openFile();
        System.out.println("My type is "+this.getFormat()+" and my size "+this.getSize()+"Kb");
    }
    private int listSort(AudioFile a){
        return this.getSize();

    }

}
