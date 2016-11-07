/*
* Name - Erin Coots
* Date - November 4th, 2016
* File - Test.h
* Description - LinkedListOfInts test functions
*/

#ifndef TEST_H
#define TEST_H

#include <iostream>
#include <string>
#include "LinkedListOfInts.h"

class Test{
  public:
    Test();
    void runTests();
    void printMessage(string test, int num, string description, bool passOrFail);

    //test isEmpty function
    void Test1a(); //true for empty list
    void Test1b(); //false for occupied list
    //test size function
    void Test2a(); //size of empty list
    void Test2b(); //size of list after addFront
    void Test2c(); //size of list after addBack
    void Test2d(); //size of list after 2+ addFront
    void Test2e(); //size of list after 2+ addBack
    void Test2f(); //size of occupied list after removeFront
    void Test2g(); //size of occupied list after removeBack
    //test search function
    void Test3a(); //search of empty list
    void Test3b(); //search of list without value
    void Test3c(); //search of list with value
    //test addBack function
    void Test4(); //value added to end of list
    //test addFront function
    void Test5(); //value added to end of list
    //test removeBack function
    void Test6a(); //false for empty list
    void Test6b(); //value removed from end of list
    //test removeFront function
    void Test7a(); //false for empty list
    void Test7b(); //value removed from front of list
  private:
};

#endif
