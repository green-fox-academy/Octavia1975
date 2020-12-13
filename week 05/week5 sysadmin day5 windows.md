Telepísünk fel egy Windows Server 2016 szervert
ok
Adjuk hozzá a szerverhez a Resource Monitor szolgáltatást
kell hozzáadni alapból tartalmazza. Resource Monitor app néven.
Mi az NTP szerver? Miért fontos ennek a beállítása?
Idõszinkronizációt biztosít a hálózaton, a hiánya esetén idõeltolódás léphet fel a server és a kliensek között ami idõkritikus mûveletek (pl. bejelentkezési folyamat) idõtúllépést kapcsolatvesztést okozhat.
Az NTP TCP vagy UDP porton kommunikál?
UDP
Miért fontos az Windows Update használata? Nagyvállalati környezetben milyen módon szokták használni és milyen kritikus pontja vannak a rendszerek frissítésének?
Biztonsági frissítések miatt, a biztonsági hibákat javítja, melyek elmaradása esetén távolról jogosulatlan személyek illetéktlenül hozzáférhetnek a hálózathoz. Általában van egy vagy több wupdate "klón" szerver a hálózaton és a kliensek errõl szedik le a frissítéseket.
Ne egyszerre egyidõben szedje le az összes kliens, mert túlterhelést okozhat. Amennyiben újraindítás szükséges lehetõleg valamilyen HOLT idõben "karbantartási idõben" történjen.
Hol tudjuk átállítani az elsõdleges és másodlagos DNS szervert?
Network Settings/Network Connections/(network card name) Properties/IPV4 settings.
Hol tudnánk a gépünket domain-be léptetni? Milyen jogosultság kell ehhez?
AD DS-ben Domain Administrator joggal.
Tiltsuk le a tûzfalon a Remote Desktop használatát
ok
