@echo off

set i=1

set /A i=%i% + 1

set /A i+=1

for %%a in (*.cmd) do (
echo %i%
echo %%a
set /A i=%i% + 1
)