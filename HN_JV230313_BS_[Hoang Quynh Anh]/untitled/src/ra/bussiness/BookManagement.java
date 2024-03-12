package ra.bussiness;

import java.util.Objects;
import java.util.Scanner;

public class BookManagement
{
    private static Book[] books = new Book[100];

//    static
//    {
//        books[0] = new Book(1, "Book 1", "Nguyen Nhat Anh", "Đây là một tác phẩm kinh điển của nhà văn ", 50, 10, 300, true);
//        books[1] = new Book(2, "Book 2", "Nguyen Nhat Ha", "Đây là một tác phẩm kinh điển của nhà văn ", 50, 10, 300, true);
//        books[2] = new Book(3, "Book 3", "Nguyen Nhat Hung", "Đây là một tác phẩm kinh điển của nhà văn ", 50, 10, 300, true);
//    }

    private static int length = 0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("**********************JAVA-HACKATHON-05-BASIC-MENU************************");
            System.out.println("1. Nhập Số lượng sách thêm mới và Thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả các sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo thứ tự tăng ");
            System.out.println("4. Xoá sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("0. Quay lai");
            System.out.print("Mời bạn nhập lựa chọn (1,2,3,4,5,6,7): ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    createBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    sortInterest();
                    break;
                case 4:
                    deleteBooks();
                    break;
                case 5:
                    seachBook();
                    break;
                case 6:
                    updateBook();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    public static void createBook()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số sách bạn muốn nhập :");
        int numBook = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numBook; i++)
        {
            Book newbook = new Book();
            newbook.inputData();
            books[i] = newbook;
        }
    }

    ;

    public static void displayBook()
    {
        for (int i = 0; i < length; i++)
        {
            books[i].displayData();
        }
        ;
    }

    public static void sortInterest()
    {

        for (int i = 0; i < length; i++)
        {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++)
            {
                if (books[j].getInterrest() < books[i].getInterrest())
                {
                    maxIndex = j;
                }
            }
            Book temp = books[i];
            books[i] = books[maxIndex];
            books[maxIndex] = temp;
        }
        System.out.println("Sắp xếp sản phẩm theo thứ tự tăng dần");

    }

    public static void deleteBooks()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa:");
        int delBookId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < length; i++)
        {
            if (Objects.equals(books[i].getBookID(), delBookId))
            {
                check = true;
                for (int j = i; j < length - 1; j++)
                {
                    books[j] = books[j + 1];
                }
                length--;
                System.out.println("Đã xóa sản phẩm có mã: " + delBookId);
                break;
            }
        }
        if (!check)
        {
            System.out.println("Không tìm thấy sản phẩm có mã: " + delBookId);
        }
    }

    public static void updateBook()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm cần update:");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < length; i++)
        {
            if (Objects.equals(books[i].getBookID(), updateId))
            {
                check = true;
                System.out.println("Nhập thông tin bạn muốn update:");
                books[i].inputData();
            }
        }
        if (!check)
        {
            System.out.println("Không tìm thấy sản phẩm có mã: " + updateId);
        }

    }
    public static void seachBook ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sản phẩm cần update:");


    }


}
