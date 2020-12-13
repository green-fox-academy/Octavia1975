Bérelt vonal vs ADSL
Bérelt vonal:
nagyobb sebesség, szimmetrikus sávszélesség
megbízhatóbb, optikai kábelt használ
A kommunikáció ellenõrzött pontok között létesül, nem kell megosztani nyílvános adathálózaton.
Drágább, mint az ADSL
ADSL:
aszimetrikus elõfizetõi vonal, fel- letöltés nem egyenlõ.
rézérpárú telefonkábelen zajlik a kapcsolat,
zajelnyomási lehetõség a felhasználás helye és a telefonközpontban levõ DSLAM eszköz között.
Olcsóbb, mint a bérelt vonal.
Kérdezzük le az otthoni gépünk IP beállításait. Milyen osztályú IP címmel rendelkezünk?

: ip address | grep inet

Osztályok:
loopback interface : A osztály
docker0 interface : B osztály
vmnet1, vmnet8, enp3s0 interfaces : C osztály
Hogyan kérhetnénk magunknak új IP címet?

Beállítom magamnak a /etc/networking/interfaces fájlban amit szeretnék, mivel statikus IP címet használok.
DHCP használata esetén windows alatt
ipconfig/release és
ipconfig /renew paranccssal.
Kérdezzük le az otthoni gépünk ARP tábláját
: /usr/sbin/arp

Milyen MX rekordot/rekordokat használunk?

greenfoxacademy.com mail exchanger = 40 aspmx2.googlemail.com.
greenfoxacademy.com mail exchanger = 50 aspmx3.googlemail.com.
greenfoxacademy.com mail exchanger = 30 alt2.aspmx.l.google.com.
greenfoxacademy.com mail exchanger = 20 alt1.aspmx.l.google.com.
greenfoxacademy.com mail exchanger = 10 aspmx.l.google.com.
Milyen paranccsal kérdeznéd le, hogy a géped milyen TCP/UDP portokon figyel éppen (aktív kapcsolatok)?
netstat -atupn
Milyen parancsot használnál, ha csak! a géped MAC címét szeretnéd kiiratni (Windows parancsosrban)
getmac -v
Mire szolgál a tracert parancs? Mikor és mire használnád?
Megmutatja egy adott távoli gép mennyi idõ alatt válaszol a hálózaton.
Arra használnám, hogy kiderítsem az adott távoli gép hány darab útválasztón routeren ("lépcsõben") érhetõ el. Lassú kapcsolat esetén melyik köztes útválasztó válaszol lassan, hol van a szûk keresztmetszet a hálózati kapcsolatban.
Hálózatunkon nincs engedélyezve a 3389-es port. Milyen szolgáltás nem fog mûködni?
Az RDP Remote Desktop Protokol, távoli asztal, távsegítség windows rendszeren.

