package ra.bussiness;

import java.util.Scanner;

public class Book
{
    private int bookID = 1;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interrest = (float) (exportPrice - importPrice);
    private boolean bookStatus = true;

    public Book()
    {
    };

    public Book(int bookID, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interrest, boolean bookStatus)
    {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interrest = interrest;
        this.bookStatus = bookStatus;
    }

    public int getBookID()
    {
        return bookID;
    }

    public void setBookID(int bookID)
    {
        this.bookID = bookID;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getDescriptions()
    {
        return descriptions;
    }

    public void setDescriptions(String descriptions)
    {
        this.descriptions = descriptions;
    }

    public double getImportPrice()
    {
        return importPrice;
    }

    public void setImportPrice(double importPrice)
    {
        this.importPrice = importPrice;
    }

    public double getExportPrice()
    {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice)
    {
        this.exportPrice = exportPrice;
    }

    public float getInterrest()
    {
        return interrest;
    }

    public void setInterrest(float interrest)
    {
        this.interrest = interrest;
    }

    public boolean isBookStatus()
    {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus)
    {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interrest=" + interrest +
                ", bookStatus=" + bookStatus +
                '}';
    }
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        bookID ++;
        System.out.println("Moi ban nhap Ten sach");
        bookName = scanner.nextLine();
        if ( bookName == null ||  bookName.isEmpty())
        {
            System.err.println("Khong duoc de trong");
        }
        System.out.println("Moi ban nhap Ten tac gia");
        author= scanner.nextLine();
        boolean check = false;
        if ( author == null ||  author.isEmpty())
        {
            System.err.println("Khong duoc de trong");
        }
        System.out.println("Moi ban nhap mieu ta");
        do {
            String inputD = scanner.nextLine();
            if (inputD.length()>10) {
                check = true;
                descriptions = inputD;
            } else {
                System.err.println("Miêu tả không hợp lệ, Vui lòng nhập lại.");
            }
        }while (!check);
        System.out.println("Moi ban Gia nhap sach");
        importPrice = Double.parseDouble(scanner.nextLine());
        while (importPrice<0)
        {
            System.err.println("Gia nhap sach phai lon hon 0, moi nhap lai");
            importPrice = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Moi ban gia suat sach");
        exportPrice= Double.parseDouble(scanner.nextLine());
        while (exportPrice<importPrice*1.2)
        {
            System.err.println("Khong hop le, moi nhap lai");
            importPrice = Double.parseDouble(scanner.nextLine());
        }
        bookStatus = Boolean.parseBoolean(scanner.nextLine());
        interrest = (float) (exportPrice - importPrice);
    }
    public void displayData()
    {
        System.out.println(toString());
    }
}
