Milyen gy�rt�i el��r�sok vannak CentOS 8 eset�ben a hardware-re vonatkoz�an (minimal requirements �s compatibility)?
x86_64 , arm64,ppc64Ie architekt�ra kompatibilit�s.
min. 10 GB szabad hely, min 1.5GB mem�ria/logical CPU
T�ltsd le a CentOS 8.2.2004 install m�di�t
Done
K�sz�ts boot-olhat� CentOS 8.2.2004 oper�ci�s rendszer install�ci�s pendrive-ot!
Nem tudom v�grehajtani , nincs szabad USB eszk�z.
Windows alatt spec. sw (pl rufus?) haszn�lhat� ami az iso f�jlt k�pes GPT part�ci�k�pes m�don USB-re �rni, linux alatt dd haszn�lhat� �r�sra k�zv. eszk�zre.
pl. : sudo dd bs=4M if=centos8.iso of=/dev/sdb conv=fdatasync
Mi a k�l�nbs�g a "yum" �s az "rpm" paramncsokkal val� install�l�sok k�z�tt?
rpm-nek k�zvetlen�l meg kell adni a telep�t�sre sz�nt csomagot, yum intelligens csomagkezel� rendszer adott forr�sb�l maga let�lti �s telep�ti a csomagot.
Keresd ki, hogy mennyibe ker�lne egy 2x16 core-os Intel Xeon processzoros g�pre RedHat Enterprise Linux oper�ci�s rendszer v�s�rl�sa 1 �v support-tal
Self-support (1 year) $349
Standard (1 year) $799
Premium (1 year) $1,299
Mi a felt�tele annak, hogy DHCP-s IP c�m be�ll�t�st haszn�ljunk a Linux szerver�nk install�l�sa sor�n?
DHCP server el�rhet� legyen a h�l�zaton install�l�s sor�n.
Mi�rt t�rj�nk �t statikus IP c�m haszn�lat�ra?
Hogy a server mindig ugyanazon a c�men legyen el�rhet�.
Install�l�s sor�n mi�rt nem k�r�nk NTP-n kereszt�li id�szinkroniz�l�st, mi�rt kell k�zzel be�ll�tani a d�tumot �s a pontos id�t?
Mert ilyenkor m�g t�bbnyire nincs el�rhet� h�l�zat.
Milyen megszor�t�sok vannak Linux oper�ci�s rendszert haszn�l� g�p eset�n a host nev�re?
Ne legyen olyan, amit ua. h�l�zatban m�s g�p m�r haszn�l, legyen name.domain form�tum�.
Lehet-e LVM disk ter�leten a /boot �s /boot/efi?
Nem aj�nlott. A boot folyamatot nagyon megbonyol�tja.

Lehet-e swap part�ci� LVM disk ter�leten?
Igen.
Milyen file rendszereket haszn�lhatunk �s haszn�lunk?
ext2, ext3/4, xfs, tmpfs, reiserfs, reiser4, stb.
