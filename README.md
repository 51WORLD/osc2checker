# 51WORLD OpenSCENARIO2 Grammar Checker (osc2checker)


osc2checker is a grammar check tool for ASAM OpenSCENARIO 2 scenario files. 
It's implemented by [ANTLR4](https://github.com/antlr/antlr4) with [ASAM OpenSCENARIO 2 EBNF ](https://asam-ev.github.io/public_release_candidate/asam-openscenario/2.0.0/language-reference/_attachments/grammar.ebnf) PRC version.

Note: It is based on the current public review draft of the language - 
[ASAM OpenSCENARIO V2.0.0-PRC.1](https://asam-ev.github.io/public_release_candidate/asam-openscenario/2.0.0/welcome.html), which is **non-final**.

Repository: https://github.com/51WORLD/osc2checker

## Installation
Install JDK of Java (version 1.7 or higher)


## How to use

### Window
```
check.bat yourOSCFileAbsolutePath

example:
check.bat %cd%\examples\cut_out.osc
```

### UNIX
```
check.sh yourOSCFileAbsolutePath

example:
check.sh $PWD/examples/cut_out.osc
or
sh check.sh $PWD/examples/cut_out.osc
```

## License

 Copyright (C) 2018 - 2022 Beijing 51WORLD Digital Twin Technology Co., Ltd. 
 , and/or its licensors.  All rights reserved.

[BSD 3-Clause](LICENSE)
