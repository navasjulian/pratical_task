To run tests use maven comand like:
```
clean test -Dtest=LoginPageTest -Pstaging -Dbrowser=chrome
```
By default tests will be run in firefox.
You don't need to setup any local GRID or download a webdriver, it will happen automatically.

`-Pstaging` to run tests on Staging1
`-Plocal` to run on http://localhost:8080/index.html#app
and etc, see <profiles> section in pom.xml
