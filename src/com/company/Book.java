package com.company;

import java.util.ArrayList;

public class Book {
    public static void main (String[] args){

        ArrayList<bookDatabase> myBooks= new ArrayList<bookDatabase>();

//        Populate Database with first book details

        bookDatabase a= new bookDatabase();
        a.setSKU("Java1001\t\t");
        a.setTitle("Head First Java\t\t\t\t\t\t\t\t");
        a.setAuthor("Kathy Sierra and Bert Bates\t\t");
        a.setDescription("Easy to read Java workbook\t\t\t\t\t\t\t\t\t");
        a.setPrice(47.50);
        myBooks.add(a);

        bookDatabase b= new bookDatabase();
        b.setSKU("Java1002\t\t");
        b.setTitle("Thinking in Java\t\t\t\t\t\t\t");
        b.setAuthor("Bruce Eckel\t\t\t\t\t\t");
        b.setDescription("Details about Java under the hood\t\t\t\t\t\t\t");
        b.setPrice(20.00);
        myBooks.add(b);

        bookDatabase c= new bookDatabase();
        c.setSKU("Orcl1003\t\t");
        c.setTitle("OCP: Oracle Certified Professional Java SE\t");
        c.setAuthor("Jeanne Boyarsky\t\t\t\t\t");
        c.setDescription("Everything you need to know in one place\t\t\t\t\t");
        c.setPrice(45.00);
        myBooks.add(c);

        bookDatabase d= new bookDatabase();
        d.setSKU("Python1004\t\t");
        d.setTitle("Automate the Boring Stuff with Python\t\t");
        d.setAuthor("Al Sweigart\t\t\t\t\t\t");
        d.setDescription("Fun with Python\t\t\t\t\t\t\t\t\t\t\t\t");
        d.setPrice(10.50);
        myBooks.add(d);

        bookDatabase e= new bookDatabase();
        e.setSKU("Zombie1005\t\t");
        e.setTitle("The Maker's Guide to the Zombie Apocalypse\t");
        e.setAuthor("Simon Monk\t\t\t\t\t\t");
        e.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t");
        e.setPrice(16.50);
        myBooks.add(e);

        bookDatabase f= new bookDatabase();
        f.setSKU("Rasp1006\t\t");
        f.setTitle("Raspberry Pi Projects for the Evil Genius\t");
        f.setAuthor("Donald Norris\t\t\t\t\t");
        f.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!\t\t\t\t");
        f.setPrice(14.75);
        myBooks.add(f);

        for (bookDatabase result: myBooks){
            System.out.println(result.getSKU()+result.getTitle()+result.getAuthor()+result.getDescription()+result.getPrice());
        }
    }
}
