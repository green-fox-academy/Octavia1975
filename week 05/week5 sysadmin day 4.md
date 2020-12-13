Lehet-e grafikus felület nélkül installálni, használni, üzemeltetni MS Windows operációs rendszert?
Asztali rendszereket nem lehet, serverek közül az ún. "Core" verziókat , melyek GUI nélkül települnek.
Lehet-e grafikus felület nélkül installálni, használni, üzemeltetni Linux operációs rendszert?
Igen.
Lehet-e MS Windows Server-en futó alkalmazást futtatni Linux operációs rendszeren?
wine, vagy 64 bites alkalmazás esetén wine64 alkalmazásból esetleg, illetve amelyik alkalmazásból van linuxos (ELF binary) verzió, azt igen.
Szükséges-e driver installálása MS Windows OS-ek alatt?
Igen, mivel a Microsoft Windows telepítõje korlátozott mennyiségû drivert tartalmaz.
Szükséges-e driver installálása Linux OS-ek alatt?
Néha. De ezek nem "driver"-ek, hanem úgynevezett kernel modulok. Ezek lehetnek nyílt forráskódúak, vagy zártak. Utóbbi esetben 2 részbõl állnak, egy nyílt forráskódú részbõl, ami a mellette levõ zárt bináris modult ráilleszti a használt kernelre. Ilyen zárt modul pl. a vmware (vmnet) kernel modulja, vagy az nvidia zárt bináris meghajtóprogramja. Létezik a DKMS modulillesztési alrendszer, ami ezeket a külsõ modulokat automatikusan "hozzáfordítja a kernelhez", már a kernel verzió telepítésekor. amennyiben a külsõ "idegen" modul DKMS kompatibilis.

Nyílt forráskódú "driver" - kernel modul - esetén elõfordulhat hogy a kernelt egy speciális patch-el elõ kell készíteni a kernelmodul lefordításához,telepítéséhez. Ilyen pl. a nagyon régi < 2000 elõtt gyártott régi tunerkártyáknál fordulhat elõ, ahol a mûködéshez szükséges bttv függvénykönyvtárat már eltávolították a linux kernelbõl mert kernelen belül senki nem használta, ezt vissza kellett tenni, és utána lehetett csak a lirc_gpio drivert lefordítani, és telepíteni ami mûködtette a régi tunerkártya távirányítóját.

MS Windows alatt a registry-t milyen alkalmazással lehet menedzselni?
regedit.exe, regedt32.exe, ill. egyes beállításai a gpedit.msc (csoportházirend-szerkesztõ)-vel is kezelhetõek.
