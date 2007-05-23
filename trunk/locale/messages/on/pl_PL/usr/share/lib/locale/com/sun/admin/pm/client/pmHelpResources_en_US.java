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


public class pmHelpResources extends ListResourceBundle {
    static final Object[][] pmHelpBundlecontents = {

        // DO NOT LOCALIZE
        {"AddAccess.tag", "AddAccess"},

        // DO NOT LOCALIZE
        {"AddAccess.seealso", "ToAddAccess ToModify ToDelete ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"AddAccess.title", "Dialog: Add Access to Printer"},

        // LOCALIZE
        {"AddAccess.keywords", "access \"add access\" description \"default printer\" \"naming service\" \"printer name\" \"printer server\" dialog: add printer"},

        // LOCALIZE
        {"AddAccess.content",
          "  " +
          "<p> " +
          "Use the Add Access to Printer dialog to make an installed printer " +
          "accessible to print client computers. See the printers.conf(4) man " +
          "page if you need more information about print client commands. " +
          "<p> " +
          "<b>Printer Name:</b> The name of the printer you wish to add access " +
          "to. The printer name must be a text string composed of uppercase or " +
          "lowercase alphabetical characters (a-z, A-Z), digits (0-9), hyphens, or " +
          "underscores. A printer name can be a maximum of 14 characters long. " +
          "<p> " +
          "<b>Printer Server:</b> The name of the printer server the named printer is " +
          "installed on. The printer may be physically connected to " +
          "the server or it may be a network printer.  " +
          "<p> " +
          "<b>NOTE:</b> Solaris Print Manager does not check for the validity of " +
          "Printer Name or Printer Server.  " +
          "<p> " +
          "<b>Description:</b> [Optional] A description of the printer, including, " +
          "for example, the type and location of the printer. " +
          "<p> " +
          "<b>Option: Default Printer:</b> If checked and no naming service is " +
          "being used, this printer is designated as the default printer for the " +
          "computer on which you are running Solaris Print Manager. If checked " +
          "and a naming service is being used, designates this as the default " +
          "printer for the naming service. " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"AddAccessFailed.tag", "AddAccessFailed"},

        // DO NOT LOCALIZE
        {"AddAccessFailed.seealso", "AddAccess ToAddAccess ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"AddAccessFailed.title", "If Add Access Fails"},

        // LOCALIZE
        {"AddAccessFailed.keywords", "add access fail failure fails"},

        // LOCALIZE
        {"AddAccessFailed.content",
          "<p> " +
          "You must enter a printer name and a printer server name; the printer " +
          "server must be a remote server (not the current server). See the man " +
          "page for lpadmin(1M) for more information.  " +
          "<p> " +
          "Display the Command-Line Console to help pinpoint where the error " +
          "may have occurred. Choose Show Command-Line Console from the Print " +
          "Manager menu to display the Command-Line Console.  " +
          ""
        },



        // DO NOT LOCALIZE
        {"AddPrinterFailed.tag", "AddPrinterFailed"},

        // DO NOT LOCALIZE
        {"AddPrinterFailed.seealso", "InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"AddPrinterFailed.title", "If New Printer Action Fails"},

        // LOCALIZE
        {"AddPrinterFailed.keywords", "install fail failure \"new attached\" \"new network\" new printer action fails"},

        // LOCALIZE
        {"AddPrinterFailed.content",
          "<p> " +
          "The printer name must be a text string composed of uppercase or " +
          "lowercase alphabetical characters (a-z, A-Z), digits (0-9), hyphens, " +
          "or underscores. A printer name can be a maximum of 14 characters long. " +
          "<p> " +
          "Display the Command-Line Console to help pinpoint where the error " +
          "may have occurred. Choose Show Command-Line Console from the Print " +
          "Manager menu to display the Command-Line Console. See the man " +
          "page for lpadmin(1M) for more information.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"DeletePrinterFailed.tag", "DeletePrinterFailed"},

        // DO NOT LOCALIZE
        {"DeletePrinterFailed.seealso", "ToDelete ToShowCommand Overview MainWindow"},

        // LOCALIZE
        {"DeletePrinterFailed.title", "If Delete Printer Fails"},

        // LOCALIZE
        {"DeletePrinterFailed.keywords", "delete fail failure printer fails"},

        // LOCALIZE
        {"DeletePrinterFailed.content",
          "<p> " +
          "If the Delete printer process fails, follow the instructions in the " +
          "error dialog. If the instructions are incomplete or unclear, display " +
          "the Command-Line Console to help pinpoint where the error may have " +
          "occurred. Choose Show Command-Line Console from the Print Manager menu " +
          "to display the Command-Line Console. See the man page for lpadmin(1M) " +
          "for more information. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"HelpOnHelp.tag", "HelpOnHelp"},

        // DO NOT LOCALIZE
        {"HelpOnHelp.seealso", "Overview"},

        // LOCALIZE
        {"HelpOnHelp.title", "Help on Help"},

        // LOCALIZE
        {"HelpOnHelp.keywords", "view index search show back forward \"see also\" help keywords"},

        // LOCALIZE
        {"HelpOnHelp.content",
          "<p>  " +
          "Solaris Print Manager help is displayed if you choose one of the help " +
          "items from the Help menu in the Print Manager main window or if you " +
          "click on a Help button in any of the Print Manager windows or dialogs. " +
          "<p> " +
          "<b> Viewing a help article </b>  " +
          "<p> " +
          "When you click on a Help button or choose a help item from the Help " +
          "menu, help for the selected topic is displayed in the help viewer. See " +
          "the headings labeled Navigation, Index, and Search below for " +
          "instructions for viewing other help articles. " +
          "<p> " +
          "<b> Navigation </b>  " +
          "<p> " +
          "To move around in an article, click on the scroll bar to the right of " +
          "the article text. Note that you can expand or contract the help window " +
          "by grabbing a corner with the mouse cursor and moving the mouse. See " +
          "below for instructions for viewing other help articles.  " +
          "<p> " +
          "Back button: Click to move to the last article viewed.  " +
          "<br> " +
          "Forward button: Click to move to the article viewed prior to clicking " +
          "the Back button.  " +
          "<br> " +
          "See also pulldown menu: Select an item from the menu and click Show to display " +
          "the selected article.  " +
          "<br> " +
          "Show button: After selecting an item from the See also menu, click Show " +
          "to display it.  " +
          "<p> " +
          "<b> Index </b>  " +
          "<p> " +
          "1. Click the Index tab at the top of the help window to display the index " +
          "search tool. " +
          "<p>  " +
          "By default the Search field is blank and all help articles are listed. " +
          "To limit the index listing, enter the first letters of a help article; " +
          "the articles that start with the entered letters will be displayed as " +
          "you type. To see all the task descriptions, for instance, enter \"to\" " +
          "and a blank. " +
          "<p>  " +
          "2. To view an article, double-click on it or select it and click " +
          "Show. The article is displayed in view mode.  " +
          "<p>  " +
          "<b> Search </b>  " +
          "<p>  " +
          "Click the Search tab at the top of the help window to display the " +
          "search tool. " +
          "<p> " +
          "Enter a word or phrase in the Keywords field and click Search.  " +
          "<p> " +
          "All articles with the entered keyword or phrase marked as a keyword " +
          "will be displayed in the Search Results list.  " +
          "<p> " +
          "To view an article, double-click on it or select it and click " +
          "Show. The article is displayed in view mode.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"InstallLocal.tag", "InstallLocal"},

        // DO NOT LOCALIZE
        {"InstallLocal.seealso", "ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"InstallLocal.title", "Dialog: New Attached Printer"},

        // LOCALIZE
        {"InstallLocal.keywords", "install \"local printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: new attached"},

        // LOCALIZE
        {"InstallLocal.content",
          "<p> " +
          "Once you have physically connected the printer to the printer server, " +
          "use the New Attached Printer dialog to install the printer, which " +
          "makes the printer available for printing from the computer on which " +
          "you are running Solaris Print Manager. " +
          "<p> " +
          "<b> Printer Name:</b> " +
          " Specifies a unique name for the printer. The " +
          " printer name must be a text string composed of " +
          " uppercase or lowercase alphabetical characters " +
          " (a-z, A-Z), digits (0-9), hyphens, or " +
          " underscores. A printer name can be a maximum of " +
          " 14 characters long.  " +
          "<p>  " +
          "<b> Printer Server:</b> This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it. Solaris Print " +
          "Manager sets up this system with the appropriate software to manage " +
          "local and remote printers. " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Port:</b>  " +
          "Specifies the hardware port, such as /dev/term/a, that the printer is " +
          "connected to.  " +
          "<p> " +
          "<b> Printer Type:</b>  " +
          "Specifies the generic name for a type of " +
          " printer. Supported printer types correspond to " +
          " items listed in the /usr/share/lib/terminfo " +
          " directories. Examples are PostScript, Daisy, and Diablo.  " +
          "<p> " +
          "<b> File Contents:</b>  " +
          "Specifies the format of files that can be " +
          " printed without any special filtering by the " +
          " print software. PostScript is the default and is " +
          " probably correct most of the time.  " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, designates this printer " +
          "as the default printer for printing jobs from the computer on which " +
          "you are running Solaris Print Manager. If you are using a naming " +
          "service, this printer will be the default printer for the naming " +
          "service, also. " +
          "<p> " +
          "Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner  " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
        {"InstallLocalPPD.tag", "InstallLocalPPD"},

        // DO NOT LOCALIZE
        {"InstallLocalPPD.seealso", "ToInstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"InstallLocalPPD.title", "Dialog: New Attached Printer"},

        // LOCALIZE
        {"InstallLocalPPD.keywords", "install \"local printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: new attached"},

        // LOCALIZE
        {"InstallLocalPPD.content",
          "<p> " +
          "Once you have physically connected the printer to the printer server, " +
          "use the New Attached Printer dialog to install the printer, which " +
          "makes the printer available for printing from the computer on which " +
          "you are running Solaris Print Manager. " +
          "<p> " +
          "<b> Printer Name:</b> " +
          " Specifies a unique name for the printer. The " +
          " printer name must be a text string composed of " +
          " uppercase or lowercase alphabetical characters " +
          " (a-z, A-Z), digits (0-9), hyphens, or " +
          " underscores. A printer name can be a maximum of " +
          " 14 characters long.  " +
          "<p>  " +
          "<b> Printer Server:</b> This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it. Solaris Print " +
          "Manager sets up this system with the appropriate software to manage " +
          "local and remote printers. " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Port:</b>  " +
          "Specifies the hardware port, such as /dev/term/a, that the printer is " +
          "connected to.  " +
          "<p> " +
          "<b> Printer Make:</b>  " +
          "Specifies the printer make, or manufacturer. This " +
          " information is on the printer and/or in the documentation " +
          " that is delivered with the printer. " +
          "<p> " +
          "<b> Printer Model:</b>  " +
          "Specifies the printer model. This information " +
          " is found on the printer and/or in the documentation that is " +
          " delivered with the printer. " +
          "<p> " +
          "<b> Printer Driver:</b> " +
          " Specifies the printer driver to use with this printer. " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, designates this printer " +
          "as the default printer for printing jobs from the computer on which " +
          "you are running Solaris Print Manager. If you are using a naming " +
          "service, this printer will be the default printer for the naming " +
          "service, also. " +
          "<p> " +
          "Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
        {"InstallNetwork.tag", "InstallNetwork"},

        // DO NOT LOCALIZE
        {"InstallNetwork.seealso", "ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"InstallNetwork.title", "Dialog: New Network Printer"},

        // LOCALIZE
        {"InstallNetwork.keywords", "install \"network printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner new dialog: network printer"},

        // LOCALIZE
        {"InstallNetwork.content",
          "<p> " +
          "Use the New Network Printer dialog to install a network printer, " +
          "thus making the printer available for printing from the network. " +
          "<p> " +
          "<b> Printer Name:</b> " +
          " Specifies a unique name for the printer. The " +
          " printer name must be a text string composed of " +
          " uppercase or lowercase alphabetical characters " +
          " (a-z, A-Z), digits (0-9), hyphens, or " +
          " underscores. A printer name can be a maximum of " +
          " 14 characters long.  " +
          "<p>  " +
          "<b> Printer Server:</b> This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it. Solaris Print " +
          "Manager sets up this system with the appropriate software to manage " +
          "local and remote printers. " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Type:</b>  " +
          "Specifies the generic name for a type of " +
          " printer. Supported printer types correspond to " +
          " entries in the /usr/share/lib/terminfo " +
          " directory. Examples are PostScript, Daisy, and Diablo.  " +
          "<p> " +
          "<b> File Contents:</b>  " +
          "Specifies the format of files that can be " +
          " printed without any special filtering by the " +
          " print software. PostScript is the default and is " +
          " probably correct most of the time.  " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p>  " +
          "<b> Destination:</b>  " +
          "<br> " +
          "For <b>BSD</b> Protocol, the network name of the printer followed by a colon " +
          "and the printer-vendor-supplied queue name.  " +
          "<br> " +
          "For <b>TCP</b> Protocol, the network name of the printer followed by a colon " +
          "and the tcp port number to connect to. " +
          "<br> " +
          "For <b>URI</b> Protocol, a printer URI to be used in connecting to the remote " +
          "printer. For example: \"smb://user@printer-host/printer-name\". " +
          "<p> " +
          "<b> Protocol:</b>  " +
          "The internet protocol for file transfer; choices are BSD, TCP, or URI.  " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, this printer is " +
          "designated as the default printer for printing jobs sent to this " +
          "server. If another printer had been designated as the default printer " +
          "for the network, this printer will replace it as the default. If you " +
          "are using a naming service, this printer will be the default printer " +
          "for the naming service, also. " +
          "<p> Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner  " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "To add a user to the list, type a user name in the blank text field " +
          "below the list and click Add. Note that this user name replaces \"all\" " +
          "or \"none\" if either \"all\" or \"none\" is in the user access list. If " +
          "\"all\" or \"none\" is added as a user, \"all\" or \"none\" will replace the " +
          "names in the list. " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
        {"InstallNetworkPPD.tag", "InstallNetworkPPD"},

        // DO NOT LOCALIZE
        {"InstallNetworkPPD.seealso", "ToInstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"InstallNetworkPPD.title", "Dialog: New Network Printer"},

        // LOCALIZE
        {"InstallNetworkPPD.keywords", "install \"network printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner new dialog: network printer"},

        // LOCALIZE
        {"InstallNetworkPPD.content",
          "<p> " +
          "Use the New Network Printer dialog to install a network printer, " +
          "thus making the printer available for printing from the network. " +
          "<p> " +
          "<b> Printer Name:</b> " +
          " Specifies a unique name for the printer. The " +
          " printer name must be a text string composed of " +
          " uppercase or lowercase alphabetical characters " +
          " (a-z, A-Z), digits (0-9), hyphens, or " +
          " underscores. A printer name can be a maximum of " +
          " 14 characters long.  " +
          "<p>  " +
          "<b> Printer Server:</b> This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it. Solaris Print " +
          "Manager sets up this system with the appropriate software to manage " +
          "local and remote printers. " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Make:</b>  " +
          "Specifies the printer make, or manufacturer. This " +
          " information is on the printer and/or in the documentation " +
          " that is delivered with the printer. " +
          "<p> " +
          "<b> Printer Model:</b>  " +
          "Specifies the printer model. This information " +
          " is found on the printer and/or in the documentation that is " +
          " delivered with the printer. " +
          "<p> " +
          "<b> Printer Driver:</b> " +
          " Specifies the printer driver to use with this printer. " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p>  " +
          "<b> Destination:</b> " +
          "<br> " +
          "For <b>BSD</b> Protocol, the network name of the printer followed by a colon " +
          "and the printer-vendor-supplied queue name. " +
          "<br> " +
          "For <b>TCP</b> Protocol, the network name of the printer followed by a colon " +
          "and the tcp port number to connect to. " +
          "<br> " +
          "For <b>URI</b> Protocol, a printer URI to be used in connecting to the remote " +
          "printer. For example: \"smb://user@printer-host/printer-name\". " +
          "<p> " +
          "<b> Protocol:</b> " +
          "The internet protocol for file transfer; choices are BSD, TCP, or URI. " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, this printer is " +
          "designated as the default printer for printing jobs sent to this " +
          "server. If another printer had been designated as the default printer " +
          "for the network, this printer will replace it as the default. If you " +
          "are using a naming service, this printer will be the default printer " +
          "for the naming service, also. " +
          "<p> Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner  " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "To add a user to the list, type a user name in the blank text field " +
          "below the list and click Add. Note that this user name replaces \"all\" " +
          "or \"none\" if either \"all\" or \"none\" is in the user access list. If " +
          "\"all\" or \"none\" is added as a user, \"all\" or \"none\" will replace the " +
          "names in the list. " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
        {"LDAPAuthentication.tag", "LDAPAuthentication"},

        // DO NOT LOCALIZE
        {"LDAPAuthentication.seealso", "NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"LDAPAuthentication.title", "LDAP Authentication"},

        // LOCALIZE
        {"LDAPAuthentication.keywords", "LDAP ldap \"LDAP server\" authentication login password naming \"naming service\" files \"replica server\" replica replication referral ldapclient \"distinguished name\" DN"},

        // LOCALIZE
        {"LDAPAuthentication.content",
          "<p> " +
          "If you are using the LDAP naming service, you will need the distinguished " +
          "name and password for a user who has update privileges to make any changes. " +
          "Before making changes to the LDAP directory the user should be fully aware of " +
          "the items in the <b>notes</b> below. " +
          "The LDAP Authentication dialog is displayed when you select LDAP as the " +
          "naming service. " +
          "<p> " +
          "1. Check the LDAP server name for correctness. You may select a " +
          "different server name if appropriate. " +
          "<p> " +
          "2. Check the Distinguished Name (DN) for correctness. You may enter a " +
          "different distinguished name of another user if appropriate. This may be the DN " +
          "of any directory user who has permissions (directory update privileges) to " +
          "update printer entries in the LDAP directory for the current ldapclient (1M) " +
          "naming service (NS) domain. " +
          "<p> " +
          "3. Enter the password for the user's Distinguished Name. " +
          "<p> " +
          "4. Click OK. " +
          "<p> " +
          "The entries you have made will be validated against the LDAP directory and then " +
          "saved, the LDAP Authentication dialog will be dismissed.  " +
          "<p>  " +
          "Click Cancel if you don't know the password for the Distinguished Name.  " +
          "<p> " +
          "<b>Note:</b> Keep the following in mind if you are using Solaris Print " +
          "Manager to update printer information in the LDAP naming service: " +
          "<p> " +
          "If the LDAP server is the Netscape Directory Server (NSDS) then " +
          "the default distinguished name is \"cn=Directory Manager\". " +
          "If the LDAP server is Sun Directory Server then an example " +
          "of the distinguished name is \"cn=admin, dc=XYZ, dc=COM\". " +
          "The Solaris Print Manager uses ldapclient(1M) to determine " +
          "the default LDAP server name. If there is more than one " +
          "server specified then the first one will be used. " +
          "<p> " +
          "The Print Manager always displays printer entries from the current  " +
          "ldapclient (1M) server. If this is not the domain Master LDAP server then " +
          "the list of printers displayed may <b>not</b> be the current list of printers, " +
          "this is because the ldapclient replica server may not have been updated by the " +
          "master server and so be out of sync with the master. Replica servers can have " +
          "various update replication agreements, for example; updated immediately there " +
          "is a change on the master, or updated once a day from the master. " +
          "<p> " +
          "If the selected LDAP server is a replica LDAP server, any <b>updates</b> will be " +
          "referred to the master server and done there. This again means the printer list " +
          "could be out of sync with the master. For example, a deleted printer may still " +
          "appear in the displayed printer list until the replica is updated from " +
          "the master. " +
          "<p> " +
          "Users can use the ldap command line utilities (ldapadd (1) & ldapmodify (1)) " +
          "to update printer entries in the directory, but this is not recommended. If " +
          "these utilities are used then the user <b>must ensure</b> that the printer-name " +
          "attribute value is unique within the ou=printers container. If it is not unique " +
          "the result of modifies done by the print manager (or lpset (1M)) may not be " +
          "predictable. " +
          "<p> " +
          "  "
        },



        // DO NOT LOCALIZE
        {"LoginFailed.tag", "LoginFailed"},

        // DO NOT LOCALIZE
        {"LoginFailed.seealso", "ToStart ToShowCommand NISAuthentication NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"LoginFailed.title", "If Login Fails"},

        // LOCALIZE
        {"LoginFailed.keywords", "\"login failed\" login fail failure fails"},

        // LOCALIZE
        {"LoginFailed.content",
          "<p> " +
          "If the NIS naming service is being used, you will need to know the " +
          "password for the naming service master. If LDAP is being used then " +
          "a fully distinguished name with update privilege and password will " +
          "be required. Note that default values may need to be overridden. For NIS+ " +
          "you may need to configure permissions to allow updates " +
          "before the tool is started. See the man page for lpadmin(1M) and the " +
          "help articles, \"About Naming Services\" and \"NIS Authentication,\" for " +
          "further information. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"MainWindow.tag", "MainWindow"},

        // DO NOT LOCALIZE
        {"MainWindow.seealso", "Overview ToAddAccess ToInstallLocal ToInstallNetwork ToModify ToDelete"},

        // LOCALIZE
        {"MainWindow.title", "Solaris Print Manager Main Window"},

        // LOCALIZE
        {"MainWindow.keywords", "\"Print Manager menu\" \"Printer menu\" \"Tools menu\" \"Help menu\" \"list of printers\" printers \"printer name\" \"printer server\" description \"default printer\" \"naming service\" domain solaris print manager main window"},

        // LOCALIZE
        {"MainWindow.content",
          "<p> " +
          "The main window is the starting point for any Solaris Print Manager " +
          "activities.  " +
          "<p> " +
          "<b> Print Manager Menu: </b> Select Naming Service, Show " +
          "Command-Line Console, Confirm All Actions, Exit " +
          "<p> " +
          "<b> Printer Menu: </b> Add Access to Printer, New Attached " +
          "Printer, New Network Printer, Modify Printer Properties, " +
          "Delete Printer " +
          "<p> " +
          "<b> Tools Menu: </b> Find Printer " +
          "<p> " +
          "<b> Help Menu: </b> Overview, On Help, About Print Manager " +
          "<p> " +
          "<b> List of Printers: </b> This is the list of printers installed on " +
          "the computer on which you are running Solaris Print Manager, or, if a " +
          "naming service is being used, all printers in the naming service. " +
          "<p> " +
          "There are three columns in the list: " +
          "<p>  " +
          "<b> Printer Name:</b> The name of the printer as specified during printer " +
          "installation.  " +
          "<p> " +
          "<b> Printer Server:</b> The name of the printer server for the printer " +
          "specified in the Printer Name column.  " +
          "<p> " +
          "<b> Description:</b> A description of the printer as specified during " +
          "printer installation (New Attached Printer or New Network " +
          "Printer) or modification (Modify Printer Properties). The " +
          "description might include the location of the printer and its printer " +
          "type. " +
          "<p>  " +
          "The footer panel at the bottom of the window has two or three entries: " +
          "<p>  " +
          "<b> Default Printer: </b> If no naming service is being used, the " +
          "default printer for the computer on which you are running Solaris " +
          "Print Manager. If a naming service is being used, the default printer " +
          "for the naming service. " +
          "<p> " +
          "<b> Naming Service: </b> The naming service -- NIS, LDAP, or NIS+ -- " +
          "that is being used for printing. This is not displayed if no naming " +
          "service is being used. " +
          "<p> " +
          "<b> Domain or Host: </b> The network domain you are working in or the " +
          "current host (if no naming service is being used). If you are " +
          "using a naming service, the list of printers includes all printers in " +
          "this domain. " +
          "<p>  " +
          ""
        },



        // DO NOT LOCALIZE
        {"Modify.tag", "Modify"},

        // DO NOT LOCALIZE
        {"Modify.seealso", "ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"Modify.title", "Dialog: Modify Printer Properties"},

        // LOCALIZE
        {"Modify.keywords", "modify properties \"printer properties\" \"attached printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: printer"},

        // LOCALIZE
        {"Modify.content",
          "<p> " +
          "Use the Modify Printer Properties dialog to modify an installed " +
          "printer. Note that you can modify the Description field only if this " +
          "is not an attached printer. You can also check or uncheck the Default " +
          "Printer box. " +
          "<p> " +
          "<b> Printer Name:</b> Cannot be modified. " +
          "<p>  " +
          "<b> Printer Server:</b> Cannot be modified.  " +
          "This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it.  " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Port:</b> Cannot be modified.  " +
          "Specifies the hardware port, such as /dev/term/a, that the printer is " +
          "connected to.  " +
          "<p> " +
          "<b> Printer Type:</b>  " +
          "Specifies the generic name for a type of " +
          " printer. Supported printer types correspond to " +
          " items listed in the /usr/share/lib/terminfo " +
          " directories. Examples are PostScript, Daisy, and Diablo.  " +
          "<p> " +
          "<b> File Contents:</b>  " +
          "Specifies the format of files that can be " +
          " printed without any special filtering by the " +
          " print software. PostScript is the default and is " +
          " probably correct most of the time.  " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, designates this printer " +
          "as the default printer for printing jobs from the computer on which " +
          "you are running Solaris Print Manager. If you are using a naming " +
          "service, this printer will be the default printer for the naming " +
          "service, also. " +
          "<p> " +
          "Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner  " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
        {"ModifyFailed.tag", "ModifyFailed"},

        // DO NOT LOCALIZE
        {"ModifyFailed.seealso", "ToModify Modify ToShowCommand Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ModifyFailed.title", "If Modify Printer Fails"},

        // LOCALIZE
        {"ModifyFailed.keywords", "modify \"modify printer\" fail failure printer fails"},

        // LOCALIZE
        {"ModifyFailed.content",
          "<p> " +
          "An attempt to modify printer properties failed. It is possible that " +
          "someone has deleted the printer before this modify operation completed. " +
          "<p> " +
          "Display the Command-Line Console to help pinpoint where the error " +
          "may have occurred. Choose Show Command-Line Console from the Print " +
          "Manager menu to display the Command-Line Console. See the man page for " +
          "lpadmin(1M) for further information.  " +
          ""
        },



        // DO NOT LOCALIZE
        {"ModifyPPD.tag", "ModifyPPD"},

        // DO NOT LOCALIZE
        {"ModifyPPD.seealso", "ToModify ModifyFailed ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ModifyPPD.title", "Dialog: Modify Printer Properties"},

        // LOCALIZE
        {"ModifyPPD.keywords", "modify properties \"printer properties\" \"attached printer\" \"printer name\" server description port \"printer make\" \"printer model\" \"printer driver\" fault \"fault notification\" \"default printer\" banner \"attached printer\" new nobanner dialog: printer"},

        // LOCALIZE
        {"ModifyPPD.content",
          "<p> " +
          "Use the Modify Printer Properties dialog to modify an installed " +
          "printer. Note that you can modify the Description field only if this " +
          "is not an attached printer. You can also check or uncheck the Default " +
          "Printer box. " +
          "<p> " +
          "<b> Printer Name:</b> Cannot be modified. " +
          "<p>  " +
          "<b> Printer Server:</b> Cannot be modified.  " +
          "This is the computer you have selected to act " +
          "as the server for print actions. You must be logged on to this " +
          "computer and be running Solaris Print Manager on it.  " +
          "<p>  " +
          "<b> Description:</b>  " +
          "[Optional] Describes the printer, including the printer type and  " +
          "location, possibly, or provides other information about the " +
          " printer.  " +
          "<p>  " +
          "<b> Printer Port:</b> Cannot be modified.  " +
          "Specifies the hardware port, such as /dev/term/a, that the printer is " +
          "connected to.  " +
          "<p> " +
          "<b> Printer Make:</b> " +
          " Specifies the printer make, or manufacturer. This  " +
          "information is on the printer and/or in the documentation " +
          " that is delivered with the printer. " +
          "<p> " +
          "<b> Printer Model:</b> " +
          " Specifies the printer model. This information " +
          " is found on the printer and/or in the documentation that is " +
          " delivered with the printer. " +
          "<p> " +
          "<b> Printer Driver:</b> " +
          " Specifies the printer driver to use with this printer. " +
          "<p> " +
          "<b> Fault Notification:</b>  " +
          "Specifies how the superuser will be notified in " +
          " case of a printer error. " +
          "<p> " +
          "<b> Options: Default Printer:</b> If checked, designates this printer " +
          "as the default printer for printing jobs from the computer on which " +
          "you are running Solaris Print Manager. If you are using a naming " +
          "service, this printer will be the default printer for the naming " +
          "service, also. " +
          "<p> " +
          "Note that this is the last place the print subsystem looks to " +
          "determine where a particular print job will be printed; the " +
          "destination option of the lp command is the first place looked, and " +
          "other environment variables are checked before this one. See the man " +
          "page for printers.conf(4) for a full explanation of the search order. " +
          "<p> " +
          "<b> Options: Banner:</b> Specifies whether a banner  " +
          "page will be printed between jobs.  " +
          "<br> " +
          "<br> " +
          "\"Aways Print Banner\" stipulates that a banner will always be printed  " +
          "and may not be turned off by the user.  " +
          "<br> " +
          "\"User Selectable - Default=on\" stipulates that a banner will be printed  " +
          "unless the user selects  " +
          "to turn the banner off.  " +
          "<br> " +
          "\"Never Print Banner\" stipulates that a banner will never be printed  " +
          "and may not be turned on by the user. " +
          "<p> " +
          "<b> User Access List:</b>  " +
          "Specifies the print clients that can " +
          " print to this printer. By default, all print " +
          " clients have access to this printer, as designated by the word " +
          "\"all\" in the list.  " +
          "<p> " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "To delete a user from the list, select the user in the list and click " +
          "Delete.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
        {"NISAuthentication.tag", "NISAuthentication"},

        // DO NOT LOCALIZE
        {"NISAuthentication.seealso", "NameService Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"NISAuthentication.title", "NIS Authentication"},

        // LOCALIZE
        {"NISAuthentication.keywords", "NIS \"NIS master\" master authentication login password naming \"naming service\" files .rhosts"},

        // LOCALIZE
        {"NISAuthentication.content",
          "<p> " +
          "If you are using the NIS naming service, you will need the root " +
          "password for the NIS master computer to make any changes. The NIS " +
          "Authentication dialog is displayed when you select NIS as the " +
          "naming service. " +
          "<p> " +
          "1. Enter the password for the NIS master. " +
          "<p> " +
          "2. Click OK. " +
          "<p> " +
          "The entries you have made will be saved and the NIS Authentication " +
          "dialog will be dismissed.  " +
          "<p>  " +
          "Click Cancel if you don't know the password for the NIS master.  " +
          "<p> " +
          "<b>Note:</b> Keep the following in mind if you are using Solaris Print " +
          "Manager to update printer information in the NIS name service: " +
          "<p> " +
          "- If your network is set up with NIS master and slave servers,  " +
          "the NIS slaves may not see the updated printer information  " +
          "until the NIS slaves are updated. See ypmake(1M) for more " +
          "information. " +
          "<p> " +
          "  " +
          "- If your NIS servers are running Solaris 2.5 and compatible  " +
          "versions, you must have explicit permissions on the NIS master  " +
          "server to update the maps. This means an entry for your system  " +
          "name must reside in root's .rhosts file on the NIS master server. " +
          "<p> " +
          "- If you have modified the yp makefile to use something other " +
          "than /etc/printers.conf as the source for the NIS map, " +
          "printers.conf.byname, do not use Solaris Print Manager to modify NIS. " +
          ""
        },



        // DO NOT LOCALIZE
        {"NameService.tag", "NameService"},

        // DO NOT LOCALIZE
        {"NameService.seealso", "ToStart ToSelectName Overview HelpOnHelp"},

        // LOCALIZE
        {"NameService.title", "About Naming Services"},

        // LOCALIZE
        {"NameService.keywords", "\"name service\" \"naming service\" name naming nis none ldap nis+ keylogin printers.conf service files hosts.equiv nisgrpadm about services"},

        // LOCALIZE
        {"NameService.content",
          "<p> " +
          "You can select \"files\" or a naming service (NIS, LDAP, or NIS+) when you " +
          "start up Solaris Print Manager or when you choose Select Naming " +
          "Service from the Print Manager menu. See the descriptions of each " +
          "of the choices below. " +
          "<p> " +
          "Once you select a naming service, Print Manager will retrieve and update " +
          "printer information in the database for the specified naming service " +
          "when you add, modify, or delete a printer. Note that in addition to " +
          "the naming service map, when updating attached or network printers " +
          "the file /etc/printers.conf is also updated when a naming service " +
          "is being used. " +
          "<p> " +
          "When you make a remote printer accessible by choosing Add Access to " +
          "Printer from the Printer menu, either the naming service map is " +
          "updated or /etc/printers.conf is updated (if \"files\" is selected and " +
          "no naming service is being used). " +
          "<p> " +
          "<b>files</b>: Retrieve or update printer information from " +
          "the file /etc/printers.conf. " +
          "  " +
          "<p> " +
          "<b>NIS</b>: Use the printers.conf.byname map stored in the Network " +
          "Information Service for retrieving or updating printer information. " +
          "See the ypserv(1M) man page for more information. " +
          "<p>  " +
          "<b>Note: </b>When a site is set up with a NIS master and slaves, if the " +
          "host binds to a slave, a user may not see NIS updates made through " +
          "Print Manager until the slave computers are updated. See the ypmake(1M) " +
          "man page for more information. " +
          "  " +
          "<p> " +
          "<b>LDAP</b>: Use the printers map stored in the LDAP " +
          "naming service for retrieving or updating printer information. " +
          "See the ldap(1) man page for more information. " +
          "<p> " +
          "To used the LDAP naming service the host computer must be configured as a " +
          "LDAP client, see ldapclient(1M). " +
          "<p>  " +
          "<b>Note:</b>If the host binds to a replica LDAP server, a user may not see " +
          "updates made through Print Manager until the replica is updated from the master " +
          "LDAP server. " +
          "<p> " +
          "<b>NIS+</b>: Use the printers.org_dir map stored in the NIS+  " +
          "naming service for retrieving or updating printer information. " +
          "See the nis+(1) man page for more information. " +
          "<p> " +
          "The following privileges are needed for each naming service: " +
          "  " +
          "<p> " +
          "<b>For files:</b> " +
          "<p> " +
          "The tool must be started as root. " +
          "  " +
          "<p> " +
          "<b>For NIS:</b>  " +
          "<p> " +
          "1) The tool must be started as root. " +
          "<p> " +
          "2) The password for the NIS master will be required when you select " +
          "this naming service. " +
          "  " +
          "<p> " +
          "3) For NIS servers running pre-2.6 Solaris, you need to set up an " +
          "rhosts entry on the NIS server allowing root on the print server root " +
          "access on the NIS server. You must have explicit permissions on the " +
          "NIS master server to update the maps. This means an entry for your " +
          "host name must reside in root's .rhosts file on the NIS master server. " +
          "See the hosts.equiv(4) man page for more information. " +
          "  " +
          "<p> " +
          "<b>For LDAP:</b>  " +
          "<p> " +
          "1) The tool must be started as root. " +
          "<p> " +
          "2) A fully distinguished name (DN) with update privilege and password will " +
          " be required when you select this naming service. " +
          "<p> " +
          "  " +
          "<b>For NIS+:</b>  " +
          "<p> " +
          "1) The computer that Solaris Print Manager is running on must be added to the list " +
          "of principals authorized to update the NIS+ map printers.org_dir. " +
          "See the nisgrpadm(1) man page for more information. " +
          "<p> " +
          "  " +
          "2) Solaris Print Manager must be started as root. Depending on " +
          "configuration the user may also need to do a keylogin. See the " +
          "keylogin(1) man page for more information. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"Overview.tag", "Overview"},

        // DO NOT LOCALIZE
        {"Overview.seealso", "MainWindow AddAccess InstallLocal InstallNetwork Modify ToAddAccess ToStart ToInstallLocal ToInstallNetwork ToModify ToDelete ToSelectName ToExit ToFindPrinter ToShowCommand ToConfirmActions HelpOnHelp"},

        // LOCALIZE
        {"Overview.title", "Overview"},

        // LOCALIZE
        {"Overview.keywords", "overview contents task dialog"},

        // LOCALIZE
        {"Overview.content",
          "<p>  " +
          "Use Solaris Print Manager to select a naming service, to install attached " +
          "or network printers, and to add, modify, or remove access to installed " +
          "printers. Five windows or dialogs and 11 tasks -- listed below -- are described " +
          "in the help volume. To view one of the help articles, select it " +
          "in the See also pulldown menu and click the Show button.  " +
          "<p> " +
          "If you need more information about printing, see the \"Solaris Print " +
          "Manager Administration Guide\" AnswerBook or the \"Setting Up Printers\" " +
          "chapter in the Solaris System Administrator AnswerBook. " +
          "<p>  " +
          "<b> Windows and Dialogs </b>  " +
          "<p> " +
          "Main Window " +
          "<br>  " +
          "Add Access to Printer " +
          "<br> " +
          "New Attached Printer " +
          "<br> " +
          "New Network Printer " +
          "<br> " +
          "Modify Printer Properties " +
          "<p>  " +
          "<b>Tasks</b> " +
          "<p> " +
          "To Start Solaris Print Manager " +
          "<br> " +
          "To Add Access to an Installed Printer " +
          "<br> " +
          "To Install an Attached Printer " +
          "<br> " +
          "To Install a Network Printer " +
          "<br> " +
          "To Modify Printer Properties " +
          "<br> " +
          "To Delete a Printer " +
          "<br> " +
          "To Select a Naming Service " +
          "<br>  " +
          "To Exit Solaris Print Manager " +
          "<br>  " +
          "To Find a Printer " +
          "<br>  " +
          "To Show the Command-Line Console " +
          "<br>  " +
          "To Confirm All Actions " +
          "<p>  " +
          "<b>More About Printing and Solaris Print Manager </b> " +
          "<p>  " +
          "If you need more information about printing or about Solaris Print " +
          "Manager, including a description of mouseless navigation, see the " +
          "\"Solaris Print Manager Administration Guide\" AnswerBook or the " +
          "\"Setting Up Printers\" chapter in the Solaris System Administrator " +
          "AnswerBook. " +
          "<p> " +
          ""
        },






        // DO NOT LOCALIZE
        {"PrinterPort.tag", "PrinterPort"},

        // DO NOT LOCALIZE
        {"PrinterPort.seealso", "InstallLocal ToInstallLocal Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"PrinterPort.title", "Specify Printer Port"},

        // LOCALIZE
        {"PrinterPort.keywords", "port \"printer port\" other specify printer"},

        // LOCALIZE
        {"PrinterPort.content",
          "<p> " +
          "The printer port is the device name (typically, /dev/term/a, " +
          "/dev/term/b, or /dev/bpp0) corresponding to the port to which a " +
          "locally attached printer is physically connected. You usually connect " +
          "printer cables to a serial port (/dev/term/a or /dev/term/b, for " +
          "example) but in some cases you can use a parallel port (/dev/bpp0, for " +
          "example). See the printer vendor's documentation and your system's " +
          "installation documentation for information about switch settings and " +
          "cabling requirements. " +
          "<p> " +
          "Note that the device name must exist and have write permissions " +
          "set. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"PrinterType.tag", "PrinterType"},

        // DO NOT LOCALIZE
        {"PrinterType.seealso", "InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"PrinterType.title", "Specify Printer Type"},

        // LOCALIZE
        {"PrinterType.keywords", "\"printer type\" type specify printer"},

        // LOCALIZE
        {"PrinterType.content",
          "<p> " +
          "When you configure a printer, you must identify the manufacturer  " +
          "and model of the printer in a way that the LP print service " +
          "understands the printer type. Examples are PostScript, Daisy, and Diablo.  " +
          "<p>  " +
          "If you have a PostScript printer, for example, select PostScript as " +
          "the Printer Type. To install a printer type that is not listed select " +
          "Other. The printer type you enter must correspond to an entry in the " +
          "/usr/share/lib/terminfo directories. See the terminfo(4) man page for " +
          "more information. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"RemoteServer.tag", "RemoteServer"},

        // DO NOT LOCALIZE
        {"RemoteServer.seealso", "AddAccess ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"RemoteServer.title", "Specify Remote Server"},

        // LOCALIZE
        {"RemoteServer.keywords", "remote \"remote printer\" server \"printer server\" fail failure specify"},

        // LOCALIZE
        {"RemoteServer.content",
          "<p> " +
          "A printer server must be specified; the printer server is the computer " +
          "on which the software for the remote printer is installed.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ShowCommandConsole.tag", "ShowCommandConsole"},

        // DO NOT LOCALIZE
        {"ShowCommandConsole.seealso", "Overview MainWindow ToShowCommand"},

        // LOCALIZE
        {"ShowCommandConsole.title", "Command-Line Console"},

        // LOCALIZE
        {"ShowCommandConsole.keywords", "\"command-line\" log command console show"},

        // LOCALIZE
        {"ShowCommandConsole.content",
          "<p> " +
          "The Command-Line Console displays the command-line version of add, " +
          "modify, and delete actions. Errors and warnings may also be " +
          "displayed after the command.  " +
          "<p> " +
          "For example, if you choose Add Access to Printer from the Print " +
          "Manager menu and enter Printer Name = MyPrinter, Printer Server = " +
          "PrintServer2, Description = Local Printer, the Command-line Console " +
          "will display: " +
          "<p> " +
          "Add Access to printer " +
          "<br> " +
          "% /usr/sbin/lpadmin -p MyPrinter -s PrintServer2 -D \"Local Printer\" " +
          "<p> " +
          "The Command-line Console is displayed if the Show Command-Line Console box " +
          "is checked in the Print Manager menu.  " +
          "<p> " +
          "<b>Note: </b>When updating the NIS naming service, there are some " +
          "cases where there is no command line equivalent for what Solaris Print " +
          "Manager is doing. In these cases what gets reported to the " +
          "Command-Line console is: \"rsh [nis_master] ...\" or " +
          "\"rexec([nis_master]) ...\" " +
          "<p> " +
          "<b>Note: </b>When updating the LDAP naming service, the Solaris Print " +
          "Manager uses native (or compiled) code to process updates. This " +
          "is done to enhance security related to the LDAP password. The command-line " +
          "used to update the LDAP database is not displayed for security reasons, but " +
          "the log will include the entry \"ldap ...\" to indicate that the LDAP database " +
          "has been updated. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToAddAccess.tag", "ToAddAccess"},

        // DO NOT LOCALIZE
        {"ToAddAccess.seealso", "AddAccess ToModify ToDelete MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToAddAccess.title", "To Add Access to an Installed Printer"},

        // LOCALIZE
        {"ToAddAccess.keywords", "access \"add access\" description \"default printer\" \"naming service\" \"printer name\" \"printer server\" add installed printer"},

        // LOCALIZE
        {"ToAddAccess.content",
          "  " +
          "<p>  " +
          "Do the following to make an installed printer accessible to print " +
          "client computers. See the printers.conf(4) man page for more " +
          "information about print client commands. " +
          "<p>  " +
          "<b>Note:</b> If you are using a naming service, use this procedure to " +
          "add access to a private printer (one that is not listed in the naming " +
          "service) or to make the printer usable even if the naming service " +
          "server is down. This adds access for all users in the naming service " +
          "domain; see the man page for domainname(1M) for more information about " +
          "domains.  " +
          "<p> " +
          "If a naming service is not being used for printing, use this procedure " +
          "to add access to a remote printer. " +
          "  " +
          "<p> " +
          "1. Choose Add Access to Printer from the Printer menu. " +
          "<p> " +
          " The Add Access To Printer dialog is displayed. " +
          "<p> " +
          "2. Enter a printer name, printer server name, and description (optional). " +
          "<p>  " +
          "Note that Solaris Print Manager does not check for the validity of " +
          "Printer Name or Printer Server.  " +
          "<p> " +
          "3. Click Default Printer if you want this printer to be the default " +
          "printer. " +
          "<p> " +
          "If a naming service is being used, this printer will be designated as " +
          "the default printer for all users in the domain.  " +
          "<p> " +
          "If no naming service is being used, this printer will be designated as " +
          "the default printer for the computer on which you are running Solaris " +
          "Print Manager. " +
          "<p> " +
          "Note that this is the last place the print commands will look to " +
          "determine the printer for a specific print command; see the " +
          "man page for printers.conf(4) for more information about resolving " +
          "printer conflicts. " +
          "<p> " +
          "4. Click OK or Apply to add access for the specified printer. " +
          "<p> " +
          "<b> Note:</b> If you are using the NIS naming service, you have to know the " +
          "root password for the NIS master. If you are using the LDAP naming service, " +
          "you must know a fully distinguished name which has update privilege and " +
          "the corresponding password. Default values may need to be overridden. You " +
          "will be prompted for the password when you click Apply or OK. Enter the " +
          "password and click OK. " +
          "<p> " +
          " The list of printers displayed in the Solaris Print Manager main window " +
          " is updated to include the new printer. " +
          "<p> " +
          " The Add Access dialog will remain displayed if you click Apply, " +
          "allowing you to add access to additional printers.  " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToConfirmActions.tag", "ToConfirmActions"},

        // DO NOT LOCALIZE
        {"ToConfirmActions.seealso", "Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToConfirmActions.title", "To Confirm All Actions"},

        // LOCALIZE
        {"ToConfirmActions.keywords", "confirm action all actions"},

        // LOCALIZE
        {"ToConfirmActions.content",
          "<p> " +
          "Do the following to require that all Solaris Print Manager actions be " +
          "confirmed before being executed, or to turn off this option.  " +
          "<p> " +
          "1. Choose Confirm All Actions from the Print Manager menu.  " +
          "<p> " +
          "If the Confirm All Actions box was not checked, it will be checked  " +
          "and all subsequent Solaris Print Manager actions will require " +
          "confirmation before being performed.  " +
          "<p> " +
          "If the Confirm All Actions box was checked, it will no longer be checked  " +
          "and subsequent Solaris Print Manager actions will NOT require " +
          "confirmation before being performed. Note that some actions, such as " +
          "Delete Printer, require confirmation regardless of the setting of the " +
          "Confirm All Actions box.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToDelete.tag", "ToDelete"},

        // DO NOT LOCALIZE
        {"ToDelete.seealso", "ToAddAccess AddAccess MainWindow Overview HelpOnHelp"},

        // LOCALIZE
        {"ToDelete.title", "To Delete a Printer"},

        // LOCALIZE
        {"ToDelete.keywords", "delete uninstall \"local printer\" \"network printer\" \"attached printer\" printer"},

        // LOCALIZE
        {"ToDelete.content",
          "<p>  " +
          "Do the following to delete a printer from the printer list.  " +
          "<p> 1. Select the printer in the list of printers in the Solaris " +
          "Print Manager main window. " +
          "<p>  " +
          "2. Choose Delete Printer from the Printer menu.  " +
          "<p>  " +
          "A dialog is displayed, " +
          "asking if you really want to delete the selected printer.  " +
          "<p> <b>Note:</b> If the printer is a local printer (one installed on " +
          "the current server), the printer will be uninstalled; if a naming " +
          "service has been selected, the entry for this printer will also be " +
          "removed from the naming service.  " +
          "<p>  " +
          "3. Click OK to delete the printer.  " +
          "<p>  " +
          "A window is displayed asking you to confirm the " +
          " deletion. " +
          "<p>  " +
          "4. Click Delete. " +
          "<p>  " +
          "The selected printer is deleted from the Solaris Print Manager main " +
          "window. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToExit.tag", "ToExit"},

        // DO NOT LOCALIZE
        {"ToExit.seealso", "ToStart Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToExit.title", "To Exit Solaris Print Manager"},

        // LOCALIZE
        {"ToExit.keywords", "exit close solaris print manager"},

        // LOCALIZE
        {"ToExit.content",
          "<p> " +
          "1. Choose Exit from the Print Manager menu.  " +
          "<p> " +
          "The Solaris Print Manager main window and any other open Print Manager " +
          "dialogs are closed.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToFindPrinter.tag", "ToFindPrinter"},

        // DO NOT LOCALIZE
        {"ToFindPrinter.seealso", "Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToFindPrinter.title", "To Find a Printer"},

        // LOCALIZE
        {"ToFindPrinter.keywords", "find \"printer name\" tool printer"},

        // LOCALIZE
        {"ToFindPrinter.content",
          "<p> " +
          "Do the following to find a printer in the Solaris Print Manager list " +
          "of printers. " +
          "<p> " +
          "1. Choose Find Printer from the Tools menu. " +
          "<p> " +
          "A dialog will be displayed, asking you to enter the name of a printer to find. " +
          "<p> " +
          "2. Type a printer name in the text field and click Find. " +
          "<p> " +
          "If the exact printer name is found in the list, it will be selected; " +
          "the list will scroll, if necessary. If the printer is not found, a " +
          "message will be displayed, indicating that the named printer was not " +
          "found in the current list.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToInstallLocal.tag", "ToInstallLocal"},

        // DO NOT LOCALIZE
        {"ToInstallLocal.seealso", "InstallLocal ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToInstallLocal.title", "To Install an Attached Printer"},

        // LOCALIZE
        {"ToInstallLocal.keywords", "install \"local printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner nobanner \"attached printer\" new attached printer"},

        // LOCALIZE
        {"ToInstallLocal.content",
          "<p> " +
          "Once you have physically connected the printer to the printer server, " +
          "do the following to install the printer, which makes the printer " +
          "available for printing from the computer on which you are running " +
          "Solaris Print Manager.  " +
          "<p> " +
          "<b> Note:</b> The computer on which you are running Solaris Print " +
          "Manager becomes the printer server for the printer being installed. " +
          "<p> " +
          "1. Choose New Attached Printer from the Printer menu. " +
          "<p>  " +
          "The New Attached Printer dialog will be displayed. " +
          "<p> " +
          "2. Enter a name in Printer Name. " +
          "<p> " +
          "3. [Optional] Enter a description of the printer. " +
          "<p> " +
          "This might include the location and the type of printer. " +
          "<p> " +
          "4. Select a port from the Printer Port pulldown menu. " +
          "<p> " +
          "This is the hardware port where the printer is plugged into the " +
          "server. If you choose Other, a dialog will pop up asking you to " +
          "specify a port. Enter a port and click OK. " +
          "<p> " +
          "5. Select a printer type from the Printer Type pulldown menu. " +
          "<p> " +
          "Scroll the list if necessary. If the printer type is not in the list, " +
          "select Other; you will be asked to specify a printer type. Enter a " +
          "printer type and click OK. " +
          "<p> " +
          "6. Select an item in the File Contents pulldown menu. " +
          "<p> " +
          "Choices include PostScript and ASCII; the default is PostScript, which " +
          "will work in most cases.  " +
          "<p> " +
          "7. Select an item in the Fault Notification pulldown menu. " +
          "<p> " +
          "The default is Write to Superuser. " +
          "<p> " +
          "8. [Optional] Click Default Printer if you want this printer to be the default " +
          "printer for this server. " +
          "<p> " +
          "9. [Optional] Select option to define whether a banner  " +
          "page is to be printed between jobs. \"Always Print Banner\" " +
          "specifies that a banner will be printed and the user may not specify " +
          "otherwise. \"User Selectable - Default=on\" specifies that the user may " +
          "specify to turn off the banner in the print command; if the user does " +
          "not specify, the banner will be printed. \"Never Print Banner\" specifies " +
          "that a banner will not be printed and the user may not specify " +
          "otherwise. The default action is to always print the banner. " +
          "<p> " +
          "10. Modify the User Access List, if necessary. " +
          "<p> " +
          "The default value is \"all,\" meaning that anyone can use this printer. " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "To remove a name from the list, select it and click Delete. " +
          "<p> " +
          "<b> Note:</b> If you enter \"all\" or \"none\" in the text field and click " +
          "Add, all individual user names will be deleted from the list and " +
          "replaced by \"all\" or \"none.\"  " +
          "<p>  " +
          "11. Click OK or Apply to install the printer. " +
          "<p> " +
          "The window will remain if you click Apply, allowing you to install " +
          "additional printers.  " +
          "<p> " +
          "<b> Note:</b> If you are using the NIS naming service, you have to know " +
          "the root password for the NIS master. If you are using the LDAP naming " +
          "service you must know a fully distinguished name which has update " +
          "privilege and the corresponding password. Default values may need to be " +
          "overridden. You will be prompted for the password when you click Apply or OK. " +
          "Enter the password and click OK. " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToInstallNetwork.tag", "ToInstallNetwork"},

        // DO NOT LOCALIZE
        {"ToInstallNetwork.seealso", "InstallNetwork ToAddAccess Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToInstallNetwork.title", "To Install a Network Printer"},

        // LOCALIZE
        {"ToInstallNetwork.keywords", "install network \"network printer\" \"printer name\" server description port \"printer type\" \"file contents\" fault \"fault notification\" \"default printer\" banner destination protocol new bsd tcp printer"},

        // LOCALIZE
        {"ToInstallNetwork.content",
          "<p> " +
          "Once you have physically connected the printer to the network, " +
          "do the following to install the printer, which makes the printer " +
          "available for printing from the network. " +
          "<p> " +
          "<b> Note:</b> The computer on which you are running Solaris Print " +
          "Manager becomes the printer server for the printer being installed. " +
          "<p> " +
          "1. Choose New Network Printer from the Printer menu. " +
          "<p> " +
          "The New Attached Printer dialog will be displayed. " +
          "<p>  " +
          "2. Enter a name in Printer Name. " +
          "<p> " +
          "3. [Optional] Enter a description of the printer. " +
          "<p> " +
          "This might include the location and the type of printer. " +
          "<p> " +
          "4. Select a printer type from the Printer Type pulldown menu. " +
          "<p> " +
          "Scroll the list if necessary. If the printer type is not in the list, " +
          "select Other; you will be asked to specify a printer type. Enter a " +
          "printer type and click OK. " +
          "<p> " +
          "5. Select an item in the File Contents pulldown menu. " +
          "<p> " +
          "Choices include PostScript and ASCII; the default is PostScript, which " +
          "will work in most cases.  " +
          "<p> " +
          "6. Select an item in the Fault Notification pulldown menu. " +
          "<p> " +
          "The default is Write to Superuser. " +
          "<p> " +
          "7a. If the printer uses BSD protocol, enter the network name of the printer " +
          "in the Destination field, followed by a colon and the printer-vendor-supplied " +
          "queue name. " +
          "<p> " +
          "7b. If the printer uses TCP protocol, enter the network name of the printer " +
          "in the Destination field, followed by a colon and port number to be used in the " +
          "tcp connection to the printer. " +
          "<p> " +
          "7c. If the printer uses a printer URI, enter the the URI for the printer " +
          "in the Destination field (for example: " +
          "\"smb://printer-host/printer-name\"). " +
          "<p> " +
          "8. Select either BSD, TCP, or URI from the Protocol pulldown menu. " +
          "<p> " +
          "9. [Optional] Click Default Printer if you want this printer to be the default " +
          "printer for this server. " +
          "<p> " +
          "10. [Optional] Select option to define whether a banner  " +
          "page is to be printed between jobs. \"Always Print Banner\" " +
          "specifies that a banner will be printed and the user may not specify " +
          "otherwise. \"User Selectable - Default=on\" specifies that the user may " +
          "specify to turn off the banner in the print command; if the user does " +
          "not specify, the banner will be printed. \"Never Print Banner\" specifies " +
          "that a banner will not be printed and the user may not specify " +
          "otherwise. The default action is to always print the banner. " +
          "<p> " +
          "11. Modify the User Access List, if necessary. " +
          "<p> " +
          "The default value is \"all,\" meaning that anyone can use this printer. " +
          "If you want to restrict its use to individual users, enter a user name " +
          "in the text field below the list and click Add. Other legal constructs " +
          "are system-name!login-ID (user \"login-ID\" on system \"system-name\"), " +
          "system-name!all (all users on system \"system-name\"), and all!login-ID " +
          "(user \"login-ID\" on all systems). Use the lpadmin(1M) command to deny " +
          "access to users.  " +
          "<p> " +
          "<b> Note:</b> If you enter \"all\" or \"none\" in the text field and click " +
          "Add, all individual user names will be deleted from the list and " +
          "replaced by \"all\" or \"none.\"  " +
          "<p>  " +
          "12. Click OK or Apply to install the printer. " +
          "<p> " +
          "The window will remain if you click Apply, allowing you to install " +
          "additional printers.  " +
          "<p> " +
          "<b> Note:</b> If you are using the NIS naming service, you have to know " +
          "the root password for the NIS master. If you are using the LDAP naming " +
          "service, you must know a fully distinguished name which has update privilege " +
          "and the corresponding password. Default values may need to be overridden. " +
          "You will be prompted for the password when you click Apply or OK. " +
          "Enter the password and click OK. " +
          "<p>  " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToModify.tag", "ToModify"},

        // DO NOT LOCALIZE
        {"ToModify.seealso", "Modify ModifyFailed InstallLocal InstallNetwork ToInstallLocal ToInstallNetwork ToAddAccess ToDelete AddAccess MainWindow Overview HelpOnHelp"},

        // LOCALIZE
        {"ToModify.title", "To Modify Printer Properties"},

        // LOCALIZE
        {"ToModify.keywords", "modify \"Printer menu\" \"local printer\" nis \"nis master\" \"naming service\" ldap LDAP attached \"network printer\" local network printer properties"},

        // LOCALIZE
        {"ToModify.content",
          "<p> " +
          "Do the following to modify the properties of an installed printer. " +
          "<p>  " +
          "1. Double-click the printer in the Solaris Print Manager main window " +
          "<p>  " +
          "OR " +
          "<p>  " +
          "Select the printer in the Solaris Print Manager main window and choose " +
          " Modify Printer Properties from the Printer menu.  " +
          "<p>  " +
          "The Modify Printer Properties dialog is displayed.  " +
          "<p>  " +
          "2. Modify the printer configuration, as needed. " +
          "<p>  " +
          "If this is an attached printer (one installed on the computer on which " +
          "you are running Solaris Print Manager) you can modify the Description, " +
          "Printer Port, Printer Type, File Contents, Fault Notification, " +
          "Options, and User Access List. " +
          "<p> " +
          "If this is not an attached printer, only the Description field can be " +
          "modified. You can also check or uncheck the Default Printer box.  " +
          "<p>  " +
          "3. Click OK. " +
          "<p>  " +
          "The changes you made are saved and the Modify Printer Properties " +
          "dialog is dismissed. " +
          "<p>  " +
          "If you modified the Description field, the new description is " +
          "displayed in the Solaris Print Manager main window. " +
          "<p>  " +
          "<b> Note:</b> If you are using the NIS naming service, you have to know " +
          "the root password for the NIS master. If you are using the LDAP naming service, " +
          "you must know a fully distinguished name which has update privilege and " +
          "the corresponding password. Default values may need to be overridden. " +
          "You will be prompted for the password when you select the NIS or " +
          "LDAP naming service. Enter the password and click OK. " +
          "<p>  " +
          "<b> Note:</b> To modify the Printer Name or Printer Server field, " +
          "delete the printer and add it with a new printer and/or server name. " +
          "<p> " +
          "<b>OK:</b> Apply changes and dismiss the window. " +
          "<br> " +
          "<b>Apply:</b> Apply the changes and leave the window displayed. " +
          "<br> " +
          "<b>Reset:</b> Reset all fields to last Apply " +
          "<br> " +
          "<b>Cancel:</b> Dismiss the window. " +
          "<br> " +
          "<b>Help:</b> Display help for the current window or dialog.  " +
          "<p> "
        },



        // DO NOT LOCALIZE
        {"ToSelectName.tag", "ToSelectName"},

        // DO NOT LOCALIZE
        {"ToSelectName.seealso", "NameService ToStart Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToSelectName.title", "To Select a Naming Service"},

        // LOCALIZE
        {"ToSelectName.keywords", "select \"name service\" \"naming service\" name naming service"},

        // LOCALIZE
        {"ToSelectName.content",
          "<p> " +
          "Do the following to select a naming service for Solaris Print Manager or " +
          "to change from using a naming service to using no naming service.  " +
          "<p>  " +
          "When you select a naming service you are specifying where Solaris " +
          "Print Manager will retrieve printer information from, and where " +
          "changes made in Print Manager will be made. If a naming service is " +
          "selected, additions and deletions will be made in the printing " +
          "configuration database for the selected naming service. If you choose " +
          "\"files,\" the /etc/printers.conf file will be used to determine which " +
          "printers are available, and changes will be made there. " +
          "<p> " +
          "1. Choose Select Naming Service from the Print Manager menu. " +
          "<p> " +
          "A dialog is displayed, asking you to choose a naming service.  " +
          "<p> " +
          "2. Choose a naming service (or \"files,\" if no naming service is to be " +
          "used) and click OK. " +
          "<p> " +
          "The Solaris Print Manager main window is displayed, listing all the " +
          "accessible printers, which includes all printers in the selected " +
          "naming service's printer configuration database.  " +
          "<p> " +
          "See the man page for printers.conf(4) for more information. " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToShowCommand.tag", "ToShowCommand"},

        // DO NOT LOCALIZE
        {"ToShowCommand.seealso", "ShowCommandConsole Overview MainWindow HelpOnHelp"},

        // LOCALIZE
        {"ToShowCommand.title", "To Show Command-Line Console"},

        // LOCALIZE
        {"ToShowCommand.keywords", "\"command-line\" log command show console"},

        // LOCALIZE
        {"ToShowCommand.content",
          "<p> " +
          "Do the following to cause the command-line version of add, modify, and " +
          "delete actions to be displayed in the Solaris Print Manager " +
          "Command-Line Console -- or to turn off this option if it was " +
          "previously turned on. Errors and warnings may also be " +
          "displayed after the command.  " +
          "<p> " +
          "1. Choose Show Command-Line Console from the Print Manager menu.  " +
          "<p> " +
          "If the Show Command-line Console box was not checked when you chose " +
          "it, it will be checked and the Show Command-line Console will be " +
          "displayed; Solaris Print Manager actions will be displayed in the " +
          "Console. " +
          "<p> " +
          "Note that errors and warnings may also appear in the Console, after " +
          "the commands used to complete the action. " +
          "<p> " +
          "If the Show Command-line Console box was checked when you chose it, " +
          "it will no longer be checked and the Show Command-line Console will be " +
          "closed. " +
          "<p> " +
          ""
        },



        // DO NOT LOCALIZE
        {"ToStart.tag", "ToStart"},

        // DO NOT LOCALIZE
        {"ToStart.seealso", "ToSelectName ToExit Mainwindow Overview HelpOnHelp"},

        // LOCALIZE
        {"ToStart.title", "To Start Solaris Print Manager"},

        // LOCALIZE
        {"ToStart.keywords", "start startup load \"name service\" \"naming service\" SUNWppm \"Solaris Management Console\" \"the Console\" solaris print manager"},

        // LOCALIZE
        {"ToStart.content",
          "<p>  " +
          "If you have installed SUNWppm package, do the following to start " +
          "Solaris Print Manager. Note that you must be root to run Print " +
          "Manager; if you attempt to launch it from Solaris Management Console " +
          "you will be prompted for the root password.  " +
          "<p>  " +
          "1. Double-click the Solaris Print Manager icon in Solaris Management " +
          "Console  " +
          "<p> " +
          " OR  " +
          "<p> " +
          "cd to the directory /usr/sadm/admin/bin and as root type ./printmgr " +
          "<p> " +
          "A dialog is displayed, asking you to choose a naming service.  " +
          "<p> " +
          "2. Choose a naming service (or files, if no naming service is to be " +
          "used) and click OK. " +
          "<p> " +
          "The Solaris Print Manager main window is displayed, listing all the " +
          "printers accessible from the computer on which you are running Solaris " +
          "Print Manager.  " +
          "<p> " +
          ""
        },


    };
    public Object[][] getContents() {
        return pmHelpBundlecontents;
    }
}
