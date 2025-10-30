-----------------StringObjects.java------------------------
public class StringObjects
{
    public static void main(String[] args)
    {
        ---- Part 1: make 2 strings + 1 that points to the first
        String stringOne = "hello";        ----- first word
        String stringTwo = "world";        ----- second word
        String stringThree = stringOne;    ----- same as stringOne (no new object)

       ---- Part 2: change stringOne to something new
        stringOne = "goodbye";             ----- now points to "goodbye"

        ---- Part 3: print all 3 to see what happens
        System.out.println(stringOne);     ----- should say goodbye
        System.out.println(stringTwo);     ----- still world
        System.out.println(stringThree);   ----- still hello (didnt change)
    }
}

-------------------investigate------------------------
  Question 1: Based on what you know of how string
objects are stored in memory and variables, how 
many string objects have you created at this point?
Explain.
I created 2 String objects.
stringOne = "hello" → one object
stringTwo = "world" → second object
stringThree = stringOne → this does not make a new object. It just points to the same "hello" object.
Question 2: Predict what happened to the value of
`stringThree` when you changed the value of 
`stringOne` at the end of the code. Why do 
you think that happens?
I think stringThree will still be "hello".
Even though I change stringOne later, stringThree was already pointing to the original "hello". Reassigning stringOne just makes it point somewhere else, but stringThree keeps pointing to the old one.
Question 3: Now that you see the values of each of
the three variables, were you right in your prediction
in Question #2? Explain why or why not.
Yes, I was right.
Output:
goodbye
world
hello
Question 4: How does reassigning a string variable
affect the original object it was pointing to?
Reassigning a String variable does not change the original object.
It just makes the variable point to a new String object. The old object stays the same in memory, and any other variables still pointing to it keep their value.
