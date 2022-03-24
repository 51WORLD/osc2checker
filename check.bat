@ECHO OFF

SET current=%~dp0%
SET AntlrFilePath=%current%ThirdParty/antlr-4.9.1-complete.jar
SET CLASSPATH=.;%AntlrFilePath%;%CLASSPATH%
SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
SET antlr4=java org.antlr.v4.Tool
SET grun=java org.antlr.v4.gui.TestRig

set defaultOscFile=%current%/examples/cut_out.osc
set guiOption=-gui
set bSkip=0

if "%1" == "" (
            echo USAGE: %0 [-s] [-h] OSC2FilePath
            echo Examples:
            echo    gui:             %0 %current%examples/cut_out.osc
            echo    silent - no gui: %0 -s %current%examples/cut_out.osc
            echo    help:            %0 -h
            set defaultOscFile=
            set bSkip=1
)  else (
    for  %%I in (%*) do (
        set stringA=%%I
        set subString=%stringA:~0,1%
        if %%I == -s (
            set guiOption=
        ) else if %%I == -h (
            echo USAGE: %0 [-s] [-h] OSC2FilePath
            echo Examples:
            echo    gui:             %0 %current%examples/cut_out.osc
            echo    silent - no gui: %0 -s %current%examples/cut_out.osc
            echo    help:            %0 -h
            set defaultOscFile=
            set bSkip=1
        ) else (
            set defaultOscFile=%%I
        )
    )
) 

if %bSkip% == 1 exit /B

SET parserPath=%current%osc2grammar\parser
%antlr4% -o %parserPath% %current%osc2grammar/OpenSCENARIO2.g4
PUSHD %parserPath%
javac OpenSCENARIO2*.java
@ECHO ON
%grun% OpenSCENARIO2 osc %guiOption% %defaultOscFile%
POPD