Export Sample - Java
===

This project illustrates how a model generated in Java using the SimianQuant environment can be integrated with an gradle project. As an illustration, the example in the help section of the environment is reproduced here. The steps are:

1. Add the extracted jar to the `lib` folder
1. Write run code in the `src/main` folder
1. Write tests in the `src/test` folder (Optional)
1. Write benchmarks in the `src/jmh` project (Optional)

The project sets up the wiring for writing tests using [TestNg](https://testng.org/doc/) and an illustrative test is written. The project also sets up the wiring for writing benchmarks using [jmh-gradle](https://github.com/melix/jmh-gradle-plugin), and one illustrative benchmark is written.