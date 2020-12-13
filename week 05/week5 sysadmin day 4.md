Lehet-e grafikus fel�let n�lk�l install�lni, haszn�lni, �zemeltetni MS Windows oper�ci�s rendszert?
Asztali rendszereket nem lehet, serverek k�z�l az �n. "Core" verzi�kat , melyek GUI n�lk�l telep�lnek.
Lehet-e grafikus fel�let n�lk�l install�lni, haszn�lni, �zemeltetni Linux oper�ci�s rendszert?
Igen.
Lehet-e MS Windows Server-en fut� alkalmaz�st futtatni Linux oper�ci�s rendszeren?
wine, vagy 64 bites alkalmaz�s eset�n wine64 alkalmaz�sb�l esetleg, illetve amelyik alkalmaz�sb�l van linuxos (ELF binary) verzi�, azt igen.
Sz�ks�ges-e driver install�l�sa MS Windows OS-ek alatt?
Igen, mivel a Microsoft Windows telep�t�je korl�tozott mennyis�g� drivert tartalmaz.
Sz�ks�ges-e driver install�l�sa Linux OS-ek alatt?
N�ha. De ezek nem "driver"-ek, hanem �gynevezett kernel modulok. Ezek lehetnek ny�lt forr�sk�d�ak, vagy z�rtak. Ut�bbi esetben 2 r�szb�l �llnak, egy ny�lt forr�sk�d� r�szb�l, ami a mellette lev� z�rt bin�ris modult r�illeszti a haszn�lt kernelre. Ilyen z�rt modul pl. a vmware (vmnet) kernel modulja, vagy az nvidia z�rt bin�ris meghajt�programja. L�tezik a DKMS modulilleszt�si alrendszer, ami ezeket a k�ls� modulokat automatikusan "hozz�ford�tja a kernelhez", m�r a kernel verzi� telep�t�sekor. amennyiben a k�ls� "idegen" modul DKMS kompatibilis.

Ny�lt forr�sk�d� "driver" - kernel modul - eset�n el�fordulhat hogy a kernelt egy speci�lis patch-el el� kell k�sz�teni a kernelmodul leford�t�s�hoz,telep�t�s�hez. Ilyen pl. a nagyon r�gi < 2000 el�tt gy�rtott r�gi tunerk�rty�kn�l fordulhat el�, ahol a m�k�d�shez sz�ks�ges bttv f�ggv�nyk�nyvt�rat m�r elt�vol�tott�k a linux kernelb�l mert kernelen bel�l senki nem haszn�lta, ezt vissza kellett tenni, �s ut�na lehetett csak a lirc_gpio drivert leford�tani, �s telep�teni ami m�k�dtette a r�gi tunerk�rtya t�vir�ny�t�j�t.

MS Windows alatt a registry-t milyen alkalmaz�ssal lehet menedzselni?
regedit.exe, regedt32.exe, ill. egyes be�ll�t�sai a gpedit.msc (csoporth�zirend-szerkeszt�)-vel is kezelhet�ek.
