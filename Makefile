compile:
	mvn clean package

run: target/first-0.0.1-SNAPSHOT.jar
	java -jar target/first-0.0.1-SNAPSHOT.jar
