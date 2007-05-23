/* 
 * GENERATED CODE
 *
 * Copyright 1999 Sun Microsystems, Inc.
 * All rights reserved.
 *
 */

package com.sun.admin.pm.client;
import java.util.*;


/*
 * 
 * CDDL HEADER START
 * 
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
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
 * 
 * Localization Notes for the Solaris Print Manager
 * 3/16/99
 * 
 * 1. Overview
 *     The help documentation tree consists of a collection of Articles, 
 *     each relating to a specific dialog, message, procedure, or 
 *     other topic.  The text, keywords, and metadata comprising the
 *     entire set of Articles is delivered in a single (large)
 *     ResourceBundle per locale.
 *     
 *     Each article consists of several parts, all of which must be
 *     defined within the ResourceBundle.  These parts are called Tag,
 *     Title, Content, Keywords, and See-Also.  Title, Content, and
 *     Keywords must be localized while Tag and See-Also must not.  
 * 
 *     The Tag is an identifier unique to each Article.  The application
 *     uses Tags to refer to specific Articles. The ResourceBundle uses
 *     each Article's Tag to form the keys which identify the
 *     strings comprising the Article.       
 * 
 *     The strings used as keys to identify the various parts of the
 *     articles in the ResourceBundle are in the form of a dotted pair,
 *     where the left side identifies the Tag of the Article to which
 *     this string belongs and the right side describes which part of
 *     that Article the string embodies.
 *     
 *     The suffixes used to identify the Tag, Title, Content, Keywords,
 *     and See-Also parts of a help article's resources are ".tag",
 *     ".title", ".content", ".keyword", and ".seealso" respectively.
 * 
 *     Examples: The key "ToAddPrinter.title" is associated with a
 *     localizable string that represents the title of the article whose
 *     tag is "ToAddPrinter".  The key "ToDeletePrinter.content" refers to
 *     a localizable string which contains the content of the help article
 *     itself.
 * 
 * 
 * 2. Structure of Help Articles
 * 
 * 2.1 Tags
 *     Each Article is associated with a unique identifier called a Tag.
 *     Tags are used internally and are never directly visible to users.
 * 
 *     A Tag is a case-sensitive string of alphanumeric 7-bit ASCII 
 *     characters containing no embedded whitespace or punctuation.  
 * 
 *     For convenience, an article's Tag is usually formed by taking the
 *     title and removing whitespace and punctuation; for example,
 *     the article titled "Troubleshooting Printer Problems" might have
 *     the Tag "TroubleShootingPrinterProblems".  Note that this is a
 *     mnemonic device only and in no way engenders a dependency between
 *     the non-localizable Tag, which must be embedded in the
 *     application's source code, and the article's title itself, which
 *     must be localized.
 * 
 *     *TAGS ARE NOT TO BE LOCALIZED!*
 * 
 * 
 * 2.2 Title and Content
 *     Each Article must contain a Title and some Content.  
 * 
 *     The Title is an arbitrary localizable string which will be 
 *     presented to the user upon viewing its associated Article.  
 * 
 *     The Content of an Article consists of a block of localizable text
 *     which may contain a limited set of embedded HTML tags (subject to
 *     restrictions described below).
 * 
 *     Since the Content is displayed in a window whose size may be
 *     adjusted by the user, its layout cannot be completely controlled by
 *     the author.  The Help display relies on word-wrapping and HTML
 *     formatting to ensure correct appearance.
 * 
 *     The viewable Content of an Article is authored in a tiny subset of
 *     HTML which can be reliably rendered in the Help component.  The
 *     intention is to provide a simple facility for controlling the
 *     appearance of the text and for handling paragraph and line breaks.
 * 
 *     The supported capabilities are:
 * 
 *     . Emphasize sections of text by bolding: <b> ... </b>
 * 
 *     . Line breaks: <br>
 * 
 *     . Paragraph breaks:  <p>
 * 
 *     No other HTML tags should be embedded in the Content as they
 *     may not produce the expected results.  No hyperlinks or images
 *     are supported!
 * 
 *     Note that while the content itself may be localized, the HTML tags
 *     embedded within the content should be left in ASCII.
 * 
 *     *BOTH TITLE AND CONTENT MUST BE LOCALIZED!*
 * 
 * 
 * 2.3 Keywords
 * 
 *     Users may search the collection of help articles by specifying one
 *     or more keywords (in the locale's representation) which are matched
 *     against the set of Articles.  Those articles whose keyword list has
 *     one or more matches with the user's list will then be viewable.
 * 
 *     Each Article may specify a (possibly empty) list of keywords 
 *     separated by whitespace and containing no commas or punctuation.
 *     The whitespace in this list of keywords is used only to separate
 *     individual keywords.  
 *     
 *     Each Keyword in the list must be a string of localizable
 *     alphanumeric text containing no whitespace (punctuation marks such
 *     as "-" may be OK).  
 * 
 *     *KEYWORDS MUST BE LOCALIZED!*
 * 
 * 
 * 2.4 See-Also 
 * 
 *     Each article may refer to other Articles by presenting the user
 *     with a "See-Also" list when the Article is viewed.  This user's
 *     view of this list contains the Titles of the specified articles, 
 *     and clicking a title causes that article to be presented.
 * 
 *     The See-Also list associated with a particular Article consists of
 *     a (possibly empty) list containing Tags of other articles separated 
 *     by whitespace and containing no commas or punctuation.  The list of 
 *     Titles corresponding to these Tags will be displayed to the user in 
 *     the same order that it appears in the definition of the Article.
 * 
 *     *SEE-ALSO ITEMS ARE NOT TO BE LOCALIZED!*
 * 
 * 
 * 3. Notes on Representation of Content 
 * 
 *     The internal representation of the Content component of each
 *     article is as a single (long) Java String.  
 * 
 *     Java permits the static initialization of Strings to use
 *     catenation on the right-hand side of the assignment.
 *     For example, the Java statements
 *         String s = "foo bar";
 *     and 
 *         String s = "foo" + " " + bar;
 *     will result in an identical assignment.
 * 
 *     Since the HTML rendering process which displays the resource to
 *     the user ignores whitespace and line breaks, the initializations
 *     of Content strings in the Help ResourceBundle exploit this approach
 *     to make the code more readable and facilitate the localization
 *     process.  
 * 
 *     Note that the breaking up of the Content string into source lines is 
 *     transparent to the application; details of the source file's
 *     appearance can change across localizations (assuming that tag names
 *     are maintained correctly).
 * 
 *     As an example, consider the ResourceBundle entry which defines the 
 *     Content portion of a help article whose tag is "ToDeletePrinter".  
 *     This entry might appear in the ResourceBundle source as 
 * 
 *         { "ToDeletePrinter.content", 
 * 
 *           "This is some help content which would extend across several " +
 *           "lines of text if it were all in a single long string. " +
 *           "Since we can separate the one long string into several " +
 *           "short ones, " +
 *           "the source file is much more easily readable. "
 *         }
 * 
 * 
 * 4. Previewing Help Article Content
 * 
 *     It is possible to use an ordinary HTML browser to view the Content of 
 *     all the help Articles in a ResourceBundle.  To do so requires the 
 *     extraction and formatting of the strings in the ResourceBundle which 
 *     comprise the Content portions of all included Articles.
 * 
 *     One approach is to create a simple script which acts as a filter; its 
 *     input is the pmHelpResources.java ResourceBundle source file and its 
 *     output is a stream of HTML which can be saved to a file and viewed in 
 *     a browser.
 * 
 *     The use of such a script can facilitate the localization process by 
 *     enabling localization teams to view a particular version of the 
 *     ResourceBundle as work on it progresses.
 * 
 *     An example of a script which performs the required formatting and 
 *     extraction is as follows:
 * 
 *     -----------------------
 *     #!/bin/ksh
 *     #
 *     # Copyright (c) 1999, by Sun Microsystems, Inc.
 *     # All rights reserved.
 *     #
 *     # This filter accepts a pmHelpResources.java file as input
 *     # and produces formatted HTML as output.
 *     # 
 * 
 *     while read line; do
 * 	    echo "$line" | grep '^.*{".*\.tag"' > /dev/null
 * 	    if [[ $? == 0 ]]; then
 * 		    print -n "<br> <h2> "
 * 		    print -n `echo "$line" | sed s/'\.'/\ / | \
 * 				    sed s/\"/\ /g | awk '{print \$2}'`
 * 		    print " </h2>"
 * 	    fi
 * 
 * 	    echo "$line" | grep '^\".*+$' | sed s/^\"//g | sed s/\"\ +\$//
 * 
 *     done
 *     -----------------------
 * 
 *     Usage of this script (assuming it is named 'extract') would be:
 * 	% extract < pmHelpResources.java > content.html
 * 
 * 
 * 5. Support
 * 
 *     For further assistance please contact:
 * 	Claude Noshpitz, clauden@eng.sun.com.
 * 
 * 
 */


public class pmHelpResources___LOCALE__ extends ListResourceBundle {
    static final Object[][] pmHelpBundlecontents = {

        // DO NOT LOCALIZE
	//@EN@ AddAccess
        {"AddAccess.tag", "AddAccess"},

        // DO NOT LOCALIZE
	//@EN@ ToAddAccess ToModify ToDelete ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp
        {"AddAccess.seealso", "ToAddAccess ToModify ToDelete ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: Add Access to Printer
        {"AddAccess.title", "Dialog: Zugriff auf Drucker hinzufügen"},

        // LOCALIZE
	//@EN@ access \"add access\" description \"default printer\" \"naming service\" \"printer name\" \"printer server\" dialog: add printer
        {"AddAccess.keywords", "Zugriff \"Zugriff hinzufügen\" Beschreibung \"Standard-Drucker\" \"Namensdiensr\" \"Druckername\" \"Drucker-Server\" Dialog: Drucker hinzufügen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@   <p> Use the Add Access to Printer dialog to make an installed printer accessible to print client computers. See the printers.conf(4) man page if you need more information about print client commands. <p> <b>Printer Name:</b> The name of the printer you wish to add access to. The printer name must be a text string composed of uppercase or lowercase alphabetical characters (a-z, A-Z), digits (0-9), hyphens, or underscores. A printer name can be a maximum of 14 characters long. <p> <b>Printer Server:</b> The name of the printer server the named printer is installed on. The printer may be physically connected to the server or it may be a network printer.  <p> <b>NOTE:</b> Solaris Print Manager does not check for the validity of Printer Name or Printer Server.  <p> <b>Description:</b> [Optional] A description of the printer, including, for example, the type and location of the printer. <p> <b>Option: Default Printer:</b> If checked and no naming service is being used, this printer is designated as the default printer for the computer on which you are running Solaris Print Manager. If checked and a naming service is being used, designates this as the default printer for the naming service. <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"AddAccess.content",
          "  " +
          "<p> " +
          "Verwenden Sie den Dialog 'Zugriff auf Drucker hinzufügen', um einen installierten Drucker " +
          "für Druck-Client-Computer verfügbar zu machen. Siehe die Man Page printers.conf(4), " +
          "wenn Sie weitere Informationen zu Druck-Client-Befehlen benötigen. " +
          "<p> " +
          "<b>Druckername:</b> Der Name des Druckers, auf den Sie Zugriff gewähren " +
          "möchten. Bei dem Druckernamen muss es sich um einen Text-String aus Groß- oder " +
          "Kleinbuchstaben (a-z, A-Z), Zahlen (0-9), Bindestrichen oder " +
          "Unterstreichungszeichen handeln. Ein Druckername kann maximal 14 Zeichen lang sein. " +
          "<p> " +
          "<b>Druckerserver:</b> Der Name des Druckerservers, auf dem der angegebene Drucker " +
          "installiert ist. Der Drucker kann ein physisch an den Server " +
          "angeschlossenes Gerät oder ein Netzwerkdrucker sein.  " +
          "<p> " +
          "<b>HINWEIS:</b> Der Solaris Druckmanager prüft den " +
          "Druckernamen oder Druckerserver nicht auf seine Gültigkeit.  " +
          "<p> " +
          "<b>Beschreibung:</b> [Optional] Eine Beschreibung des Druckers, einschließlich " +
          "z. B. des Druckertyps und -standorts. " +
          "<p> " +
          "<b>Option: Standarddrucker:</b> Ist diese Option aktiviert und wird kein Namen-Service " +
          "verwendet, dann wird dieser Drucker als Standarddrucker für den " +
          "Computer festgelegt, auf dem Sie den Solaris Druckmanager ausführen. Ist diese Option aktiviert " +
          "und wird ein Namen-Service verwendet, dann wird dieser Drucker als " +
          "Standarddrucker für den Namen-Service festgelegt. " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ AddAccessFailed
        {"AddAccessFailed.tag", "AddAccessFailed"},

        // DO NOT LOCALIZE
	//@EN@ AddAccess ToAddAccess ToShowCommand Overview MainWindow HelpOnHelp
        {"AddAccessFailed.seealso", "AddAccess ToAddAccess ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ If Add Access Fails
        {"AddAccessFailed.title", "Wenn das Hinzufügen des Zugriffs fehlschlägt"},

        // LOCALIZE
	//@EN@ add access fail failure fails
        {"AddAccessFailed.keywords", "Hinzufügen des Zugriffs fehlschlagen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> You must enter a printer name and a printer server name; the printer server must be a remote server (not the current server). See the man page for lpadmin(1M) for more information.  <p> Display the Command-Line Console to help pinpoint where the error may have occurred. Choose Show Command-Line Console from the Print Manager menu to display the Command-Line Console.  
        {"AddAccessFailed.content",
          "<p> " +
          "Sie müssen einen Druckernamen und einen Druckerservernamen eingeben; der " +
          "Druckerserver muss ein ferner Server sein (nicht der aktuelle Server). Siehe die Man  " +
          "Page für lpadmin(1M), um weitere Informationen zu erhalten.  " +
          "<p> " +
          "Zeigen Sie die Befehlszeilenkonsole an, um festzustellen, wo der Fehler " +
          "aufgetreten sein könnte. Wählen Sie 'Befehlszeilenkonsole anzeigen' aus dem Menü " +
          "'Druckmanager', um die Befehlszeilenkonsole anzuzeigen.  " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ AddPrinterFailed
        {"AddPrinterFailed.tag", "AddPrinterFailed"},

        // DO NOT LOCALIZE
	//@EN@ InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToShowCommand Overview MainWindow HelpOnHelp
        {"AddPrinterFailed.seealso", "InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ If New Printer Action Fails
        {"AddPrinterFailed.title", "Wenn die Aktion 'Neuer Drucker' fehlschlägt"},

        // LOCALIZE
	//@EN@ install fail failure \"new attached\" \"new network\" new printer action fails
        {"AddPrinterFailed.keywords", "installieren fehlschlagen \"neu angeschlossen\" \"neues Netzwerk\" Aktion 'Neuer Drucker' schlägt fehl"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> The printer name must be a text string composed of uppercase or lowercase alphabetical characters (a-z, A-Z), digits (0-9), hyphens, or underscores. A printer name can be a maximum of 14 characters long. <p> Display the Command-Line Console to help pinpoint where the error may have occurred. Choose Show Command-Line Console from the Print Manager menu to display the Command-Line Console. See the man page for lpadmin(1M) for more information.  <p> 
        {"AddPrinterFailed.content",
          "<p> " +
          "Bei dem Druckernamen muss es sich um einen Text-String aus Groß- oder " +
          "Kleinbuchstaben (a-z, A-Z), Zahlen (0-9), Bindestrichen, " +
          "oder Unterstreichungszeichen handeln. Ein Druckername kann maximal 14 Zeichen lang sein. " +
          "<p> " +
          "Zeigen Sie die Befehlszeilenkonsole an, um festzustellen, wo der Fehler " +
          "aufgetreten sein könnte. Wählen Sie 'Befehlszeilenkonsole anzeigen' aus dem Menü " +
          "'Druckmanager', um die Befehlszeilenkonsole anzuzeigen. Siehe die Man  " +
          "Page für lpadmin(1M), um weitere Informationen zu erhalten.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ DeletePrinterFailed
        {"DeletePrinterFailed.tag", "DeletePrinterFailed"},

        // DO NOT LOCALIZE
	//@EN@ ToDelete ToShowCommand Overview MainWindow
        {"DeletePrinterFailed.seealso", "ToDelete ToShowCommand Overview MainWindow"},

        // LOCALIZE
	//@EN@ If Delete Printer Fails
        {"DeletePrinterFailed.title", "Wenn das Löschen des Druckers fehlschlägt"},

        // LOCALIZE
	//@EN@ delete fail failure printer fails
        {"DeletePrinterFailed.keywords", "löschen fehlschlagen Drucker sclägt fehl"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> If the Delete printer process fails, follow the instructions in the error dialog. If the instructions are incomplete or unclear, display the Command-Line Console to help pinpoint where the error may have occurred. Choose Show Command-Line Console from the Print Manager menu to display the Command-Line Console. See the man page for lpadmin(1M) for more information. <p> 
        {"DeletePrinterFailed.content",
          "<p> " +
          "Wenn das Löschen des Druckers fehlschlägt, befolgen Sie die Anweisungen im " +
          "Fehlerdialog. Wenn die Anweisungen unvollständig oder unklar sind, zeigen Sie die " +
          "Befehlszeilenkonsole an, um festzustellen, wo der Fehler " +
          "aufgetreten sein könnte. Wählen Sie 'Befehlszeilenkonsole anzeigen' aus dem Menü 'Druckmanager', " +
          "um die Befehlszeilenkonsole anzuzeigen. Siehe die Man Page für lpadmin(1M). " +
          "Dort finden Sie weitere Informationen. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ HelpOnHelp
        {"HelpOnHelp.tag", "HelpOnHelp"},

        // DO NOT LOCALIZE
	//@EN@ Overview
        {"HelpOnHelp.seealso", "Overview"},

        // LOCALIZE
	//@EN@ Help on Help
        {"HelpOnHelp.title", "Hilfe zur Hilfe"},

        // LOCALIZE
	//@EN@ view index search show back forward \"see also\" help keywords
        {"HelpOnHelp.keywords", "anzeigen Index suchen zeigen zurück vorwärts \"see also\" Hilfe-Schlüsselwörter"},

        // LOCALIZE
	//@EN@ <p>  Solaris Print Manager help is displayed if you choose one of the help items from the Help menu in the Print Manager main window or if you click on a Help button in any of the Print Manager windows or dialogs. <p> <b> Viewing a help article </b>  <p> When you click on a Help button or choose a help item from the Help menu, help for the selected topic is displayed in the help viewer. See the headings labeled Navigation, Index, and Search below for instructions for viewing other help articles. <p> <b> Navigation </b>  <p> To move around in an article, click on the scroll bar to the right of the article text. Note that you can expand or contract the help window by grabbing a corner with the mouse cursor and moving the mouse. See below for instructions for viewing other help articles.  <p> Back button: Click to move to the last article viewed.  <br> Forward button: Click to move to the article viewed prior to clicking the Back button.  <br> See also pulldown menu: Select an item from the menu and click Show to display the selected article.  <br> Show button: After selecting an item from the See also menu, click Show to display it.  <p> <b> Index </b>  <p> 1. Click the Index tab at the top of the help window to display the index search tool. <p>  By default the Search field is blank and all help articles are listed. To limit the index listing, enter the first letters of a help article; the articles that start with the entered letters will be displayed as you type. To see all the task descriptions, for instance, enter \"to\" and a blank. <p>  2. To view an article, double-click on it or select it and click Show. The article is displayed in view mode.  <p>  <b> Search </b>  <p>  Click the Search tab at the top of the help window to display the search tool. <p> Enter a word or phrase in the Keywords field and click Search.  <p> All articles with the entered keyword or phrase marked as a keyword will be displayed in the Search Results list.  <p> To view an article, double-click on it or select it and click Show. The article is displayed in view mode.  <p> 
        {"HelpOnHelp.content",
          "<p>  " +
          "Die Hilfe zum Solaris Druckmanager wird angezeigt, wenn Sie eine der Hilfeoptionen " +
          "aus dem Menü 'Hilfe' im Hauptfenster des Druckmanagers wählen oder wenn Sie " +
          "in einem der Druckmanager-Fenster oder -Dialoge auf die Schaltfläche 'Hilfe' klicken. " +
          "<p> " +
          "<b> Anzeigen eines Hilfetexts </b>  " +
          "<p> " +
          "Wenn Sie auf eine Hilfeschaltfläche klicken oder eine Hilfeoption aus dem Menü 'Hilfe' " +
          "wählen, erscheint Hilfe für das gewählte Thema in der Hilfe-Anzeige. Siehe " +
          "die Abschnitte 'Navigation', 'Index' und 'Suchen' weiter unten. " +
          "Dort erhalten Sie Anweisungen zum Anzeigen weiterer Hilfetexte. " +
          "<p> " +
          "<b> Navigation </b>  " +
          "<p> " +
          "Wenn Sie sich in einem Hilfetext bewegen möchten, klicken Sie auf die Bildlaufleiste rechts neben " +
          "dem Hilfetext. Beachten Sie, dass Sie das Hilfefenster vergrößern oder verkleinern können, " +
          "indem Sie eine Ecke des Fensters mit dem Mauscursor festhalten und die Maus bewegen. Anweisungen " +
          "zum Anzeigen weiterer Hilfetexte finden Sie weiter unten.  " +
          "<p> " +
          "Schaltfläche 'Zurück': Klicken Sie, um zum zuletzt angezeigten Hilfetext zu gelangen.  " +
          "<br> " +
          "Schaltfläche 'Vorwärts': Klicken Sie, um zu dem Hilfetext zu gelangen, der vor dem Klicken auf " +
          "die Schaltfläche 'Zurück' angezeigt wurde.  " +
          "<br> " +
          "Siehe auch das Pulldown-Menü: Wählen Sie einen Eintrag aus dem Menü, und klicken Sie auf 'Anzeigen', um " +
          "den gewählten Hilfetext anzuzeigen.  " +
          "<br> " +
          "Schaltfläche 'Anzeigen': Nachdem Sie einen Eintrag aus dem Menü 'Siehe auch' gewählt haben, klicken Sie auf 'Anzeigen', " +
          "um ihn anzuzeigen.  " +
          "<p> " +
          "<b> Index </b>  " +
          "<p> " +
          "1. Klicken Sie auf die Registerkarte 'Index' im oberen Bereich des Hilfefensters, um das " +
          "Index-Suchtool anzuzeigen. " +
          "<p>  " +
          "Das Feld 'Suchen' ist standardmäßig leer, und alle Hilfetexte sind aufgelistet. " +
          "Um den Umfang der Indexliste einzuschränken, geben Sie die ersten Buchstaben eines Hilfetexts ein; " +
          "die Texte, die mit den eingegebenen Buchstaben beginnen, werden beim " +
          "Tippen angezeigt. Wenn Sie z. B. alle Aufgabenbeschreibungen anzeigen möchten, geben Sie " +
          "und ein Leerzeichen ein. " +
          "<p>  " +
          "2. Zum Anzeigen eines Hilfetexts doppelklicken Sie auf den gewünschten Text. Sie können ihn auch auswählen und " +
          "auf 'Anzeigen' klicken. Der Hilfetext wird im Ansichtsmodus angezeigt.  " +
          "<p>  " +
          "<b> Suchen </b>  " +
          "<p>  " +
          "Klicken Sie auf die Registerkarte 'Suchen' im oberen Bereich des Hilfefensters, um das " +
          "Suchtool anzuzeigen. " +
          "<p> " +
          "Geben Sie ein Wort oder einen Ausdruck in das Feld 'Schlüsselwörter' ein, und klicken Sie auf 'Suchen'.  " +
          "<p> " +
          "Alle Texte mit dem eingegebenen Schlüsselwort oder dem als Schlüsselwort angegebenen Ausdruck " +
          "werden in der Liste 'Suchergebnisse' angezeigt.  " +
          "<p> " +
          "Zum Anzeigen eines Hilfetexts doppelklicken Sie auf den gewünschten Text. Sie können ihn auch auswählen und " +
          "auf 'Anzeigen' klicken. Der Hilfetext wird im Ansichtsmodus angezeigt.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ InstallLocal
        {"InstallLocal.tag", "InstallLocal"},

        // DO NOT LOCALIZE
	//@EN@ ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp
        {"InstallLocal.seealso", "ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: New Attached Printer
        {"InstallLocal.title", "Dialog: Neuer angeschlossener Drucker"},

        // LOCALIZE
	//@EN@ install \"local printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: new attached
        {"InstallLocal.keywords", "installieren \"lokaler Drucker\" \"Druckername\" Server Beschreibung Anschluss \"Druckertyp\" \"Dateiinhalt\" Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner \"angeschlossener Drucker\" neu Nobanner Dialog: neu angeschlossen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Once you have physically connected the printer to the printer server, use the New Attached Printer dialog to install the printer, which makes the printer available for printing from the computer on which you are running Solaris Print Manager. <p> <b> Printer Name:</b>  Specifies a unique name for the printer. The  printer name must be a text string composed of  uppercase or lowercase alphabetical characters  (a-z, A-Z), digits (0-9), hyphens, or  underscores. A printer name can be a maximum of  14 characters long.  <p>  <b> Printer Server:</b> This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it. Solaris Print Manager sets up this system with the appropriate software to manage local and remote printers. <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Port:</b>  Specifies the hardware port, such as /dev/term/a, that the printer is connected to.  <p> <b> Printer Type:</b>  Specifies the generic name for a type of  printer. Supported printer types correspond to  items listed in the /usr/share/lib/terminfo  directories. Examples are PostScript, Daisy, and Diablo.  <p> <b> File Contents:</b>  Specifies the format of files that can be  printed without any special filtering by the  print software. PostScript is the default and is  probably correct most of the time.  <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p> <b> Options: Default Printer:</b> If checked, designates this printer as the default printer for printing jobs from the computer on which you are running Solaris Print Manager. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner  page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"InstallLocal.content",
          "<p> " +
          "Sobald Sie den Drucker physisch an den Druckerserver angeschlossen haben, " +
          "installieren Sie den Drucker mit dem Dialog 'Neuer angeschlossener Drucker', mit " +
          "dem der Drucker für Druckanforderungen des Computers verfügbar gemacht wird, " +
          "auf dem der Solaris Druckmanager aktiv ist. " +
          "<p> " +
          "<b> Druckername:</b> " +
          " Gibt einen eindeutigen Namen für den Drucker an. Der " +
          " Druckername muss ein Text-String sein, der aus " +
          " Groß- oder Kleinbuchstaben " +
          " (a-z, A-Z), Zahlen (0-9), Bindestrichen oder " +
          " Unterstreichungszeichen besteht. Ein Druckername kann maximal " +
          " 14 Zeichen lang sein.  " +
          "<p>  " +
          "<b> Druckerserver:</b> Dies ist der Computer, der als " +
          "Server für Druckaktionen fungieren soll. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen. Der Solaris Druckmanager " +
          "richtet dieses System mit der entsprechenden Software zur Verwaltung " +
          "lokaler und ferner Drucker ein. " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
          "<p>  " +
          "<b> Druckeranschluss:</b>  " +
          "Gibt den Hardware-Anschluss an, z. B. /dev/term/a, mit dem der Drucker " +
          "verbunden ist.  " +
          "<p> " +
          "<b> Druckertyp:</b>  " +
          "Gibt den generischen Namen für einen " +
          " Druckertyp an. Die unterstützten Druckertypen entsprechen den " +
          " Einträgen, die in den Verzeichnissen /usr/share/lib/terminfo " +
          " aufgelistet sind. Beispiele sind PostScript, Daisy und Diablo.  " +
          "<p> " +
          "<b> Dateiinhalt:</b>  " +
          "Gibt das Format der Dateien an, die " +
          " ohne einen besonderen Filter von der Druck-Software " +
          " gedruckt werden können. PostScript ist der Standardwert, der wahrscheinlich " +
          " meistens korrekt ist.  " +
          "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs des Computers festgelegt, " +
          "auf dem der Solaris Druckmanager ausgeführt wird. Wenn Sie einen Namen-Service " +
          "verwenden, ist dieser Drucker auch der Standarddrucker für den " +
          "Namen-Service. " +
          "<p> " +
          "Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf 'Hinzufügen'. Weitere zulässige Konstruktionen " +
          "sind Systemname!Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname!all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
	//@EN@ InstallLocalPPD
        {"InstallLocalPPD.tag", "InstallLocalPPD"},

        // DO NOT LOCALIZE
	//@EN@ ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp
        {"InstallLocalPPD.seealso", "ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: New Attached Printer
        {"InstallLocalPPD.title", "Dialog: Neuer angeschlossener Drucker"},

        // LOCALIZE
	//@EN@ install \"local printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: new attached
        {"InstallLocalPPD.keywords", "installieren \"lokaler Drucker\" \"Druckername\" Server Beschreibung Anschluss Druckermarke Druckermodell Druckertreiber Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner \"angeschlossener Drucker\" neu Nobanner Dialog: neu angeschlossen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Once you have physically connected the printer to the printer server, use the New Attached Printer dialog to install the printer, which makes the printer available for printing from the computer on which you are running Solaris Print Manager. <p> <b> Printer Name:</b>  Specifies a unique name for the printer. The  printer name must be a text string composed of  uppercase or lowercase alphabetical characters  (a-z, A-Z), digits (0-9), hyphens, or  underscores. A printer name can be a maximum of  14 characters long.  <p>  <b> Printer Server:</b> This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it. Solaris Print Manager sets up this system with the appropriate software to manage local and remote printers. <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Port:</b>  Specifies the hardware port, such as /dev/term/a, that the printer is connected to.  <p> <b> Printer Make:</b>  Specifies the printer make, or manufacturer. This  information is on the printer and/or in the documentation  that is delivered with the printer. <p> <b> Printer Model:</b>  Specifies the printer model. This information  is found on the printer and/or in the documentation that is  delivered with the printer. <p> <b> Printer Driver:</b>  Specifies the printer driver to use with this printer. <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p> <b> Options: Default Printer:</b> If checked, designates this printer as the default printer for printing jobs from the computer on which you are running Solaris Print Manager. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"InstallLocalPPD.content",
          "<p> " +
          "Sobald Sie den Drucker physisch an den Druckerserver angeschlossen haben, " +
          "installieren Sie den Drucker mit dem Dialog 'Neuer angeschlossener Drucker', mit " +
          "dem der Drucker für Druckanforderungen des Computers verfügbar gemacht wird, " +
          "auf dem der Solaris Druckmanager aktiv ist. " +
          "<p> " +
          "<b> Druckername:</b> " +
          " Gibt einen eindeutigen Namen für den Drucker an. Der " +
          " Druckername muss ein Text-String sein, der aus " +
          " Groß- oder Kleinbuchstaben " +
          " (a-z, A-Z), Zahlen (0-9), Bindestrichen oder " +
          " Unterstreichungszeichen besteht. Ein Druckername kann maximal " +
          " 14 Zeichen lang sein.  " +
          "<p>  " +
          "<b> Druckerserver:</b> Dies ist der Computer, der als " +
          "Server für Druckaktionen fungieren soll. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen. Der Solaris Druckmanager " +
          "richtet dieses System mit der entsprechenden Software zur Verwaltung " +
          "lokaler und ferner Drucker ein. " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
          "<p>  " +
          "<b> Druckeranschluss:</b>  " +
          "Gibt den Hardware-Anschluss an, z. B. /dev/term/a, mit dem der Drucker " +
          "verbunden ist.  " +
	  "<p> " +
          "<b> Druckermarke:</b> " +
          "Gibt die Marke oder den Hersteller des Druckers an. Diese " +
          "Informationen finden Sie auf dem Drucker und/oder in der " +
          "mitgelieferten Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckermodell:</b> " +
          "Gibt das Druckermodell an. Diese Information " +
          "finden Sie auf dem Drucker und/oder in der mitgelieferten " +
          "Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckertreiber:</b> " +
          "Gibt den Druckertreiber an, der für diesen Drucker verwendet " +
          "werden soll." +
	  "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs des Computers festgelegt, " +
          "auf dem der Solaris Druckmanager ausgeführt wird. Wenn Sie einen Namen-Service " +
          "verwenden, ist dieser Drucker auch der Standarddrucker für den " +
          "Namen-Service. " +
          "<p> " +
          "Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf 'Hinzufügen'. Weitere zulässige Konstruktionen " +
          "sind Systemname!Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname!all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
	//@EN@ InstallNetwork
        {"InstallNetwork.tag", "InstallNetwork"},

        // DO NOT LOCALIZE
	//@EN@ ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp
        {"InstallNetwork.seealso", "ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: New Network Printer
        {"InstallNetwork.title", "Dialog: Neuer Netzwerkdrucker"},

        // LOCALIZE
	//@EN@ install \"network printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner new dialog: network printer
        {"InstallNetwork.keywords", "installieren \"Netzwerkdrucker\" \"Druckername\" Server Beschreibung Anschluss \"Druckertyp\" \"Dateiinhalt\" Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner neu Dialog: Netzwerkdrucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Use the New Network Printer dialog to install a network printer, thus making the printer available for printing from the network. <p> <b> Printer Name:</b>  Specifies a unique name for the printer. The  printer name must be a text string composed of  uppercase or lowercase alphabetical characters  (a-z, A-Z), digits (0-9), hyphens, or  underscores. A printer name can be a maximum of  14 characters long.  <p>  <b> Printer Server:</b> This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it. Solaris Print Manager sets up this system with the appropriate software to manage local and remote printers. <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Type:</b>  Specifies the generic name for a type of  printer. Supported printer types correspond to  entries in the /usr/share/lib/terminfo  directory. Examples are PostScript, Daisy, and Diablo.  <p> <b> File Contents:</b>  Specifies the format of files that can be  printed without any special filtering by the  print software. PostScript is the default and is  probably correct most of the time.  <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p>  <b> Destination:</b>  <br> For <b>BSD</b> Protocol, the network name of the printer followed by a colon and the printer-vendor-supplied queue name.  <br> For <b>TCP</b> Protocol, the network name of the printer followed by a colon and the tcp port number to connect to. <br> For <b>URI</b> Protocol, a printer URI to be used in connecting to the remote printer. For example: \"smb://user@printer-host/printer-name\". <p> <b> Protocol:</b>  The internet protocol for file transfer; choices are BSD, TCP, or URI.  <p> <b> Options: Default Printer:</b> If checked, this printer is designated as the default printer for printing jobs sent to this server. If another printer had been designated as the default printer for the network, this printer will replace it as the default. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner  page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> To add a user to the list, type a user name in the blank text field below the list and click Add. Note that this user name replaces \"all\" or \"none\" if either \"all\" or \"none\" is in the user access list. If \"all\" or \"none\" is added as a user, \"all\" or \"none\" will replace the names in the list. <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p>  
        {"InstallNetwork.content",
          "<p> " +
          "Verwenden Sie den Dialog 'Neuer Netzwerkdrucker', um einen Netzwerkdrucker zu installieren " +
          "und den Drucker auf diese Weise für das Drucken im Netzwerk verfügbar zu machen. " +
          "<p> " +
          "<b> Druckername:</b> " +
          " Gibt einen eindeutigen Namen für den Drucker an. Der " +
          " Druckername muss ein Text-String sein, der aus " +
          " Groß- oder Kleinbuchstaben " +
          " (a-z, A-Z), Zahlen (0-9), Bindestrichen oder " +
          " Unterstreichungszeichen besteht. Ein Druckername kann maximal " +
          " 14 Zeichen lang sein.  " +
          "<p>  " +
          "<b> Druckerserver:</b> Dies ist der Computer, der als " +
          "Server für Druckaktionen fungieren soll. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen. Der Solaris Druckmanager " +
          "richtet dieses System mit der entsprechenden Software zur Verwaltung " +
          "lokaler und ferner Drucker ein. " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
          "<p>  " +
          "<b> Druckertyp:</b>  " +
          "Gibt den generischen Namen für einen " +
          " Druckertyp an. Die unterstützten Druckertypen entsprechen den " +
          " Einträgen, die im Verzeichnis /usr/share/lib/terminfo " +
          " aufgelistet sind. Beispiele sind PostScript, Daisy und Diablo.  " +
          "<p> " +
          "<b> Dateiinhalt:</b>  " +
          "Gibt das Format der Dateien an, die " +
          " ohne einen besonderen Filter von der Druck-Software " +
          " gedruckt werden können. PostScript ist der Standardwert, der wahrscheinlich " +
          " meistens korrekt ist.  " +
          "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p>  " +
          "<b> Ziel:</b>  " +
          "Der Netzwerkname des Druckers, " +
          "gefolgt von einem Doppelpunkt und dem Warteschlangennamen, der vom Druckerhersteller angegeben wurde.  " +
          "<p> " +
          "<b> Protokoll:</b>  " +
          "Das Internet-Protokoll für Dateiübertragungen; Sie können zwischen BSD und TCP wählen.  " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs festgelegt, die an diesen " +
          "Server gesendet werden. Wenn ein anderer Drucker als Standarddrucker für das " +
          "Netzwerk festgelegt wurde, ersetzt dieser Drucker den betreffenden Drucker als Standarddrucker. Wenn Sie " +
          "einen Namen-Service verwenden, ist dieser Drucker auch der Standarddrucker " +
          "für den Namen-Service. " +
          "<p> Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Um einen Benutzer zur Liste hinzuzufügen, geben Sie einen Benutzernamen in das leere Textfeld " +
          "unterhalb der Liste ein und klicken auf 'Hinzufügen'. Beachten Sie, dass dieser Benutzername \"all\" " +
          "oder \"none\" ersetzt, wenn \"all\" oder \"none\" in der Benutzerzugriffsliste angegeben ist. Wenn " +
          "\"all\" oder \"none\" als Benutzer hinzugefügt wird, ersetzt \"all\" oder \"none\" die " +
          "in der Liste angegebenen Namen. " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ InstallNetworkPPD
        {"InstallNetworkPPD.tag", "InstallNetworkPPD"},

        // DO NOT LOCALIZE
	//@EN@ ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp
        {"InstallNetworkPPD.seealso", "ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: New Network Printer
        {"InstallNetworkPPD.title", "Dialog: Neuer Netzwerkdrucker"},

        // LOCALIZE
	//@EN@ install \"network printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner new dialog: network printer
        {"InstallNetworkPPD.keywords", "installieren \"Netzwerkdrucker\" \"Druckername\" Server Beschreibung Anschluss Druckermarke Druckermodell Druckertreiber Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner neu Dialog: Netzwerkdrucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Use the New Network Printer dialog to install a network printer, thus making the printer available for printing from the network. <p> <b> Printer Name:</b>  Specifies a unique name for the printer. The  printer name must be a text string composed of  uppercase or lowercase alphabetical characters  (a-z, A-Z), digits (0-9), hyphens, or  underscores. A printer name can be a maximum of  14 characters long.  <p>  <b> Printer Server:</b> This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it. Solaris Print Manager sets up this system with the appropriate software to manage local and remote printers. <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Make:</b>  Specifies the printer make, or manufacturer. This  information is on the printer and/or in the documentation  that is delivered with the printer. <p> <b> Printer Model:</b>  Specifies the printer model. This information  is found on the printer and/or in the documentation that is  delivered with the printer. <p> <b> Printer Driver:</b>  Specifies the printer driver to use with this printer. <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p>  <b> Destination:</b> <br> For <b>BSD</b> Protocol, the network name of the printer followed by a colon and the printer-vendor-supplied queue name. <br> For <b>TCP</b> Protocol, the network name of the printer followed by a colon and the tcp port number to connect to. <br> For <b>URI</b> Protocol, a printer URI to be used in connecting to the remote printer. For example: \"smb://user@printer-host/printer-name\". <p> <b> Protocol:</b> The internet protocol for file transfer; choices are BSD, TCP, or URI. <p> <b> Options: Default Printer:</b> If checked, this printer is designated as the default printer for printing jobs sent to this server. If another printer had been designated as the default printer for the network, this printer will replace it as the default. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner  page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> To add a user to the list, type a user name in the blank text field below the list and click Add. Note that this user name replaces \"all\" or \"none\" if either \"all\" or \"none\" is in the user access list. If \"all\" or \"none\" is added as a user, \"all\" or \"none\" will replace the names in the list. <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p>  
        {"InstallNetworkPPD.content",
          "<p> " +
          "Verwenden Sie den Dialog 'Neuer Netzwerkdrucker', um einen Netzwerkdrucker zu installieren " +
          "und den Drucker auf diese Weise für das Drucken im Netzwerk verfügbar zu machen. " +
          "<p> " +
          "<b> Druckername:</b> " +
          " Gibt einen eindeutigen Namen für den Drucker an. Der " +
          " Druckername muss ein Text-String sein, der aus " +
          " Groß- oder Kleinbuchstaben " +
          " (a-z, A-Z), Zahlen (0-9), Bindestrichen oder " +
          " Unterstreichungszeichen besteht. Ein Druckername kann maximal " +
          " 14 Zeichen lang sein.  " +
          "<p>  " +
          "<b> Druckerserver:</b> Dies ist der Computer, der als " +
          "Server für Druckaktionen fungieren soll. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen. Der Solaris Druckmanager " +
          "richtet dieses System mit der entsprechenden Software zur Verwaltung " +
          "lokaler und ferner Drucker ein. " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
	  "<p> " +
          "<b> Druckermarke:</b> " +
          "Gibt die Marke oder den Hersteller des Druckers an. Diese " +
          "Informationen finden Sie auf dem Drucker und/oder in der " +
          "mitgelieferten Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckermodell:</b> " +
          "Gibt das Druckermodell an. Diese Information " +
          "finden Sie auf dem Drucker und/oder in der mitgelieferten " +
          "Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckertreiber:</b> " +
          "Gibt den Druckertreiber an, der für diesen Drucker verwendet " +
          "werden soll." +
	  "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p>  " +
          "<b> Ziel:</b>  " +
          "Der Netzwerkname des Druckers, " +
          "gefolgt von einem Doppelpunkt und dem Warteschlangennamen, der vom Druckerhersteller angegeben wurde.  " +
          "<p> " +
          "<b> Protokoll:</b>  " +
          "Das Internet-Protokoll für Dateiübertragungen; Sie können zwischen BSD und TCP wählen.  " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs festgelegt, die an diesen " +
          "Server gesendet werden. Wenn ein anderer Drucker als Standarddrucker für das " +
          "Netzwerk festgelegt wurde, ersetzt dieser Drucker den betreffenden Drucker als Standarddrucker. Wenn Sie " +
          "einen Namen-Service verwenden, ist dieser Drucker auch der Standarddrucker " +
          "für den Namen-Service. " +
          "<p> Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Um einen Benutzer zur Liste hinzuzufügen, geben Sie einen Benutzernamen in das leere Textfeld " +
          "unterhalb der Liste ein und klicken auf 'Hinzufügen'. Beachten Sie, dass dieser Benutzername \"all\" " +
          "oder \"none\" ersetzt, wenn \"all\" oder \"none\" in der Benutzerzugriffsliste angegeben ist. Wenn " +
          "\"all\" oder \"none\" als Benutzer hinzugefügt wird, ersetzt \"all\" oder \"none\" die " +
          "in der Liste angegebenen Namen. " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ LDAPAuthentication
        {"LDAPAuthentication.tag", "LDAPAuthentication"},

        // DO NOT LOCALIZE
	//@EN@ NameService Overview MainWindow HelpOnHelp
        {"LDAPAuthentication.seealso", "NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ LDAP Authentication
        {"LDAPAuthentication.title", "LDAP-Authentisierung"},

        // LOCALIZE
	//@EN@ LDAP ldap \"LDAP server\" authentication login password naming \"naming service\" files \"replica server\" replica replication referral ldapclient \"distinguished name\" DN
        {"LDAPAuthentication.keywords", "LDAP ldap \"LDAP-Server\" authentication login password naming \"Namen-Service\" files \"Replikationsserver\" replica replication referral ldapclient \"Distinguished Name (DN)\" DN"},

        // LOCALIZE
	//@EN@ <p> If you are using the LDAP naming service, you will need the distinguished name and password for a user who has update privileges to make any changes. Before making changes to the LDAP directory the user should be fully aware of the items in the <b>notes</b> below. The LDAP Authentication dialog is displayed when you select LDAP as the naming service. <p> 1. Check the LDAP server name for correctness. You may select a different server name if appropriate. <p> 2. Check the Distinguished Name (DN) for correctness. You may enter a different distinguished name of another user if appropriate. This may be the DN of any directory user who has permissions (directory update privileges) to update printer entries in the LDAP directory for the current ldapclient (1M) naming service (NS) domain. <p> 3. Enter the password for the user's Distinguished Name. <p> 4. Click OK. <p> The entries you have made will be validated against the LDAP directory and then saved, the LDAP Authentication dialog will be dismissed.  <p>  Click Cancel if you don't know the password for the Distinguished Name.  <p> <b>Note:</b> Keep the following in mind if you are using Solaris Print Manager to update printer information in the LDAP naming service: <p> If the LDAP server is the Netscape Directory Server (NSDS) then the default distinguished name is \"cn=Directory Manager\". If the LDAP server is Sun Directory Server then an example of the distinguished name is \"cn=admin, dc=XYZ, dc=COM\". The Solaris Print Manager uses ldapclient(1M) to determine the default LDAP server name. If there is more than one server specified then the first one will be used. <p> The Print Manager always displays printer entries from the current  ldapclient (1M) server. If this is not the domain Master LDAP server then the list of printers displayed may <b>not</b> be the current list of printers, this is because the ldapclient replica server may not have been updated by the master server and so be out of sync with the master. Replica servers can have various update replication agreements, for example; updated immediately there is a change on the master, or updated once a day from the master. <p> If the selected LDAP server is a replica LDAP server, any <b>updates</b> will be referred to the master server and done there. This again means the printer list could be out of sync with the master. For example, a deleted printer may still appear in the displayed printer list until the replica is updated from the master. <p> Users can use the ldap command line utilities (ldapadd (1) & ldapmodify (1)) to update printer entries in the directory, but this is not recommended. If these utilities are used then the user <b>must ensure</b> that the printer-name attribute value is unique within the ou=printers container. If it is not unique the result of modifies done by the print manager (or lpset (1M)) may not be predictable. <p>   
        {"LDAPAuthentication.content",
          "<p> " +
          "Wenn Sie mit dem LDAP-Namen-Service arbeiten und Änderungen vornehmen möchten, " +
          "benötigen Sie den Distinguished Name (DN) und das Passwort eines Benutzers mit Update-Berechtigung. " +
          "Bevor Sie Änderungen am LDAP-Verzeichnis vornehmen, müssen Sie sich mit den " +
          "nachfolgenden Punkten und <b>Hinweisen</b> vertraut machen. " +
          "Das Dialogfeld 'LDAP-Authentisierung' wird angezeigt, wenn Sie LDAP als " +
          "Namen-Service wählen. " +
          "<p> " +
          "1. Vergewissern Sie sich, dass der LDAP-Servername richtig ist. Bei Bedarf " +
          "können Sie einen anderen Servernamen wählen. " +
          "<p> " +
          "2. Vergewissern Sie sich, dass der Distinguished Name (DN) richtig ist. Bei Bedarf " +
          "können Sie einen anderen DN eines anderen Benutzers angeben. Dabei kann es sich um den DN " +
          "eines beliebigen Verzeichnisbenutzers mit Berechtigung (Verzeichnisaktualisierungsberechtigung) " +
          "zum Aktualisieren von Druckereinträgen im LDAP-Verzeichnis für die aktuelle ldapclient (1M)-" +
          "NS(Namen-Service)-Domain handeln. " +
          "<p> " +
          "3. Geben Sie das Passwort für den Distinguished Name (DN) des Benutzers ein. " +
          "<p> " +
          "4. Klicken Sie auf 'OK'. " +
          "<p> " +
          "Ihre Einträge werden auf Gültigkeit für das LDAP-Verzeichnis geprüft und dann " +
          "gespeichert. Das Dialogfeld 'LDAP-Authentisierung' wird geschlossen.  " +
          "<p>  " +
          "Sollten Sie das Passwort für den Distinguished Name (DN) nicht kennen, klicken Sie auf 'Abbrechen'.  " +
          "<p> " +
          "<b>Hinweis:</b> Wenn Sie die Druckerangaben im LDAP-Namen-Service mit dem Solaris " +
          "Druckmanager aktualisieren, beachten Sie bitte Folgendes: " +
          "<p> " +
          "Ist NSDS (Netscape Directory Server) der LDAP-Server, dann " +
          "lautet der Standard-DN (Distinguished Name) \"cn=Directory Manager\". " +
          "Beispiele für einen DN bei Verwendung von Sun Directory Server als " +
          "LDAP-Server sind \"cn=admin, dc=XYZ, dc=COM\". " +
          "Der Solaris Druckmanager ermittelt den Standard-LDAP-Servernamen " +
          "per ldapclient(1M). Sind mehrere Server angegeben, " +
          "so wird der zuerst aufgeführte verwendet. " +
          "<p> " +
          "Der Druckmanager zeigt stets Druckereinträge des aktuellen  " +
          "ldapclient (1M)-Servers an. Sollte dieser nicht der Master-LDAP-Server der Domain sein, " +
          "dann ist die angezeigte Druckerliste u. U. <b>nicht</b> die aktuelle Druckerliste, " +
          "weil der ldapclient-Replikationsserver möglicherweise nicht durch den Master-Server " +
          "aktualisiert wurde und folglich nicht auf demselben Stand ist. Für Replikationsserver können " +
          "unterschiedliche Aktualisierungsregeln gelten, z. B: eine sofortige Aktualisierung bei " +
          "Änderung auf dem Master oder eine tägliche Aktualisierung durch den Master. " +
          "<p> " +
          "Ist der gewählte LDAP-Server ein Replikations-LDAP-Server, werden <b>Aktualisierungsanforderungen</b> " +
          "an den Master-Server weitergeleitet und dort vorgenommen. Dies bedeutet wiederum, dass die " +
          "Druckerliste u. U. nicht mit derjenigen des Masters übereinstimmt. So kann z. B. ein gelöschter " +
          "Drucker weiterhin in der angezeigten Druckerliste aufscheinen, wenn die Replikation " +
          "noch nicht vom Master aktualisiert wurde. " +
          "<p> " +
          "Mit den LDAP-Befehlszeilendienstprogrammen (ldapadd (1) und ldapmodify (1)) können " +
          "Sie Druckereinträge im Verzeichnis aktualisieren, diese Vorgehensweise wird jedoch nicht " +
          "empfohlen. Bei Verwendung dieser Dienstprogramme <b>müssen Sie sicher sein</b>, dass der Wert des " +
          "Druckernamen-Attributs innerhalb des Containers ou=printers eindeutig ist. Ist dieser Wert nicht " +
          "eindeutig, so ist das Ergebnis der Änderungen durch den Druckmanager (oder lpset (1M)) " +
          "nicht vorhersehbar. " +
          "<p> " +
          "  "
        },



        // DO NOT LOCALIZE
	//@EN@ LoginFailed
        {"LoginFailed.tag", "LoginFailed"},

        // DO NOT LOCALIZE
	//@EN@ ToStart ToShowCommand NISAuthentication NameService Overview MainWindow HelpOnHelp
        {"LoginFailed.seealso", "ToStart ToShowCommand NISAuthentication NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ If Login Fails
        {"LoginFailed.title", "Wenn die Anmeldung fehlschlägt"},

        // LOCALIZE
	//@EN@ \"login failed\" login fail failure fails
        {"LoginFailed.keywords", "\"Anmeldung fehlgeschlagen\" Anmeldung fehlschlagen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> If the NIS naming service is being used, you will need to know the password for the naming service master. If LDAP is being used then a fully distinguished name with update privilege and password will be required. Note that default values may need to be overridden. For NIS+ you may need to configure permissions to allow updates before the tool is started. See the man page for lpadmin(1M) and the help articles, \"About Naming Services\" and \"NIS Authentication,\" for further information. <p> 
        {"LoginFailed.content",
          "<p> " +
          "Wenn Sie den NIS-Namen-Service verwenden, müssen Sie das " +
          "Passwort für den Namen-Service kennen. Für NIS+ müssen Sie möglicherweise " +
          "Berechtigungen konfigurieren, um vor dem Starten des Tools Aktualsierungen zu ermöglichen. " +
          "Siehe die Man Page für lpadmin(1M) und die Hilfetexte \"About Naming " +
          "Services\" und \"NIS Authentication,\" um weitere Informationen zu erhalten. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ MainWindow
        {"MainWindow.tag", "MainWindow"},

        // DO NOT LOCALIZE
	//@EN@ Overview ToAddAccess ToInstallLocal ToInstallNetwork ToModify ToDelete
        {"MainWindow.seealso", "Overview ToAddAccess ToInstallLocal ToInstallNetwork ToModify ToDelete"},

        // LOCALIZE
	//@EN@ Solaris Print Manager Main Window
        {"MainWindow.title", "Hauptfenster des Solaris Druckmanagers"},

        // LOCALIZE
	//@EN@ \"Print Manager menu\" \"Printer menu\" \"Tools menu\" \"Help menu\" \"list of printers\" printers \"printer name\" \"printer server\" description \"default printer\" \"naming service\" domain solaris print manager main window
        {"MainWindow.keywords", "\"Druckmanager (Menü)\" \"Drucker (Menü)\" \"Tools (Menü)\" \"Hilfe (Menü)\" \"Druckerliste\" Drucker \"Druckername\" \"Drucker-Server\" Beschreibung \"Standard-Drucker\" \"Namensdienst\" Domäne Solaris drucken Manager Hauptfenster"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> The main window is the starting point for any Solaris Print Manager activities.  <p> <b> Print Manager Menu: </b> Select Naming Service, Show Command-Line Console, Confirm All Actions, Exit <p> <b> Printer Menu: </b> Add Access to Printer, New Attached Printer, New Network Printer, Modify Printer Properties, Delete Printer <p> <b> Tools Menu: </b> Find Printer <p> <b> Help Menu: </b> Overview, On Help, About Print Manager <p> <b> List of Printers: </b> This is the list of printers installed on the computer on which you are running Solaris Print Manager, or, if a naming service is being used, all printers in the naming service. <p> There are three columns in the list: <p>  <b> Printer Name:</b> The name of the printer as specified during printer installation.  <p> <b> Printer Server:</b> The name of the printer server for the printer specified in the Printer Name column.  <p> <b> Description:</b> A description of the printer as specified during printer installation (New Attached Printer or New Network Printer) or modification (Modify Printer Properties). The description might include the location of the printer and its printer type. <p>  The footer panel at the bottom of the window has two or three entries: <p>  <b> Default Printer: </b> If no naming service is being used, the default printer for the computer on which you are running Solaris Print Manager. If a naming service is being used, the default printer for the naming service. <p> <b> Naming Service: </b> The naming service -- NIS, LDAP, or NIS+ -- that is being used for printing. This is not displayed if no naming service is being used. <p> <b> Domain or Host: </b> The network domain you are working in or the current host (if no naming service is being used). If you are using a naming service, the list of printers includes all printers in this domain. <p>  
        {"MainWindow.content",
          "<p> " +
          "Das Hauptfenster bildet den Ausgangspunkt für alle Aktivitäten des " +
          "Solaris Druckmanagers.  " +
          "<p> " +
          "<b> Menü 'Druckmanager': </b> Namen-Service wählen, Anzeigen " +
          "Befehlszeilenkonsole, Alle Aktionen bestätigen, Beenden " +
          "<p> " +
          "<b> Menü 'Drucker': </b> Zugriff auf Drucker hinzufügen, Neuer angeschlossener " +
          "Drucker, Neuer Netzwerkdrucker, Druckereigenschaften ändern, " +
          "Drucker löschen " +
          "<p> " +
          "<b> Menü 'Tools': </b> Drucker suchen " +
          "<p> " +
          "<b> Menü 'Hilfe': </b> Übersicht, Zur Hilfe, Info zum Druckmanager " +
          "<p> " +
          "<b> Druckerliste: </b> Dies ist die Liste der Drucker, die auf dem " +
          "Computer mit dem Solaris Druckmanager installiert sind, oder, " +
          "wenn ein Namen-Service verwendet wird, alle Drucker im Namen-Service. " +
          "<p> " +
          "Die Liste besteht aus drei Spalten: " +
          "<p>  " +
          "<b> Druckername:</b> Der Name des Druckers, der während der " +
          "Druckerinstallation angegeben wurde.  " +
          "<p> " +
          "<b> Druckerserver:</b> Der Name des Druckerservers für den Drucker, " +
          "der in der Spalte 'Druckername' angegeben ist.  " +
          "<p> " +
          "<b> Beschreibung:</b> Eine Beschreibung des Druckers, die während " +
          "der Druckerinstallation ('Neuer angeschlossener Drucker' oder 'Neuer " +
          "Netzwerkdrucker') oder einer Änderung ('Druckereigenschaften ändern') angegeben wurde. Die " +
          "Beschreibung kann den Standort des Druckers und den Druckertyp " +
          "umfassen. " +
          "<p>  " +
          "Der Fußzeilenbereich am unteren Rand des Fensters besitzt zwei oder drei Einträge: " +
          "<p>  " +
          "<b> Standarddrucker: </b> Wenn kein Namen-Service verwendet wird, ist dies der " +
          "Standarddrucker für den Computer, auf dem der Solaris " +
          "Druckmanager ausgeführt wird. Wenn ein Namen-Service verwendet wird, ist dies der Standarddrucker " +
          "für den Namen-Service. " +
          "<p> " +
          "<b> Namen-Service: </b> Der Namen-Service - NIS, LDAP oder NIS+ -, " +
          "der zum Drucken verwendet wird. Dies wird nicht angezeigt, wenn kein " +
          "Namen-Service verwendet wird. " +
          "<p> " +
          "<b> Domain oder Host: </b> Die Netzwerk-Domain, in der Sie arbeiten oder der " +
          "aktuelle Host (wenn kein Namen-Service verwendet wird). Wenn Sie " +
          "einen Namen-Service verwenden, enthält die Druckerliste alle Drucker " +
          "dieser Domain. " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ Modify
        {"Modify.tag", "Modify"},

        // DO NOT LOCALIZE
	//@EN@ ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp
        {"Modify.seealso", "ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: Modify Printer Properties
        {"Modify.title", "Dialog: Druckereigenschaften ändern"},

        // LOCALIZE
	//@EN@ modify properties \"printer properties\" \"attached printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: printer
        {"Modify.keywords", "Eigenschaften ändern \"Druckereigenschaften\" \"angeschlossener Drucker\" \"Druckername\" Server Beschreibung Anschluss \"Druckertyp\" \"Dateiinhalt\" Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner \"angeschlossener Drucker\" neu Nobanner Dialog: Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Use the Modify Printer Properties dialog to modify an installed printer. Note that you can modify the Description field only if this is not an attached printer. You can also check or uncheck the Default Printer box. <p> <b> Printer Name:</b> Cannot be modified. <p>  <b> Printer Server:</b> Cannot be modified.  This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it.  <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Port:</b> Cannot be modified.  Specifies the hardware port, such as /dev/term/a, that the printer is connected to.  <p> <b> Printer Type:</b>  Specifies the generic name for a type of  printer. Supported printer types correspond to  items listed in the /usr/share/lib/terminfo  directories. Examples are PostScript, Daisy, and Diablo.  <p> <b> File Contents:</b>  Specifies the format of files that can be  printed without any special filtering by the  print software. PostScript is the default and is  probably correct most of the time.  <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p> <b> Options: Default Printer:</b> If checked, designates this printer as the default printer for printing jobs from the computer on which you are running Solaris Print Manager. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner  page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"Modify.content",
          "<p> " +
          "Verwenden Sie den Dialog 'Druckereigenschaften ändern', um einen installierten " +
          "Drucker zu ändern. Beachten Sie, dass Sie nur das Feld 'Beschreibung' ändern können, wenn es sich " +
          "um einen nicht angeschlossenen Drucker handelt. Sie können das Feld 'Standarddrucker' auch " +
          "aktivieren oder deaktivieren. " +
          "<p> " +
          "<b> Druckername:</b> Kann nicht geändert werden. " +
          "<p>  " +
          "<b> Druckerserver:</b> Kann nicht geändert werden.  " +
          "Dies ist der Computer, den Sie als " +
          "Server für Druckaktionen gewählt haben. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen.  " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
          "<p>  " +
          "<b> Druckeranschluss:</b> Kann nicht geändert werden.  " +
          "Gibt den Hardware-Anschluss an, z. B. /dev/term/a, mit dem der Drucker " +
          "verbunden ist.  " +
          "<p> " +
          "<b> Druckertyp:</b>  " +
          "Gibt den generischen Namen für einen " +
          " Druckertyp an. Die unterstützten Druckertypen entsprechen den " +
          " Einträgen, die in den Verzeichnissen /usr/share/lib/terminfo " +
          " aufgelistet sind. Beispiele sind PostScript, Daisy und Diablo.  " +
          "<p> " +
          "<b> Dateiinhalt:</b>  " +
          "Gibt das Format der Dateien an, die " +
          " ohne einen besonderen Filter von der Druck-Software " +
          " gedruckt werden können. PostScript ist der Standardwert, der wahrscheinlich " +
          " meistens korrekt ist.  " +
          "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs des Computers festgelegt, " +
          "auf dem der Solaris Druckmanager ausgeführt wird. Wenn Sie einen Namen-Service " +
          "verwenden, ist dieser Drucker auch der Standarddrucker für den " +
          "Namen-Service. " +
          "<p> " +
          "Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf Hinzufügen. Weitere zulässige Konstruktionen " +
          "sind Systemname!Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname!all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
	//@EN@ ModifyFailed
        {"ModifyFailed.tag", "ModifyFailed"},

        // DO NOT LOCALIZE
	//@EN@ ToModify Modify ToShowCommand Overview MainWindow HelpOnHelp
        {"ModifyFailed.seealso", "ToModify Modify ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ If Modify Printer Fails
        {"ModifyFailed.title", "Wenn das Ändern des Druckers fehlschlägt"},

        // LOCALIZE
	//@EN@ modify \"modify printer\" fail failure printer fails
        {"ModifyFailed.keywords", "Ändern \"Drucker ändern\" fehlschlagen Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> An attempt to modify printer properties failed. It is possible that someone has deleted the printer before this modify operation completed. <p> Display the Command-Line Console to help pinpoint where the error may have occurred. Choose Show Command-Line Console from the Print Manager menu to display the Command-Line Console. See the man page for lpadmin(1M) for further information.  
        {"ModifyFailed.content",
          "<p> " +
          "Der Versuch, Druckereigenschaften zu ändern, ist fehlgeschlagen. Möglicherweise wurde " +
          "der Drucker gelöscht, bevor diese Änderungsoperation beendet wurde. " +
          "<p> " +
          "Zeigen Sie die Befehlszeilenkonsole an, um festzustellen, wo der Fehler " +
          "aufgetreten sein könnte. Wählen Sie 'Befehlszeilenkonsole anzeigen' aus dem Menü " +
          "'Druckmanager', um die Befehlszeilenkonsole anzuzeigen. Siehe die Man Page für " +
          "lpadmin(1M), um weitere Informationen zu erhalten.  " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ModifyPPD
        {"ModifyPPD.tag", "ModifyPPD"},

        // DO NOT LOCALIZE
	//@EN@ ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp
        {"ModifyPPD.seealso", "ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Dialog: Modify Printer Properties
        {"ModifyPPD.title", "Dialog: Druckereigenschaften ändern"},

        // LOCALIZE
	//@EN@ modify properties \"printer properties\" \"attached printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: printer
        {"ModifyPPD.keywords", "Eigenschaften ändern \"Druckereigenschaften\" \"angeschlossener Drucker\" \"Druckername\" Server Beschreibung Anschluss Druckermarke Druckermodell Druckertreiber Fehler \"Fehlerbenachrichtigung\" \"Standarddrucker\" Banner \"angeschlossener Drucker\" neu Nobanner Dialog: Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Use the Modify Printer Properties dialog to modify an installed printer. Note that you can modify the Description field only if this is not an attached printer. You can also check or uncheck the Default Printer box. <p> <b> Printer Name:</b> Cannot be modified. <p>  <b> Printer Server:</b> Cannot be modified.  This is the computer you have selected to act as the server for print actions. You must be logged on to this computer and be running Solaris Print Manager on it.  <p>  <b> Description:</b>  [Optional] Describes the printer, including the printer type and  location, possibly, or provides other information about the  printer.  <p>  <b> Printer Port:</b> Cannot be modified.  Specifies the hardware port, such as /dev/term/a, that the printer is connected to.  <p> <b> Printer Make:</b>  Specifies the printer make, or manufacturer. This  information is on the printer and/or in the documentation  that is delivered with the printer. <p> <b> Printer Model:</b>  Specifies the printer model. This information  is found on the printer and/or in the documentation that is  delivered with the printer. <p> <b> Printer Driver:</b>  Specifies the printer driver to use with this printer. <p> <b> Fault Notification:</b>  Specifies how the superuser will be notified in  case of a printer error. <p> <b> Options: Default Printer:</b> If checked, designates this printer as the default printer for printing jobs from the computer on which you are running Solaris Print Manager. If you are using a naming service, this printer will be the default printer for the naming service, also. <p> Note that this is the last place the print subsystem looks to determine where a particular print job will be printed; the destination option of the lp command is the first place looked, and other environment variables are checked before this one. See the man page for printers.conf(4) for a full explanation of the search order. <p> <b> Options: Banner:</b> Specifies whether a banner  page will be printed between jobs.  <br> <br> \"Aways Print Banner\" stipulates that a banner will always be printed  and may not be turned off by the user.  <br> \"User Selectable - Default=on\" stipulates that a banner will be printed  unless the user selects  to turn the banner off.  <br> \"Never Print Banner\" stipulates that a banner will never be printed  and may not be turned on by the user. <p> <b> User Access List:</b>  Specifies the print clients that can  print to this printer. By default, all print  clients have access to this printer, as designated by the word \"all\" in the list.  <p> If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> To delete a user from the list, select the user in the list and click Delete.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"ModifyPPD.content",
          "<p> " +
          "Verwenden Sie den Dialog 'Druckereigenschaften ändern', um einen installierten " +
          "Drucker zu ändern. Beachten Sie, dass Sie nur das Feld 'Beschreibung' ändern können, wenn es sich " +
          "um einen nicht angeschlossenen Drucker handelt. Sie können das Feld 'Standarddrucker' auch " +
          "aktivieren oder deaktivieren. " +
          "<p> " +
          "<b> Druckername:</b> Kann nicht geändert werden. " +
          "<p>  " +
          "<b> Druckerserver:</b> Kann nicht geändert werden.  " +
          "Dies ist der Computer, den Sie als " +
          "Server für Druckaktionen gewählt haben. Sie müssen an diesem Computer " +
          "angemeldet sein und den Solaris Druckmanager darauf ausführen.  " +
          "<p>  " +
          "<b> Beschreibung:</b>  " +
          "[Optional] Beschreibt den Drucker, einschließlich Druckertyp und  " +
          "Standort, und liefert möglicherweise weitere Informationen zum " +
          " Drucker.  " +
          "<p>  " +
          "<b> Druckeranschluss:</b> Kann nicht geändert werden.  " +
          "Gibt den Hardware-Anschluss an, z. B. /dev/term/a, mit dem der Drucker " +
          "verbunden ist.  " +
	  "<p> " +
          "<b> Druckermarke:</b> " +
          "Gibt die Marke oder den Hersteller des Druckers an. Diese " +
          "Informationen finden Sie auf dem Drucker und/oder in der " +
          "mitgelieferten Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckermodell:</b> " +
          "Gibt das Druckermodell an. Diese Information " +
          "finden Sie auf dem Drucker und/oder in der mitgelieferten " +
          "Dokumentation zum Drucker." +
	  "<p> " +
          "<b> Druckertreiber:</b> " +
          "Gibt den Druckertreiber an, der für diesen Drucker verwendet " +
          "werden soll." +
          "<p> " +
          "<b> Fehlerbenachrichtigung:</b>  " +
          "Gibt an, wie der Superuser im Falle eines " +
          " Druckerfehlers benachrichtigt wird. " +
          "<p> " +
          "<b> Optionen: Standarddrucker:</b> Wenn aktiviert, wird dieser Drucker " +
          "als Standarddrucker für Druckjobs des Computers festgelegt, " +
          "auf dem der Solaris Druckmanager ausgeführt wird. Wenn Sie einen Namen-Service " +
          "verwenden, ist dieser Drucker auch der Standarddrucker für den " +
          "Namen-Service. " +
          "<p> " +
          "Beachten Sie, dass das Drucksubsystem hier zuletzt nachsieht, " +
          "um das Druckziel eines spezifischen Druckjobs zu bestimmen; die " +
          "Zieloption des Befehls lp wird als erstes überprüft und die " +
          "anderen Umgebungsvariablen werden vor dieser berücksichtigt. Siehe die Man  " +
          "Page für printers.conf(4). Dort finden Sie eine vollständige Beschreibung der Suchreihenfolge. " +
          "<p> " +
          "<b> Optionen: Deckblatt:</b> Hiermit legen Sie fest, ob  " +
          "zwischen einzelnen Druckaufträgen ein Deckblatt gedruckt wird.  " +
          "<br> " +
          "<br> " +
          "'Deckblatt immer drucken' bestimmt, dass immer ein Deckblatt  " +
          "gedruckt wird, ohne dass der Benutzer den Deckblattausdruck deaktivieren kann.  " +
          "<br> " +
          "'Benutzerdefinierbar - Standard=Ein' bestimmt, dass ein Deckblatt  " +
          "gedruckt wird, sofern der Benutzer  " +
          "den Deckblattausdruck nicht deaktiviert.  " +
          "<br> " +
          "'Deckblatt nie drucken' bestimmt, dass nie ein Deckblatt gedruckt  " +
          "wird und der Benutzer dies auch nicht aktivieren kann. " +
          "<p> " +
          "<b> Benutzerzugriffsliste:</b>  " +
          "Gibt die Druck-Clients an, die " +
          " auf diesem Drucker drucken können. Standardmäßig haben alle " +
          " Druck-Clients auf diesen Drucker Zugriff, was mit dem Wort " +
          "\"all\" in der Liste angegeben wird.  " +
          "<p> " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf Hinzufügen. Weitere zulässige Konstruktionen " +
          "sind Systemname!Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname!all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "Um einen Benutzer aus der Liste zu löschen, wählen Sie den Benutzer aus der Liste aus und klicken " +
          "auf 'Löschen'.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
	//@EN@ NISAuthentication
        {"NISAuthentication.tag", "NISAuthentication"},

        // DO NOT LOCALIZE
	//@EN@ NameService Overview MainWindow HelpOnHelp
        {"NISAuthentication.seealso", "NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ NIS Authentication
        {"NISAuthentication.title", "NIS-Authentisierung"},

        // LOCALIZE
	//@EN@ NIS \"NIS master\" master authentication login password naming \"naming service\" files .rhosts
        {"NISAuthentication.keywords", "NIS \"NIS-Master\" Master Authentisierung Anmeldung Passwort Namen \"Namen-Service\" Dateien .rhosts"},

        // LOCALIZE
	//@EN@ <p> If you are using the NIS naming service, you will need the root password for the NIS master computer to make any changes. The NIS Authentication dialog is displayed when you select NIS as the naming service. <p> 1. Enter the password for the NIS master. <p> 2. Click OK. <p> The entries you have made will be saved and the NIS Authentication dialog will be dismissed.  <p>  Click Cancel if you don't know the password for the NIS master.  <p> <b>Note:</b> Keep the following in mind if you are using Solaris Print Manager to update printer information in the NIS name service: <p> - If your network is set up with NIS master and slave servers,  the NIS slaves may not see the updated printer information  until the NIS slaves are updated. See ypmake(1M) for more information. <p>   - If your NIS servers are running Solaris 2.5 and compatible  versions, you must have explicit permissions on the NIS master  server to update the maps. This means an entry for your system  name must reside in root's .rhosts file on the NIS master server. <p> - If you have modified the yp makefile to use something other than /etc/printers.conf as the source for the NIS map, printers.conf.byname, do not use Solaris Print Manager to modify NIS. 
        {"NISAuthentication.content",
          "<p> " +
          "Wenn Sie mit dem NIS-Namen-Service arbeiten, benötigen Sie das " +
          "Root-Passwort für den NIS-Master-Computer, um Änderungen vornehmen zu können. Der Dialog " +
          "'NIS-Authentisierung' wird angezeigt, wenn Sie in einem Dialog " +
          "auf 'OK' oder 'Anwenden' klicken. " +
          "<p> " +
          "1. Geben Sie das Passwort für den NIS-Master ein. " +
          "<p> " +
          "2. Klicken Sie auf 'OK'. " +
          "<p> " +
          "Die von Ihnen vorgenommenen Einträge werden gespeichert, und der Dialog " +
          "'NIS-Authentisierung' wird geschlossen.  " +
          "<p>  " +
          "Klicken Sie auf 'Abbrechen', wenn Sie das Passwort für den NIS-Master nicht kennen.  " +
          "<p> " +
          "<b>Hinweis:</b> Beachten Sie die folgenden Punkte, wenn Sie die Druckerinformationen mit dem Solaris " +
          "Druckmanager im NIS-Namen-Service aktualisieren: " +
          "<p> " +
          "- Wenn Ihr Netzwerk mit NIS-Master- und -Slave-Servern konfiguriert ist,  " +
          "erhalten die NIS-Slaves die aktualisierten Druckerinformationen möglicherweise  " +
          "erst, wenn die NIS-Slaves aktualisiert werden. Siehe ypmake(1M), um weitere " +
          "Informationen zu erhalten. " +
          "<p> " +
          "  " +
          "- Wenn auf Ihren NIS-Servern Solaris 2.5 und kompatible  " +
          "Versionen ausgeführt werden, benötigen Sie eine ausdrückliche Berechtigung auf dem  " +
          "NIS-Master-Server, um die Maps aktualisieren zu können. Das bedeutet, dass ein Eintrag für Ihr Systemname  " +
          "in der Root-Datei .rhosts auf dem NIS-Master-Server enthalten sein muss. " +
          "<p> " +
          "- Wenn Sie die Makefile yp geändert haben, um etwas anderes als " +
          "/etc/printers.conf als Quelle für die NIS-Map " +
          "printers.conf.byname zu verwenden, dürfen Sie den Solaris Druckmanager nicht zum Ändern von NIS einsetzen. " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ NameService
        {"NameService.tag", "NameService"},

        // DO NOT LOCALIZE
	//@EN@ ToStart ToSelectName Overview HelpOnHelp
        {"NameService.seealso", "ToStart ToSelectName Overview HelpOnHelp"},

        // LOCALIZE
	//@EN@ About Naming Services
        {"NameService.title", "Informationen zu Namen-Services"},

        // LOCALIZE
	//@EN@ \"name service\" \"naming service\" name naming nis none ldap nis+ keylogin printers.conf service files hosts.equiv nisgrpadm about services
        {"NameService.keywords", "\"Namen-Service\" \"Benennungs-Service\" Name Benennung nis none ldap nis+ keylogin printers.conf service files hosts.equiv nisgrpadm Informationen zu Services"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> You can select \"files\" or a naming service (NIS, LDAP, or NIS+) when you start up Solaris Print Manager or when you choose Select Naming Service from the Print Manager menu. See the descriptions of each of the choices below. <p> Once you select a naming service, Print Manager will retrieve and update printer information in the database for the specified naming service when you add, modify, or delete a printer. Note that in addition to the naming service map, when updating attached or network printers the file /etc/printers.conf is also updated when a naming service is being used. <p> When you make a remote printer accessible by choosing Add Access to Printer from the Printer menu, either the naming service map is updated or /etc/printers.conf is updated (if \"files\" is selected and no naming service is being used). <p> <b>files</b>: Retrieve or update printer information from the file /etc/printers.conf.   <p> <b>NIS</b>: Use the printers.conf.byname map stored in the Network Information Service for retrieving or updating printer information. See the ypserv(1M) man page for more information. <p>  <b>Note: </b>When a site is set up with a NIS master and slaves, if the host binds to a slave, a user may not see NIS updates made through Print Manager until the slave computers are updated. See the ypmake(1M) man page for more information.   <p> <b>LDAP</b>: Use the printers map stored in the LDAP naming service for retrieving or updating printer information. See the ldap(1) man page for more information. <p> To used the LDAP naming service the host computer must be configured as a LDAP client, see ldapclient(1M). <p>  <b>Note:</b>If the host binds to a replica LDAP server, a user may not see updates made through Print Manager until the replica is updated from the master LDAP server. <p> <b>NIS+</b>: Use the printers.org_dir map stored in the NIS+  naming service for retrieving or updating printer information. See the nis+(1) man page for more information. <p> The following privileges are needed for each naming service:   <p> <b>For files:</b> <p> The tool must be started as root.   <p> <b>For NIS:</b>  <p> 1) The tool must be started as root. <p> 2) The password for the NIS master will be required when you select this naming service.   <p> 3) For NIS servers running pre-2.6 Solaris, you need to set up an rhosts entry on the NIS server allowing root on the print server root access on the NIS server. You must have explicit permissions on the NIS master server to update the maps. This means an entry for your host name must reside in root's .rhosts file on the NIS master server. See the hosts.equiv(4) man page for more information.   <p> <b>For LDAP:</b>  <p> 1) The tool must be started as root. <p> 2) A fully distinguished name (DN) with update privilege and password will  be required when you select this naming service. <p>   <b>For NIS+:</b>  <p> 1) The computer that Solaris Print Manager is running on must be added to the list of principals authorized to update the NIS+ map printers.org_dir. See the nisgrpadm(1) man page for more information. <p>   2) Solaris Print Manager must be started as root. Depending on configuration the user may also need to do a keylogin. See the keylogin(1) man page for more information. <p> 
        {"NameService.content",
          "<p> " +
          "Sie können \"Dateien\" oder einen Namens-Service (NIS, LDAP, oder NIS+) wählen, wenn Sie " +
          "den Solaris Druckmanager starten oder wenn Sie 'Namens-Service " +
          "auswählen' aus dem Menü 'Druckmanager' gewählt haben. Siehe Beschreibungen der " +
          "nachfolgend aufgeführten Optionen. " +
          "<p> " +
          "Nach der Auswahl eines Namens-Service liest und aktualisiert der Druckmanager " +
          "die in der Datenbank enthaltenen Druckerinformation für den jeweiligen Namens-Service, " +
          "wenn Sie einen Drucker hinzufügen, Ändern oder löschen. Bitte beachten Sie, dass zusätzlich " +
          "zur Namensdiensttabelle bei der Aktualisierung angeschlossener lokaler bzw. Netzwerkdrucker " +
          "die Datei /etc/printers.conf ebenfalls aktualisiert wird, wenn ein Namens-Service " +
          "verwendet wird. " +
          "<p> " +
          "Wenn Sie einen Netzwerkdrucker durch Auswahl von 'Zugriff auf " +
          "Drucker hinzufügen' aus dem Menü zugänglich machen, wird entweder die Namensdiensttabelle " +
          "oder die Datei /etc/printers.conf aktualisiert (wenn \"Dateien\" ausgewählt wurde und " +
          "keine Namens-Services verwendet werden). " +
          "<p> " +
          "<b>Dateien</b>: Lesen bzw. Aktualisieren von Druckerinformationen aus " +
          "der Datei /etc/printers.conf. " +
          "  " +
          "<p> " +
          "<b>NIS</b>: Verwendung der Tabelle printers.conf.byname, die im Netzwerk- " +
          "Informations-Service (NIS) zum Lesen bzw. Aktualisieren von Druckerinformationen gespeichert ist. " +
          "Mehr Informationen erhalten Sie auf der Man-Page ypserv(1M). " +
          "<p>  " +
          "<b>Hinweis: </b>Wenn ein Netzwerk mit NIS-Masters und -Slaves konfiguriert ist, " +
          "kann es vorkommen, dass, wenn ein Host an einen Slave gebunden wird, für den Benutzer die NIS-Aktualisierungen, die durch " +
          "den Druckmanager gemacht wurden, erst bei Aktualisierung der Slave-Computer sichtbar werden. " +
          "Mehr Informationen erhalten Sie auf der Man-Page ypmake(1M). " +
          "  " +
          "<p> " +
          "<b>LDAP</b>: Verwenden der Druckertabelle, die im LDAP- " +
          "Namen-Service zum Lesen bzw. Aktualisieren von Druckerinformationen gespeichert ist. " +
          "Mehr Informationen erhalten Sie auf der Man-Page ldap(1). " +
          "<p> " +
          "Um den LDAP-Namen-Service nutzen zu können, muss der Host-Computer als " +
          "LDAP-Client konfiguriert sein, siehe ldapclient(1M). " +
          "<p>  " +
          "<b>Hinweis:</b>Wenn der Host an eine Replika eines LDAP-Servers gebunden wird, kann es vorkommen, dass für den Benutzer " +
          "die durch den Druckmanager gemachten Aktualisierungen erst bei Aktualisierung der Replika vom Master- " +
          "LDAP-Server sichtbar werden. " +
          "<p> " +
          "<b>NIS+</b>: Verwenden der Tabelle printers.org_dir, die im NIS+- " +
          "Namen-Service zum Lesen bzw. Aktualisieren von Druckerinformationen gespeichert ist. " +
          "Mehr Informationen erhalten Sie auf der Man-Page nis+(1). " +
          "<p> " +
          "Für jeden Namen-Service werden die folgenden Priviliegien verwendet: " +
          "  " +
          "<p> " +
          "<b>Für Dateien</b>" +
          "<p> " +
          "Das Tool muss als Root gestartet werden. " +
          "  " +
          "<p> " +
          "<b>For NIS:</b>  " +
          "<p> " +
          "1) Das Tool muss als Root gestartet werden. " +
          "<p> " +
          "2) Das Password für den NIS-Master wird benötigt, wenn Sie " +
          "diesen Namen-Service auswählen. " +
          "  " +
          "<p> " +
          "3) Bei NIS-Servern, auf denen Solaris vor Version 2.6 installiert ist, müssen Sie " +
          "auf dem NIS-Server einen rhosts-Eintrag einrichten, mit dem der root-Benutzer auf dem Drucker-Server root-" +
          "Zugriffsrechte auf dem NIS-Server hat. Sie müssen explizite Zugriffsrechte für den " +
          "NIS-Masterserver haben, um die Tabellen aktualisieren zu können. Das bedeutet, dass sich ein Eintrag für Ihren " +
          "Host-Namen in der Datei .rhosts des root-Benutzers auf dem NIS-Masterserver befinden muss. " +
          "Mehr Informationen erhalten Sie auf der Man-Page hosts.equiv(4). " +
          "  " +
          "<p> " +
          "<b>Für LDAP</b>" +
          "<p> " +
          "1) Das Tool muss als Root gestartet werden. " +
          "<p> " +
          "2) Einen vollständiger Distinguished Name (DN) mit Aktualisierungsprivilegien und Passwort ist " +
          " nötig, wenn Sie diesen Namen-Service auswählen. " +
          "<p> " +
          "  " +
          "<b>Für NIS</b>" +
          "<p> " +
          "1) Der Computer, auf dem der Solaris Druckmanager läuft, muss zur Liste " +
          "der Hauptelemente, die zur Aktualisierung der NIS+-Tabelle printers.org_dir berechtigt sind, hinzugefügt werden." +
          "Mehr Informationen erhalten Sie auf der Man-Page nisgrpadm(1). " +
          "<p> " +
          "  " +
          "2) Der Solaris Druckmanager muss als Root gestartet werden. Je nach " +
          "der Konfiguration kann es sein, dass der Benutzer auch ein keylogin druchführen muss. Siehe " +
          "auch die Man-Page keylogin(1), wenn Sie mehr Informationen benötigen. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ Overview
        {"Overview.tag", "Overview"},

        // DO NOT LOCALIZE
	//@EN@ MainWindow AddAccess InstallLocal InstallNetwork Modify ToAddAccess ToStart ToInstallLocal ToInstallNetwork ToModify ToDelete ToSelectName ToExit ToFindPrinter ToShowCommand ToConfirmActions HelpOnHelp
        {"Overview.seealso", "MainWindow AddAccess InstallLocal InstallNetwork Modify ToAddAccess ToStart ToInstallLocal ToInstallNetwork ToModify ToDelete ToSelectName ToExit ToFindPrinter ToShowCommand ToConfirmActions HelpOnHelp"},

        // LOCALIZE
	//@EN@ Overview
        {"Overview.title", "Übersicht"},

        // LOCALIZE
	//@EN@ overview contents task dialog
        {"Overview.keywords", "Übersicht Inhalt Aufgabe Dialog"},

        // LOCALIZE
	//@EN@ <p>  Use Solaris Print Manager to select a naming service, to install attached or network printers, and to add, modify, or remove access to installed printers. Five windows or dialogs and 11 tasks -- listed below -- are described in the help volume. To view one of the help articles, select it in the See also pulldown menu and click the Show button.  <p> If you need more information about printing, see the \"Solaris Print Manager Administration Guide\" AnswerBook or the \"Setting Up Printers\" chapter in the Solaris System Administrator AnswerBook. <p>  <b> Windows and Dialogs </b>  <p> Main Window <br>  Add Access to Printer <br> New Attached Printer <br> New Network Printer <br> Modify Printer Properties <p>  <b>Tasks</b> <p> To Start Solaris Print Manager <br> To Add Access to an Installed Printer <br> To Install an Attached Printer <br> To Install a Network Printer <br> To Modify Printer Properties <br> To Delete a Printer <br> To Select a Naming Service <br>  To Exit Solaris Print Manager <br>  To Find a Printer <br>  To Show the Command-Line Console <br>  To Confirm All Actions <p>  <b>More About Printing and Solaris Print Manager </b> <p>  If you need more information about printing or about Solaris Print Manager, including a description of mouseless navigation, see the \"Solaris Print Manager Administration Guide\" AnswerBook or the \"Setting Up Printers\" chapter in the Solaris System Administrator AnswerBook. <p> 
        {"Overview.content",
          "<p>  " +
          "Verwenden Sie den Solaris Druckmanager, um einen Namen-Service zu wählen, angeschlossene Drucker " +
          "oder Netzwerkdrucker zu installieren oder installierte Drucker hinzuzufügen, zu ändern oder den Zugriff auf diese Drucker " +
          "zu entziehen. In der Hilfe werden fünf Fenster oder Dialoge und 11 Aufgaben beschrieben, die " +
          "im Folgenden aufgelistet sind. Wenn Sie einen der Hilfetexte anzeigen möchten, wählen Sie den gewünschten Text " +          "aus dem Pulldown-Menü 'Siehe auch' und klicken auf die Schaltfläche 'Anzeigen'.  " +
          "<p> " +
          "Wenn Sie weitere Informationen zum Drucken benötigen, ziehen Sie das AnswerBook \"Solaris Print " +
          "Manager Administration Guide\" oder das Kapitel \"Setting Up Printers\" " +
          "im AnswerBook 'Solaris System Administrator' zu Rate. " +
          "<p>  " +
          "<b> Fenster und Dialoge </b>  " +
          "<p> " +
          "Hauptfenster " +
          "<br>  " +
          "Zugriff auf Drucker hinzufügen " +
          "<br> " +
          "Neuer angeschlossener Drucker " +
          "<br> " +
          "Neuer Netzwerkdrucker " +
          "<br> " +
          "Druckereigenschaften ändern " +
          "<p>  " +
          "<b>Aufgaben</b> " +
          "<p> " +
          "So starten Sie den Solaris Druckmanager " +
          "<br> " +
          "So fügen Sie Zugriff auf einen installierten Drucker hinzu " +
          "<br> " +
          "So installieren Sie einen angeschlossenen Drucker " +
          "<br> " +
          "So installieren Sie einen Netzwerkdrucker " +
          "<br> " +
          "So ändern Sie Druckereigenschaften " +
          "<br> " +
          "So löschen Sie einen Drucker " +
          "<br> " +
          "So wählen Sie einen Namen-Service " +
          "<br>  " +
          "So beenden Sie den Solaris Druckmanager " +
          "<br>  " +
          "So suchen Sie einen Drucker " +
          "<br>  " +
          "So zeigen Sie die Befehlszeilenkonsole an " +
          "<br>  " +
          "So bestätigen Sie alle Aktionen " +
          "<p>  " +
          "<b>Weitere Informationen zum Drucken und zum Solaris Druckmanager </b> " +
          "<p>  " +
          "Wenn Sie weitere Informationen zum Drucken oder zum Solaris Druckmanager " +
          "(einschließlich einer Beschreibung der Navigation ohne Maus) benötigen, ziehen Sie das " +
          " AnswerBook \"Solaris Print Manager Administration Guide\" oder das " +
          "Kapitel \"Setting Up Printers\" im AnswerBook 'Solaris System Administrator' " +
          "zu Rate. " +
          "<p> " +
          ""
        },






        // DO NOT LOCALIZE
	//@EN@ PrinterPort
        {"PrinterPort.tag", "PrinterPort"},

        // DO NOT LOCALIZE
	//@EN@ InstallLocal ToInstallLocal Overview MainWindow HelpOnHelp
        {"PrinterPort.seealso", "InstallLocal ToInstallLocal Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Specify Printer Port
        {"PrinterPort.title", "Druckeranschluss angeben"},

        // LOCALIZE
	//@EN@ port \"printer port\" other specify printer
        {"PrinterPort.keywords", "Anschluss \"Druckeranschluss\" weitere Drucker angeben"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> The printer port is the device name (typically, /dev/term/a, /dev/term/b, or /dev/bpp0) corresponding to the port to which a locally attached printer is physically connected. You usually connect printer cables to a serial port (/dev/term/a or /dev/term/b, for example) but in some cases you can use a parallel port (/dev/bpp0, for example). See the printer vendor's documentation and your system's installation documentation for information about switch settings and cabling requirements. <p> Note that the device name must exist and have write permissions set. <p> 
        {"PrinterPort.content",
          "<p> " +
          "Der Druckeranschluss ist der Gerätename (in der Regel /dev/term/a, " +
          "/dev/term/b oder /dev/bpp0), der dem Anschluss entspricht, mit dem ein " +
          "lokal angeschlossener Drucker physisch verbunden ist. Normalerweise werden " +
          "Druckerkabel mit einem seriellen Anschluss (z. B. /dev/term/a oder /dev/term/b) " +
          "verbunden; in manchen Fällen können Sie jedoch einen parallelen Anschluss (z. B. /dev/bpp0) " +
          "verwenden. Informationen zu den Schaltereinstellungen und den Kabelanforderungen " +
          "finden Sie in der Dokumentation des Druckerherstellers und im " +
          "Installationshandbuch Ihres Systems. " +
          "<p> " +
          "Beachten Sie, dass der Gerätename vorhanden sein muss und eine Schreibberechtigung " +
          "erforderlich ist. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ PrinterType
        {"PrinterType.tag", "PrinterType"},

        // DO NOT LOCALIZE
	//@EN@ InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp
        {"PrinterType.seealso", "InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ Specify Printer Type
        {"PrinterType.title", "Druckertyp angeben"},

        // LOCALIZE
	//@EN@ \"printer type\" type specify printer
        {"PrinterType.keywords", "\"Druckertyp\" Typ Drucker angeben "  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> When you configure a printer, you must identify the manufacturer  and model of the printer in a way that the LP print service understands the printer type. Examples are PostScript, Daisy, and Diablo.  <p>  If you have a PostScript printer, for example, select PostScript as the Printer Type. To install a printer type that is not listed select Other. The printer type you enter must correspond to an entry in the /usr/share/lib/terminfo directories. See the terminfo(4) man page for more information. <p> 
        {"PrinterType.content",
          "<p> " +
          "Beim Konfigurieren eines Druckers müssen Sie den Hersteller und  " +
          "das Modell des Druckers so angeben, dass der LP-Druck-Service " +
          "den Druckertyp erkennt. Beispiele sind PostScript, Daisy und Diablo.  " +
          "<p>  " +
          "Wenn Sie z. B. einen PostScript-Drucker besitzen, wählen Sie 'PostScript' " +
          "als den Druckertyp. Wenn Sie einen nicht aufgelisteten Druckertyp installieren möchten, wählen Sie " +
          "'Andere'. Der eingegebene Druckertyp muss einem Eintrag in den " +
          "Verzeichnissen /usr/share/lib/terminfo entsprechen. Siehe die Man Page für terminfo(4), " +
          "um weitere Informationen zu erhalten. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ RemoteServer
        {"RemoteServer.tag", "RemoteServer"},

        // DO NOT LOCALIZE
	//@EN@ AddAccess ToAddAccess Overview MainWindow HelpOnHelp
        {"RemoteServer.seealso", "AddAccess ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ Specify Remote Server
        {"RemoteServer.title", "Angeben eines fernen Servers"},

        // LOCALIZE
	//@EN@ remote \"remote printer\" server \"printer server\" fail failure specify
        {"RemoteServer.keywords", "entfernt \"Netzwerkdrucker\" Server \"Drucker-Server\" fehlschlagen angeben"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> A printer server must be specified; the printer server is the computer on which the software for the remote printer is installed.  <p> 
        {"RemoteServer.content",
          "<p> " +
          "Es muss ein Druckerserver angegeben werden; der Druckerserver ist der Computer, " +
          "auf dem die Software für den fernen Drucker installiert ist.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ShowCommandConsole
        {"ShowCommandConsole.tag", "ShowCommandConsole"},

        // DO NOT LOCALIZE
	//@EN@ Overview MainWindow ToShowCommand
        {"ShowCommandConsole.seealso", "Overview MainWindow ToShowCommand"},

        // LOCALIZE
	//@EN@ Command-Line Console
        {"ShowCommandConsole.title", "Befehlszeilenkonsole"},

        // LOCALIZE
	//@EN@ \"command-line\" log command console show
        {"ShowCommandConsole.keywords", "\"Befehlszeile\" Protokoll Befehl Konsole anzeigen"},

        // LOCALIZE
	//@EN@ <p> The Command-Line Console displays the command-line version of add, modify, and delete actions. Errors and warnings may also be displayed after the command.  <p> For example, if you choose Add Access to Printer from the Print Manager menu and enter Printer Name = MyPrinter, Printer Server = PrintServer2, Description = Local Printer, the Command-line Console will display: <p> Add Access to printer <br> % /usr/sbin/lpadmin -p MyPrinter -s PrintServer2 -D \"Local Printer\" <p> The Command-line Console is displayed if the Show Command-Line Console box is checked in the Print Manager menu.  <p> <b>Note: </b>When updating the NIS naming service, there are some cases where there is no command line equivalent for what Solaris Print Manager is doing. In these cases what gets reported to the Command-Line console is: \"rsh [nis_master] ...\" or \"rexec([nis_master]) ...\" <p> <b>Note: </b>When updating the LDAP naming service, the Solaris Print Manager uses native (or compiled) code to process updates. This is done to enhance security related to the LDAP password. The command-line used to update the LDAP database is not displayed for security reasons, but the log will include the entry \"ldap ...\" to indicate that the LDAP database has been updated. <p> 
        {"ShowCommandConsole.content",
          "<p> " +
          "Auf der Befehlszeilenkonsole wird die Befehlszeilenversion von Hinzufüge-, " +
          "Änderungs- und Löschaktionen angezeigt. Hinter dem Befehl können außerdem " +
          "Fehler- und Warnmeldungen eingeblendet werden.  " +
          "<p> " +
          "Wenn Sie z. B. \"Zugriff auf Drucker hinzufügen\" aus dem Menü \"Drucker\" wählen, " +
          "und die Angaben Druckername = Drucker, Drucker-Server = " +
          "DruckServer2, Beschreibung = Lokaler Drucker einfügen, so zeigt die " +
          "Befehlszeilenkonsole Folgendes an: " +
          "<p> " +
          "Zugriff auf Drucker hinzufügen " +
          "<br> " +
          "% /usr/sbin/lpadmin -p Drucker -s DruckServer2 -D \"Lokaler Drucker\" " +
          "<p> " +
          "Die Befehlszeilenkonsole wird dann eingeblendet, wenn Sie im Menü \"Druckmanager\" " +
          "das Kontrollkästchen \"Befehlszeilenkonsole anzeigen\" markiert haben.  " +
          "<p> " +
          "<b>Hinweis: </b>Bei der Aktualisierung von NIS können Situationen entstehen, in " +
          "welchen es kein Befehlszeilen-Äquivalent für die Schritte gibt, die der Solaris Druckmanager " +
          "unternimmt. In solchen Fällen sehen Sie auf der Befehlszeilenkonsole " +
          "die Meldung: \"rsh [nis_master] ...\" oder " +
          "\"rexec([nis_master]) ...\" " +
          "<p> " +
          "<b>Hinweis: </b>Aktualisierungen des LDAP-Namen-Service verarbeitet der " +
          "Solaris Druckmanager mit nativem (oder kompiliertem) Code. Dies gewährleistet " +
          "eine erhöhte Sicherheit bezüglich des LDAP-Passworts. Aus Sicherheitsgründen " +
          "wird die Befehlszeile für die Aktualisierung der LDAP-Datenbank nicht angezeigt. Das " +
          "Protokoll enthält jedoch den Eintrag \"ldap ...\", der darauf hinweist, dass die " +
          "LDAP-Datenbank aktualisiert wurde. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToAddAccess
        {"ToAddAccess.tag", "ToAddAccess"},

        // DO NOT LOCALIZE
	//@EN@ AddAccess ToModify ToDelete MainWindow HelpOnHelp
        {"ToAddAccess.seealso", "AddAccess ToModify ToDelete MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Add Access to an Installed Printer
        {"ToAddAccess.title", "So fügen Sie Zugriff auf einen installierten Drucker hinzu"},

        // LOCALIZE
	//@EN@ access \"add access\" description \"default printer\" \"naming service\" \"printer name\" \"printer server\" add installed printer
        {"ToAddAccess.keywords", "Zugriff \"Zugriff hinzufügen\" Beschreibung \"Standard-Drucker\" \"Namen-Service\" \"Druckername\" \"Drucker-Server\" hinzufügen installierter Drucker "  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@   <p>  Do the following to make an installed printer accessible to print client computers. See the printers.conf(4) man page for more information about print client commands. <p>  <b>Note:</b> If you are using a naming service, use this procedure to add access to a private printer (one that is not listed in the naming service) or to make the printer usable even if the naming service server is down. This adds access for all users in the naming service domain; see the man page for domainname(1M) for more information about domains.  <p> If a naming service is not being used for printing, use this procedure to add access to a remote printer.   <p> 1. Choose Add Access to Printer from the Printer menu. <p>  The Add Access To Printer dialog is displayed. <p> 2. Enter a printer name, printer server name, and description (optional). <p>  Note that Solaris Print Manager does not check for the validity of Printer Name or Printer Server.  <p> 3. Click Default Printer if you want this printer to be the default printer. <p> If a naming service is being used, this printer will be designated as the default printer for all users in the domain.  <p> If no naming service is being used, this printer will be designated as the default printer for the computer on which you are running Solaris Print Manager. <p> Note that this is the last place the print commands will look to determine the printer for a specific print command; see the man page for printers.conf(4) for more information about resolving printer conflicts. <p> 4. Click OK or Apply to add access for the specified printer. <p> <b> Note:</b> If you are using the NIS naming service, you have to know the root password for the NIS master. If you are using the LDAP naming service, you must know a fully distinguished name which has update privilege and the corresponding password. Default values may need to be overridden. You will be prompted for the password when you click Apply or OK. Enter the password and click OK. <p>  The list of printers displayed in the Solaris Print Manager main window  is updated to include the new printer. <p>  The Add Access dialog will remain displayed if you click Apply, allowing you to add access to additional printers.  <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"ToAddAccess.content",
          "  " +
          "<p>  " +
          "Gehen Sie wie im Folgenden beschrieben vor, um " +
          "Druck-Client-Computern einen installierten Drucker zur Verfügung zu stellen. Siehe die Man Page printers.conf(4), um weitere " +
          "Informationen zu Druck-Client-Befehlen zu erhalten. " +
          "<p>  " +
          "<b>Hinweis:</b> Wenn Sie einen Namen-Service verwenden, können Sie einem privaten Benutzer " +
          "(Benutzer, der nicht im Namen-Service aufgeführt ist) mit dieser Prozedur Zugriff verschaffen " +
          "oder den Drucker selbst dann bereitstellen, wenn der Server für den " +
          "Namen-Service nicht verfügbar ist. Damit können alle Benutzer in der Domain auf " +
          "den Namen-Service zugreifen; siehe die Man Page für domainname(1M), um weitere Informationen zu  " +
          "Domains zu erhalten.  " +
          "<p> " +
          "Wenn zum Drucken kein Namen-Service verwendet wird, können Sie mit dieser Prozedur " +
          "Zugriff auf einen fernen Drucker hinzufügen. " +
          "  " +
          "<p> " +
          "1. Wählen Sie 'Zugriff auf Drucker hinzufügen' aus dem Menü 'Drucker'. " +
          "<p> " +
          " Der Dialog 'Zugriff auf Drucker hinzufügen' wird angezeigt. " +
          "<p> " +
          "2. Geben Sie einen Druckernamen, einen Druckerservernamen und eine Beschreibung (optional) ein. " +
          "<p>  " +
          "Beachten Sie, dass der Solaris Druckmanager den " +
          "Druckernamen oder Druckerserver nicht auf seine Gültigkeit prüft.  " +
          "<p> " +
          "3. Klicken Sie auf 'Standarddrucker', wenn dieser Drucker als " +
          "Standarddrucker verwendet werden soll. " +
          "<p> " +
          "Wenn ein Namen-Service verwendet wird, dann wird dieser Drucker als " +
          "Standarddrucker für alle Benutzer in der Domain festgelegt.  " +
          "<p> " +
          "Wenn kein Namen-Service verwendet wird, denn wird dieser Drucker als " +
          "Standarddrucker für den Computer festgelegt, auf dem der Solaris " +
          "Druckmanager ausgeführt wird. " +
          "<p> " +
          "Beachten Sie, dass die Druckbefehle hier zuletzt nachsehen, " +
          "um den Drucker für den spezifischen Druckbefehl zu bestimmen; siehe die " +
          "Man Page für printers.conf(4), um weitere Informationen zum Lösen " +
          "von Druckerkonflikten zu erhalten. " +
          "<p> " +
          "4. Klicken Sie auf 'OK' oder auf 'Anwenden', um für den angegebenen Drucker Zugriff hinzuzufügen. " +
          "<p> " +
          "<b> Hinweis:</b> Wenn Sie den NIS-Namen-Service verwenden, müssen Sie das " +
          "Root-Passwort für den NIS-Master kennen; Sie werden zur Eingabe " +
          "des Passworts aufgefordert, wenn Sie auf 'Anwenden' oder 'OK' klicken. Geben Sie das Passwort ein, und klicken Sie auf " +
          "'OK'. " +
          "<p> " +
          " Der neue Drucker wird in die Liste der Drucker aufgenommen, die im Hauptfenster des Solaris Druckmanagers " +
          " angezeigt wird. " +
          "<p> " +
          " Der Dialog 'Zugriff auf Drucker hinzufügen' wird nach Klicken auf 'Anwenden' weiterhin angezeigt. " +
          "Dadurch haben Sie die Möglichkeit, Zugriff auf weitere Drucker hinzuzufügen.  " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToConfirmActions
        {"ToConfirmActions.tag", "ToConfirmActions"},

        // DO NOT LOCALIZE
	//@EN@ Overview MainWindow HelpOnHelp
        {"ToConfirmActions.seealso", "Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Confirm All Actions
        {"ToConfirmActions.title", "So bestätigen Sie alle Aktionen"},

        // LOCALIZE
	//@EN@ confirm action all actions
        {"ToConfirmActions.keywords", "bestätigen Aktion alle Aktionen"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Do the following to require that all Solaris Print Manager actions be confirmed before being executed, or to turn off this option.  <p> 1. Choose Confirm All Actions from the Print Manager menu.  <p> If the Confirm All Actions box was not checked, it will be checked  and all subsequent Solaris Print Manager actions will require confirmation before being performed.  <p> If the Confirm All Actions box was checked, it will no longer be checked  and subsequent Solaris Print Manager actions will NOT require confirmation before being performed. Note that some actions, such as Delete Printer, require confirmation regardless of the setting of the Confirm All Actions box.  <p> 
        {"ToConfirmActions.content",
          "<p> " +
          "Gehen Sie wie folgt vor, wenn alle Aktionen des Solaris Druckmanagers " +
          "vor deren Ausführung bestätigt werden sollen, oder deaktivieren Sie diese Option.  " +
          "<p> " +
          "1. Wählen Sie 'Alle Aktionen bestätigen' aus dem Menü 'Druckmanager'.  " +
          "<p> " +
          "Wenn das Feld 'Alle Aktionen bestätigen' nicht aktiviert war, wird es nun aktiviert  " +
          "und alle nachfolgenden Solaris Druckmanager-Aktionen müssen " +
          "vor deren Ausführung bestätigt werden.  " +
          "<p> " +
          "Wenn das Feld 'Alle Aktionen bestätigen' aktiviert war, ist es nun deaktiviert  " +
          "und alle nachfolgenden Solaris Druckmanager-Aktionen müssen vor deren Ausführung NICHT " +
          "bestätigt werden. Beachten Sie, dass manche Aktionen (z. B. " +
          "das Löschen eines Druckers) unabhängig von der Einstellung des Felds " +
          "'Alle Aktionen bestätigen' bestätigt werden müssen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToDelete
        {"ToDelete.tag", "ToDelete"},

        // DO NOT LOCALIZE
	//@EN@ ToAddAccess AddAccess MainWindow Overview HelpOnHelp
        {"ToDelete.seealso", "ToAddAccess AddAccess MainWindow Overview HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Delete a Printer
        {"ToDelete.title", "So löschen Sie einen Drucker"},

        // LOCALIZE
	//@EN@ delete uninstall \"local printer\" \"network printer\" \"attached printer\" printer
        {"ToDelete.keywords", "löschen deinstallieren \"lokaler Drucker\" \"Netzwerkdrucker\" \"angeschlossener Drucker\" Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p>  Do the following to delete a printer from the printer list.  <p> 1. Select the printer in the list of printers in the Solaris Print Manager main window. <p>  2. Choose Delete Printer from the Printer menu.  <p>  A dialog is displayed, asking if you really want to delete the selected printer.  <p> <b>Note:</b> If the printer is a local printer (one installed on the current server), the printer will be uninstalled; if a naming service has been selected, the entry for this printer will also be removed from the naming service.  <p>  3. Click OK to delete the printer.  <p>  A window is displayed asking you to confirm the  deletion. <p>  4. Click Delete. <p>  The selected printer is deleted from the Solaris Print Manager main window. <p> 
        {"ToDelete.content",
          "<p>  " +
          "Gehen Sie wie folgt vor, um einen Drucker aus der Druckerliste zu löschen:  " +
          "<p> 1. Wählen Sie den gewünschten Drucker aus der Druckerliste im Hauptfenster des Solaris " +
          "Druckmanagers. " +
          "<p>  " +
          "2. Wählen Sie 'Drucker löschen' aus dem Menü 'Drucker'.  " +
          "<p>  " +
          "Ein Dialog wird angezeigt, " +
          "in dem Sie gefragt werden, ob Sie den ausgewählten Drucker wirklich löschen möchten.  " +
          "<p> <b>Hinweis:</b> Wenn es sich um einen lokalen Drucker handelt (einer, der auf " +
          "dem aktuellen Server installiert ist), wird der Drucker deinstalliert; wenn Sie einen " +
          "Namen-Service ausgewählt haben, wird der Eintrag für diesen Drucker " +
          "auch aus dem Namen-Service entfernt.  " +
          "<p>  " +
          "3. Klicken Sie auf 'OK', um den Drucker zu löschen.  " +
          "<p>  " +
          "Ein Fenster erscheint, in dem Sie aufgefordert werden, die " +
          " Löschoperation zu bestätigen. " +
          "<p>  " +
          "4. Klicken Sie auf 'Löschen'. " +
          "<p>  " +
          "Der gewählte Drucker wird aus dem Hauptfenster des Solaris Druckmanagers " +
          "gelöscht. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToExit
        {"ToExit.tag", "ToExit"},

        // DO NOT LOCALIZE
	//@EN@ ToStart Overview MainWindow HelpOnHelp
        {"ToExit.seealso", "ToStart Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Exit Solaris Print Manager
        {"ToExit.title", "So beenden Sie den Solaris Druckmanager"},

        // LOCALIZE
	//@EN@ exit close solaris print manager
        {"ToExit.keywords", "beenden schließen Solaris Druckmanager"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> 1. Choose Exit from the Print Manager menu.  <p> The Solaris Print Manager main window and any other open Print Manager dialogs are closed.  <p> 
        {"ToExit.content",
          "<p> " +
          "1. Wählen Sie 'Beenden' aus dem Menü 'Druckmanager'.  " +
          "<p> " +
          "Das Hauptfenster des Solaris Druckmanagers und alle geöffneten Druckmanager-Dialoge " +
          "werden geschlossen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToFindPrinter
        {"ToFindPrinter.tag", "ToFindPrinter"},

        // DO NOT LOCALIZE
	//@EN@ Overview MainWindow HelpOnHelp
        {"ToFindPrinter.seealso", "Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Find a Printer
        {"ToFindPrinter.title", "So suchen Sie einen Drucker"},

        // LOCALIZE
	//@EN@ find \"printer name\" tool printer
        {"ToFindPrinter.keywords", "suchen \"Druckername\" Tool Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Do the following to find a printer in the Solaris Print Manager list of printers. <p> 1. Choose Find Printer from the Tools menu. <p> A dialog will be displayed, asking you to enter the name of a printer to find. <p> 2. Type a printer name in the text field and click Find. <p> If the exact printer name is found in the list, it will be selected; the list will scroll, if necessary. If the printer is not found, a message will be displayed, indicating that the named printer was not found in the current list.  <p> 
        {"ToFindPrinter.content",
          "<p> " +
          "Gehen Sie wie folgt vor, um einen Drucker in der Solaris-Druckmanager-Liste " +
          "der Drucker zu suchen: " +
          "<p> " +
          "1. Wählen Sie 'Drucker suchen' aus dem Menü 'Tools'. " +
          "<p> " +
          "Ein Dialog wird angezeigt, in dem Sie aufgefordert werden, den Namen des zu suchenden Druckers einzugeben. " +
          "<p> " +
          "2. Geben Sie einen Druckernamen in das Textfeld ein, und klicken Sie auf 'Suchen'. " +
          "<p> " +
          "Der Druckername wird ausgewählt, wenn er in der Liste enthalten ist; " +
          "falls erforderlich, wird die Liste durchgeblättert. Wenn der Drucker nicht gefunden wird, erscheint " +
          "eine Meldung, die besagt, dass der angegebene Drucker " +
          "in der aktuellen Liste nicht gefunden wurde.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToInstallLocal
        {"ToInstallLocal.tag", "ToInstallLocal"},

        // DO NOT LOCALIZE
	//@EN@ InstallLocal ToAddAccess Overview MainWindow HelpOnHelp
        {"ToInstallLocal.seealso", "InstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Install an Attached Printer
        {"ToInstallLocal.title", "So installieren Sie einen angeschlossenen Drucker"},

        // LOCALIZE
	//@EN@ install \"local printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner nobanner \"attached printer\" new attached printer
        {"ToInstallLocal.keywords", "installieren \"lokaler Drucker\" \"Druckername\" Server Beschreibung Anschluss \"Druckertyp\" \"Dateiinhalt\" Fehler \"Fehlerbenachrichtigung\" \"Standard-Drucker\" Banner Nobanner \"angeschlossener Drucker\" neu angeschlossener Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Once you have physically connected the printer to the printer server, do the following to install the printer, which makes the printer available for printing from the computer on which you are running Solaris Print Manager.  <p> <b> Note:</b> The computer on which you are running Solaris Print Manager becomes the printer server for the printer being installed. <p> 1. Choose New Attached Printer from the Printer menu. <p>  The New Attached Printer dialog will be displayed. <p> 2. Enter a name in Printer Name. <p> 3. [Optional] Enter a description of the printer. <p> This might include the location and the type of printer. <p> 4. Select a port from the Printer Port pulldown menu. <p> This is the hardware port where the printer is plugged into the server. If you choose Other, a dialog will pop up asking you to specify a port. Enter a port and click OK. <p> 5. Select a printer type from the Printer Type pulldown menu. <p> Scroll the list if necessary. If the printer type is not in the list, select Other; you will be asked to specify a printer type. Enter a printer type and click OK. <p> 6. Select an item in the File Contents pulldown menu. <p> Choices include PostScript and ASCII; the default is PostScript, which will work in most cases.  <p> 7. Select an item in the Fault Notification pulldown menu. <p> The default is Write to Superuser. <p> 8. [Optional] Click Default Printer if you want this printer to be the default printer for this server. <p> 9. [Optional] Select option to define whether a banner  page is to be printed between jobs. \"Always Print Banner\" specifies that a banner will be printed and the user may not specify otherwise. \"User Selectable - Default=on\" specifies that the user may specify to turn off the banner in the print command; if the user does not specify, the banner will be printed. \"Never Print Banner\" specifies that a banner will not be printed and the user may not specify otherwise. The default action is to always print the banner. <p> 10. Modify the User Access List, if necessary. <p> The default value is \"all,\" meaning that anyone can use this printer. If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> To remove a name from the list, select it and click Delete. <p> <b> Note:</b> If you enter \"all\" or \"none\" in the text field and click Add, all individual user names will be deleted from the list and replaced by \"all\" or \"none.\"  <p>  11. Click OK or Apply to install the printer. <p> The window will remain if you click Apply, allowing you to install additional printers.  <p> <b> Note:</b> If you are using the NIS naming service, you have to know the root password for the NIS master. If you are using the LDAP naming service you must know a fully distinguished name which has update privilege and the corresponding password. Default values may need to be overridden. You will be prompted for the password when you click Apply or OK. Enter the password and click OK. <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"ToInstallLocal.content",
          "<p> " +
          "Sobald Sie den Drucker physisch an den Druckerserver angeschlossen haben, " +
          "führen Sie die folgenden Schritte aus, um den Drucker zu installieren. Damit wird der Drucker " +
          "für Druckoperationen anderer Computer verfügbar gemacht, auf denen " +
          "der Solaris Druckmanager ausgeführt wird.  " +
          "<p> " +
          "<b> Hinweis:</b> Der Computer mit dem Solaris Druckmanager " +
          "wird der Druckerserver für den installierten Drucker. " +
          "<p> " +
          "1. Wählen Sie 'Neuer angeschlossener Drucker' aus dem Menü 'Drucker'. " +
          "<p>  " +
          "Der Dialog 'Neuer angeschlossener Drucker' wird angezeigt. " +
          "<p> " +
          "2. Geben Sie einen Namen in das Feld 'Druckername' ein. " +
          "<p> " +
          "3. [Optional] Geben Sie eine Beschreibung des Druckers ein. " +
          "<p> " +
          "Sie kann den Standort des Druckers und den Druckertyp umfassen. " +
          "<p> " +
          "4. Wählen Sie einen Anschluss aus dem Pulldown-Menü 'Druckeranschluss'. " +
          "<p> " +
          "Dies ist der Hardware-Anschluss, über den der Drucker mit dem " +
          "Server verbunden ist. Wenn Sie 'Andere' gewählt haben, erscheint ein Dialog mit der Aufforderung, " +
          "einen Anschluss anzugeben. Geben Sie einen Anschluss ein, und klicken Sie auf 'OK'. " +
          "<p> " +
          "5. Wählen Sie einen Druckertyp aus dem Pulldown-Menü 'Druckertyp'. " +
          "<p> " +
          "Blättern Sie bei Bedarf durch die Liste. Wenn der Druckertyp nicht in der Liste enthalten ist, " +
          "wählen Sie 'Andere'; Sie werden aufgefordert, einen Druckertyp anzugeben. Geben Sie " +
          "einen Druckertyp ein, und klicken Sie auf 'OK'. " +
          "<p> " +
          "6. Wählen Sie einen Eintrag im Pulldown-Menü 'Dateiinhalt'. " +
          "<p> " +
          "Sie können zwischen PostScript und ASCII wählen; der Standardwert ist PostScript, der " +
          "in den meisten Fällen verwendet werden kann.  " +
          "<p> " +
          "7. Wählen Sie einen Eintrag im Pulldown-Menü 'Fehlerbenachrichtigung'. " +
          "<p> " +
          "Der Standardwert ist 'An Superuser schreiben'. " +
          "<p> " +
          "8. [Optional] Klicken Sie auf 'Standarddrucker', wenn dieser Drucker als " +
          "Standarddrucker für diesen Server verwendet werden soll. " +
          "<p> " +
          "9. [Optional] Wählen Sie eine Option für den Druck von Deckblättern  " +
          "zwischen einzelnen Druckaufträgen aus. 'Deckblatt immer drucken' " +
          "bedeutet, dass stets ein Deckblatt gedruckt wird und der Benutzer diese " +
          "Einstellung nicht ändern kann. 'Benutzerdefinierbar - Standard=Ein' bedeutet, " +
          "dass der Benutzer den Deckblattausdruck im Druckbefehl deaktivieren kann; Falls " +
          "der Benutzer keine Angabe macht, wird das Deckblatt gedruckt. 'Deckblatt nie drucken' " +
          "bedeutet, dass kein Deckblatt gedruckt wird und der Benutzer diese Einstellung " +
          "nicht ändern kann. In der Standardeinstellung wird immer ein Deckblatt gedruckt. " +
          "<p> " +
          "10. Ändern Sie die Benutzerzugriffsliste bei Bedarf. " +
          "<p> " +
          "Der Standardwert ist \"all,\" was bedeutet, dass dieser Drucker von allen Benutzern verwendet werden kann. " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf 'Hinzufügen'. Weitere zulässige Konstruktionen " +
          "sind Systemname! Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname! all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "Um einen Namen aus der Liste zu entfernen, wählen Sie den betreffenden Namen aus und klicken auf 'Löschen'. " +
          "<p> " +
          "<b> Hinweis:</b> Wenn Sie \"all\" oder \"none\" in das Textfeld eingeben und auf " +
          "'Hinzufügen' klicken, werden alle individuellen Benutzernamen aus der Liste gelöscht und " +
          "durch \"all\" oder \"none\" ersetzt.  " +
          "<p>  " +
          "11. Klicken Sie auf 'OK' oder 'Anwenden', um den Drucker zu installieren. " +
          "<p> " +
          "Das Fenster bleibt geöffnet, wenn Sie auf 'Anwenden' klicken, so dass Sie " +
          "weitere Drucker installieren können.  " +
          "<p> " +
          "<b> Hinweis:</b> Wenn Sie den NIS-Namen-Service verwenden, müssen Sie das " +
          "Root-Passwort für den NIS-Master kennen; Sie werden zur Eingabe des " +
          "Passworts aufgefordert, wenn Sie auf 'Anwenden' oder 'OK' klicken. Geben Sie das Passwort ein, und klicken Sie auf 'OK'. " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToInstallNetwork
        {"ToInstallNetwork.tag", "ToInstallNetwork"},

        // DO NOT LOCALIZE
	//@EN@ InstallNetwork ToAddAccess Overview MainWindow HelpOnHelp
        {"ToInstallNetwork.seealso", "InstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Install a Network Printer
        {"ToInstallNetwork.title", "So installieren Sie einen Netzwerkdrucker"},

        // LOCALIZE
	//@EN@ install network \"network printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner destination protocol new bsd tcp printer
        {"ToInstallNetwork.keywords", "installiern Netzwerk\"Netzwerkdrucker\" \"Druckername\" Server Beschreibung Anschluss \"Druckertyp\" \"Dateiinhalt\" Fehler \"Fehlerbenachrichtigung\" \"Standard-Drucker\" Banner Ziel Protokoll neu BSD TCP Drucker"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Once you have physically connected the printer to the network, do the following to install the printer, which makes the printer available for printing from the network. <p> <b> Note:</b> The computer on which you are running Solaris Print Manager becomes the printer server for the printer being installed. <p> 1. Choose New Network Printer from the Printer menu. <p> The New Attached Printer dialog will be displayed. <p>  2. Enter a name in Printer Name. <p> 3. [Optional] Enter a description of the printer. <p> This might include the location and the type of printer. <p> 4. Select a printer type from the Printer Type pulldown menu. <p> Scroll the list if necessary. If the printer type is not in the list, select Other; you will be asked to specify a printer type. Enter a printer type and click OK. <p> 5. Select an item in the File Contents pulldown menu. <p> Choices include PostScript and ASCII; the default is PostScript, which will work in most cases.  <p> 6. Select an item in the Fault Notification pulldown menu. <p> The default is Write to Superuser. <p> 7a. If the printer uses BSD protocol, enter the network name of the printer in the Destination field, followed by a colon and the printer-vendor-supplied queue name. <p> 7b. If the printer uses TCP protocol, enter the network name of the printer in the Destination field, followed by a colon and port number to be used in the tcp connection to the printer. <p> 7c. If the printer uses a printer URI, enter the the URI for the printer in the Destination field (for example: \"smb://printer-host/printer-name\"). <p> 8. Select either BSD, TCP, or URI from the Protocol pulldown menu. <p> 9. [Optional] Click Default Printer if you want this printer to be the default printer for this server. <p> 10. [Optional] Select option to define whether a banner  page is to be printed between jobs. \"Always Print Banner\" specifies that a banner will be printed and the user may not specify otherwise. \"User Selectable - Default=on\" specifies that the user may specify to turn off the banner in the print command; if the user does not specify, the banner will be printed. \"Never Print Banner\" specifies that a banner will not be printed and the user may not specify otherwise. The default action is to always print the banner. <p> 11. Modify the User Access List, if necessary. <p> The default value is \"all,\" meaning that anyone can use this printer. If you want to restrict its use to individual users, enter a user name in the text field below the list and click Add. Other legal constructs are system-name!login-ID (user \"login-ID\" on system \"system-name\"), system-name!all (all users on system \"system-name\"), and all!login-ID (user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny access to users.  <p> <b> Note:</b> If you enter \"all\" or \"none\" in the text field and click Add, all individual user names will be deleted from the list and replaced by \"all\" or \"none.\"  <p>  12. Click OK or Apply to install the printer. <p> The window will remain if you click Apply, allowing you to install additional printers.  <p> <b> Note:</b> If you are using the NIS naming service, you have to know the root password for the NIS master. If you are using the LDAP naming service, you must know a fully distinguished name which has update privilege and the corresponding password. Default values may need to be overridden. You will be prompted for the password when you click Apply or OK. Enter the password and click OK. <p>  <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"ToInstallNetwork.content",
          "<p> " +
          "Sobald Sie den Drucker physisch an das Netzwerk angeschlossen haben, " +
          "führen Sie die folgenden Schritte aus, um den Drucker zu installieren. Damit wird der Drucker " +
          "für Druckjobs verfügbar gemacht, die über das Netzwerk abgesetzt werden. " +
          "<p> " +
          "<b> Hinweis:</b> Der Computer mit dem Solaris Druckmanager " +
          "wird der Druckerserver für den installierten Drucker. " +
          "<p> " +
          "1. Wählen Sie 'Neuer Netzwerkdrucker' aus dem Menü 'Drucker'. " +
          "<p> " +
          "Der Dialog 'Neuer angeschlossener Drucker' wird angezeigt. " +
          "<p>  " +
          "2. Geben Sie einen Namen in das Feld 'Druckername' ein. " +
          "<p> " +
          "3. [Optional] Geben Sie eine Beschreibung des Druckers ein. " +
          "<p> " +
          "Sie kann den Standort des Druckers und den Druckertyp umfassen. " +
          "<p> " +
          "4. Wählen Sie einen Druckertyp aus dem Pulldown-Menü 'Druckertyp'. " +
          "<p> " +
          "Blättern Sie bei Bedarf durch die Liste. Wenn der Druckertyp nicht in der Liste enthalten ist, " +
          "wählen Sie 'Andere'; Sie werden aufgefordert, einen Druckertyp anzugeben. Geben Sie " +
          "einen Druckertyp ein, und klicken Sie auf 'OK'. " +
          "<p> " +
          "5. Wählen Sie einen Eintrag im Pulldown-Menü 'Dateiinhalt'. " +
          "<p> " +
          "Sie können zwischen PostScript und ASCII wählen; der Standardwert ist PostScript, der " +
          "in den meisten Fällen verwendet werden kann.  " +
          "<p> " +
          "6. Wählen Sie einen Eintrag im Pulldown-Menü 'Fehlerbenachrichtigung'. " +
          "<p> " +
          "Der Standardwert ist 'An Superuser schreiben'. " +
          "<p> " +
          "7. Geben Sie den Netzwerknamen des Druckers in das Feld 'Ziel', " +
          "gefolgt von einem Doppelpunkt und dem Warteschlangennamen ein, der vom Druckerhersteller angegeben wurde.  " +
          "<p> " +
          "8. Wählen Sie entweder BSD oder TCP aus dem Pulldown-Menü 'Protokoll'. " +
          "<p> " +
          "9. [Optional] Klicken Sie auf 'Standarddrucker', wenn dieser Drucker als " +
          "Standarddrucker für diesen Server verwendet werden soll. " +
          "<p> " +
          "10. [Optional] Wählen Sie eine Option für den Druck von Deckblättern  " +
          "zwischen einzelnen Druckaufträgen aus. 'Deckblatt immer drucken' " +
          "bedeutet, dass stets ein Deckblatt gedruckt wird und der Benutzer diese " +
          "Einstellung nicht ändern kann. 'Benutzerdefinierbar - Standard=Ein' bedeutet, " +
          "dass der Benutzer den Deckblattausdruck im Druckbefehl deaktivieren kann; Falls " +
          "der Benutzer keine Angabe macht, wird das Deckblatt gedruckt. 'Deckblatt nie drucken' " +
          "bedeutet, dass kein Deckblatt gedruckt wird und der Benutzer diese Einstellung " +
          "nicht ändern kann. In der Standardeinstellung wird immer ein Deckblatt gedruckt. " +
          "<p> " +
          "11. Ändern Sie die Benutzerzugriffsliste bei Bedarf. " +
          "<p> " +
          "Der Standardwert ist \"all,\" was bedeutet, dass alle Benutzer diesen Drucker verwenden können. " +
          "Wenn Sie seine Verwendung auf einzelne Benutzer beschränken möchten, geben Sie einen Benutzernamen " +
          "in das Textfeld unterhalb der Liste ein und klicken auf 'Hinzufügen'. Weitere zulässige Konstruktionen " +
          "sind Systemname!Anmelde-ID (Benutzer \"Anmelde-ID\" auf System \"Systemname\"), " +
          "Systemname!all (alle Benutzer auf System \"Systemname\") und all!Anmelde-ID " +
          "(Benutzer \"Anmelde-ID\" auf allen Systemen). Verwenden Sie den Befehl lpadmin(1M), um " +
          "Benutzern den Zugriff zu verweigern.  " +
          "<p> " +
          "<b> Hinweis:</b> Wenn Sie \"all\" oder \"none\" in das Textfeld eingeben und auf " +
          "'Hinzufügen' klicken, werden alle individuellen Benutzernamen aus der Liste gelöscht und " +
          "durch \"all\" oder \"none\" ersetzt.  "+
          "<p> " +
          "12. Klicken Sie auf 'OK' oder 'Anwenden', um den Drucker zu installieren. " +
          "<p> " +
          "Das Fenster bleibt geöffnet, wenn Sie auf 'Anwenden' klicken, so dass Sie " +
          "weitere Drucker installieren können.  " +
          "<p> " +
          "<b> Hinweis:</b> Wenn Sie den NIS-Namen-Service verwenden, müssen Sie das " +
          "Root-Passwort für den NIS-Master kennen; Sie werden zur Eingabe des " +
          "Passworts aufgefordert, wenn Sie auf 'Anwenden' oder 'OK' klicken. Geben Sie das Passwort ein, und klicken Sie auf 'OK'. " +
          "<p>  " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToModify
        {"ToModify.tag", "ToModify"},

        // DO NOT LOCALIZE
	//@EN@ Modify ModifyFailed InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToAddAccess ToDelete AddAccess MainWindow Overview HelpOnHelp
        {"ToModify.seealso", "Modify ModifyFailed InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToAddAccess ToDelete AddAccess MainWindow Overview HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Modify Printer Properties
        {"ToModify.title", "So ändern Sie Druckereigenschaften"},

        // LOCALIZE
	//@EN@ modify \"Printer menu\" \"local printer\" nis \"nis master\" \"naming service\" ldap LDAP attached \"network printer\" local network printer properties
        {"ToModify.keywords", "ändern \"Drucker (Menü)\" \"lokaler Drucker\" NIS \"NIS-Master\" \"Namen-Service\" LDAP angeschlossen \"Netzwerkdrucker\" lokal Netzwerk Druckereigenschaften"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p> Do the following to modify the properties of an installed printer. <p>  1. Double-click the printer in the Solaris Print Manager main window <p>  OR <p>  Select the printer in the Solaris Print Manager main window and choose  Modify Printer Properties from the Printer menu.  <p>  The Modify Printer Properties dialog is displayed.  <p>  2. Modify the printer configuration, as needed. <p>  If this is an attached printer (one installed on the computer on which you are running Solaris Print Manager) you can modify the Description, Printer Port, Printer Type, File Contents, Fault Notification, Options, and User Access List. <p> If this is not an attached printer, only the Description field can be modified. You can also check or uncheck the Default Printer box.  <p>  3. Click OK. <p>  The changes you made are saved and the Modify Printer Properties dialog is dismissed. <p>  If you modified the Description field, the new description is displayed in the Solaris Print Manager main window. <p>  <b> Note:</b> If you are using the NIS naming service, you have to know the root password for the NIS master. If you are using the LDAP naming service, you must know a fully distinguished name which has update privilege and the corresponding password. Default values may need to be overridden. You will be prompted for the password when you select the NIS or LDAP naming service. Enter the password and click OK. <p>  <b> Note:</b> To modify the Printer Name or Printer Server field, delete the printer and add it with a new printer and/or server name. <p> <b>OK:</b> Apply changes and dismiss the window. <br> <b>Apply:</b> Apply the changes and leave the window displayed. <br> <b>Reset:</b> Reset all fields to last Apply <br> <b>Cancel:</b> Dismiss the window. <br> <b>Help:</b> Display help for the current window or dialog.  <p> 
        {"ToModify.content",
          "<p> " +
          "Gehen Sie wie folgt vor, um die Eigenschaften eines installierten Druckers zu ändern: " +
          "<p>  " +
          "1. Doppelklicken Sie auf den Drucker im Hauptfenster des Solaris Druckmanagers " +
          "<p>  " +
          "ODER " +
          "<p>  " +
          "Wählen Sie den gewünschten Drucker im Hauptfenster des Solaris Druckmanagers, und wählen " +
          " Sie 'Druckereigenschaften ändern' aus dem Menü 'Drucker'.  " +
          "<p>  " +
          "Der Dialog 'Druckereigenschaften ändern' wird angezeigt.  " +
          "<p>  " +
          "2. Ändern Sie die Druckerkonfiguration nach Bedarf. " +
          "<p>  " +
          "Wenn es sich um einen angeschlossenen Drucker handelt (einer, der auf dem Computer installiert ist, " +
          "auf dem der Solaris Druckmanager ausgeführt wird), können Sie die Beschreibung, " +
          "den Druckeranschluss, den Druckertyp, den Dateiinhalt, die Fehlerbenachrichtigung, " +
          "die Optionen und die Benutzerzugriffsliste ändern. " +
          "<p> " +
          "Wenn es sich nicht um einen angeschlossenen Drucker handelt, kann nur das Feld " +
          "'Beschreibung' geändert werden. Sie können das Feld 'Standarddrucker' auch aktivieren oder deaktivieren.  " +
          "<p>  " +
          "3. Klicken Sie auf 'OK'. " +
          "<p>  " +
          "Die vorgenommenen Änderungen werden gespeichert, und der Dialog  " +
          "'Druckereigenschaften ändern' wird geschlossen. " +
          "<p>  " +
          "Wenn Sie das Feld 'Beschreibung' geändert haben, wird die neue Beschreibung " +
          "im Hauptfenster des Solaris Druckmanagers angezeigt. " +
          "<p>  " +
          "<b> Hinweis:</b> Wenn Sie den NIS-Namen-Service verwenden, müssen Sie das " +
          "Root-Passwort für den NIS-Master kennen; Sie werden zur Eingabe des " +
          "Passworts aufgefordert, wenn Sie auf 'Anwenden' oder 'OK' klicken. Geben Sie das Passwort ein, und klicken Sie auf 'OK'. " +
          "<p>  " +
          "<b> Hinweis:</b> Um das Feld 'Druckername' oder 'Druckerserver' zu ändern, " +
          "löschen Sie den Drucker und fügen ihn unter einem neuen Drucker- und/oder Servernamen hinzu. " +
          "<p> " +
          "<b>OK:</b> Änderungen anwenden und das Fenster schließen. " +
          "<br> " +
          "<b>Anwenden:</b> Die Änderungen anwenden und das Fenster weiterhin anzeigen. " +
          "<br> " +
          "<b>Zurücksetzen:</b> Alle Felder auf den Zustand nach dem letzten 'Anwenden' zurücksetzen. " +
          "<br> " +
          "<b>Abbrechen:</b> Das Fenster schließen. " +
          "<br> " +
          "<b>Hilfe:</b> Hilfe für das aktuelle Fenster oder den aktuellen Dialog anzeigen.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
	//@EN@ ToSelectName
        {"ToSelectName.tag", "ToSelectName"},

        // DO NOT LOCALIZE
	//@EN@ NameService ToStart Overview MainWindow HelpOnHelp
        {"ToSelectName.seealso", "NameService ToStart Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Select a Naming Service
        {"ToSelectName.title", "So wählen Sie einen Namen-Service"},

        // LOCALIZE
	//@EN@ select \"name service\" \"naming service\" name naming service
        {"ToSelectName.keywords", "wählen \"Namen-Service\" \"Namen-Service\" Name Namen-Service"},

        // LOCALIZE
	//@EN@ <p> Do the following to select a naming service for Solaris Print Manager or to change from using a naming service to using no naming service.  <p>  When you select a naming service you are specifying where Solaris Print Manager will retrieve printer information from, and where changes made in Print Manager will be made. If a naming service is selected, additions and deletions will be made in the printing configuration database for the selected naming service. If you choose \"files,\" the /etc/printers.conf file will be used to determine which printers are available, and changes will be made there. <p> 1. Choose Select Naming Service from the Print Manager menu. <p> A dialog is displayed, asking you to choose a naming service.  <p> 2. Choose a naming service (or \"files,\" if no naming service is to be used) and click OK. <p> The Solaris Print Manager main window is displayed, listing all the accessible printers, which includes all printers in the selected naming service's printer configuration database.  <p> See the man page for printers.conf(4) for more information. 
        {"ToSelectName.content",
          "<p> " +
          "Gehen Sie wie folgt vor, um einen Namen-Service für den Solaris Druckmanager zu wählen oder " +
          "um keinen Namen-Service mehr zu verwenden, wenn zuvor ein Namen-Service eingesetzt wurde.  " +
          "<p>  " +
          "Bei Auswahl eines Namen-Service geben Sie an, wo der Solaris " +
          "Druckmanager Druckerinformationen abruft und wo " +
          "im Druckmanager vorgenommene Änderungen gemacht werden. Wenn ein Namen-Service " +
          "ausgewählt ist, werden Hinzufügungen und Löschungen in der " +
          "Druckkonfigurationsdatenbank für den gewählten Namen-Service vorgenommen. Wenn Sie " +
          "\"files,\" wählen, werden die verfügbaren Drucker mit der Datei /etc/printers.conf " +
          "bestimmt und Änderungen daran vorgenommen. " +
          "<p> " +
          "1. Wählen Sie 'Namen-Service wählen' aus dem Menü 'Druckmanager'. " +
          "<p> " +
          "Ein Dialog wird angezeigt, in dem Sie aufgefordert werden, einen Namen-Service zu wählen.  " +
          "<p> " +
          "2. Wählen Sie einen Namen-Service (oder \"files,\" wenn kein Namen-Service verwendet werden " +
          "soll), und klicken Sie auf 'OK'. " +
          "<p> " +
          "Das Hauptfenster des Solaris Druckmanagers wird angezeigt, in dem alle Drucker aufgeführt sind, " +
          "auf die Zugriff besteht. Dazu gehören alle Drucker in der " +
          "Druckerkonfigurationsdatenbank des gewählten Namen-Service.  " +
          "<p> " +
          "Siehe die Man Page für printers.conf(4), um weitere Informationen zu erhalten. " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToShowCommand
        {"ToShowCommand.tag", "ToShowCommand"},

        // DO NOT LOCALIZE
	//@EN@ ShowCommandConsole Overview MainWindow HelpOnHelp
        {"ToShowCommand.seealso", "ShowCommandConsole Overview MainWindow HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Show Command-Line Console
        {"ToShowCommand.title", "So zeigen Sie die Befehlszeilenkonsole an"},

        // LOCALIZE
	//@EN@ \"command-line\" log command show console
        {"ToShowCommand.keywords", "\"Befehlszeile\" Protokoll Befehl Konsole anzeigen"},

        // LOCALIZE
	//@EN@ <p> Do the following to cause the command-line version of add, modify, and delete actions to be displayed in the Solaris Print Manager Command-Line Console -- or to turn off this option if it was previously turned on. Errors and warnings may also be displayed after the command.  <p> 1. Choose Show Command-Line Console from the Print Manager menu.  <p> If the Show Command-line Console box was not checked when you chose it, it will be checked and the Show Command-line Console will be displayed; Solaris Print Manager actions will be displayed in the Console. <p> Note that errors and warnings may also appear in the Console, after the commands used to complete the action. <p> If the Show Command-line Console box was checked when you chose it, it will no longer be checked and the Show Command-line Console will be closed. <p> 
        {"ToShowCommand.content",
          "<p> " +
          "Gehen Sie wie im Folgenden beschrieben vor, um die Befehlszeilenversion für Hinzufüge-, Änderungs- und " +
          "Löschaktionen in der Befehlszeilenkonsole des Solaris " +
          "Druckmanagers anzuzeigen - oder um diese Option zu deaktivieren, wenn sie " +
          "zuvor aktiviert war. Fehler und Warnungen können " +
          "nach dem Befehl ebenfalls angezeigt werden.  " +
          "<p> " +
          "1. Wählen Sie 'Befehlszeilenkonsole anzeigen' aus dem Menü 'Druckmanager'.  " +
          "<p> " +
          "Wenn das Feld 'Befehlszeilenkonsole anzeigen' bei dessen Auswahl deaktiviert " +
          "war, wird es nun aktiviert, und die Befehlszeilenkonsole " +
          "wird angezeigt; die Aktionen des Solaris Druckmanagers werden in der " +
          "Konsole angezeigt. " +
          "<p> " +
          "Beachten Sie, dass Fehler und Warnungen ebenfalls in der Konsole erscheinen, und zwar nach " +
          "den Befehlen für die Aktion. " +
          "<p> " +
          "Wenn das Feld 'Befehlszeilenkonsole anzeigen' bei dessen Auswahl " +
          "aktiviert war, ist es nun deaktiviert, und die Befehlszeilenkonsole " +
          "wird geschlossen. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
	//@EN@ ToStart
        {"ToStart.tag", "ToStart"},

        // DO NOT LOCALIZE
	//@EN@ ToSelectName ToExit Mainwindow Overview HelpOnHelp
        {"ToStart.seealso", "ToSelectName ToExit Mainwindow Overview HelpOnHelp"},

        // LOCALIZE
	//@EN@ To Start Solaris Print Manager
        {"ToStart.title", "So starten Sie den Solaris Druckmanager"},

        // LOCALIZE
	//@EN@ start startup load \"name service\" \"naming service\" SUNWppm \"Solaris Management Console\" \"the Console\" solaris print manager
        {"ToStart.keywords", "starten hochfahren laden \"Namen-Service\" \"Namen-Service\" SUNWppm \"Solaris Management-Konsole\" \"die Konsole\" Solaris Druckmanager"  /*@TMC@ NEW MESSAGE */  },

        // LOCALIZE
	//@EN@ <p>  If you have installed SUNWppm package, do the following to start Solaris Print Manager. Note that you must be root to run Print Manager; if you attempt to launch it from Solaris Management Console you will be prompted for the root password.  <p>  1. Double-click the Solaris Print Manager icon in Solaris Management Console  <p>  OR  <p> cd to the directory /usr/sadm/admin/bin and as root type ./printmgr <p> A dialog is displayed, asking you to choose a naming service.  <p> 2. Choose a naming service (or files, if no naming service is to be used) and click OK. <p> The Solaris Print Manager main window is displayed, listing all the printers accessible from the computer on which you are running Solaris Print Manager.  <p> 
        {"ToStart.content",
          "<p>  " +
          "Wenn Sie das SUNWppm-Paket installiert haben, gehen Sie zum Starten des " +
          "Solaris Druckmanagers wie im Folgenden beschrieben vor. Beachten Sie, dass Sie als Root angemeldet sein müssen, um den " +
          "Druckmanager ausführen zu können; wenn Sie ihn von der Solaris Management-Konsole " +
          "aus starten, werden Sie nach dem Root-Passwort gefragt.  " +
          "<p>  " +
          "1. Doppelklicken Sie auf das Symbol für den Solaris Druckmanager in der Solaris " +
          "Management-Konsole  " +
          "<p> " +
          " ODER  " +
          "<p> " +
          "Wechseln Sie zum Verzeichnis /usr/sadm/admin/bin, und geben Sie als Root ./printmgr ein. " +
          "<p> " +
          "Ein Dialog wird angezeigt, in dem Sie aufgefordert werden, einen Namen-Service zu wählen.  " +
          "<p> " +
          "2. Wählen Sie einen Namen-Service (oder 'files', wenn kein Namen-Service verwendet werden " +
          "soll), und klicken Sie auf 'OK'. " +
          "<p> " +
          "Das Hauptfenster des Solaris Druckmanagers wird angezeigt, in dem alle Drucker aufgeführt sind, " +
          "auf die von dem Computer aus zugegriffen werden kann, auf dem der Solaris " +
          "Druckmanager aktiv ist.  " +
          "<p> " +
          ""
        },


    };
    public Object[][] getContents() {
        return pmHelpBundlecontents;
    }
}
