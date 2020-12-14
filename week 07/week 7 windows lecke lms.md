Készítsünk egy GPO-t a következõ beállításokkal
Korlátozzuk a Vezérlõpulthoz való hozzáférést (készítsünk egy felhasználót az AD-ben és 
állítsuk be arra a felhasználóra)
Tiltsuk le a LAN Manager Hash tárolását. Miért szükséges letiltani?
Tiltsuk le a kikényszerített rendszer-újraindítást (Windows Update). Miért lehet ez 
hasznos?
Tiltsuk le a cserélhetõ adathordozó-meghajtókat (CD,DVD)
Tiltsuk le a Guest accountot (Vendég fiók)
Állítsuk a minimális jelszó hosszt 10-re
Állítsuk be a rendszert úgy, hogy az utoljára használt 6 jelszót jegyezze meg (Password 
history)

Hozzunk létre egy mappát a C: meghajtón, majd készítsünk benne egy valami.txt fájlt. Állítsuk be, 
hogy a valami.txt fájt a Domain Users felhasználók csak olvasni tudják.

Mi az NTDS.DIT? Hol találom meg?
A %SystemRoot%\ntds\NTDS.DIT 
a fájl az Active Directory fõ adatbázisa,
    
    Mit jelent a kvótázás? Milyen fájlrendszerben található meg?
A felhasználók tárterület használatát korlátozza. megadott objektumra (mappa, mappák, 
erõforrások) az adott felhasználó, vagy csoport nem léphet túl
Windows alatt NTFS, és ReFS fájlrendszerben.
Mit csinál a következõ parancs? C:>ipconfig /flushdns
Törli a számítógépen ideiglenes tárolt DNS lekérdezések (ipconfig /displaydns) adatait.
    Mi a különsbség a Forward és a Reverse Lookup Zone között?
    A forward Lookup Zone a hostnév IP címét adja meg.
A reverse lookup az IP címhez tartozó Hostnevet adja meg.
Az Active Directory telepítésekor alapértelmezés szerint melyik két csoportházirend- 
objektum jön létre ?
default domain policy
default domain controllers policy

Melyik zónában találunk A-rekordot és melyikben PTR-t ?
Forward Lookup zone-ban van A record, 
Reverse Lookup Zone-ban a PTR.


