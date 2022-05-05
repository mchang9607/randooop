# randooop

University of Illinois Urbana-Champaign CS598lmz school project.
Reimplementation of feedback directed random test generation.

Inspired by Randoop.

1. get a list of APIs
2. compose APIs atomically
3. dump sequence (Can just be a string) into JUnit

Future plans (optional):
1. improve performance
2. introduce different types of randomness for comparision.

usage requirements:
1. jar file of library to test
2. uncompressed folder of library
3. package name of library
4. jar file of junit for program's auto-compilation dependencies

modify before use:
1. change directory to uncompressed library folder path (line104@TmpMain)
2. change package name if not our benchmark (line103@TmpMain)
3. for any runtime that is not 30 mins, change executionTimeSec to desired time in seconds (line138@TmpMain)
4. edit arguments for compilation if not using our default benchmark (line284@TmpMain)

NOTE: Main program is at TmpMain.java. DO NOT USE App.java!

Credentials to implementation:

  Michael Chang:
  * APIElement
  * PoolElement
  * ByteCodeAnalyzer
  * TestPool
  * TestBuilder
  * TestRecorder
  
  Other credits:
  * TmpMain (modified based off original App, maintainence)
  
  Bo Liu:
  * Ast_parser
  * contract_generator
  * compileclass
  * testcase_file_writer
  * TmpMain (implementation of App)
  
  Other credits:
  * evaluation on randoop, randooop, evosuite.


Example generated test cases by our project are included in the repository.
Benchmark: [Joda-Time-2.10.13.jar](https://github.com/JodaOrg/joda-time/releases/download/v2.10.13/joda-time-2.10.13.jar)

Other Dependencies: [Junit-4.13.2.jar](https://search.maven.org/remotecontent?filepath=junit/junit/4.13.2/junit-4.13.2.jar)
