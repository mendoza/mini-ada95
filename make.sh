if [ "$1" = "build" ] ; then
    java -jar ./libs/jflex.jar ./ada.flex
    javac -cp "./libs/jflex.jar:." Main.java
    java -cp "./libs/jflex.jar:." Main $2
elif [ "$1" = "run" ] ; then
    java -cp "./libs/jflex.jar:." Main $2
fi;