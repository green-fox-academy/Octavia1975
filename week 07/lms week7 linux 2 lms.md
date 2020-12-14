* Végezzük el az LinuxTEST gép operációs rendszerének az update-jét. Hajtsunk végre a "yum update" parancsot, nézzük meg és elemezzük, hogy mit fog az installációt követõen a rendszer update-elni!
Elvégeztem az updatet amiben hiányzó fájlokat telepitett a virtuális gép..
utána az upgradet is.

* Állítsuk le a gépünket "shutdown -h now" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
[tpalffy@linuxtest ~]$ shutdown -h now
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.
[tpalffy@linuxtest ~]$

* Állítsuk le a gépünket "shutdown -h now" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
a konzolgép leállt bezáródott.. putty fatal error miután megszakadt a hálózati kapcsolat.

* Állítsuk le a gépünket "halt" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl halt -i'.
[tpalffy@linuxtest ~]$

* Állítsuk le a gépünket "halt" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
Halted
kiirja hogy CPU has been disabled by the guest operating system.
power off orr eset virtual machine. ok gomb

* Állítsuk le a gépünket "poweroff" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
[tpalffy@linuxtest ~]$ poweroff
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.

* Állítsuk le a gépünket "poweroff" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
A virtuális gép kilép ablak bezáródik.

* Indítsuk újra a gépünket "shutdown -r now" parancs kiadásával SSH kliensen keresztül. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
User root is logged in on tty1.
Please retry operation after closing inhibitors and logging out other users.
Alternatively, ignore inhibitors and users with 'systemctl poweroff -i'.

* Indítsuk újra a gépünket "shutdown -r now" parancs kiadásával konzolon. Mit látunk a leállás folyamatából? A virtuális gép milyen állapotban lesz a végén?
virtuális gép leállitja a folyamatokat bezáródik és újraindul.

* Elemezzük ki a "dmesg" parancs kimenetét egy gép indítását követõen.
több oldalon irja ki a kernel és user messagekat.

* Elemezzük ki a "ps auxf" parancs kimenetét!
kilistázza a futó folyamatokat fastruktúrában.

* Nézzük meg a "top" parancs kimenetét, elemezzük mit látunk!
kiirja a rendszer átlagos terhelését cpu használat %-os megoszlását, memória, swap használatot, és egy listában

* Indítsunk egy SSH kliensen keresztüli belépést. Belépést követõen indítsunk egy "vi /root/.bashrc" parancsot. Lépjünk be konzolon. A "ps auxf" segítségével keressük ki a "vi" parancsunkat. A szülõ shell-jét "kill" segítségével állítsuk le! Majd ellenõrizzük a "ps auxf" segítségével a hatását process szinten. Végezetül mit találunk a /root könyvtárban ami eddig nem volt ott?
(opcipnális anyag :ps auxf | grep iostat | awk '{print "kill -9" $2}' | /bin/bash)

* Adjunk egy 10GB-os és egy 20GB-os disk-et a gépünkhöz (mind a kettõ legyen thin provisioning módban)! A 10GB-os disk-et csatoljuk a /DATA/mongoDB alá. Legyen xfs file system. A 20GB-os disk-en LVM legyen. A VG neve: grayLOG-VG, file system: xfs, mount point: /DATA/grayLOG

* "Pasword reset" módszerrel hajtsuk végre a gépünk root felhasználójának jelszó módosítását! (Nem kötelezõ! Aki végrehajtja: óvatosan!)
nem hajtottam végre


