# Code zur Vorlesung

Dieser Ordner enthält Code, der in den Vorlesungen entwickelt
oder der als Ergänzung bereitgestellt wird.

## Struktur

Das gesamte Repository ist ein Maven-Projekt mit einer [`pom.xml` im Wurzelverzeichnis](../pom.xml).

Dieser Ordner ist der Quell-Ordner dieses Projekts und er hat daher die entsprechende Struktur:

* `src/main/java/algods`: Hier befindet sich der Java-Code.
* `src/main/test/algods`: Hier befinden sich die Tests zum Java-Code.

Unterhalb von `java` gibt es jeweils Pakete für den Code, der direkt in der Vorlesung entsteht
sowie für Beispielcode, der separat bereitgestellt wird.

Der Vorlesungs-Code ist in weitere Unterpakete unterteilt,
die den jeweiligen Tag der Vorlesung repräsentieren
und darunter thematisch weiter aufgeteilt sind.

Der sonstige Beispielcode ist direkt nach Thema gruppiert.

*Anmerkung:*

Da der Code aus den Vorlesungen größtenteils während der Vorlesungen im Dialog entsteht,
kann er ggf. unvollständig oder unübersichtlich sein.
Alles in diesem Ordner wird hier zunächst genau so abgelegt,
wie es in den Vorlesungen entsteht.

Hinterher kann es ggf. etwas umsortiert und kommentiert werden.
Größere Umstrukturierungen wird es aber nicht geben, da die Sammlung
einen Dokumentationscharakter haben soll.
