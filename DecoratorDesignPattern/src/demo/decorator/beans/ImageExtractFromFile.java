package demo.decorator.beans;

public class ImageExtractFromFile extends FileUploadDecorator{

    public ImageExtractFromFile(FileUpload fileUpload) {
        super(fileUpload);
    }

    @Override
    public void upload(){
        super.upload();
        System.out.println("Images From uploaded File Extracted");
    }
}
