T9# SAN, storage infrastruktúra alapok Workshop

•	Mi a mentés és az archiválás közötti különbség?
•	Hol érdemes tárolni a mentett adatainkat?
•	Minimálisan hány példányban érdemes tarttani a mentéseinket?
•	A mentés inkább CPU vagy inkább I/O igényes művelet?	
•	Az internete mindenki nyissa meg az IBM Spectrum Protect demó oldalát és probáljon ki néhény funciót az ottani felületen! link
•	Mindeki végezzen számításokat arra, hogy 100GB, 200GB, 500GB, 1TB, 2TB adat különböző médiákon (szalag, LAN, SAN) mennyi ideig tartana lementeni!
•	A délutáni gyakorlatok alatt keress az interneten mentéssel kapcsolatos hardver megoldásokat, szalagos meghajtókat, szalagkönyvtárakat és virtuális szalagos megoldásokat!
•	A délutáni gyakorlatok alatt keress az interneten mentéssel kapcsolatos szoftver megoldásokat!
•	A lenti megadott linkek alapján nézd meg és próbáld ki a mentési megoldásokhoz kapcsolódó ingyenes vagy próba szoftvertermékeket (dd, rsync, ...)!






Mik azok a tárolók vagy storage-ok?
A storage, egyszerűen kifejezve egy „doboz ,amiben diszkek vannak.” Ez konyhanyelven tökéletesen azonosítja a storage-t. A storage feladata, hogy egy teljesen szeparált módon, és esetekben centralizált módon biztosítsa más szervereknek, vagy klienseknek a tárterületet.
Milyen három tároló kategóriát ismertünk meg?
DAS, NAS és SAN.
Milyen hálózatot használnak a NAS (Network Attached Storage) tárolók?
TCP /IP alapú sima otthoni enthernet hálózatot. Cat6 UTP kábelel már 1 Gigabites tempót is elérhet.
Hogy néz ki a címzés a SAN hálózati eszköz WWN címével? (Internetet is lehet használni)
A Fibre Channel környezet minden résztvevőjének egyedi azonosítója van, amelyet World Wide Name (WWN) néven hívnak. Ez a WWN egy 64 bites cím, és ha két WWN címet teszünk a keret fejlécébe, ez 16 bájt adatot hagy csak a cél- és forráscím azonosítására. Tehát a 64 bites címek befolyásolhatják az útválasztási teljesítményt. Emiatt van egy másik címzési séma, amelyet a Fibre Channel hálózatokban használnak. Ez a séma a kapcsolt szövet portjainak címzésére szolgál. A kapcsolt szövet minden egyes portjának megvan a maga egyedi 24 bites címe. Ezzel a 24 bites címzési sémával kisebb keretfejlécet kapunk, és ez felgyorsíthatja az útválasztási folyamatot. Ezzel a keretfejléccel és útvonalválasztási logikával a Fibre Channel szövetet optimalizálták a keretek nagy sebességű kapcsolására. A 24 bites címzési sémával ez akár 16 millió címet is lehetővé tesz, ami nagyobb, mint a mai világban létező bármilyen gyakorlati SAN-terv. Ezt a 24 bites címet valahogy össze kell kapcsolni a világhálón társított 64 bites címmel és azzal. A 24 bites címséma egyúttal megszünteti a címek kézi kezelésének általános költségeit is, lehetővé téve a topológia számára, hogy címeket rendeljen hozzá. Ez nem olyan, mint a WWN címzés, amelyben a címeket az IEEE szabványbizottság hozzárendeli a gyártókhoz, és beépítéskor beépítik a készülékbe, hasonlóan ahhoz, mint amikor egy gyermeket születéskor elneveznek. Ha a topológia maga hozzárendeli a 24 bites címeket, akkor valakinek felelnie kell a címzési sémáért a WWN címzéstől a port címzésig. A kapcsolt szövet környezetben maga a kapcsoló felel a port címek hozzárendeléséért és karbantartásáért. Amikor az eszköz a WWN-jével egy adott port kapcsolójába jelentkezik be, a kapcsoló hozzárendeli a port címét ahhoz a porthoz, és a kapcsoló fenntartja az összefüggést a port címe és az adott eszköz WWN-címe között. A kapcsoló ezen funkcióját egy névszerver segítségével valósítják meg. A névszerver a fabric operációs rendszer egyik összetevője, amely a kapcsolón belül fut. Lényegében olyan objektumok adatbázisa, amelyben a szövethez kapcsolt eszköz regisztrálja értékeit. A dinamikus címzés megszünteti az emberi hibák potenciális elemét a címek karbantartásában, és nagyobb rugalmasságot biztosít a SAN kiegészítéseiben, áthelyezésében és módosításaiban. A 24 bites portcím három részből áll: Tartomány (bitek 23-tól 16-ig) Terület (bitek 15-től 08-ig) Port vagy választott hurok fizikai címe - AL_PA (bitek 07-től 00-ig) Tartomány: A portcím legjelentősebb bájtja a tartomány. Ez maga a kapcsoló címe. Egy bájt legfeljebb 256 lehetséges címet engedélyez. Mivel ezek egy része fenntartva van (például a műsorszórásé), csak 239 cím áll rendelkezésre. Ez azt jelenti, hogy akár 239 kapcsoló is lehet a SAN környezetében. A tartományszám lehetővé teszi, hogy minden kapcsoló egyedi azonosítóval rendelkezzen, ha a környezetében több összekapcsolt kapcsoló van. Terület: A terület mező 256 címet ad meg. A cím ezen része az egyes FL_Ports támogató hurkok azonosítására szolgál, vagy használható az F_Portok csoportjának azonosítójaként; például egy kártya, amelyen több port található. Ez azt jelenti, hogy minden portcsoportnak külön a területszáma, még akkor is, ha csak egy port van a csoportban. Port: A cím utolsó része 256 címet ad a csatolt N_Portok és NL_Portok azonosításához. A rendelkezésre álló címek számának eléréséhez egy egyszerű számítás szükséges: Tartomány x Terület x Portok Ez azt jelenti, hogy 239 x 256 x 256 = 15 663 104 cím áll rendelkezésre.
Hogy néz ki a címzés egy iSCSI eszközön?
Az iSCSI a TCP-t (általában a 860 és 3260 TCP portokat ) használja a protokollokhoz, a protokollban lévő objektumok címzésére magasabb szintű neveket használnak. A speciális nevek az iSCSI kezdeményezőkre és a célokra egyaránt vonatkoznak. Az iSCSI három névformátumot kínál: iSCSI minősített név (IQN) Formátum: Az iSCSI minősített név az RFC 3720-ban van dokumentálva , további névpéldákkal az RFC 3721-ben . Röviden, a mezők a következők: szó szerinti iqn (iSCSI minősített név) dátum (éééé-hh), amikor a névadó hatóság átvette a domain tulajdonjogát a hatóság fordított tartományneve (pl. org.alpinelinux, com.example, to.yp.cr) Opcionális ":" a névadó hatóság által megadott tárolási célnév előtagja. Az RFC-től: típus . Dátum . Auth. Elnevezése : Karakterláncot az example.com Naming Authority határozza meg iqn . 1992-01 . com.példa : tárolás: diskarrays-sn-a8675309 iqn . 1992-01 . com.példa iqn . 1992-01 . com.példa : tárolás.szalag1.sys1.xyz iqn . 1992-01 . com.példa : storage.disk2.sys1.xyz Kiterjesztett egyedi azonosító (EUI) Formátum: eui. {EUI-64 bites cím} (pl. Eui.02004567A425678D ) T11 hálózati cím hatóság (NAA) Formátum: naa. {NAA 64 vagy 128 bites azonosító} (pl. Naa.52004567BA64678D ) Az IQN formátumú címek fordulnak elő leggyakrabban. Dátum (éééé-hh) minősítéssel rendelkezik, mert a domainnevek lejárhatnak, vagy egy másik entitás megszerezheti őket. Az IEEE regisztrációs hatóság az EUI-t az EUI-64 szabványnak megfelelően biztosítja. Az NAA az OUI része, amelyet az IEEE Regisztrációs Hatóság biztosít. Az RSC 3980- ban NAA névformátumokat adtak az iSCSI-hez , hogy kompatibilisek legyenek a Fibre Channel és a Serial Attached SCSI (SAS) tárolási technológiákban használt névadási konvenciókkal . Általában egy iSCSI résztvevőt három vagy négy mező határozhat meg: Gazdanév vagy IP-cím (pl. "Iscsi.example.com") Port száma (pl. 3260) iSCSI név (pl. az IQN "iqn.2003-01.com.ibm:00.fcd0ab21.shark128") Opcionális CHAP titok (pl. "Titkok újrakezdése") iSCSI - https://hu.qaz.wiki/wiki/ISCSI
Keress az interneten az IBM gyártó termékkínálatából SAN tárolókat!
IBM 3592 Tape Cartridge
IBM 7226 Multimedia Storage Enclosure
IBM DS8900F
•	IBM Elastic Storage System 3000
•	IBM Elastic Storage System 5000
•	IBM Elastic Storage Server
•	IBM FlashSystem 5000 (Formerly Storwize V5000E)
•	IBM FlashSystem 5000H (Formerly Storwize V5000E)
•	IBM FlashSystem 5200
•	IBM FlashSystem 5100H (Formerly Storwize V5100)
•	IBM FlashSystem 7200
•	IBM FlashSystem 7200H
•	IBM FlashSystem 9200
•	IBM FlashSystem 9200R
•	IBM Linear Tape-Open (LTO) Ultrium 6 Data Cartridge
•	IBM Linear Tape-Open (LTO) Ultrium 7 Data Cartridge
•	IBM Linear Tape-Open (LTO) Ultrium 8 Data Cartridge
•	IBM Network Advisor 14.0
•	IBM SAN Volume Controller
•	IBM Spectrum Archive
•	IBM Spectrum Control
•	IBM Spectrum Copy Data Management
•	IBM Spectrum Discover
•	IBM Spectrum Protect
•	IBM Spectrum Protect Plus
•	IBM Spectrum Scale
•	IBM Spectrum Storage Suite
•	IBM Spectrum Virtualize for Public Cloud
•	IBM Storage Insights
•	IBM Storage Networking SAN18B-6
•	IBM Storage Networking SAN24B-6
•	IBM Storage Networking SAN42B-R
•	IBM Storage Networking SAN48C-6
•	IBM Storage Networking SAN50C-R Fabric Switch
•	IBM Storage Networking SAN64B-6
•	IBM Storage Networking SAN96C-6
•	IBM Storage Networking SAN128B-6
•	IBM Storage Networking SAN192C-6 Multilayer Director
•	IBM Storage Networking SAN32C-6 Fabric Switch
•	IBM Storage Networking SAN384C-6 Multilayer Director
•	IBM Storage Networking SAN512B-6 and SAN256B-6
•	IBM Storage Networking SAN768C-6 Director
•	IBM Storage Suite for IBM Cloud Paks
•	IBM Storage Utility
•	IBM Storwize V5000E (See IBM FlashSystem 5000)
•	IBM Storwize V5100 (See IBM FlashSystem 5200)
•	IBM Storwize V5100F (See IBM FlashSystem 5200)
•	IBM Storwize V7000 (See IBM FlashSystem 7200)
Keress ugyan így más gyártóknál is hasonló termékeket: HPE, Oracle/Sun, NetApp, Synology, QNAP és próbáljuk megkeresni a funkcióikat és esetleg a különbözőségeket!
Q1J02A HP vállalati moduláris intelligens tömb 2052 SAN kettős vezérlő LFF tároló
MediaVault D1200, R1200, R3600
HPE SIMPLIVITY 380 GEN10 ADAT-DEDUPLIKÁCIÓ
Hewlett Packard Enterprise announces simple and affordable next generation storage solution for small businesses
Oracle FS Path Manager 4.0 for Linux (OL/RHEL/CentOS 5,6,7; OVS 3; SLES 11,12)
Oracle FS Path Manager 4.0 for Windows (2008, 2008 R2, 2012, 2012 R2)
Oracle’s Sun Storage 2500-M2
Oracle’s Pillar Axiom 600 storage system
NetApp FAS2000 sorozat: FAS2020 és FAS2040 (akár 136 TB-ig)
FAS2200 sorozat: FAS2220 és FAS2240 (akár 552 TB-ig)
FAS3100 sorozat: FAS3140, FAS3160 és FAS3170 (akár 1680 TB-ig)
FAS3200 sorozat: FAS3210, FAS3240 és FAS3270 (akár 1920 TB-ig)
FAS6200 sorozat: FAS6210, FAS6240 és FAS6280 (akár 2880 TB-ig)
V3200/V6200 sorozatok: más gyártó tárolókapacitásának virtualizációjához
Szinte az összes NetApp tárolási, hatékonysági és szoftverfunkciót kiterjesztheti meglévő, más gyártótól vásárolt tárolási kapacitására a V-sorozat vezérlőinek segítségével. Más szempontból megegyeznek a normál FAS vezérlőkkel, így saját polcokkal is bővíthetőek. Letölthető PDF adatlap…
NetApp bővítő diszkpolcok (DS14, DS4243, DS2246)
SAS vagy FC bekötéssel; SAS, FC vagy SATA lemezekkel vagy SSD-vel. Letölthető PDF adatlap…
•	DS14: FC bekötéssel 3U magas, FC vagy SATA lemezekkel
•	DS4243: SAS bekötéssel 4U magas, 24 lemezhely, SAS, SATA vagy SSD meghajtók
•	DS2246: SAS bekötéssel 2U magas, 24 lemezhely, SAS lemezekkel
•	SYNOLOGY RS3617RPXS
•	FS3017
•	RS18017xs+
•	UC3200
•	RS4017xs+
•	FS sorozat
FS640024 fiók240 000 4K véletlenszerű írási IOPSKétmagos, nyolcmagos 2,1 GHz-es CPUSynology RAID F1 az időtálló flash-tárhelyért
FS360024 fiók12 magos CPU, turbó üzemmódban max. 2,7 GHzTöbb mint 195 000 iSCSI 4K véletlenszerű írási IOPSAkár 72 db SAS/SATA SSD
FS340024 fiókTöbb mint 137 000 iSCSI 4K véletlenszerű írási IOPSNyolcmagos CPU, turbó üzemmódban max. 2,7 GHzAkár 72 db SAS/SATA SSD
SA sorozat
SA360012 fiók12 magos CPU, turbó üzemmódban max. 2,7 GHzTöbb mint 5,500 MB/s szekvenciális olvasási sebesség180/96 meghajtóig fokozatosan bővíthető
SA340012 fiókNyolcmagos CPU, turbó üzemmódban max. 2,7 GHz2 db alaplapi 10GBASE-T port és 2 db PCIe 3.0-bővítőhely180/96 meghajtóig fokozatosan bővíthető
SA3200D12 fiókKétvezérlős architektúra4 magos CPU, turbó üzemmódban max. 2,7 GHzTöbb mint 90 000 4K véletlenszerű írási IOPS
XS+/XS sorozat
NEW
RS4021xs+16 fiók234 698 feletti 4K véletlenszerű olvasási IOPSKét beépített 10 GbE portRX1217(RP) bővítőegységgel akár 40 lemezhely
RS4017xs+16 fiókNyolcmagos 2,1 GHz-es CPU64 GB-ig bővíthető memória2 db 10 GBASE-T-port és 2 db PCIe 3.0 x8
NEW
RS3621xs+12 fiókIntel® Xeon® nyolcmagos processzorKét beépített 10 GbE portAkár 64 GB DDR4 ECC UDIMM
RS3617xs+12 fiókTöbb mint 5 570 MB/s átviteli sebesség és 191 126 IOPS2 db 10 GBASE-T és 4 db 1 GbE RJ-45 LAN-port36 meghajtóig fokozatosan bővíthető
RS1619xs+4 fiókNégymagos 2,2 GHz-es CPU10 GbE támogatása (opcionális)M.2 NVMe/SATA SSD-gyorsítótár támogatása
NEW
RS3621RPxs12 fiókIntel® Xeon® hatmagos processzorKét PCIe-bővítőhelyRedundáns tápellátás
RS3617RPxs12 fiókNégymagos 2,4 GHz-es CPU36 meghajtóig fokozatosan bővíthetőRedundáns 500 W-os tápellátás
RS3618xs12 fiókNégymagos 2,4 GHz-es CPU 36 meghajtóig fokozatosan bővíthető64 GB-ig bővíthető memória
RC18015xs+12 fiókNégymagos 3,3 GHz-es CPUAktív/passzív architektúrájú high-availability klaszter180 meghajtóig fokozatosan bővíthető
DS1621xs+6 fiókNégymagos, 2,2 GHz-es CPUBeépített 10 GbE/M.2 NVMe SSD-gyorsítótár-bővítőhelyek16 meghajtóig fokozatosan bővíthető
DS3617xs12 fiókNégymagos 2,2 GHz-es CPU10 GbE hálózati adapterek támogatása (opcionális)36 meghajtóig fokozatosan bővíthető
Plus sorozat
DS620slim6 fiókUltrakompakt, hat lemezhelyes 2,5 hüvelykes házKétmagos CPU, turbó üzemmódban maximum 2,5 GHzBővíthető memóriakapacitás
DS220+2 fiókKétmagos CPU, turbó üzemmódban maximum 2,9 GHz2 db 1 GbE RJ-45 portA Btrfs fájlrendszer támogatása
DS420+4 fiókKétmagos CPU, turbó üzemmódban maximum 2,9 GHzM.2 NVMe SSD-gyorsítótár támogatásaTöbb mint 226 MB/s olvasási teljesítmény
DS720+2 fiókNégymagos processzor, turbó üzemmódban maximum 2,7 GHzM.2 NVMe SSD-gyorsítótár támogatása7 meghajtóig fokozatosan bővíthető
DS920+4 fiókNégymagos processzor, turbó üzemmódban maximum 2,7 GHzM.2 NVMe SSD-gyorsítótár támogatása9 meghajtóig fokozatosan bővíthető
DS1520+5 fiókNégymagos processzor, turbó üzemmódban maximum 2,7 GHzM.2 NVMe SSD-gyorsítótár támogatása15 meghajtóig fokozatosan bővíthető
DS1621+6 fiókNégymagos 2,2 GHz-es CPUM.2 NVMe SSD-gyorsítótár támogatása16 meghajtóig fokozatosan bővíthető
DS1819+8 fiókNégymagos 2,1 GHz-es CPUM.2 NVMe/SATA SSD-gyorsítótár támogatása118 meghajtóig fokozatosan bővíthető
DS1821+8 fiókNégymagos 2,2 GHz-es CPUM.2 NVMe SSD-gyorsítótár támogatása18 meghajtóig fokozatosan bővíthető
DS2419+12 fiókNégymagos 2,1 GHz-es CPUAkár 336 TB-ig bővíthetőM.2 NVMe/SATA SSD-gyorsítótár támogatása
RS820+ / RS820RP+4 fiókNégymagos, 2,1 GHz-es CPUTöbb mint 1621 MB/s szekvenciális olvasási sebesség8 meghajtóig fokozatosan bővíthető
RS1219+8 fiókNégymagos 2,4 GHz-es CPU M.2 SATA SSD-gyorsítótár támogatása112 meghajtóig fokozatosan bővíthető
NEW
RS1221+ / RS1221RP+8 fiókNégymagos 2,2 GHz-es CPU12 meghajtóig fokozatosan bővíthető10 GbE támogatása (választható)
RS2418+ / RS2418RP+12 fiókNégymagos 2,1 GHz-es CPU 24 meghajtóig fokozatosan bővíthető64 GB-ig bővíthető memória
RS2818RP+16 fiókNégymagos 2,1 GHz-es CPU 28 meghajtóig fokozatosan bővíthető64 GB-ig bővíthető memória
Value sorozat
DS218play2 fiókOtthoni multimédiás központNégymagos 1,4 GHz-es CPUCsendes és energiatakarékos
DS1181 fiókNégymagos 1,4 GHz-es CPUTöbb mint 113 MB/s olvasási teljesítményKörnyezetbarát energiafogyasztás
DS2182 fiókNégymagos 1,4 GHz-es CPUTöbb mint 112 MB/s olvasási teljesítményA Btrfs fájlrendszer támogatása
DS4184 fiókNégymagos 1,4 GHz-es CPUTöbb mint 226 MB/s olvasási teljesítményA Btrfs fájlrendszer támogatása
DS18178 fiókNégymagos 1,7 GHz-es CPU2 db 10 GBASE-T és 2 db 1 GbE port18 meghajtóig fokozatosan bővíthető
RS2172 fiókKompakt váz a könnyű beszerelésértTöbb mint 221 MB/s olvasási teljesítményKörnyezetbarát, 21,25W-os alacsony energiafogyasztás
RS8194 fiók64 bites, négymagos 1,4 GHz-es processzorKompakt 1U váz, 12 hüvelyk mélységű kialakításTöbb mint 224 MB/s olvasási sebesség titkosított adatok esetén
J sorozat
DS120j1 fiókKompakt privátfelhő-megoldásTöbb mint 112 MB/s olvasási teljesítmény9,81 wattos alacsony energiafogyasztás
DS220j2 fiók64 bites, négymagos 1,4 GHz-es processzor112 MB/s feletti olvasási és írási sebességCsendes és energiatakarékos
DS420j4 fiók64 bites, négymagos 1,4 GHz-es processzorTöbb mint 112 MB/s olvasási/írási sebességCsendes és energiatakarékos
 NAS-választó
Nézz utána a Wikipédián, vagy más internetes forrásban, hogy milyen más RAID megoldások léteznek manapság!
RAID 0, RAID 1, RAID 2, RAID 3, RAID 4, RAID 5, RAID 6, RAID 7, RAID 01, RAID 10
•	Keress olyan online RAID kalkulátorokat, amikkel könnyen láthatjuk, hogy melyik RAID megoldáshoz milyen diszkek kellenek és azok hogyan használhatók fel. Például:
https://www.synology.com/hu-hu/support/RAID_calculator
http://www.raid-calculator.com/default.aspx
https://www.servethehome.com/raid-calculator/
https://www.asustor.com/service/RAID_calculator
https://www.seagate.com/gb/en/internal-hard-drives/raid-calculator/
https://www.icc-usa.com/raid-calculator/
https://www.omnicalculator.com/other/raid
https://www.qnap.com/hu-hu/nas-selector/
https://wintelguy.com/raidcalc.pl
https://www.grijpink.eu/tools/raid/
Keress SAN kapcsolatokhoz használható kábeleket, csatlakozókat és modulokat az interneten.
Startech Mini SAS kábel, A csatl.: SFF-8088 (26 pólusú, külső Mini-SAS) reteszelő dugó, B csatl.: SFF-8088 (26 pólusú,
IBM 2109-5805 - Fiber Channel cable Multimode
Ubiquiti UniFi Direct Attach Copper Cable, 10Gbps, 2m
DAC twinax SFP+ to SFP+ 10GB 1M passzív kábel, FINISAR kompatibilis
Termékkód: FI+SFP+C1
JST Csatlakozó ház, SAN sorozat, távolság: 2mm, 10 érintkezős, Egyenes, rögzítés: Kábelre szerelhető
B2001 SAN csatlakozó
DELL 403-BBMT - QLE2692L 16GB FC 2PORT LP 403-BBMT
Intel X520 szerver adapter- SR2 DUAL PORT 10G SR2 LC FIBER PCIE BULK
Dell 8/4 Gbps FC SAN Module
Brocade 16Gb Fibre Channel SAN Switch Module for HPE Synergy
Brocade SAN I/O Modules for Blade Servers
BROCADE 5470 20PORT 8GB SAN SWITCH MODULE 44X1926 44X1924 IBM BLADECENTER 8GB FIBER CHANNEL SWITCH I/O MODULE FOR IBM BLADECENTER
QLogic 20-Port 8 Gb and 4/8 Gb SAN Switch Modules for BladeCenter
Lenovo Flex System FC3171 8Gb SAN Switch and Pass-thru Modules
32R1812 Brocade 4Gb 20-Port SAN Switch Module
Keress az interneten szalagos meghajtókat ne csak az IBM kínálatából!
DLT 7000
IBM TS1130
Dell PowerVault LTO-4 120
HP Surestore Disk Array XP48
Lenovo TS2280
Keress VTL (Virtual Tape Library) eszközöket az internet segítségével más gyártók kínálatából.
IBM 3494
VTL Free
StarWind VTL for AWS and Veeam
Backblaze B2 Backup Storage
Automated LTO P2V Conversion
Wasabi Backup Storage
Data Protection with Cloudian HyperStore
VTL Adds Azure Archive Blob Support to Veeam
Tape Library Emulation
Vendor	Library Emulation
ADIC	Scalar 24, Scalar 50, Scalar 100, Scalar i40/80 Series
	Scalar i500, Scalar i2000, Scalar i6000
Quantum/ATL	M1500, M2500
	P1000, P2000, P3000, P4000, P7000
	PX500 Series, PX720
HP	ESL9000, ESL E-Series, EML E-Series
	MSL 2024/4048/8096, MSL 6000
IBM	3583 UltraScalable Library
	3584 / TS3500
	TS3100/3200
Overland Storage	Neo 2000/4000/8000 Series
StorageTek	L-Series L20, L40, L80, L120, L180, L700
	SL-Series SL150, SL500, SL3000, SL8500
SpectraLogic	T-Series
Tape Drive Emulation
Vendor	Drive Emulation
HP	DLT VS80, VS160, SDLT 220, 320, 600
	Ultrium 232 (LTO-1), Ultrium 448, 460 (LTO-2)
	Ultrium 960 (LTO-3), Ultrium 1840 (LTO-4)
	Ultrium 3280 (LTO-5), Ultrium 6250 (LTO-6)
	Ultrium 15000 (LTO-7)
IBM	3580 Ultrium 1, 3580 Ultrium 2
	3580 Ultrium 3, 3580 Ultrium 4
	3580 Ultrium 5, 3580 Ultrium 6
Quantum	SDLT 220 (SuperDLT I), SDLT 320 (SuperDLT II)
	SDLT 600
StorageTek	T9840A, T9840B, T9840C, T9840D
	T9940A, T9940B
	T10000A, T10000B, T10000C
Backup Software
Vendor	Version	Inline Deduplication Support
ASG Time Navigator	4.5.x	Yes (From release 3.0.16, SIDF backup format)
CA ARCServe	15.x, 16.x, 17.x	Yes
CommVault Simpana	9, 10, 11	Yes
EMC NetWorker	7.x, 8.x, 9.x	Yes
Symantec NetBackup	6.x, 7.x, 8.x	Yes
HP Data Protector	7.x, 8.x, 9.x, 10.x	Yes
Symantec BackupExec	10.x, 11d, 12.5, 2010, 2012, 2016	Yes
Data Protection Manager	2010, 2012	Yes
Quest/BakBone Netvault	7.x, 8.x, 9.x, 10.x	Yes
IBM Tivoli Storage Manager, Spectrum Protect	5.x, 6.x, 7.x, 8.x	Yes
BRMS	v7r1, v7r2, v7r3	Yes
Veeam Backup and Replication	7.x, 8.x, 9.x, 10.x, 11.x	Yes

