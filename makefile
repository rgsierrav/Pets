JAVAC = javac
JAR = jar
MAIN_CLASS = Main

# List of source files
SRC_FILES = enums/*.java interfaces/*.java attributes/*.java pets/*.java Main.java

all:
	$(JAVAC) -d . $(SRC_FILES)

run:
	java -cp . $(MAIN_CLASS)

clean:
	del /s /q *.class

jar:
	$(JAR) cfe my-pets.jar $(MAIN_CLASS) .
