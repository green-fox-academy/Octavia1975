5. hét das san
Mondd el saját szavaiddal, hogy:

• Mik azok a tárolók vagy storage-ok általánosságban és hol jelenhetnek meg egy vállalatnál?
adattárolásra alkalmas eszközök.dobozok amikben diskek vannak.
15 terrás tartományúak is lehetnek a diskek .Embermagasságó szekrény tele diskekkel.
feladatuk hogy központositott menedzsmenttel biztositsa a szervereknek klienseknek a disk tipusu tárterületet.
fontos hogy skálázható bővithető legyen. leállás nélkül kell megvalósitani a diskcserét.
túláramvédelem. mentés offline esetleg disk eszközre is.
lehet szoftveres raid is.Fontos hogy gyors legyen. szünetmentws legyen.          


• Mi az a DAS (Direct Attached Storage)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát meghatározni!
Közvetlen kábellel csatolt usb pl. meghajtók pendrivok.külső vinchesterek. scsi kábellel összekötött dobozok amelyekben diskek vannak. régebbi technológia.
kábel hossza max 3-4m .
előnye olcsó egyszerű 
hátránya kis távolságokra tehetjük szerverektől lassú idejétmúlt technológia.


• Mi az a NAS (Network Attached Storage)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát saját szavaiddal meghatározni!
Diskekkel teli doboz ethernet kábelen TCP/IP hálózaton keresztüli kapcsolat szerverhezmás tárolókhoz.
a NAS nak szervernek is van IP cime.
elterjedt protokollok 
FTP file transwer protokoll, NFS network file unixra fejlesztet technológia aktivan fejlesztett system Webdaw
samba is egy unix által használt alklmazás

A nas egy tárhellyel teli gép ami mendenféle hálózati megosztásra képes. spec az is nas megosztunk egy mappát és egy kollega másik gépen eléri.
nagygépes környezetben 2 egység van benne az egyik megáll a másik át tudja venni a szerepét.leállás nélkül lehet kezelni.
előnyei: hálózati kapcsolat miatt egyszerű és olcsón tudjuk hálózatba kötni. sokan dolgoznak a cégnél mindenki számára elérhető fájlok könyvtárok.
hátránya:mivel hálózaton van a forgalmunk könnyen kieshet vagy belassulhat nem túl biztonságos közvetítő közeg
közvetitő közeg ethernet hálózat TCP/IP alapokon egyszerű és olcsó.
nyers diskeket nem kezelheti
szlgáltatott tárhely tipusa megosztásokat kapunk ,fájl mappastruktúra



• Mi az a SAN (Storage Area Network)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát saját szavaiddal meghatározni!
SAN nem csak egy doboz diskekkel tele hanem egy protokoll topológia.hálózati protokoll egy teljes tárolási technológia.
üvegszálas technológia.
üvegszálas kábel gyors biztonságos 
san kapcsolók egyik portról a másik portra küldik át a dolgokat. 
üvegszálban irányitott formában nagy távolságra gyorsan lehet adatokat küldeni.
egy vagy több fénysugarat használunk egy közvetitő zónában.
HBA  adapter egy kiegészitő kártya ami FC port ot tartalmaz amivel kapcsolódhat az optikai kábel.
FC kábel FC port
hátránya hogy drága
előnye gyorsaság sávszélesség garantált
SAN witchek san kapcsolók csomopontokon helyezkednek el
Fiber chanel esetén WWN world wide name cimzést használunk.
Fabric 1,2,3,4 stb elnevezések vannak az üveghálózatnak
SAN storage egy eszköz amiben diskek vannak fc portokkal ebből is minimum 2 kell hogy hibatűrő legyen
előnyök gyors nagy távolságok valósíthatók meg hibatűrő struktúra biztonságos
hátrányok: drága speciális kártyák kellenek hozzá speciális kábelek. sérülékeny ,komoly szakértelem kell a bevezetéshez.
közvetitő közeg üvegszál copper kábelek rövidebb távolságokra vagy ethernet kábel
tárhely tipusa: nyers diskek vagy lun ok szerver felé kiajánlva.


• Mi jelent a RAID (Redundant Array of Independent Disks) betűszó?
Redundáns tömb különálló diszkekből.
tetszőleges méretű tárterületet tudjunk kiajánlani diszkekből plusz diskek sérülése esetén se veszitsünk adatot.
RAID ekből is van többféle legelterjedtebbek 
raid 0 csikozás előnye gyorsabb hátránya egyforma diskek kellenek
concat diskek egymás után kötése előúnye vegyesen is fűzhetünk hátránya lassabb mert folyamatosan irja tele a diszkeket
raid 1 tükrözés egyik diszket tüközi a másikra 2 diszk kell hozzá 2 nél több diszket sphare diszkként kezeli
kétszerannyi területre van szükség hozzá ami csak költség 
ha elromlik egy disk a másikról elérhetők lehetnek az adatok.
raid 5 minimálisan 3 diszket haználunk uj fogalom a paritás a paritás egy ellenőrző összeg mint egy olyan érték amit úgy kapunk meg hogy az egy csikon elhelyezkedő adatok értékét összegezzük.
előnye gyors csupán egy disknyi területet vesztünk csak a redundancia miatt cserébe egy tetszőleges disk kiesését tűri el.
hátránya csikozásal dolgozik ugyanakkora méretű diszkek sokáig tart az ujraépitése.
sphere diskek tartalék diszkek ezek nem lesznek használva csak addig amig a hibatűrő RAID tömbben egy diszk meghibásodik.
ekkor a raid tömb kicsréli sphere diskként levő tartalék lemezt a meghibásodott diszkre és elinditja a visszaépitést.
majd csere után visszaszinkronizálás.


• Mi jelent az iSCSI (Internet Small Computer Systems Interface) rövidítés?
hatékonyabb protokoll a NAS hoz kizárólag ethernetet hálózatot IP címeket igényel. megfelelő TCP/IP csomagokba ágyazódnak a diszk scsi utasitások.
ISCSIt be tudjuk üzemelni 2 gép kell az egyik a storage a másik a iscsi target  a másik a kliens ami a tárterületet kapja.
bevezették az IQN neveket iscsi qualified name neveket.
nasokkkal ellentétben diszk alapu tárhely kialakitást tesz lehetővé a nas oknál megszokott ethernet alapú TCP/IP hálózaton.
iscsi szofveres megoldás nem kell hozzá spec hardver habár léteznek iscsi képes HBA kártyák . ilyenkor az átviteli teljesitményt nem terheli hanem egy külön egység végzi magán a kártyán.
a hálózat terheltsége könnyen befolyásolhatja a disk elérést 



• Milyen sebességekre, illetve tároló méretekre emlékszel?
6 Gbps = 750 MB/s 5400-7200rpm hdd a jellemző

