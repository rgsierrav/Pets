JAVAC = javac
JAR = jar
MAIN_CLASS = Main

all:
    $(JAVAC) -d . src/enums/*.java src/interfaces/*.java src/attributes/*.java src/pets/*.java src/Main.java

run:
    java -cp . $(MAIN_CLASS)

clean:
    find . -name "*.class" -type f -delete

jar:
    $(JAR) cfe my-pets.jar $(MAIN_CLASS) .
