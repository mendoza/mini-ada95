java -jar ./libs/jflex.jar ./ada.flex
javac -cp "./libs/jflex.jar:." Main.java
java -cp "./libs/jflex.jar:." Main $1