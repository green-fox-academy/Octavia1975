@echo off

chcp 65001

echo Hello World!

if "%1"=="boci" goto boci
echo Egyél inkább Bocit!
goto end

:boci
echo Hmmmm...Azt én is szeretem!

:end



