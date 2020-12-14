* V�gezz�k el az LinuxTEST g�p oper�ci�s rendszer�nek az update-j�t. Hajtsunk v�gre a "yum update" parancsot, n�zz�k meg �s elemezz�k, hogy mit fog az install�ci�t k�vet�en a rendszer update-elni!
Elv�geztem az updatet amiben hi�nyz� f�jlokat telepitett a virtu�lis g�p..
ut�na az upgradet is.

* �ll�tsuk le a g�p�nket "shutdown -h now" parancs kiad�s�val SSH kliensen kereszt�l. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
[tpalffy@linuxtest ~]$ shutdown -h now
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.
[tpalffy@linuxtest ~]$

* �ll�tsuk le a g�p�nket "shutdown -h now" parancs kiad�s�val konzolon. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
a konzolg�p le�llt bez�r�dott.. putty fatal error miut�n megszakadt a h�l�zati kapcsolat.

* �ll�tsuk le a g�p�nket "halt" parancs kiad�s�val SSH kliensen kereszt�l. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl halt -i'.
[tpalffy@linuxtest ~]$

* �ll�tsuk le a g�p�nket "halt" parancs kiad�s�val konzolon. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
Halted
kiirja hogy CPU has been disabled by the guest operating system.
power off orr eset virtual machine. ok gomb

* �ll�tsuk le a g�p�nket "poweroff" parancs kiad�s�val SSH kliensen kereszt�l. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
[tpalffy@linuxtest ~]$ poweroff
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.

* �ll�tsuk le a g�p�nket "poweroff" parancs kiad�s�val konzolon. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
A virtu�lis g�p kil�p ablak bez�r�dik.

* Ind�tsuk �jra a g�p�nket "shutdown -r now" parancs kiad�s�val SSH kliensen kereszt�l. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.

* Ind�tsuk �jra a g�p�nket "shutdown -r now" parancs kiad�s�val konzolon. Mit l�tunk a le�ll�s folyamat�b�l? A virtu�lis g�p milyen �llapotban lesz a v�g�n?
virtu�lis g�p le�llitja a folyamatokat bez�r�dik �s �jraindul.

* Elemezz�k ki a "dmesg" parancs kimenet�t egy g�p ind�t�s�t k�vet�en.
t�bb oldalon irja ki a kernel �s user messagekat.

* Elemezz�k ki a "ps auxf" parancs kimenet�t!
kilist�zza a fut� folyamatokat fastrukt�r�ban.

* N�zz�k meg a "top" parancs kimenet�t, elemezz�k mit l�tunk!
kiirja a rendszer �tlagos terhel�s�t cpu haszn�lat %-os megoszl�s�t, mem�ria, swap haszn�latot, �s egy list�ban

* Ind�tsunk egy SSH kliensen kereszt�li bel�p�st. Bel�p�st k�vet�en ind�tsunk egy "vi /root/.bashrc" parancsot. L�pj�nk be konzolon. A "ps auxf" seg�ts�g�vel keress�k ki a "vi" parancsunkat. A sz�l� shell-j�t "kill" seg�ts�g�vel �ll�tsuk le! Majd ellen�rizz�k a "ps auxf" seg�ts�g�vel a hat�s�t process szinten. V�gezet�l mit tal�lunk a /root k�nyvt�rban ami eddig nem volt ott?
(opcipn�lis anyag :ps auxf | grep iostat | awk '{print "kill -9" $2}' | /bin/bash)

* Adjunk egy 10GB-os �s egy 20GB-os disk-et a g�p�nkh�z (mind a kett� legyen thin provisioning m�dban)! A 10GB-os disk-et csatoljuk a /DATA/mongoDB al�. Legyen xfs file system. A 20GB-os disk-en LVM legyen. A VG neve: grayLOG-VG, file system: xfs, mount point: /DATA/grayLOG

* "Pasword reset" m�dszerrel hajtsuk v�gre a g�p�nk root felhaszn�l�j�nak jelsz� m�dos�t�s�t! (Nem k�telez�! Aki v�grehajtja: �vatosan!)
nem hajtottam v�gre


