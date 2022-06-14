package demo.decorator.beans;

public class BasicFileUpload implements FileUpload{


    @Override
    public void upload() {
        System.out.println("Basic File Uploading");
    }

}
