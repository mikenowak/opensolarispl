/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at usr/src/OPENSOLARIS.LICENSE
 * or http://www.opensolaris.org/os/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at usr/src/OPENSOLARIS.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */
/*
 *
 * ident	"@(#)pmResources.java	1.19	06/06/02 SMI"
 *
 * Copyright 2005 Sun Microsystems, Inc.  All rights reserved.
 * Use is subject to license terms.
 *
 *
 * pmResources.java
 * Localizable resource strings
 */

package com.sun.admin.pm.client;

import java.util.*;

/*
 * In accordance with the ResourceBundle pattern,
 * each line in this file defines a tuple containing
 * two strings:
 *	string 1 is the key used by the app -- DO NOT LOCALIZE
 *	string 2 is the string to be localized
 *       
 * For example, in the tuple
 *	{"info_name", "Solaris Print Manager"}
 *
 *       "info_name" is the resource key that must 
 * 		          not be modified in any way
 *
 *       "Solaris Print Manager" is the corresponding
 *                        text to be localized
 */

public class pmResources___LOCALE__ extends ListResourceBundle {
    static final Object[][] pmBundlecontents = {

	/* 
	 * Descriptive strings used in the 'About' dialog
	 */
	//@EN@ Solaris Print Manager
        {"info_name", "Solaris Druckmanager"},
	//@EN@ Version 1.0
        {"info_version", "Version 1.0"},
	//@EN@ Authors: Wendy Phillips
	{"info_authors", "Autoren: Wendy Phillips"},

	// Note: the copyright notice is displayed on two lines.
	//@EN@ Copyright \251 
	{"info_copyright1", "Copyright \251 "  /*@TMC@ NEW MESSAGE */  },
	/* JSTYLED */
	//@EN@  Sun Microsystems, Inc.  All rights reserved.  Use is subject to license terms. Third-party software, including font technology, is copyrighted and licensed from Sun suppliers.  Sun, Sun Microsystems, the Sun logo and Solaris are trademarks or registered trademarks of Sun Microsystems, Inc. in the U.S. and other countries.  Federal Acquisitions:  Commercial Software - Government Users Subject to Standard License Terms and Conditions.
	{"info_copyright2", " Sun Microsystems, Inc. Alle Rechte vorbehalten.  Die Nutzung unterliegt den Lizenzbedingungen. Die Software anderer Hersteller, einschlie\u00dflich der Schriften-Technologie, ist urheberrechtlich gesch\u00fctzt und von Lieferanten von Sun lizenziert.  Sun, Sun Microsystems, das Sun-Logo und Solaris sind Warenzeichen oder eingetragene Warenzeichen von Sun Microsystems, Inc., in den Vereinigten Staaten und in bestimmten anderen L\u00e4ndern.  Federal Acquisitions:  Commercial Software - Government Users Subject to Standard License Terms and Conditions."  /*@TMC@ NEW MESSAGE */  },


	/*
	 * Main window title, the application name
	 */
	//@EN@ Solaris Print Manager
	{"Solaris.Print.Manager", "Solaris Druckmanager"},


        /*
         * Main window column labels for printer list
         */
	//@EN@ Printer Name
        {"Printer.Name", "Druckername"},
	//@EN@ Printer Server
        {"Printer.Server", "Druckerserver"},
	//@EN@ Description
        {"Description", "Beschreibung"},


	/*
	 * Main window menu titles and mnemonics
	 */
	//@EN@ Print Manager
        {"Print.Manager", "Druckmanager"},
	//@EN@ M
        {"Print.Manager.mnemonic", "M"},

	//@EN@ Printer
        {"Printer", "Drucker" },
	//@EN@ P
        {"Printer.mnemonic", "D"},

	//@EN@ Tools
        {"Tools", "Tools" },
	//@EN@ T
        {"Tools.mnemonic", "T"},

	//@EN@ Help
	{"Help", "Hilfe"},
	//@EN@ H
	{"Help.mnemonic", "H"},


	/*
	 * Main window data labels
	 */
	//@EN@ Default Printer:
        {"Default.Printer:", "Standarddrucker:"},
	//@EN@ Domain:
        {"Domain:", "Domain:"},
	//@EN@ Host:
	{"Host:", "Host:"},


	/*
	 * 'Printer Manager' menu item labels and mnemonics
	 */
	//@EN@ Select Naming Service...
        {"Select.Naming.Service", "Namen-Service w\u00e4hlen..."},
	//@EN@ N
        {"Select.Naming.Service.mnemonic", "N"},

	//@EN@ Show Command-Line Console
        {"Show.Command-Line.Console", "Befehlszeilenkonsole anzeigen"},
	//@EN@ L
        {"Show.Command-Line.Console.mnemonic", "k"},

	//@EN@ Confirm All Actions
        {"Confirm.All.Actions", "Alle Aktionen best\u00e4tigen"},
	//@EN@ C
        {"Confirm.All.Actions.mnemonic", "s"},

	//@EN@ Use PPD files
	{"Use.PPD.files", "PPD-Dateien verwenden"},


	//@EN@ Exit
	{"Exit", "Beenden"},
	//@EN@ X
	{"Exit.mnemonic", "B"},

	/*
	 * 'Printer' menu item labels and mnemonics
	 */
	//@EN@ Add Access to Printer...
	{"Add.Access.to.Printer...", "Zugriff auf Drucker hinzuf\u00fcgen..."},
	//@EN@ A
	{"Add.Access.to.Printer.mnemonic", "Z"},

	//@EN@ New Attached Printer...
        {"New.Attached.Printer...", "Neuer angeschlossener Drucker"},
	//@EN@ T
        {"New.Attached.Printer.mnemonic", "g"},

	//@EN@ New Network Printer...
        {"New.Network.Printer...", "Neuer Netzwerkdrucker..."},
	//@EN@ N
        {"New.Network.Printer.mnemonic", "N"},

	//@EN@ Modify Printer Properties...
        {"Modify.Printer.Properties...", "Druckereigenschaften \u00e4ndern..."},
	//@EN@ M
        {"Modify.Printer.Properties.mnemonic", "e"},

	//@EN@ Delete Printer...
        {"Delete.Printer...", "Drucker l\u00f6schen..."},
	//@EN@ D
        {"Delete.Printer.mnemonic", "l"},


	/*
	 * 'Tools' menu item labels
	 */
	//@EN@ Find Printer...
	{"Find.Printer", "Drucker suchen..."},
	//@EN@ F
	{"Find.Printer.mnemonic", "s"},


	/*
	 * 'Help' menu item labels
	 */
	//@EN@ Overview
        {"Overview", "\u00dcbersicht"},
	//@EN@ O
        {"Overview.mnemonic", "c"},

	//@EN@ On Help
        {"On.Help", "Zur Hilfe"},
	//@EN@ H
        {"On.Help.mnemonic", "H"},

	//@EN@ About Print Manager...
	{"About.Print.Manager", "Info zum Druckmanager..."},
	//@EN@ A
	{"About.Print.Manager.mnemonic", "I"},



	/*
	 * 'Select Naming Service' dialog title
	 */
	//@EN@ Solaris Print Manager: Select Naming Service
        {"SPM:Select.Naming.Service",
                "Solaris Druckmanager: Namen-Service w\u00e4hlen"},


	/*
	 * 'Command-Line Console' dialog title
	 */
	//@EN@ Solaris Print Manager: Command-Line Console
        {"SPM:Command-Line.Console",
                "Solaris Druckmanager: Befehlszeilenkonsole"},


	/*
	 * 'Delete Printer' confirmation dialog title
	 */
	//@EN@ Solaris Print Manager: Delete Printer
        {"SPM:Delete.Printer", "Solaris Druckmanager: Drucker l\u00f6schen"},


	/*
         * 'Add Access to Printer' dialog title
         */
	//@EN@ Solaris Print Manager: Add Access to Printer
        {"SPM:Add.Access.To.Printer",
                "Solaris Druckmanager: Zugriff auf Drucker hinzuf\u00fcgen"},


	/*
         * 'Add Attached Printer' dialog title
         */
	//@EN@ Solaris Print Manager: New Attached Printer
        {"SPM:New.Attached.Printer",
                "Solaris Druckmanager: Neuer angeschlossener Drucker"},


	/*
         * 'Add Network Printer' dialog title
         */
	//@EN@ Solaris Print Manager: New Network Printer
        {"SPM:New.Network.Printer",
                "Solaris Druckmanager: Neuer Netzwerkdrucker"},


	/*
         * 'Modify Printer Properties' dialog title
         */
	//@EN@ Solaris Print Manager: Modify Printer Properties
        {"SPM:Modify.Printer.Properties",
                "Solaris Druckmanager: Druckereigenschaften \u00e4ndern"},


	/*
         * 'Find Printer' dialog title
         */
	//@EN@ Solaris Print Manager: Find Printer
        {"SPM:Find.Printer", "Solaris Druckmanager: Drucker suchen"},


	/*
	 * 'Help' dialog title
	 */
	//@EN@ Solaris Print Manager: Help
        {"SPM:Help", "Solaris Druckmanager: Hilfe"},


        /*
         * 'About Print Manager' dialog title
         */
	//@EN@ About Solaris Print Manager
        {"About.Solaris.Print.Manager", "Infos zu Solaris Druckmanager"},


	/*
	 * 'User Input of Printer Port' dialog title
	 */
	//@EN@ Solaris Print Manager: Specify Printer Port
        {"SPM:Specify.Printer.Port",
		"Solaris Druckmanager: Druckeranschluss angeben"},


	/*
	 * 'User Input of Printer Type' dialog title
	 */
	//@EN@ Solaris Print Manager: Specify Printer Type
        {"SPM:Specify.Printer.Type",
		"Solaris Druckmanager: Druckertyp angeben"},


	/*
	 * 'NIS Authentication' dialog title
	 */
	//@EN@ NIS Authentication
	{"NIS.Authentication", "NIS-Authentisierung"},

	/*
	 * 'LDAP Authentication' dialog title
	 */
	//@EN@ LDAP Authentication
	{"LDAP.Authentication", "LDAP-Authentisierung"},


	/*
	 * 'Action Confirmation' dialog title
	 */
	//@EN@ Action Confirmation
	{"Action.Confirmation", "Aktion best\u00e4tigen"},


	/*
	 * Button labels and mnemonics
	 */
	//@EN@ Apply
        {"Apply", "Anwenden"},
	//@EN@ P
        {"Apply.mnemonic", "w"},

	//@EN@ Cancel
        {"Cancel", "Abbrechen"},
	//@EN@ C
        {"Cancel.mnemonic", "A"},

	//@EN@ Clear
        {"Clear", "L\u00f6schen"},
	//@EN@ L
        {"Clear.mnemonic", "L"},

	//@EN@ Dismiss
        {"Dismiss", "Verwerfen"},
	//@EN@ D
        {"Dismiss.mnemonic", "V"},

        // {"Button Help", "Help"},
        // {"Button.Help.mnemonic", "H"},

	//@EN@ OK
        {"OK", "OK"},
	//@EN@ O
        {"OK.mnemonic", "O"},

	//@EN@ Reset
        {"Reset", "Zur\u00fccksetzen"},
	//@EN@ R
        {"Reset.mnemonic", "Z"},

	//@EN@ Find
        {"Find", "Suchen"},
	//@EN@ F
        {"Find.mnemonic", "S"},

	//@EN@ Show
        {"Show", "Anzeigen"},
	//@EN@ S
        {"Show.mnemonic", "z"},

	//@EN@ Forward
        {"Forward", "Vorw\u00e4rts"},
	//@EN@ W
        {"Forward.mnemonic", "w"},

	//@EN@ Back
        {"Back", "Zur\u00fcck"},
	//@EN@ B
        {"Back.mnemonic", "u"},

	//@EN@ Add
        {"Add", "Hinzuf\u00fcgen"},
	//@EN@ A
        {"Add.mnemonic", "H"},

	//@EN@ Delete
        {"Delete", "L\u00f6schen"},
	//@EN@ D
        {"Delete.mnemonic", "L"},


	/*
	 * Actions performed by the application
         * as displayed in the Command-Line Console
	 */
	//@EN@ New Attached Printer
	{"New.Attached.Printer", "Neuer angeschlossener Drucker"},
	//@EN@ New Network Printer
	{"New.Network.Printer", "Neuer Netzwerkdrucker"},
	//@EN@ Modify Printer Properties
	{"Modify.Printer.Properties", "Druckereigenschaften \u00e4ndern"},
	//@EN@ Delete Printer
	{"Delete.Printer", "Drucker l\u00f6schen"},
	//@EN@ Add Access To Printer
	{"Add.Access.To.Printer", "Zugriff auf Drucker hinzuf\u00fcgen"},


	/*
	 * Prompts: messages to user describing required input.
	 */
	//@EN@ Enter the name of a printer to find:
	{"Enter.name.of.printer.to.find",
		"Name des zu suchenden Druckers eingeben:"},
	//@EN@ Please confirm deletion of printer 
	{"Please.confirm.deletion.of.printer",
		"L\u00f6schen des Druckers best\u00e4tigen "},
	//@EN@ Enter printer type:
	{"Enter.printer.type:", "Druckertyp eingeben:"},
	//@EN@ Enter printer port or file:
	{"Enter.printer.port.or.file", "Druckeranschluss oder Datei eingeben:"},


	/*
	 * 'Help' dialog tabbed-pane tab selection labels
	 */
	//@EN@ View
        {"View", "Anzeigen"},
	//@EN@ Index
        {"Index", "Index"},
	//@EN@ Search
        {"Search", "Suchen"},


	/*
	 * 'Help' dialog prompts, labels, and mnemonics
	 */
	//@EN@ Help on:
        {"Help.on:", "Hilfe f\u00fcr:"},
	//@EN@ See also:
        {"See.also:", "Siehe auch:"},

	//@EN@ Matching entries:
	{"Matching.entries:", "\u00dcbereinstimmende Eintr\u00e4ge:"}, 
	//@EN@ M
	{"Matching.entries:.mnemonic", "b"}, 

	//@EN@ Search help index for: 
	{"Search.help.index.for:", "Hilfeindex durchsuchen nach: "}, 
	//@EN@ S
	{"Search.help.index.for:.mnemonic", "d"}, 

	//@EN@ Search Results:
        {"Search.Results:", "Suchergebnisse:"},
	//@EN@ R
        {"Search.Results:.mnemonic", "e"},

	//@EN@ Keywords: 
        {"Keywords:", "Schl\u00fcsselw\u00f6rter: "},
	//@EN@ K
        {"Keywords:.mnemonic", "S"},

      
	/*
	 * 'Help' dialog descriptive messages to provide
         * assistance in using the features.
	 */

	/*
	 * The following two labels create one message, displayed on 
	 * two adjacent lines.  
	 */
	//@EN@ To search the index of help articles alphabetically,
        {"To.search.the.index...",
		 "Um den Index der Hilfetexte alphabetisch zu durchsuchen,"},
	//@EN@ type your query below then select the desired article.
        {"type.your.query.below...",
		 "geben Sie Ihre Anfrage unten ein und w\u00e4hlen den gew\u00fcnschten Text."}, 

	/*
	 * The following two labels create one message, displayed on 
	 * two adjacent lines.  
	 */
	//@EN@ To find help articles about a particular topic,
        {"To.find.help.articles...",
		"Um Hilfetexte zu einem bestimmten Thema zu suchen,"},
	//@EN@ enter keywords below then press the Find button.
        {"enter.keywords.below...",
		 "geben Sie unten Schl\u00fcsselw\u00f6rter ein und w\u00e4hlen die Schaltfl\u00e4che Suchen."},


	/*
	 * Prompts/labels on 'Install Printer' and 'Modify Printer' dialogs
	 */
	//@EN@ Printer Name:
	{"Printer.Name:", "Druckername:"},
	//@EN@ Printer Server:
	{"Printer.Server:", "Druckerserver:"},
	//@EN@ Description:
	{"Description:", "Beschreibung:"},
	//@EN@ Printer Port:
	{"Printer.Port:", "Druckeranschluss:"},
	//@EN@ Not Selected
	{"Not.Selected", "Nicht ausgewählt"},
	//@EN@ Printer Type:
	{"Printer.Type:", "Druckertyp:"},
	//@EN@ Printer Driver:
	{"Printer.Driver:", "Druckertreiber:"},
	//@EN@ No PPD files found
	{"No.PPD.Files.Found", "Keine PPD-Dateien gefunden"},
	//@EN@ Printer Make:
	{"Printer.Make:", "Druckermarke:"},
	//@EN@ Printer Model:
	{"Printer.Model:", "Druckermodell:"},
	//@EN@ No Models Found
	{"No.Models.Found", "Keine Modelle gefunden"},
	//@EN@ File Contents:
	{"File.Contents:", "Dateiinhalt:"},
	//@EN@ Fault Notification:
	{"Fault.Notification:", "Fehlerbenachrichtigung:"},
	//@EN@ Destination:
	{"Destination:", "Ziel:"},
	//@EN@ Protocol:
	{"Protocol:", "Protokoll:"},
	//@EN@ Options:
	{"Options:", "Optionen:"},
	//@EN@ O
	{"Options.mnemonic", "O"},
	//@EN@ Option:
	{"Option:", "Option:"},
	//@EN@ User Access List:
	{"User.Access.List:", "Benutzerzugriffsliste:"},


	/*
	 * Combo item allowing custom 'Printer Port' selection
 	 * See "Printer.Port:" above.
	 */
	//@EN@ Other...
	{"Other...", "Andere..."},


	/*
	 * Combo items specifying printer 'File Contents'
	 * See "File.Contents" above.
	 */
	//@EN@ PostScript
	{"PostScript", "PostScript"},
	//@EN@ ASCII
	{"ASCII", "ASCII"},
	//@EN@ None
	{"None", "Keiner"},
	//@EN@ Any
	{"Any", "Beliebig"},
	//@EN@ Both PostScript and ASCII
	{"Both.PostScript.and.ASCII", "PostScript und ASCII"},


	/*
	 * Combo items specifying 'Fault Notification' options.
	 * See "Fault.Notification" above.
	 */
	//@EN@ Write to Superuser
	{"Write.to.Superuser", "An Superuser schreiben"},
	//@EN@ Mail to Superuser
	{"Mail.to.Superuser", "An Superuser senden"},


	/*
	 * Labels for checkboxes used in 'Install Printer' and
         * 'Modify Printer' dialogs
	 */
	//@EN@ Default Printer
	{"Default.Printer", "Standarddrucker"},
	//@EN@ Always Print Banner
	{"Always.Print.Banner", "Deckblatt immer drucken"},
	//@EN@ User Selectable - Default=on
	{"User.Selectable.Default.On", "Benutzerdefinierbar - Standard=Ein"},
	//@EN@ Never Print Banner
	{"Never.Print.Banner", "Deckblatt nie drucken"},


	/*
	 * Prompt for 'Select Naming Service' combo 
	 */
	//@EN@ Naming Service:
	{"Naming.Service:", "Namen-Service:"},


	/*
	 * Descriptive label for 'NIS Authentication' dialog
	 */
	//@EN@ Enter NIS authentication data.
	{"Enter.NIS.authentication.data.", "NIS-Authentisierungsdaten eingeben."},

	/*
	 * Descriptive label for 'LDAP Authentication' dialog
	 */
	//@EN@ Enter LDAP authentication data.
	{"Enter.LDAP.authentication.data.", "Geben Sie die Daten f\u00fcr die LDAP-Authentisierung ein."},


	/*
	 * Prompts and mnemonics for 'NIS Authentication' dialog
	 */
	//@EN@ Hostname:
	{"Hostname:", "Hostname:"},
	//@EN@ H
	{"Hostname.mnemonic", "H"},

	//@EN@ Username:
	{"Username:", "Benutzername:"},
	//@EN@ U
	{"Username.mnemonic", "B"},

	//@EN@ Password:
	{"Password:", "Passwort:"},
	//@EN@ P
	{"Password.mnemonic", "P"},

	/*
	 * Prompts for 'LDAP Authentication' dialog
	 */
	//@EN@ LDAP Server:
	{"LDAP.Server:", "LDAP-Server:"},
	//@EN@ Distinguished Name:
	{"Distinguished.Name:", "DN (Distinguished Name):"},
	//@EN@ Password:
	{"Password:", "Passwort:"},


	/*
	 * Error dialog titles
	 */
	//@EN@ Application Error
	{"Application.Error", "Anwendungsfehler"},
	//@EN@ Unknown Application Error
	{"Unknown.Application.Error", "Unbekannter Anwendungsfehler"},
	//@EN@ Command Failed Error
	{"Command.Failed.Error", "Fehler - Befehl fehlgeschlagen"},
	//@EN@ Error
	{"Error", "Fehler"},
	//@EN@ Warning
	{"Warning", "Warnung"},


        /*
         * Error messages displayed to user
         */
	//@EN@ Item not found: 
        {"Item.not.found:", "Element nicht gefunden: "},
	//@EN@ No information available.
        {"No.information.available.", "Keine Informationen verf\u00fcgbar."},
	//@EN@ Unable to find printer 
	{"Unable.to.find.printer", "Drucker wurde nicht gefunden "},
	//@EN@ Printer delete operation failed.
	{"Printer.delete.operation.failed.",
		"Operation zum L\u00f6schen des Druckers fehlgeschlagen."},
	//@EN@ Invalid printer type.
	{"Invalid.printer.type.", "Ung\u00fcltiger Druckertyp."},
	//@EN@ Device missing or not writeable.
	{"Device.missing.or.not.writeable.",
		"Ger\u00e4t fehlt oder nicht beschreibbar."},
	//@EN@ Printer name required.
        {"Printer.name.required.", "Druckername erforderlich."},
	//@EN@ Printer Port Selection required.
	{"Printer.Port.Selection.required", "Die Auswahl eines Druckeranschlusses ist obligatorisch."},
	//@EN@ Printer Make Selection required.
	{"Printer.Make.Selection.required", "Die Auswahl einer Druckermarke ist obligatorisch."},
	//@EN@ Printer name invalid.
        {"Printer.name.invalid.", "Druckername ung\u00fcltig."},
	//@EN@ Server name required.
        {"Server.name.required.", "Servername erforderlich."},
	//@EN@ Server name invalid.
        {"Server.name.invalid.", "Servername ung\u00fcltig."},
	//@EN@ User Cancelled Login
        {"User.Cancelled.Login", "Anmeldung vom Benutzer abgebrochen."},
	//@EN@ Destination required.
        {"Destination.required.", "Ziel erforderlich."},
	//@EN@ User Cancelled Login
        {"User.Cancelled.Login", "Anmeldung vom Benutzer abgebrochen."},
	//@EN@ Destination invalid.
	{"Destination.invalid.", "Ziel ung\u00fcltig."},
	//@EN@ Operation Cancelled
	{"Operation.Cancelled", "Operation abgebrochen."},
	//@EN@ Login Failure
	{"Login.Failure", "Anmeldefehler"},
	//@EN@ Required login failed.
	{"Required.login.failed.", "Erforderliche Anmeldung fehlgeschlagen."},
	//@EN@ Login Authorization Failed
	{"Login.Authorization.Failed", "Anmeldeauthorisierung fehlgeschlagen."},
	//@EN@ Cannot modify this queue; ppdcache file missing.
	{"Cannot.modify.this.queue;ppdcache.file.missing.",
		"Diese Warteschlange kann nicht geändert werden; die ppdcache-Datei fehlt."},
	//@EN@ Cannot modify this queue; PPD file not in ppdcache.
	{"Cannot.modify.this.queue;PPD.file.not.in.ppdcache.",
		"Diese Warteschlange kann nicht geändert werden; die PPD-Datei befindet sich nicht im ppdcache."},
	//@EN@ Request cannot be completed.
	{"Request.cannot.be.completed.", "Anforderung kann nicht beendet werden."},
	//@EN@ Could not get local hostname
	{"Could.not.get.local.hostname", "Lokaler Hostname konnte nicht abgerufen werden."},
	//@EN@ The specified printer already exists.
	{"The.specified.printer.already.exists.",
		"Der angegebene Drucker ist bereits vorhanden."},
	//@EN@ The server must be a remote server.
	{"The.server.must.be.a.remote.server.",
		"Der Server muss ein entfernter Server sein."},
	//@EN@ Required login failed.
	{"Required.login.failed.", "Erforderliche Anmeldung fehlgeschlagen."},
	//@EN@ Invalid printer type.
	{"Invalid.printer.type.", "Ung\u00fcltiger Druckertyp."},
	//@EN@ Invalid username
	{"Invalid.username", "Ung\u00fcltiger Benutzername"},
	//@EN@ Device missing or not writeable.
	{"Device.missing.or.not.writeable.",
		"Ger\u00e4t fehlt oder nicht beschreibbar."},
	//@EN@ User cancelled login.
	{"User.cancelled.login.", "Anmeldung vom Benutzer abgebrochen."},
	//@EN@ Nothing matched.
        {"Nothing.matched.", "Keine \u00dcbereinstimmungen."},
	//@EN@ The specified printer already exists.
        {"The.specified.printer.already.exists.",
		"Der angegebene Drucker ist bereits vorhanden."},
	//@EN@ The selected printer does not exist.
        {"The.selected.printer.does.not.exist.",
                "Der gew\u00e4hlte Drucker existiert nicht."},
	//@EN@ User not authorized to modify this namespace.
        {"User.not.authorized.to.modify.this.namespace.",
                "Benutzer darf diesen Namensplatz nicht \u00e4ndern."},
	//@EN@ Cannot get list of printers. Exiting.
        {"Cannot.get.list.of.printers.Exiting.",
                "Liste der Drucker kann nicht abgerufen werden. Operation wird beendet."},
	//@EN@ LDAP Server Name required.
        {"LDAP.server.name.required.",
                "LDAP-Servername erforderlich."},
	//@EN@ LDAP Distinguished Name required.
        {"LDAP.Distinguished.name.required.",
                "LDAP-DN (Distinguished Name) erforderlich."},
	//@EN@ LDAP Password required.
        {"LDAP.Password.required.",
                "LDAP-Passwort erforderlich."},


	/*
	 * Prompts for 'Confirm Action' dialogs
	 */
	//@EN@ Continue action for this printer?
	{"Continue.action.for.this.printer?",
		"Aktion f\u00fcr diesen Drucker fortsetzen?"},
	//@EN@ Continue creating access for this printer?
	{"Continue.creating.access.for.this.printer?",
		"Zugriffserstellung f\u00fcr diesen Drucker fortsetzen?"},


	/*
	 * The help subsystem builds a database of searchable 
	 * keywords based in part on the title of each help
	 * article.  In order to avoid excessive false hits, the
	 * following words are ignored when adding title words 
	 * to the searchable keyword list.
         *
         * If this list is left empty, all the words in the title of 
         * each help article will be added to the keywords database.
	 */
	//@EN@ to an a of if the and or
        {"help.ignore.words", "zu an ein eine einer von wenn die der das und oder"},

	

	/* 
	 * Title for the authorization dialog which is invoked by 
	 * the printmgr executable.
	 */ 
	//@EN@ Authentication Required
	{"Authentication.required", "Authentisierung erforderlich"},

	/* 
	 * Prompt for the printmgr authorization dialog.  
	 * This is displayed with line breaks.
	 */
	/* JSTYLED */
	//@EN@ Root access is required for full functionality.\nYou may authenticate as root or continue\nwith limited functionality.
	{"Root.access.is.required", "Um mit allen Funktionen arbeiten zu k\u00f6nnen, ist Root-Zugriff erforderlich.\nSie k\u00f6nnen sich als Root authentisieren oder\nmit einer begrenzten Anzahl Funktionen fortfahren."},

	/* 
	 * Buttons for the authorization dialog.
	 */
	//@EN@ Authenticate
	{"Authenticate", "Authentisieren"},
	//@EN@ A
	{"Authenticate.mnemonic", "A"},
	
	//@EN@ Continue
	{"Continue", "Weiter"}, 
	//@EN@ N
	{"Continue.mnemonic", "W"},

	/* 
	 * Title for the root password request dialog invoked by printmgr.
	 */
	//@EN@ Root Authentication
	{"Root.authentication", "Root-Authentisierung"}, 

	/* 
	 * Prompt for the root password request dialog.
	 */
	//@EN@ Enter root password
	{"Enter.root.password", "Root-Passwort eingeben."},

	/* 
	 * Prompt for the root password request dialog.
	 */
	//@EN@ Invalid password entered.  Retry?
	{"Invalid.password", "Ung\u00fcltiges Passwort eingegeben.  Neuer Versuch?"},

	/*
	 * Just a placeholder, never used.
	 */
	//@EN@ 
	{"dummy", ""  /*@TMC@ NEW MESSAGE */  }
    };

    public Object[][] getContents() {
	    return pmBundlecontents;
    }
}
