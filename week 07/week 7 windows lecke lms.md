K�sz�ts�nk egy GPO-t a k�vetkez� be�ll�t�sokkal
Korl�tozzuk a Vez�rl�pulthoz val� hozz�f�r�st (k�sz�ts�nk egy felhaszn�l�t az AD-ben �s 
�ll�tsuk be arra a felhaszn�l�ra)
Tiltsuk le a LAN Manager Hash t�rol�s�t. Mi�rt sz�ks�ges letiltani?
Tiltsuk le a kik�nyszer�tett rendszer-�jraind�t�st (Windows Update). Mi�rt lehet ez 
hasznos?
Tiltsuk le a cser�lhet� adathordoz�-meghajt�kat (CD,DVD)
Tiltsuk le a Guest accountot (Vend�g fi�k)
�ll�tsuk a minim�lis jelsz� hosszt 10-re
�ll�tsuk be a rendszert �gy, hogy az utolj�ra haszn�lt 6 jelsz�t jegyezze meg (Password 
history)

Hozzunk l�tre egy mapp�t a C: meghajt�n, majd k�sz�ts�nk benne egy valami.txt f�jlt. �ll�tsuk be, 
hogy a valami.txt f�jt a Domain Users felhaszn�l�k csak olvasni tudj�k.

Mi az NTDS.DIT? Hol tal�lom meg?
A %SystemRoot%\ntds\NTDS.DIT 
a f�jl az Active Directory f� adatb�zisa,
    
    Mit jelent a kv�t�z�s? Milyen f�jlrendszerben tal�lhat� meg?
A felhaszn�l�k t�rter�let haszn�lat�t korl�tozza. megadott objektumra (mappa, mapp�k, 
er�forr�sok) az adott felhaszn�l�, vagy csoport nem l�phet t�l
Windows alatt NTFS, �s ReFS f�jlrendszerben.
Mit csin�l a k�vetkez� parancs? C:>ipconfig /flushdns
T�rli a sz�m�t�g�pen ideiglenes t�rolt DNS lek�rdez�sek (ipconfig /displaydns) adatait.
    Mi a k�l�nsbs�g a Forward �s a Reverse Lookup Zone k�z�tt?
    A forward Lookup Zone a hostn�v IP c�m�t adja meg.
A reverse lookup az IP c�mhez tartoz� Hostnevet adja meg.
Az Active Directory telep�t�sekor alap�rtelmez�s szerint melyik k�t csoporth�zirend- 
objektum j�n l�tre ?
default domain policy
default domain controllers policy

Melyik z�n�ban tal�lunk A-rekordot �s melyikben PTR-t ?
Forward Lookup zone-ban van A record, 
Reverse Lookup Zone-ban a PTR.


