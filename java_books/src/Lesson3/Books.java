package Lesson3;

class Books {
    String title;
    String author;
}
class BooksTestDrive{
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        int x = 0;
        myBooks[0].title = " Плоды Java";
        myBooks[1].title = " Java Гетсби";
        myBooks[2].title = " Список рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author ="Сью";
        myBooks[2].author ="Ян";

        while (x<3){
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
