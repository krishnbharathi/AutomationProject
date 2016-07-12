cd C:\Users\BEaswara\workspace\TestNGDemo
set ProjectPath=C:\Users\BEaswara\workspace\TestNGDemo
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java -cp bin;lib\*
java org.testng.TestNG %ProjectPath%\testng.xml