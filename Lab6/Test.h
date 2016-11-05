/*
* Name - Erin Coots
* Date - November 4th, 2016
* File - Test.h
* Description - LinkedListOfInts test functions
*/

#ifndef TEST_H
#define TEST_H

#include <iostream>
#include "LinkedListOfInts.h"

class Test{
  public:
    void runTests();
    void printMessage(testNum, description, passFail);

    //test isEmpty function
    bool Test1();
    //test size function
    bool Test2a(); //size of empty list
    bool Test2b(); //size of list after addFront
    bool Test2c(); //size of list after addBack
    bool Test2d(); //size of list after 2+ addFront
    bool Test2e(); //size of list after 2+ addBack
    bool Test2f(); //size of occupied list after removeFront
    bool Test2g(); //size of occupied list after removeBack
    //test search function
    bool Test3a(); //search of empty list
    bool Test3b(); //search of list without value
    bool Test3c(); //search of list with value
    //test addBack function
    bool Test4();
    //test addFront function
    bool Test5();
    //test removeBack function
    bool Test6();
    //test removeFront function
    bool Test7();
  private:
};

#endif
