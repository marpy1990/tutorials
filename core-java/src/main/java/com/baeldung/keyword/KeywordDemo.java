package com.baeldung.keyword;

import com.baeldung.keyword.superkeyword.SubClass;
import com.baeldung.keyword.thiskeyword.ThisKeyword;

/**
 * Created by Gebruiker on 5/14/2018.
 */
public class KeywordDemo {

    public static void main(String[] args) {
        ThisKeyword keyword = new ThisKeyword();

        SubClass child = new SubClass("message from the child class");
    }
}
