# A programozás módszertana I. Pót ZH - C1 csoport

A dolgozathoz csak és kizárólag a saját, korábban megírt kódok használhatóak. Minden más segítég tilos!

## Feladatok

0. (0 pont) Klónozza jelen repository-t és ossza meg a saját GitHub fiókjában:
    - Code / URL másolása
    - File / New / Project from Version Control...
    - Git / GitHub / Share Project on GitHub (a repository nevét ne változtassa meg)
1. (2 pont) Készítsen egy ***Matrix*** osztályt. Az osztályban írja meg a ***countNumbersDivisibleBySeven*** és a
   ***columnsWithMax*** metódusokat. Mindkét metódus meghatározza egy 2-dimenziós egész mátrixban: előbbi a 7-tel
   osztható számok számát, utóbbi azon oszlopok indexét, amelyben megtalálható a mátrix maximuma!
2. (4 pont) Implementálja a ***Chef*** osztályt, ami éttermi fogások neveit és árait kezeli (recipe, price).
   Az osztálynak rendelkeznie kell egy ***newRecipe*** (új fogás hozzáadása adott árral), egy ***removeRecipe***
   (adott elem törlése) és egy ***getMenu*** (egy String-ben visszaadja az aktuálisan tárolt fogások adatait:
   <fogásnév> <ár> formátumban) metódussal.
3. (2 pont) Származtasson egy ***Waiter*** osztályt a ***Chef*** osztályból, melynek ***modifyPrice***
   metódusával lehessen módosítani a ***Chef*** fogásainak árait.

## Beadás módja

A feladatok megoldására 1,5 óra áll rendelkezésre. A megoldásokat az adott határidőn belül fel kell tölteni
a saját GitHub repository-jukba. A commit and push művelet során commit message-ként használja a neptunkódját.

## Értékelés

* 0-4 pont: Elégtelen (1)
* 5 pont: Elégséges (2)
* 6 pont: Közepes (3)
* 7 pont: Jó (4)
* 8 pont: Jeles (5)