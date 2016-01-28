println "hello groovy!!!"

/**
 * A Class description
 */
class Person {
    /** the name of the person */
    String name
	
	Integer id
	int age

    /**
     * Creates a greeting method for a certain person.
     *
     * @param otherPerson the person to greet
     * @return a greeting message
     */
    String greet(String otherPerson) {
       println "Hello ${otherPerson}"
    }
}

class Main {
	public static start() {
			new Person().greet("groovy");
	}
}

Main.start();

def map = [:]

map.'Single quote'
map."double quote"
map.'''triple single quote'''
map."""triple double quote"""

assert 'a'+'b'=='ab'

def aMultilineString = '''line one
line two
line three'''

println "$aMultilineString";

def strippedFirstNewline = '''\
line one
line two
line three
'''

assert !strippedFirstNewline.startsWith('\n')
println strippedFirstNewline;


def name = 'Guillaume' // a plain string
def greeting = "Hello ${name}"

assert greeting.toString() == 'Hello Guillaume'

person = new Person()
//def person = [name:'Guillaume',age:36]
println "$person.name is old $person.age"


class User {
    String firstName // bean field
    String lastName  // bean field
}
def user = new User()
user.firstName = "John"
user.lastName = "Doe"
println user.firstName

// the simplest closure
def hello = {"hello,$it!"}
assert hello('chris') == 'hello,chris!'

// the closure that do not take any params
def bye = {->'Bye!'}
println bye()

// the closure with several params
def niceHello = {firstName, lastName -> "Hello, $firstName $lastName!"}
assert niceHello('Chris', 'Bennett') == 'Hello, Chris Bennett!'

// an empty list
def emptyList = []

//predefined list
def list = ['One','Two','Three']

//assert list[0]=='One'
assert list[1..2] == ['Two','Three']

// gets another range
assert list[-1..-2] == ['Three', 'Two']

list = [3,2,1]
//iterates the list
list.each{emptyList << "$it!"}

// iterates the list and transforms each entry into a new value
// using the closure
assert list.collect {it * 2} == [6, 4, 2]

// sorts using the closure as a comparator
assert list.sort {it1, it2 -> it1 <=> it2} == [1, 2, 3]

// gets min or max using closure as comparator
assert list.min {it1, it2 -> it1 <=> it2} == 1

// an empty map
def emptyMap = [:]
//predefined map
def pMap = [John : 10,Mark : 20 ,Aaron : 30,Peter : 'Not defined']

// the array style
assert pMap['Peter'] == 'Not defined'

//the bean style
assert pMap.John == 10

//also you can preset default value that will be returned by
//the get method if key does not exist
assert pMap.get('Michael', 100) == 100

pMap.each { key, value ->
    emptyMap.put key, "$key: $value" as String
}

println emptyMap

// sorts map elements using the closure as a comparator
pMap.put 'Chris', 15
assert pMap.sort { e1, e2 ->
    e1.key <=> e2.key
} == [Aaron:30, Chris:15, John:10, Mark:20, Michael:100, Peter:'Not defined']

assert [] == []
//compare to object address
assert ![].is([])

//.*操作符被引入用于表示在集合内所有的成员上执行操作：
assert [1, 2, 3] == ['a', 'ab', 'abc']*.size()

def char c1 = 'A'
assert c1 instanceof Character
def char c2 = 'B' as char
assert c2 instanceof Character
def  char c3 = (char)'C'
assert c3 instanceof Character

byte xByte = 0b100
assert xByte==4

def letters = ['a', 'b', 'c', 'd']
assert letters[-1] == 'd'
letters << 'e'  
assert letters[ 4] == 'e'
assert letters[-1] == 'e'
println letters

assert  2 ** 3 == 8

String tempStr = "test"
def result = tempStr ? 'Found' : 'Not found'
println result

//use of the null-safe operator prevents from a NullPointerException
person = person.find { it.id == 123 }    
name = person?.name                      
assert name == null    

//use of .@ forces usage of the field instead of the getter
println user.@firstName













































































