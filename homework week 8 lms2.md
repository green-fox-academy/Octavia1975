Workshop  8.hét 2 hálózatos
Nézzünk utána mi a különbség az ADSL és a bérelt vonal között? Melyiket használják enterprise környezetben és miért?
Bérelt vonal
drágább
nagyob sebesség szimmetrikus sávszélesség
megbizhatóbb optikai kábelt használ
ellenőrzött pontok közti kommunikáció , nem kell megosztani nyilvános hálózaton
ADSL
asszimmetrikus fel letöltés nem egyenlő
rézérpárú telefonkábel zajosabb kapcsolat 
olcsóbb 
Enterprise környezetben a bérelt vonalat használják mert megmegbizhatóbb , gyorsabb biztonságosabb

Kérdezzük le az otthoni gépünk IP beállításait. Milyen osztályú IP címmel rendelkezünk?
ipconfig 
ipconfig /all
IP címem : 192.168.0.4  C osztály

Milyen parancsokkal tudjuk felszabadítni, majd új IP címet igényelni a gépünk számára?
ipconfig /release paranccsal felszabadítani
ipconfig /renew paranccsal újat kérni

Kérdezzük le az otthoni gépünk ARP tábláját
Az Address Resolution Protocol (ARP) protokoll a TCP/IP protokollrendszer része, a kimenő adatcsomagok IP és MAC címének megfeleltetéseit tárolja és kezeli
Az ARP-tábla minden bejegyzése vagy sora egy IP-címet köt össze egy MAC-címmel. A két érték közti kapcsolatot összerendelésnek vagy leképezésnek hívjuk - ez egyszerűen azt jelenti, hogy megkeresve az IP-címet a táblában megtalálhatjuk a megfelelő MAC-címet is.
cmd futtatás
arp -a paranccsal
C:\Users\tpalf>arp -a
Interface: 169.254.107.243 --- 0xb
  Internet Address      Physical Address      Type
  169.254.255.255       ff-ff-ff-ff-ff-ff     static
  224.0.0.22            01-00-5e-00-00-16     static
  224.0.0.251           01-00-5e-00-00-fb     static
  224.0.0.252           01-00-5e-00-00-fc     static
  239.255.255.250       01-00-5e-7f-ff-fa     static
  255.255.255.255       ff-ff-ff-ff-ff-ff     static
Interface: 192.168.0.4 --- 0x11
  Internet Address      Physical Address      Type
  192.168.0.1           2c-99-24-6b-69-48     dynamic
  192.168.0.2           90-2b-d2-e3-75-37     dynamic
  192.168.0.3           64-e7-d8-70-cb-8b     dynamic
  192.168.0.252         00-00-ca-01-02-03     dynamic
  192.168.0.255         ff-ff-ff-ff-ff-ff     static
  224.0.0.22            01-00-5e-00-00-16     static
  224.0.0.251           01-00-5e-00-00-fb     static
  224.0.0.252           01-00-5e-00-00-fc     static
  239.255.255.250       01-00-5e-7f-ff-fa     static
  255.255.255.255       ff-ff-ff-ff-ff-ff     static

Mit mutat az MX rekord és hogyan tudjuk lekérdezni?
a levelező szerver ip címét mutatja meg
MX rekord lekérdezése. Ehhez az nslookup parancs szükséges minden egyéb paraméter nélkül.
Utána sorban, mindegyik sor végén enter -t ütve:
server névszervernévvagyipcím
nslookup
set q=MX
domainnév



Milyen paranccsal kérdeznéd le, hogy a géped milyen TCP/UDP portokon figyel éppen (aktív kapcsolatok)?
A netstat (network statistics, hálózati statisztika) egy parancssori eszköz, amely megjeleníti a hálózati kapcsolatokat (kimenő és bejövő kapcsolatot egyaránt), az irányítótáblákat, és más egyéb hálózati statisztikákat.
•	-a: megjelenít minden aktív kapcsolatot, illetve azokat a TCP és UDP portokat, amelyeken a számítógép „fülel”.
netstat -a 

Milyen parancsot használnál, ha csak! a géped MAC címét szeretnéd kiiratni (Windows parancsosrban)
cmd futtatás 
getmac parancsot használnám

Mire szolgál a tracert parancs? Mikor és mire használnád?
megmutatja hogy a távoli gép mennyi idő alatt válaszol a hálózaton
hány átjárón megy keresztül
A traceroute és a tracert futtatására akkor van szükség, ha két számítógép vagy hálózati eszköz kommunikációjában hiba van. Ezek lefuttatása segít abban, hogy a hibát lokalizálni lehessen.

Hálózatunkon nincs engedélyezve a 3389-es port. Milyen szolgáltás nem fog működni?
TCP/UDP port 3389
RDP Távoli asztali protokol ( Remote Desktop Protokol ) a Microsoft által kifejlesztett szabadalmaztatott protokoll , amely grafikus interfészt biztosít a felhasználó számára, hogy hálózati kapcsolaton keresztül csatlakozzon egy másik számítógéphez.







Mik a privát IP tartományok?
RFC 1918 név
IP címtartomány	Címek száma	Classful leírás	Legnagyobb CIDR blokk (alhálózati maszk)	Hosztazonosító mérete
24 bites blokk	10.0.0.0 – 10.255.255.255	16 777 216	Egyetlen A osztály	10.0.0.0/8 (255.0.0.0)	24 bit
20 bites blokk	172.16.0.0 – 172.31.255.255	1 048 576	16 szomszédos B osztály	172.16.0.0/12 (255.240.0.0)	20 bit
16 bites blokk	192.168.0.0 – 192.168.255.255	65 536	256 szomszédos C osztály	192.168.0.0/16 (255.255.0.0)	16 bit


Mi a subnet maszk?
alhálózati maszk . Az IP cím és az alhálózati maszk együtt adja meg az adott subnet alhálózat méretét ,kiosztható IP címek számát.
Mi a default gateway?
Az alapértelmezett átjáró feladata a távoli csomópontok felé az adatok továbbítása, illetve az onnan érkező információk fogadása a gép számára.

Mi a különbség az OSI és a TCP/IP között?

A TCP/IP modell egyszerűbb 
nem tartalmazza az OSI model 2 rétegét illetve összevontan használja
a viszony sesson réteget és a megjelenitési presentation réteget

Mi a leglényegesebb különbség a TCP és az UDP között?
UDP


User Datagram Protocol (UDP)
Felhasználói Datagram Protokoll


Az Interneten alkalmazott TCP/IP protokollcsomag nem-megbízható, datagram típusú átvitelt biztosító tagja.


Az UDP másik gyakran alkalmazott társával, az TCP-vel szemben nem ellenőrzi az adatok sértetlen átvitelét, ezért nem képes az elveszett vagy sérült csomagok pótlására. Ezen kívül a fogadás sorrendjét sem garantálja a vételi oldalon.


Ezen jellemzői miatt az UDP-t kizárólag olyan esetekben alkalmazzák, ahol a küldött adatok viszonylag kis részének elvesztése nem okoz működési problémát, sőt, esetleg kívánatos is (pl. torlódás esetén), mint pl. a műsorszórás; vagy ahol ezen hibák korrigálásáról egy magasabb szintű protokoll gondoskodik.


TCP


Transmission Control Protocol (TCP)
Átviteli Vezérlő-protokoll


Az Interneten alkalmazott TCP/IP protokollcsomag megbízható kapcsolatorientált adatátviteli csatornát biztosító tagja.


A TCP másik gyakran alkalmazott társával, az UDP-vel szemben ellenőrzi az adatok sértetlen átvitelét, és szükség esetén újraküldi az elveszett vagy megsérült csomagokat, így az ilyen jellegű hibák kezelésére használata során már nem kell gondot fordítani. Ezen kívül gondoskodik arról is, hogy az adatokat a fogadó a küldési sorrendben kapja meg, azaz egy adatfolyam jellegű átviteli csatornát biztosít, amelyben a fogadási oldalon garantáltan mindig pontosan ugyanaz "jön ki", amit a küldési oldalon "beleraktak".


Mi az APIPA?
1.	automatic private IP addressing
2.	Az APIPA az automatikus privát IP-címzést (APIPA) jelenti. Ez az operációs rendszerek (pl. Windows) olyan jellemzője vagy jellemzője, amely lehetővé teszi a számítógépek számára, hogy automatikusan konfigurálják az IP-címet és az alhálózati maszkot, amikor a DHCP (Dynamic Host Configuration Protocol) kiszolgálójuk nem érhető el. Az IP-cím tartomány APIPA (169.254.0.1 a 169.254.255.254) , amelynek 65, 534 felhasználható IP-címeket, az alhálózati maszk 255.255.0.0 .


Mi a localhsot és hogyan érem el?
A localhost a számítógép-hálózatoknál az egyes állomások saját magukra mutató neve. (IPv4 címe: 127.0.0.1; IPv6: ::1).
http://localhost 
webhely nem érhető el üzenetet kapunk chrome nál

Mik a well known portok?
jól ismert portok listája
PORT 0-1023 ig kiváltságos szolgáltatások számára fenntartva

A TCP/IP modell szerint melyik rétegbe tartozik az IP (Internet Protocol)?
Hálózati rétegbe tartozik

A TCP/IP modell szerint melyik rétegbe tartozik a TCP (Transmission Control Protocol)?
Szállitási rétegbe tartozik

Mi a HTTP és a HTTPS portszáma?
HTTP port  80/TCP
HTTPS port 443/TCP

Mire jó a ping parancs?
Az eszköz, mely egy számítógépes program, az ICMP protokoll ECHO parancsát küldi az ellenőrizni kívánt számítógépnek, melynek hatására az változtatás nélkül visszaküldi a kapott adatcsomagokat. A parancs elküldése után a program várja a ECHO válaszokat, majd megérkeztük után kiszámolja az oda-vissza út idejét és az adatveszteséget. Ha egy csomag nem érkezik vissza az élettartamán (TTL) belül, elveszettnek minősül.
