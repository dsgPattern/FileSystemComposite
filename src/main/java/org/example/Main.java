package org.example;

public class Main {
    public static void main(String[] args) {

        //C:
        //  Folder1
        //      File1
        //      File2
        //      Folder 1.1
        //          File3
        Folder c = new Folder("C:");

        Folder folder1 = new Folder("Folder1");
        Folder folder11 = new Folder("Folder1.1");
        File file1 = new File("File1","1234");
        File file2 = new File("File2","1234567");
        File file3 = new File("File3","123456789");

        c.add(folder1);
        folder1.add(file1);
        folder1.add(file2);
        folder11.add(file3);
        folder1.add(folder11);

        System.out.println(c.getSize());
    }
}