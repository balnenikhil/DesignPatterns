package demo.decorator.beans;

public class TextExtractFromFIle extends FileUploadDecorator{


    public TextExtractFromFIle(FileUpload fileUpload) {
        super(fileUpload);
    }

    @Override
    public void upload(){
        super.upload();
        System.out.println("Text From uploaded File Extracted");
    }
}
