Workshop

a k�pek a doc f�jlban vannak!

K�sz�ts�nk egy GPO-t a k�vetkez� be�ll�t�sokkal
* Korl�tozzuk a Vez�rl�pulthoz val� hozz�f�r�st (k�sz�ts�nk egy felhaszn�l�t az AD-ben �s �ll�tsuk be arra a felhaszn�l�ra)
* k�p


* 
* Tiltsuk le a LAN Manager Hash t�rol�s�t. Mi�rt sz�ks�ges letiltani?
* 

* Tiltsuk le a kik�nyszer�tett rendszer-�jraind�t�st (Windows Update). Mi�rt lehet ez hasznos?
* k�p
* 

* Tiltsuk le a cser�lhet� adathordoz�-meghajt�kat (CD,DVD)
* k�p

* Tiltsuk le a Guest accountot (Vend�g fi�k)
* �ll�tsuk a minim�lis jelsz� hosszt 10-re
* k�p
* 

* �ll�tsuk be a rendszert �gy, hogy az utolj�ra haszn�lt 6 jelsz�t jegyezze meg (Password history)

Hozzunk l�tre egy mapp�t a C: meghajt�n, majd k�sz�ts�nk benne egy valami.txt f�jlt. �ll�tsuk be, hogy a valami.txt f�jt a Domain Users felhaszn�l�k csak olvasni tudj�k.
ok. k�p

Mi az NTDS.DIT? Hol tal�lom meg?
A %SystemRoot%ntds\NTDS.DIT
a f�jl az Active Directory f� adatb�zisa

Mit jelent a kv�t�z�s? Milyen f�jlrendszerben tal�lhat� meg?
A felhaszn�l�k t�rter�let felhaszn�l�s�t korl�tozza. megadott objektumra  t�rter�letre vonatkozik amit felhaszn�l� nem l�phet t�l .
NTFS �s REFS f�jlrendszerben

Mit csin�l a k�vetkez� parancs? C:>ipconfig /flushdns
T�rli a sz�mit�g�pen a DNS lek�rdez�sek (ipconfig/displaydns ) adatait

Mi a k�l�nsbs�g a Forward �s a Reverse Lookup Zone k�z�tt?
A forward Lookup Zone a hostn�v IP cim�t adja meg.
A Reverse Lookup Zone az IP c�mhez tartoz� hostnevet adja meg.

Az Active Directory telep�t�sekor alap�rtelmez�s szerint melyik k�t csoporth�zirend- objektum j�n l�tre?
default domain policy
default domain controllers policy

Melyik z�n�ban tal�lunk A-rekordot �s melyikben PTR-t?
ForwardLookup  Zone A rekord
Reverse Lookup Zone a PTR
