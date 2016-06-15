for /r %a in (src/model*.java) do ( javac -d modules/model -modulepath modules -sourcepath src/model "%a" )

for /r %a in (src/dao*.java) do ( javac -d modules/dao -modulepath modules -sourcepath src/dao "%a" )

for /r %a in (src/service*.java) do ( javac -d modules/service -modulepath modules -sourcepath src/service "%a" )

for /r %a in (src/main*.java) do ( javac -d modules/main -modulepath modules -sourcepath src/main "%a" )
