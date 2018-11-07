JAVAC = javac
JAVA = java
SRCS = $(wildcard *.java)
CLASSES = $(SRCS:%.java=%.class)
TARGET = main

build:
	$(JAVAC) $(SRCS)

run: build
	$(JAVA) $(TARGET)

clean:
	$(RM) -rf $(CLASSES)
