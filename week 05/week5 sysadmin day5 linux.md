Milyen gyártói elõírások vannak CentOS 8 esetében a hardware-re vonatkozóan (minimal requirements és compatibility)?
x86_64 , arm64,ppc64Ie architektúra kompatibilitás.
min. 10 GB szabad hely, min 1.5GB memória/logical CPU
Töltsd le a CentOS 8.2.2004 install médiát
Done
Készíts boot-olható CentOS 8.2.2004 operációs rendszer installációs pendrive-ot!
Nem tudom végrehajtani , nincs szabad USB eszköz.
Windows alatt spec. sw (pl rufus?) használható ami az iso fájlt képes GPT partícióképes módon USB-re írni, linux alatt dd használható írásra közv. eszközre.
pl. : sudo dd bs=4M if=centos8.iso of=/dev/sdb conv=fdatasync
Mi a különbség a "yum" és az "rpm" paramncsokkal való installálások között?
rpm-nek közvetlenül meg kell adni a telepítésre szánt csomagot, yum intelligens csomagkezelõ rendszer adott forrásból maga letölti és telepíti a csomagot.
Keresd ki, hogy mennyibe kerülne egy 2x16 core-os Intel Xeon processzoros gépre RedHat Enterprise Linux operációs rendszer vásárlása 1 év support-tal
Self-support (1 year) $349
Standard (1 year) $799
Premium (1 year) $1,299
Mi a feltétele annak, hogy DHCP-s IP cím beállítást használjunk a Linux szerverünk installálása során?
DHCP server elérhetõ legyen a hálózaton installálás során.
Miért térjünk át statikus IP cím használatára?
Hogy a server mindig ugyanazon a címen legyen elérhetõ.
Installálás során miért nem kérünk NTP-n keresztüli idõszinkronizálást, miért kell kézzel beállítani a dátumot és a pontos idõt?
Mert ilyenkor még többnyire nincs elérhetõ hálózat.
Milyen megszorítások vannak Linux operációs rendszert használó gép esetén a host nevére?
Ne legyen olyan, amit ua. hálózatban más gép már használ, legyen name.domain formátumú.
Lehet-e LVM disk területen a /boot és /boot/efi?
Nem ajánlott. A boot folyamatot nagyon megbonyolítja.

Lehet-e swap partíció LVM disk területen?
Igen.
Milyen file rendszereket használhatunk és használunk?
ext2, ext3/4, xfs, tmpfs, reiserfs, reiser4, stb.
