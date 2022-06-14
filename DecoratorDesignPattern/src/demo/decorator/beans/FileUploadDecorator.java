package demo.decorator.beans;

public class FileUploadDecorator implements FileUpload{

    protected FileUpload fileUpload;

    public FileUploadDecorator(FileUpload fileUpload){
        this.fileUpload = fileUpload;
    }


    @Override
    public void upload() {

        this.fileUpload.upload();

    }
}
