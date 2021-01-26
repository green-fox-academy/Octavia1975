Workshop

a képek az lms verzióban ban vannak!

Teszteljük SFTP klienssel a belépést és listázzuk a könyvtár tartalmát!

WINSCP programot használtuk hozzá
kell hozzá egy sftp kliens ami az ssh nk is lehet 22 porton van
mkdir .ssh
chmod 700 .ssh
/.ssh  bemegyünk 
kulcsgenerálás 
ss-keygen -t dsa lefuttatjuk pasword nélkül     legeneráljuk a DSA és RSA kulcsot
cat id_dsa.pub > authorized_keys
cat id_rsa.pub >> authorized_keys
bakarülnek  az .ssh /authorized_keys fájlba




Teszteljük SFTP klienssel egy file feltöltését és letöltését!
 
kép
 
Installáljunk FTP szervert, konfiguráljuk be!

yum install vsftpd.x86_64
systemctl enable vsftpd
systemctl start vsftpd
systemctl status vsftpd
cd /etc/vsftpd			ls -als
cat vsftpd.conf
nano vsftpd.conf  (userlist enable YES )  
chmod 700 /home        744 olvasási jog     755 beenged a könyvtárba futtatási jog
Total Commander 21 port

Teszteljük FTP klienssel a belépést és listázzuk a könyvtár tartalmát!
 kép
 

Ha nem sikerült, akkor mit kellett még módosítani a rendszeren!

nemtudom nem sikerült belépni mert hálózati gondom van

Teszteljük FTP klienssel egy file feltöltését és letöltését!

nem sikerült nincs hálózatom 

Installáljunk NFS szervert, konfiguráljuk be!

yum list | grep nfs 
yum install nfs-server.service
systemctl enable nfs-server.service
systemctl start nfs-server.service

 /etc/exports fájl
/DATA/mongoDB
megosztom valakivel a könyvtárat 
etc/fstab fájlba beirom a mountolást
kép
 

NFS szerver szolgáltatásként a /var/lib könyvtárat szolgáltassuk ki bármely szerver számára 
read only módban, konfiguráljuk be!

/etc/exports fájl
/var/lib		chmod 744 lib
megosztom valakivel a könyvtárat 
etc/fstab fájlba beirom a mountolást ami benne van az autómatikusan elindul


NFS klienst installáljunk a szerverünkre!
windows klienst használunk
 



Mountoljuk fel a saját elõzõ NFS megosztását!

Teszteljük az olvasást!
chmod 744

Teszteljük az írást!
chmod 755 




