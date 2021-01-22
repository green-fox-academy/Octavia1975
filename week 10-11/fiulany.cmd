@echo off

echo Hello World!

choice /C:FL /M "Fiú vagy lány"

if errorlevel 2 goto lany
echo Szervusz, fiú...
goto end

:lany
echo Szervusz, lány ;)

:end



