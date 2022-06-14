package demo.decorator.main;

import demo.decorator.beans.BasicFileUpload;
import demo.decorator.beans.FileUpload;
import demo.decorator.beans.ImageExtractFromFile;
import demo.decorator.beans.TextExtractFromFIle;

public class DecoratorMain {

    public static void main(String[] args) {

        FileUpload textExtractFromFile = new TextExtractFromFIle(new BasicFileUpload());
        textExtractFromFile.upload();

      /*  FileUpload imageExtractFromFile = new ImageExtractFromFile(new BasicFileUpload());
        imageExtractFromFile.upload(); */

       /* FileUpload textAndImageExtractFromFIle = new TextExtractFromFIle(new ImageExtractFromFile(new BasicFileUpload()));
        textAndImageExtractFromFIle.upload(); */

    }
}



/*
Decorator Design Pattern is a structural design pattern
motto: attach a flexible additional responsibilities to an object dynamically
Also Known as wrapper

Advantages:
It enhances the extensibility of the object, because changes are made by coding new classes.

uses:
When you want to add responsibilities to an object that you may want to change in the future.
 */