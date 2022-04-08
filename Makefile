build: Statistics.java
	javac -cp . Statistics.java


run-p1: Walsh.java
	java -cp . Walsh.java


run-p2: Statistics.java
	java -cp Statistics.java

run-p3:      # nume necesar

run-p4:      # nume necesar

clean:
	rm Walsh.class Nxy.class Statistics.class Words.class