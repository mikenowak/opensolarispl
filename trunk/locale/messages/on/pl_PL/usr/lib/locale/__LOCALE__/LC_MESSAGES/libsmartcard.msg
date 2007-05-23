$ 
$ CDDL HEADER START
$ 
$ The contents of this file are subject to the terms of the
$ Common Development and Distribution License (the "License").
$ You may not use this file except in compliance with the License.
$ 
$ You can obtain a copy of the license at src/OPENSOLARIS.LICENSE
$ or http://www.opensolaris.org/os/licensing.
$ See the License for the specific language governing permissions
$ and limitations under the License.
$ 
$ When distributing Covered Code, include this CDDL HEADER in each
$ file and include the License file at src/OPENSOLARIS.LICENSE.
$ If applicable, add the following below this CDDL HEADER, with the
$ fields enclosed by brackets "[]" replaced with your own identifying
$ information: Portions Copyright [yyyy] [name of copyright owner]
$ 
$ CDDL HEADER END
$ 
$ Copyright 1999-2002 Sun Microsystems, Inc.  All rights reserved.
$ Use is subject to license terms.
$
$ ident	"@(#)libsmartcard.msg	1.5	02/02/24 SMI"
$
$
$ ----- NOTE FOR TRANSLATORS -----
$
$ These messages are made available in libsmartcard.so for SCF_strerror()
$ and OCF_strerror(), APIs similar in purpose to the libc strerror() function.
$ These messages all describe various error/status codes, and should be
$ terse messages expected in logfiles or for developers/administrators.

$ Set 1 contains messages for the SCF interfaces, via SCF_strerror().
$set 1

$ SCF_STATUS_SUCCESS
$ @EN@ Success
1 Erfolgreich

$ SCF_STATUS_FAILED
$ @EN@ Internal/general error
2 Interner/allgemeiner Fehler

$ SCF_STATUS_BADERRORCODE
$ @EN@ Invalid error code
3 Ungültiger Fehlercode

$ SCF_STATUS_BADARGS
$ @EN@ Invalid argument supplied
4 Das angegebene Argument ist ungültig

$ SCF_STATUS_BADHANDLE
$ @EN@ The object handle is not valid
5 Das Objekt-Handle ist ungültig

$ SCF_STATUS_BADTERMINAL
$ @EN@ Unknown terminal name
6 Unbekannter Terminalname

$ SCF_STATUS_COMMERROR
$ @EN@ Connection to server lost
7 Verbindung zum Server verloren

$ SCF_STATUS_CARDLOCKED
$ @EN@ Access denied due to card lock
8 Zugriff wegen Kartensperrung verweigert

$ SCF_STATUS_DOUBLELOCK
$ @EN@ Cannot lock card twice
9 Karte kann nicht zweimal gesperrt werden

$ SCF_STATUS_NOCARD
$ @EN@ No card found in terminal
10 Im Terminal konnte keine Karte gefunden werden

$ SCF_STATUS_CARDREMOVED
$ @EN@ The requested card has been removed
11 Die gewünschte Karte wurde entfernt

$ SCF_STATUS_TIMEOUT
$ @EN@ Timeout expired
12 Zeitüberschreitung abgelaufen

$ SCF_STATUS_NOSPACE
$ @EN@ Reply APDU too big for buffer
13 Antwort-APDU zu groß für den Puffer

$ SCF_STATUS_UNKNOWNPROPERTY
$ @EN@ Property name not found
14 Eigenschaftenname nicht gefunden

$ SCF_STATUS_NOLISTENER
$ @EN@ No matching listener found
15 Kein passender Überwachungsdienst gefunden


$ Set 2 contains messages for the OCF interfaces, via ocf_strerror().
$set 2

$ OCF_Success
$ @EN@ Success
1 Erfolgreich

$ OCF_NoCard
$ @EN@ No Card Present
2 Keine Karte vorhanden

$ OCF_CardError
$ @EN@ Error on Card
3 Kartenfehler

$ OCF_ReaderError
$ @EN@ Error on reader
4 Lesegerät-Fehler

$ OCF_ParameterError
$ @EN@ An Invalid Parameter was set
5 Es wurde ein ungültiger Parameter festgelegt.

$ OCF_OperationTimeout
$ @EN@ Operation Timed out
6 Zeitüberschreitung bei Vorgang

$ OCF_ResourceUnavailable
$ @EN@ Unavailable Resource
7 Ressource nicht verfügbar

$ OCF_CardLocked
$ @EN@ Card is Locked
8 Karte ist gesperrt

$ OCF_DuplicateClient
$ @EN@ Duplicate Client
9 Doppelter Client

$ OCF_DuplicateHandler
$ @EN@ Duplicate Handler
10 Doppelter Handler

$ OCF_DuplicateEvent
$ @EN@ Duplicate Event
11 Doppeltes Ereignis

$ OCF_VerifyError
$ @EN@ Verfication failed
12 Überprüfung fehlgeschlagen

$ OCF_PINAlreadySet
$ @EN@ Pin already set
13 Pin bereits festgelegt

$ OCF_NoPermission
$ @EN@ No permission for this operation
14 Keine Berechtigung für diesen Vorgang

$ OCF_UnknownResource
$ @EN@ Requested resource unknown
15 Angeforderte Ressource unbekannt

$ OCF_EncodingError
$ @EN@ Encode/Decode error
16 Verschlüsselungs-/Entschlüsselungsfehler

$ OCF_ServerError
$ @EN@ Error in communication with server
17 Fehler bei Kommunikation mit Server

$ OCF_VersionMismatch
$ @EN@ Client/Server version mismatch
18 Client/Server-Versionen stimmen nicht überein.

$ OCF_DoubleLock
$ @EN@ Already has a lock
19 Sperre bereits vorhanden

$ OCF_Exception
$ @EN@ Exception from server
20 Ausnahme vom Server

$ OCF_NoSuchProperty
$ @EN@ No such property defined
21 Es wurde keine derartige Eigenschaft definiert.

$ OCF_InvalidClientHandle
$ @EN@ Invalid client handle
22 Ungültiges Client-Handle

$ OCF_InvalidCardHandle
$ @EN@ Invalid card handle
23 Ungültiges Karten-Handle

$ OCF_InvalidEventHandle
$ @EN@ Invalid event handle
24 Ungültiges Ereignis-Handle

$ OCF_NoReadersConfigured
$ @EN@ No readers configured
25 Es wurden keine Lesegeräte konfiguriert.

$ OCF_NoCardsConfigured
$ @EN@ No cards configured
26 Es wurden keine Karten konfiguriert.

$ OCF_AuthenticationError
$ @EN@ Authentication error
27 Authentisierungsfehler

$ OCF_AuthenticationFailed
$ @EN@ Authentication failed
28 Die Authentisierung ist fehlgeschlagen.

$ OCF_AuthOp
$ @EN@ Authentication operation
29 Authentisierungsvorgang

$ OCF_InvalidPin
$ @EN@ Invalid PIN
30 Ungültige PIN

$ OCF_InvalidPassword
$ @EN@ Invalid Password
31 Ungültiges Passwort

$ OCF_UnsupportedAuthMech
$ @EN@ Unsupported authentication
32 Nicht unterstützte Authentisierung

$ OCF_UnsupportedAuthMech
$ @EN@ Unknown Error
33 Unbekannter Fehler
