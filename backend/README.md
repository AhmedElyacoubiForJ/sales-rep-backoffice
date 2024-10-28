# Backend für Sales-Rep-Backoffice

## Projektübersicht
Dieses Projekt stellt das Backend für eine Backoffice-Anwendung bereit, die dem Management eine Übersicht über Vertriebsdaten und -berichte bietet. Die Anwendung unterstützt das Management dabei, fundierte Entscheidungen auf Basis von Vertriebskennzahlen zu treffen.

## Ist-Zustand
- **ER-Modell:** Das Entity-Relationship-Modell (ER) ist bereits vorgegeben.
- **Vorhandene Daten:** Die Daten sind vollständig vorhanden und müssen nicht neu erstellt werden.
- **Aufgabe:** Die primäre Aufgabe in diesem Stadium ist es, das bestehende ER-Modell in Spring JPA-Entities umzuwandeln und die notwendigen Repositories für den Datenzugriff zu erstellen.

## Geplante Realisierung
### Funktionen
- **JPA-Entitäten und Repositories:** Umsetzung des ER-Modells in Spring JPA-Entities und Erstellung entsprechender Repositories für den Datenzugriff.
- **Service-Schicht:** Definition und Implementierung von Service-Interfaces für die Geschäftslogik, um eine saubere Trennung zwischen Datenzugriff und Logik sicherzustellen.
- **REST-API-Controller:** Bereitstellung von Endpunkten zur Bereitstellung der Vertriebs- und Performance-Daten für die Frontend-Anwendung.
- **Spring Security (geplant):** Die Implementierung von Sicherheitsfunktionen mit Spring Security wird in einem späteren Schritt erfolgen, um die Authentifizierung und Autorisierung zu gewährleisten.

## Technischer Überblick
- **Technologien:** Spring Boot, Spring JPA, Maven
- **Architektur:** Mehrschichtige Architektur (Controller, Service, Repository)

## Standard-README-Inhalte
### Installation
1. **Klonen des Repositories**
   ```bash
   git clone <repository-url>
   cd sales-rep-backoffice
   ```
2. **Backend-Setup**
   ```bash   
   cd backend
   ./mvnw spring-boot:run
   ```
3. **Endpunkte (Beispiele)**
   > Methode	Endpunkt	Beschreibung
   > GET	/api/reports	Liefert Berichte und Analysen
   > GET	/api/sales/{id}	Details zu einem bestimmten Vertriebsmitarbeiter
   > POST	/api/notifications	Fügt neue Benachrichtigungen hinzu

4. **Autoren**
   - A. El Yacoubi