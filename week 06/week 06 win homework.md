Telep�ts�nk DHCP-t_ezt el�g kedden megcsin�lni

feltelepitve �r�n

Telep�ts�nk DNS-t_ezt el�g kedden megcsin�lni

feltelepitve �r�n
AD DS-el automatikusan feltelep�lt.

Milyen porton kommunik�l a DNS szerver?
53

Mi a Kerberos?

Egy sz�m�t�g�pes h�l�zati hiteles�t�si protokoll, amely egy nem biztons�gos h�l�zaton kereszt�l �gy 
teszi lehet�v� a csom�pontok k�z�tti kommunik�ci�t, hogy biztons�gos m�don igazolj�k 
szem�lyazonoss�gukat egym�s fel�.

Mik az FSMO szerepk�r�k? Melyek a tartom�nyi �s melyek az erd�szint� szerepk�r�k? Keress�k meg 
grafikus fel�leten az �t szerepk�rt! Hogyan tudjuk lek�rdezni parancssorb�l?
RID Master
PDC Emulator
Infrastructure Master
Domain Naming Master
Schema Master

Windows 2016/Server Manager/Active Directory Users and Computers \ (domain name) jobb eg�rgomb: 
operation masters: (RID, PDC, Infrastructure)
Domain Naming Master: Active Dir. Domains and Trusts / Operation Master
(regsvr32 schmmgmt.dll) ut�n mmc / add snap-in / Active Directory Schema /Operation Masters.
parancssor: netdom query fsmo

Mit tudunk konfigur�lni a DNS Forwaders f�l�n? Keress�nk itt haszn�lhat� DNS szervereket (IP c�meket)
Fel lehet venni k�ls� DNS servereket, melyek n�vfelold�shoz haszn�lhat�ak. A Host t�zfala nem enged ki 
semmit, csak speci�lis k�ls� - feh�rlista alapj�n k�sz�lt list�ban szerepl� - DNS serverekre. Pl. 8.8.8.8-as 
google DNS-t sem engedi.

DHCP szerveren hogyan tudunk a kiosztand� IP c�mtartom�nyb�l kiz�rni kiadhat� IP-ket? Milyen 
esetekben c�lszer� haszn�lni ezt a lehet�s�get?
Pl. fix ip c�mmel rendelkez� h�l�zati nyomtat�kon, egy�b h�l�zati eszk�z�k�n melyekn�l fontos, hogy a 
h�l�zat t�bbi tagja mindig ugyanott �rhesse el.

K�rdezz�k le egy tetsz�leges domain SOA, A �s MX rekordj�t.
nslookup -q=MX fnxs.hu nslookup -q=SOA fnxs.hu nslookup -q=A fnxs.hu

Mi a Glob�lis katal�gus?

Tartom�nyvez�rl�i szerepk�r. A GC a saj�t tartom�ny�n k�v�l erd� szinten t�rolja a c�mt�r �sszes 
objektum�nak alapadatait, el�rhet�s�g�nek inform�ci�it.

Miket t�rol a SYSVOL mappa? Ha t�bb DC-nk is van melyiken tal�ljuk meg?

A kliens sz�m�t�g�pek ind�t�s , bejelentkez�s k�zben let�lt�tt f�jljat tartalmazza (csoport h�zirendek, 
bejelentkez�si szkriptek.) Minden egyes DC-n.
