Workshop

a képek a doc fájlban vannak!

Készítsünk egy GPO-t a következõ beállításokkal
* Korlátozzuk a Vezérlõpulthoz való hozzáférést (készítsünk egy felhasználót az AD-ben és állítsuk be arra a felhasználóra)
* kép


* 
* Tiltsuk le a LAN Manager Hash tárolását. Miért szükséges letiltani?
* 

* Tiltsuk le a kikényszerített rendszer-újraindítást (Windows Update). Miért lehet ez hasznos?
* kép
* 

* Tiltsuk le a cserélhetõ adathordozó-meghajtókat (CD,DVD)
* kép

* Tiltsuk le a Guest accountot (Vendég fiók)
* Állítsuk a minimális jelszó hosszt 10-re
* kép
* 

* Állítsuk be a rendszert úgy, hogy az utoljára használt 6 jelszót jegyezze meg (Password history)

Hozzunk létre egy mappát a C: meghajtón, majd készítsünk benne egy valami.txt fájlt. Állítsuk be, hogy a valami.txt fájt a Domain Users felhasználók csak olvasni tudják.
ok. kép

Mi az NTDS.DIT? Hol találom meg?
A %SystemRoot%ntds\NTDS.DIT
a fájl az Active Directory fõ adatbázisa

Mit jelent a kvótázás? Milyen fájlrendszerben található meg?
A felhasználók tárterület felhasználását korlátozza. megadott objektumra  tárterületre vonatkozik amit felhasználó nem léphet túl .
NTFS és REFS fájlrendszerben

Mit csinál a következõ parancs? C:>ipconfig /flushdns
Törli a számitógépen a DNS lekérdezések (ipconfig/displaydns ) adatait

Mi a különsbség a Forward és a Reverse Lookup Zone között?
A forward Lookup Zone a hostnév IP cimét adja meg.
A Reverse Lookup Zone az IP címhez tartozó hostnevet adja meg.

Az Active Directory telepítésekor alapértelmezés szerint melyik két csoportházirend- objektum jön létre?
default domain policy
default domain controllers policy

Melyik zónában találunk A-rekordot és melyikben PTR-t?
ForwardLookup  Zone A rekord
Reverse Lookup Zone a PTR
