# Lab 1

## Installation

If [available in Hex](https://hex.pm/docs/publish), the package can be installed
by adding `newmath_ex` to your list of dependencies in `mix.exs`:

```elixir
def deps do
  [
    {:newmath_ex, "~> 0.1.0"}
  ]
end
```

Documentation can be generated with [ExDoc](https://github.com/elixir-lang/ex_doc)
and published on [HexDocs](https://hexdocs.pm). Once published, the docs can
be found at [https://hexdocs.pm/newmath_ex](https://hexdocs.pm/newmath_ex).



## Part 1: Run newmath_ex 

###   Prerequisites:
 - Command Line [Git](https://git-scm.com/downloads) or or PowerShell for Windows users
 - Latest version of [Elixir](https://elixir-lang.org/install.html)
 

###Steps for invoking NewmathEx.div function
  - Navigate to the Newmath_ex folder
  - Open Git command Line
  - use the following command to compile and invoke the Elixir code: ```bin/run```

You should obtain the result "Result1" image linked in file.

![Result1](https://user-images.githubusercontent.com/71564246/177562013-71d6bf04-76b4-41c2-b2c1-b3e0a18d2a34.png)


###Steps for testing NewmathEx.div function
  - Follow the two first steps for **Newmath.div function** above
  - use the following command to compile and invoke the Elixir test code: ```bin/test```
  

You should obtain the result "Result2" image linked in file.
![Result2](https://user-images.githubusercontent.com/71564246/177562063-6fb71f8b-5231-459b-9c6f-8adbf9e2e521.png)


## Part 2: Run newmath_java

### Prerequisites:
 - Command Line [Git](https://git-scm.com/downloads) or PowerShell for Windows users
 - Java [JDK](https://www.oracle.com/java/technologies/downloads/)
 - JUnit [Platform Console Standalone-v1.7.1.jar](https://search.maven.org/artifact/org.junit.platform/junit-platform-console-standalone/1.7.1/jar)



### Steps for invoking Newmath.div function
  - Navigate to the Newmath_java folder
  - Open Git command Line
  - use the following command to compile Java classes: ```javac -encoding UTF-8 --source-path src -d dist src/*.java```
  - use the following command to invoke the main method which will call Newmath.div method:```java -cp ./dist Main```

You should obtain the result "Result3" image linked in file. 

![Result3](https://user-images.githubusercontent.com/71564246/177562100-7993acca-ce65-40b2-858f-a5703d828c08.png)


### Steps for testing Newmath.div function    
  - Follow the first two steps for **invoking Newmath.div function** above
  - use the following command to compile Java test classes: ```javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java```
  -  use the following command to invoke Java test classes: ```java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path```

You should obtain the result "Result4" image linked in file
![Result4](https://user-images.githubusercontent.com/71564246/177562132-7161f3d8-0dca-4d9c-800a-4973532f6806.png)




Thank you for your time. 
Adnane
300177651
