rm -r modules

mkdir modules

javac -d modules/model -modulepath modules -sourcepath src/model `find src/model -name '*.java'`

javac -d modules/dao -modulepath modules -sourcepath src/dao `find src/dao -name '*.java'`

javac -d modules/service -modulepath modules -sourcepath src/serivce `find src/service -name '*.java'`

javac -d modules/main -modulepath modules -sourcepath src/main `find src/main -name '*.java'`

