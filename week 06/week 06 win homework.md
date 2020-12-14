Telepítsünk DHCP-t_ezt elég kedden megcsinálni

feltelepitve órán

Telepítsünk DNS-t_ezt elég kedden megcsinálni

feltelepitve órán
AD DS-el automatikusan feltelepült.

Milyen porton kommunikál a DNS szerver?
53

Mi a Kerberos?

Egy számítógépes hálózati hitelesítési protokoll, amely egy nem biztonságos hálózaton keresztül úgy 
teszi lehetõvé a csomópontok közötti kommunikációt, hogy biztonságos módon igazolják 
személyazonosságukat egymás felé.

Mik az FSMO szerepkörök? Melyek a tartományi és melyek az erdõszintû szerepkörök? Keressük meg 
grafikus felületen az öt szerepkört! Hogyan tudjuk lekérdezni parancssorból?
RID Master
PDC Emulator
Infrastructure Master
Domain Naming Master
Schema Master

Windows 2016/Server Manager/Active Directory Users and Computers \ (domain name) jobb egérgomb: 
operation masters: (RID, PDC, Infrastructure)
Domain Naming Master: Active Dir. Domains and Trusts / Operation Master
(regsvr32 schmmgmt.dll) után mmc / add snap-in / Active Directory Schema /Operation Masters.
parancssor: netdom query fsmo

Mit tudunk konfigurálni a DNS Forwaders fülön? Keressünk itt használható DNS szervereket (IP címeket)
Fel lehet venni külsõ DNS servereket, melyek névfeloldáshoz használhatóak. A Host tûzfala nem enged ki 
semmit, csak speciális külsõ - fehérlista alapján készült listában szereplõ - DNS serverekre. Pl. 8.8.8.8-as 
google DNS-t sem engedi.

DHCP szerveren hogyan tudunk a kiosztandó IP címtartományból kizárni kiadható IP-ket? Milyen 
esetekben célszerû használni ezt a lehetõséget?
Pl. fix ip címmel rendelkezõ hálózati nyomtatókon, egyéb hálózati eszközökön melyeknél fontos, hogy a 
hálózat többi tagja mindig ugyanott érhesse el.

Kérdezzük le egy tetszõleges domain SOA, A és MX rekordját.
nslookup -q=MX fnxs.hu nslookup -q=SOA fnxs.hu nslookup -q=A fnxs.hu

Mi a Globális katalógus?

Tartományvezérlõi szerepkör. A GC a saját tartományán kívül erdõ szinten tárolja a címtár összes 
objektumának alapadatait, elérhetõségének információit.

Miket tárol a SYSVOL mappa? Ha több DC-nk is van melyiken találjuk meg?

A kliens számítógépek indítás , bejelentkezés közben letöltött fájljat tartalmazza (csoport házirendek, 
bejelentkezési szkriptek.) Minden egyes DC-n.
