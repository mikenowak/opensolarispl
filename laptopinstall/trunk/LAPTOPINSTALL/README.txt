
3/29/2006

The docbook.dtd file located in this directory is the latest version of 
the DocBook 5.0 DTD obtained from here:
http://docbook.org/xml/5.0b3/dtd/docbook.dtd

A few things have been changed on this DTD which may be in error. They are:

- All places where the keyword EMPTY was used have had the surrounding 
parenthesis removed (i.e. <!ELEMENT colspec (EMPTY)> is now 
<!ELEMENT colspec EMPTY> )

- The table element has had its info sub-element made optional (info?), its
title|titleabbrev sub-elements made into OR instead of each required, its 
textobject sub-element made into * instead of required, and its indexterm 
sub-element made into * instead of required

If these changes are not correct than a subsequent version of this tool shall 
correct them. Also note that as the DocBook 5 specification changes updates will
occur accordingly.


