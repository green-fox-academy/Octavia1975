Workshop

a k�pek az lms verzi�ban ban vannak!

Tesztelj�k SFTP klienssel a bel�p�st �s list�zzuk a k�nyvt�r tartalm�t!

WINSCP programot haszn�ltuk hozz�
kell hozz� egy sftp kliens ami az ssh nk is lehet 22 porton van
mkdir .ssh
chmod 700 .ssh
/.ssh  bemegy�nk 
kulcsgener�l�s 
ss-keygen -t dsa lefuttatjuk pasword n�lk�l     legener�ljuk a DSA �s RSA kulcsot
cat id_dsa.pub > authorized_keys
cat id_rsa.pub >> authorized_keys
bakar�lnek  az .ssh /authorized_keys f�jlba




Tesztelj�k SFTP klienssel egy file felt�lt�s�t �s let�lt�s�t!
 
k�p
 
Install�ljunk FTP szervert, konfigur�ljuk be!

yum install vsftpd.x86_64
systemctl enable vsftpd
systemctl start vsftpd
systemctl status vsftpd
cd /etc/vsftpd			ls -als
cat vsftpd.conf
nano vsftpd.conf  (userlist enable YES )  
chmod 700 /home        744 olvas�si jog     755 beenged a k�nyvt�rba futtat�si jog
Total Commander 21 port

Tesztelj�k FTP klienssel a bel�p�st �s list�zzuk a k�nyvt�r tartalm�t!
 k�p
 

Ha nem siker�lt, akkor mit kellett m�g m�dos�tani a rendszeren!

nemtudom nem siker�lt bel�pni mert h�l�zati gondom van

Tesztelj�k FTP klienssel egy file felt�lt�s�t �s let�lt�s�t!

nem siker�lt nincs h�l�zatom 

Install�ljunk NFS szervert, konfigur�ljuk be!

yum list | grep nfs 
yum install nfs-server.service
systemctl enable nfs-server.service
systemctl start nfs-server.service

 /etc/exports f�jl
/DATA/mongoDB
megosztom valakivel a k�nyvt�rat 
etc/fstab f�jlba beirom a mountol�st
k�p
 

NFS szerver szolg�ltat�sk�nt a /var/lib k�nyvt�rat szolg�ltassuk ki b�rmely szerver sz�m�ra 
read only m�dban, konfigur�ljuk be!

/etc/exports f�jl
/var/lib		chmod 744 lib
megosztom valakivel a k�nyvt�rat 
etc/fstab f�jlba beirom a mountol�st ami benne van az aut�matikusan elindul


NFS klienst install�ljunk a szerver�nkre!
windows klienst haszn�lunk
 



Mountoljuk fel a saj�t el�z� NFS megoszt�s�t!

Tesztelj�k az olvas�st!
chmod 744

Tesztelj�k az �r�st!
chmod 755 




