# Table builder for java cli 
  This package can be used to create tables in the command line .
  Table builder allows you to create tables like 


          ================================================
          ┃     ID         ┃     Data                    ┃
          ================================================
          ┃     four       ┃     what's up ladies!       ┃
          ┃     One        ┃     hello boys!!            ┃
          ┃     Three      ┃     hello Girls             ┃
          ┃     Two        ┃     hello Girls kbv         ┃
          ┃     five       ┃     hello again!            ┃
          ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

or like this

          =====================================================
          ┃          ID         ┃     Data                    ┃
          =====================================================
          ┃ 1. ┃     four       ┃     what's up ladies!       ┃
          ┃ 2. ┃     One        ┃     hello boys!!            ┃
          ┃ 3. ┃     Three      ┃     hello Girls             ┃
          ┃ 4. ┃     Two        ┃     hello Girls kbv         ┃
          ┃ 5. ┃     five       ┃     hello again!            ┃
          ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

- --
- [Download Jar File ](https://github.com/sagarbhusal01/TableBuilder/releases/download/v1.0.2/TableBuilder-1.0.2.jar)

- --

# How to use it ?

 - First you have to download the jar file from this repo and place it in the project file.
 - After that you have to add that jar file as a dependencies into your project
 - then create an object for the TableBuilder


```java
TableBuilder tb = new TableBuilder();
```   


You now have many methods that can be called to make tables as to your wish.

Remember 
-
- Different TableBuilder methods have different requirements.Like 

```java
tb.ListAll(OneDirectionalArray);
```


Likewise, the following are all method available in TableBuilder class and their parameters :

ListAll method
-
```java
//method
tb.ListAll(OneDirectionalArray);

//Example
        
        String[] OneDirectionalArray=
        {
        "Some secret message",
        "Some important message",
        "Some decoy message?"
        };
//        ListAll method being called 
        tb.ListAll(OneDirectionalArray);
        
```
Which makes the table look like :

        ==================================
        ┃     Some secret message        ┃
        ┃     Some important message     ┃
        ┃     Some decoy message?        ┃
        ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

ListAllWithID method
-

```java
   //method
tb.ListAllWithID(OneDirectionalArray);

//Example

        String[] OneDirectionalArray=
        {
        "Some secret message",
        "Some important message",
        "Some decoy message?"
        };
//        ListAllWithID method being called 
        tb.ListAllWithID(OneDirectionalArray);



```
Which makes the table look like :

      =====================================
      ┃     1. Some secret message        ┃
      ┃     2. Some important message     ┃
      ┃     3. Some decoy message?        ┃
       ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

ListAllWithHeader method
-

```java
//method
tb.ListAllWithHeader(OneDirectionalArray,HeaderName);

//Example

        String[] OneDirectionalArray=
        {
        "Some secret message",
        "Some important message",
        "Some decoy message?"
        };
//        ListAllWithHeader method being called 
        tb.ListAllWithHeader(OneDirectionalArray,HeaderName);


```
Which makes the table look like :

    ==================================
    ┃     Some Important Header      ┃
    ==================================
    ┃     Some secret message        ┃
    ┃     Some important message     ┃
    ┃     Some decoy message?        ┃
    ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

TwoColumnTable method
-

```java
//method
tb.TwoColumnTable(HashMap_Returning_String_String,ColumnOneHeader,ColumnTwoHeader);

//Example

        HashMap<String,String> HashedData =new HashMap<>();
        HashedData.put("useful message","The description that is to be conveyed");
        HashedData.put("useful Tips","How to use that tip !!");
        HashedData.put("secret Code","KJHj JLKJLK JkLD");
        
//        TwoColumnTable method being called
        tb.TwoColumnTable(HashedData,"Some indexing","Some Description");
        
```
Which makes the table look like :

    ===========================================================================
    ┃     Some indexing      ┃     Some Description                           ┃
    ===========================================================================
    ┃     secret Code        ┃     KJHj JLKJLK JkLD                           ┃
    ┃     useful message     ┃     The description that is to be conveyed     ┃
    ┃     useful Tips        ┃     How to use that tip !!                     ┃
    ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

TwoColumnTableWithID method
-
```java
//method
tb.TwoColumnTableWithID(HashMap_Returning_String_String,ColumnOneHeader,ColumnTwoHeader);

//Example
        
        HashMap<String,String> HashedData =new HashMap<>();
        HashedData.put("useful message","The description that is to be conveyed");
        HashedData.put("useful Tips","How to use that tip !!");
        HashedData.put("secret Code","KJHj JLKJLK JkLD");
        
//        TwoColumnTableWithID method being called
        tb.TwoColumnTableWithID(HashedData,"Some indexing","Some Description");

```

Which makes the table look like :


    ================================================================================
    ┃          Some indexing      ┃     Some Description                           ┃
    ================================================================================
    ┃ 1. ┃     secret Code        ┃     KJHj JLKJLK JkLD                           ┃
    ┃ 2. ┃     useful message     ┃     The description that is to be conveyed     ┃
    ┃ 3. ┃     useful Tips        ┃     How to use that tip !!                     ┃
    ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔









       
    

