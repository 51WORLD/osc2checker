#!/usr/bin/env bash

current=$(cd $(dirname $0) && pwd)
defaultOscFile=$current/examples/cut_out.osc
guiOption=-gui

help() {
    echo "USAGE: $0 [-s] [-h] OSC2FilePath" 
    echo "Examples:"
    echo "gui:            $0 $PWD/examples/cut_out.osc"
    echo "silent(no gui): $0 -s $PWD/examples/cut_out.osc"
    echo "help:           $0 -h"
}

if [ $# -eq 0 ]; then
help
exit 1;
fi

for arg in "$@"
    do 
        case $arg in 
        "-s")
            guiOption=
            ;;
        "help" | "--help" | "-h"| "-help" | "h")
            help
            defaultOscFile=
            ;;
        *)
            defaultOscFile=$arg
            ;;
        esac
    done 

AntlrFilePath=$current/ThirdParty/antlr-4.9.1-complete.jar

alias antlr4='java -Xmx500M -cp ".:$AntlrFilePath:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp ".:$AntlrFilePath:$CLASSPATH" org.antlr.v4.gui.TestRig'
export CLASSPATH=".:$AntlrFilePath:$CLASSPATH"

parserPath=$current/osc2grammar/parser
antlr4  -o $parserPath $current/osc2grammar/OpenSCENARIO2.g4
cd $parserPath
javac OpenSCENARIO2*.java
grun OpenSCENARIO2 osc $guiOption $defaultOscFile 
cd $current
