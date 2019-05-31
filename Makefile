game: *.java
	javac *.java
.PHONY: clean
clean:
	rm *.class
.PHONY: run
run: 
	java Main
