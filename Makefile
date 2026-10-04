filename = Program4_OneHundredBottlesOfBeer
#filename = Program3_TheTwelveDaysOfChristmas
#filename = Program1_CountFlips
#filename = Program2_PrintVowelsAndNonVowels

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename)
clean:
	rm *.class
