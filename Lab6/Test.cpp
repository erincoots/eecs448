/*
* Name - Erin Coots
* Date - November 4th, 2016
* File - Test.cpp
* Description - LinkedListOfInts tests
*/

#include <iostream>
#include <string>
#include "Test.h"

using namespace std;

Test::Test(){}

void Test::runTests(){
  cout << "\n-------------------\n";
  cout << "   RUNNING TESTS   ";
  cout << "\n-------------------\n\n";

  Test1a();
  Test1b();
  Test2a();
  Test2b();
  Test2c();
  Test2d();
  Test2e();
  Test2f();
  Test2g();
  Test3a();
  Test3b();
  Test3c();
  Test4();
  Test5();
  Test6a();
  Test6b();
  Test7a();
  Test7b();

  cout << "\n-------------------\n";
  cout << "   TEST COMPLETE   ";
  cout << "\n-------------------\n";
}

void Test::printMessage(string test, int num, string description, bool passOrFail){
  if(num == 0){
    if(num == 1){
      cout << test << ":\n";
    }
    cout << "\t" << num << ": ";
    cout << description << ": ";
    if(passOfFail == true){
      cout << "Passed\n";
    }
    else{
      cout << "Failed\n";
    }
  }
  else{
    cout test << ": ";
    cout << description << ": ";
    if(passOfFail == true){
      cout << "Passed\n";
    }
    else{
      cout << "Failed\n";
    }
  }
}

//true for empty list
void Test::Test1a(){
  LinkedListOfInts list;
  bool verdict = false;

  verdict = list.isEmpty();

  printMessage("isEmpty", 1 ,"list registers as empty", verdict);
}

//false for occupied list
void Test::Test1b(){
  LinkedListOfInts list;
  bool verdict = false;

  verdict = list.isEmpty() ? false : true;

  printMessage("isEmpty", 2 ,"list registers as occupied", verdict);
}

//size of empty list
void Test::Test2a(){
  LinkedListOfInts list;
  bool verdict = false;

  if(list.size() == 0)
    verdict = true;

  printMessage("size", 1 ,"size of empty list", verdict);
}

//size of list after addFront
void Test::Test2b(){
  LinkedListOfInts list;
  bool verdict = false;

  list.addFront(0);
  if(list.size() == 1)
    verdict = true;

  printMessage("size", 2 ,"size of list after 1 addFront", verdict);
}

//size of list after addBack
void Test::Test2c(){
  LinkedListOfInts list;
  bool verdict = false;

  list.addBack(0);
  if(list.size() == 1)
    verdict = true;

  printMessage("size", 3 ,"size of list after 1 addBack", verdict);
}

//size of list after 2+ addFront
void Test::Test2d(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  if(list.size() == 10)
    verdict = true;

  printMessage("size", 4 ,"size of list after 2+ addFront", verdict);
}

//size of list after 2+ addBack
void Test::Test2e(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addBack(i);
  }
  if(list.size() == 10)
    verdict = true;

  printMessage("size", 5 ,"size of list after 2+ addBack", verdict);
}

//size of occupied list after removeFront
void Test::Test2f(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.removeFront();
  if(list.size() == 9)
    verdict = true;

  printMessage("size", 6 ,"size of occupied list after removeFront", verdict);
}

//size of occupied list after removeBack
void Test::Test2g(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.removeBack();
  if(list.size() == 9)
    verdict = true;

  printMessage("size", 7 ,"size of occupied list after removeBack", verdict);
}

//search of empty list
void Test::Test3a(){
  LinkedListOfInts list;
  bool verdict = false;

  verdict = list.search(1) ? false : true;

  printMessage("search", 1 ,"search of empty list", verdict);
}

//search of list without value
void Test::Test3b(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  verdict = list.search(11) ? false : true;

  printMessage("search", 2 ,"search of list without value", verdict);
}

//search of list with value
void Test::Test3c(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  verdict = list.search(1);

  printMessage("search", 3 ,"search of list with value", verdict);
}

//value added to end of list
void Test::Test4(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.addFront(20);
  list.removeBack();
  verdict = list.search(20) ? false : true;

  printMessage("addBack", 0 ,"value added to end of list", verdict);
}

//value added to end of list
void Test::Test5(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.addBack(20);
  list.removeFront();
  verdict = list.search(20) ? false : true;

  printMessage("addFront", 0 ,"value added to front of list", verdict);
}

//false for empty list
void Test::Test6a(){
  LinkedListOfInts list;
  bool verdict = false;

  verdict = list.removeBack() ? false : true;

  printMessage("removeBack", 1 ,"returns false for empty list", verdict);
}

//value removed from end of list
void Test::Test6b(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.removeFront();
  verdict = list.search(9) ? false : true;

  printMessage("removeBack", 2 ,"value removed from end of list", verdict);
}

//false for empty list
void Test::Test7a(){
  LinkedListOfInts list;
  bool verdict = false;

  verdict = list.removeFront() ? false : true;

  printMessage("removeFront", 1 ,"returns false for empty list", verdict);
}

//value removed from front of list
void Test::Test7b(){
  LinkedListOfInts list;
  bool verdict = false;

  for(int i = 0; i < 10;i++){
    list.addFront(i);
  }
  list.removeBack();
  verdict = list.search(0) ? false : true;

  printMessage("removeFront", 2 ,"value removed from front of list", verdict);
}
