B�relt vonal vs ADSL
B�relt vonal:
nagyobb sebess�g, szimmetrikus s�vsz�less�g
megb�zhat�bb, optikai k�belt haszn�l
A kommunik�ci� ellen�rz�tt pontok k�z�tt l�tes�l, nem kell megosztani ny�lv�nos adath�l�zaton.
Dr�g�bb, mint az ADSL
ADSL:
aszimetrikus el�fizet�i vonal, fel- let�lt�s nem egyenl�.
r�z�rp�r� telefonk�belen zajlik a kapcsolat,
zajelnyom�si lehet�s�g a felhaszn�l�s helye �s a telefonk�zpontban lev� DSLAM eszk�z k�z�tt.
Olcs�bb, mint a b�relt vonal.
K�rdezz�k le az otthoni g�p�nk IP be�ll�t�sait. Milyen oszt�ly� IP c�mmel rendelkez�nk?

: ip address | grep inet

Oszt�lyok:
loopback interface : A oszt�ly
docker0 interface : B oszt�ly
vmnet1, vmnet8, enp3s0 interfaces : C oszt�ly
Hogyan k�rhetn�nk magunknak �j IP c�met?

Be�ll�tom magamnak a /etc/networking/interfaces f�jlban amit szeretn�k, mivel statikus IP c�met haszn�lok.
DHCP haszn�lata eset�n windows alatt
ipconfig/release �s
ipconfig /renew paranccssal.
K�rdezz�k le az otthoni g�p�nk ARP t�bl�j�t
: /usr/sbin/arp

Milyen MX rekordot/rekordokat haszn�lunk?

greenfoxacademy.com mail exchanger = 40 aspmx2.googlemail.com.
greenfoxacademy.com mail exchanger = 50 aspmx3.googlemail.com.
greenfoxacademy.com mail exchanger = 30 alt2.aspmx.l.google.com.
greenfoxacademy.com mail exchanger = 20 alt1.aspmx.l.google.com.
greenfoxacademy.com mail exchanger = 10 aspmx.l.google.com.
Milyen paranccsal k�rdezn�d le, hogy a g�ped milyen TCP/UDP portokon figyel �ppen (akt�v kapcsolatok)?
netstat -atupn
Milyen parancsot haszn�ln�l, ha csak! a g�ped MAC c�m�t szeretn�d kiiratni (Windows parancsosrban)
getmac -v
Mire szolg�l a tracert parancs? Mikor �s mire haszn�ln�d?
Megmutatja egy adott t�voli g�p mennyi id� alatt v�laszol a h�l�zaton.
Arra haszn�ln�m, hogy kider�tsem az adott t�voli g�p h�ny darab �tv�laszt�n routeren ("l�pcs�ben") �rhet� el. Lass� kapcsolat eset�n melyik k�ztes �tv�laszt� v�laszol lassan, hol van a sz�k keresztmetszet a h�l�zati kapcsolatban.
H�l�zatunkon nincs enged�lyezve a 3389-es port. Milyen szolg�lt�s nem fog m�k�dni?
Az RDP Remote Desktop Protokol, t�voli asztal, t�vseg�ts�g windows rendszeren.

