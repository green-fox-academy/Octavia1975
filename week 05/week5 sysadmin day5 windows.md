Telep�s�nk fel egy Windows Server 2016 szervert
ok
Adjuk hozz� a szerverhez a Resource Monitor szolg�ltat�st
kell hozz�adni alapb�l tartalmazza. Resource Monitor app n�ven.
Mi az NTP szerver? Mi�rt fontos ennek a be�ll�t�sa?
Id�szinkroniz�ci�t biztos�t a h�l�zaton, a hi�nya eset�n id�eltol�d�s l�phet fel a server �s a kliensek k�z�tt ami id�kritikus m�veletek (pl. bejelentkez�si folyamat) id�t�ll�p�st kapcsolatveszt�st okozhat.
Az NTP TCP vagy UDP porton kommunik�l?
UDP
Mi�rt fontos az Windows Update haszn�lata? Nagyv�llalati k�rnyezetben milyen m�don szokt�k haszn�lni �s milyen kritikus pontja vannak a rendszerek friss�t�s�nek?
Biztons�gi friss�t�sek miatt, a biztons�gi hib�kat jav�tja, melyek elmarad�sa eset�n t�volr�l jogosulatlan szem�lyek illet�ktlen�l hozz�f�rhetnek a h�l�zathoz. �ltal�ban van egy vagy t�bb wupdate "kl�n" szerver a h�l�zaton �s a kliensek err�l szedik le a friss�t�seket.
Ne egyszerre egyid�ben szedje le az �sszes kliens, mert t�lterhel�st okozhat. Amennyiben �jraind�t�s sz�ks�ges lehet�leg valamilyen HOLT id�ben "karbantart�si id�ben" t�rt�njen.
Hol tudjuk �t�ll�tani az els�dleges �s m�sodlagos DNS szervert?
Network Settings/Network Connections/(network card name) Properties/IPV4 settings.
Hol tudn�nk a g�p�nket domain-be l�ptetni? Milyen jogosults�g kell ehhez?
AD DS-ben Domain Administrator joggal.
Tiltsuk le a t�zfalon a Remote Desktop haszn�lat�t
ok
