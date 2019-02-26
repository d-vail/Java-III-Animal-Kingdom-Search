# Java III - Interfaces and Closures

## Animal Kingdom Search Project

A simple search app to practice Java interfaces, abstract classes and Lambda Expressions.

### 1: Create an abstract class for animals
- All animals consume food the same way
- Each animal is assigned a unique number, a name, and year discovered regardless of classification.
- The methods will return a string saying how that animal implements the action
- Animals can move, breath, reproduce

### 2: Create classes for mammals, birds, fish
- __Mammals__: move - walk, breath - lungs, reproduce - live births
- __Birds__: move - fly, breath - lungs, reproduce - eggs
- __Fish__: move - swim, breath - gills, reproduce - eggs

### 3: Create a collection for the animals using the following data
- __Mammals__:
    - _Name_: Panda _Year Named_: 1869
    - _Name_: Zebra _Year Named_: 1778
    - _Name_: Koala _Year Named_: 1816
    - _Name_: Sloth _Year Named_: 1804
    - _Name_: Armadillo _Year Named_: 1758
    - _Name_: Raccoon _Year Named_: 1758
    - _Name_: Bigfoot _Year Named_: 2021
- __Birds__:
    - _Name_: Pigeon _Year Named_: 1837
    - _Name_: Peacock _Year Named_: 1821
    - _Name_: Toucan _Year Named_: 1758
    - _Name_: Parrot _Year Named_: 1824
    - _Name_: Swan _Year Named_: 1758
- __Fish__:
    - _Name_: Salmon _Year Named_: 1758
    - _Name_: Catfish _Year Named_: 1817
    - _Name_: Perch _Year Named_: 1758

### 4: Search using Lambda Expressions
- List all the animals in descending order by year named
- List all the animals alphabetically
- List all the animals order by how they move
- List only those animals the breath with lungs
- List only those animals that breath with lungs and were named in 1758
- List only those animals that lay eggs and breath with lungs
- List alphabetically only those animals that were named in 1758

### Build from Source

Ensure that you have Git and JDK 11.

#### Get the Source Code

```` bash
git clone https://github.com/d-vail/Java-III-Animal-Kingdom-Search.git
cd Java-III-Animal-Kingdom-Search
````

#### Build and Run from the Command Line

To compile and build the project use:

```` bash
./gradlew build
````

To run the application use:

```` bash
./gradlew run
````

#### Import into IntelliJ IDEA

Ensure JDK 11 is configured properly in the IDE.

- _From Welcome Screen_: Import Project -> Navigate to the project directory -> 
  Select `build.gradle`
- _From the Editor_: File -> New -> Project from Existing Sources -> Navigate to
  the project directory -> Select `build.gradle`

