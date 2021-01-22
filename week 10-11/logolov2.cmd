@echo off

rem Greenfox oktatas
rem
rem
rem
rem
rem


rem Itt lehet megadni a log fajl nevet:
set logolo.txt=logolov2.txt

rem
echo Szkript start >> log\%logolo.txt%

date /t >> log\%logolo.txt%
time /t >> log\%logolo.txt%

rem Foprogram
echo Hello World!

echo Szkript end >> log\%logolo.txt%

date /t >> log\%logolo.txt%
time /t >> log\%logolo.txt%
