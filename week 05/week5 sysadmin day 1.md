Telep�ts�nk fel egy VMware Workstation Player-t a Windows-os g�p�nkre

ok

Keress ut�na, hogy milyen g�pterem besorol�si szintek vannak! K�sz�ts �sszehasonl�t� t�bl�zatot!

G�PTEREM SZINT	LE�R�S
TIER I	M�r az els�, a TIER I sem k�nnyen elnyerhet�; egy �tlagos adatk�zponthoz k�pest teh�t m�r ez is rangot jelent.
TIER II	a kapacit�skomponensek, p�ld�ul h�t�rendszerek redundanci�j�t vizsg�lja. A min�s�t�s birtokosa r�szben redund�nsnak min�s�l.
TIER III	Az �zemeltet� akkor is ny�jtani tudja a v�llalt szolg�ltat�si param�tereket, ha karbantart�sra ker�l sor, cser�lni kell egy berendez�st. Minden akt�v eszk�zb�l rendelkez�sre �ll tartal�k. Ezen k�v�l minden ell�t�si �tvonal � redund�ns.Az ilyen min�s�t�ssel rendelkez� adatk�zpont b�rmilyen hiba eset�n teljesen hibat�r�: a szerverek m�g a legs�lyosabb technikai incidensek eset�n is el�rhet�k maradnak.
TIER IV	Az ilyen min�s�t�ssel rendelkez� adatk�zpont b�rmilyen hiba eset�n teljesen hibat�r�: a szerverek m�g a legs�lyosabb technikai incidensek eset�n is el�rhet�k maradnak.
Mi a k�l�nbs�g egy Tier 3 �s Tier 4 besorol�s� g�pterem k�z�tt?

A sz�m�t�stechnikai eszk�z�k�n fel�l minden h�t�berendez�s k�t f�ggetlen �ramforr�sr�l m�k�dik, bele�rtve a h�t�berendez�seket, a ventil�torokat �s a l�gkondicion�l�st, tov�bb� a hibat�r� infrastrukt�ra 99,995% v�rhat� rendelkez�sre �ll�ssal.

Keress Tier 3 �s Tier 4 g�ptermeket Budapesten!


A rendelkez�sre �ll�sra vonatkoz�, nagyon szigor� nemzetk�zi aj�nl�soknak �s szabv�nyoknak megfelel�, a legkorszer�bb biztons�gi rendszerekkel ell�tott l�tes�tm�nyt adott �t november 22-�n az Invitech Solutions. A �DC10" adatk�zpontpark �j egys�ge teljes ki�p�t�sben t�bb mint 1000 n�gyzetm�teres, �s az adatk�zpontokat vil�gszerte min�s�t� szervezet, az Uptime Institute a tervdokument�ci�k alapj�n ennek a szerverparknak adta meg haz�nkban els�k�nt a �TIER III" min�s�t�st.

https://www.origo.hu/techbazis/20171130-magyarorszag-legkorszerubb-adatkozpontja.html

https://bitport.hu/mar-nekunk-is-van-minositett-adatkozpontunk-megmutatjuk-hol.html

Lehet-e g�pteremben v�zzel oltani? Indokold!


Mit tegy�nk, ha m�r megt�rt�nt a baj? A legfontosabb tudnival�, hogy elektromos t�zet tilos v�zzel oltani, ez�rt az els� l�p�s minden esetben az �ramtalan�t�s legyen!

Milyen olt�rendszerek/k�sz�l�kek haszn�lhat�k g�pteremben?

G�ZZAL OLT� RENDSZER:

B�rmilyen ter�leten, ahol �rz�keny elektromos berendez�sek, esetleg olyan �rt�kt�rgyak vannak, melyeket a v�z t�nkretehet, a g�zzal olt� rendszer adja meg azt az olt�si k�zeget, melyre sz�ks�g van. B�rmilyen ter�let olt�s�ra alkalmas, m�g abban az esetben is, ha ugyanabban a l�gt�rben emberek tart�zkodnak. Olykor egy irod�ban is emellett az olt�k�zeg mellett d�ntenek, amennyiben a sz�m�t�g�pek �s a rajtuk t�rolt adatok t�ls�gosan �rt�kesek ahhoz, hogy egy t�z eset�n el�zzanak �s haszn�lhatatlann� v�ljanak.





Mi a k�l�nbs�g egy �rack mounted� �s egy �blade� szerver k�z�tt?
A blade server is a stripped-down server computer with a modular design optimized to minimize the use of physical space and energy. Blade servers have many components removed to save space, minimize power consumption and other considerations, while still having all the functional components to be considered a computer.

Mi a k�l�nbs�g egy desktop g�p �s egy szerver k�z�tt?
a szerver alaplapok j�val t�bb mem�ri�t tudnak kezelni, m�g egy �tlag PC 32-64 GB RAM-ot kezel csak addig a szerverek ak�r 500-800 GB RAM-ot is tudnak kezelni.
hibajav�t�s. Szerverbe t�bbnyire ecc registered fully buffered mem�ri�kat lehet tenni, aminek az �ra 2x 3x magasabb az �tlag mem�ri�n�l. A PC-k 90%-a az ilyen mem�ri�kkal nem indul el.
A merevlemezek gyakorlatilag univerz�lisak, a szerver kateg�ri�s HDD/SSD-t is lehet PC ben haszn�lni, ugyanakkor az �ruk 2x magasabb, mint az �tlag felhaszn�l�sra sz�nt modelleknek.
Nagyon fontos alkatr�sz a RAID k�rtya, amit a legt�bb PC-n is megtal�lhatunk az alaplapra integr�lva.
H�t�s: A PC-ket a lak�sban haszn�ljuk �s egy-k�t extr�m felhaszn�l�t�l eltekintve, ritk�n terhelj�k �ket 20-40% n�l jobban. Ez�rt a h�t�st �gy tervezik meg, hogy a lehet� leghalkabb legyen. A szerverek viszont folyamatosan magas terhel�ssel �zemelnek, �pp ez�rt, nagyon er�s ventil�torokat haszn�lnak benn�k. A hangjuk maxim�lis fordulatsz�mn�l egy porsz�v� hangj�val vetekszik.
�r: Az �rk�l�nbs�get az adja, hogy a szervereket �gy tervezik, hogy �veket tudjanak non-stop menni. Ez a felhaszn�lt anyagok k�zti k�l�nbs�gb�l ad�dik.
Oktat� anyag a HPE blade technol�gi�n kereszt�l mutatta be blade rendszer fel�p�t�s�t. Keresd meg ennek a megfelel�j�t a DELL eset�ben!

DELL EMC Poweredge .
