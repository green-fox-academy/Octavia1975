@echo off

echo Hello World!

choice /C:FL /M "Fiu vagy lany"

if errorlevel 2 goto lany
echo Szervusz, fiu...
goto end

:lany
echo Szervusz, lany ;)

:end