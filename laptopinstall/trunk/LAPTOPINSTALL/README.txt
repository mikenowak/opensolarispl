
3/29/2006

Plik docbook.dtd w tym katalogu to najnowsza wersja DocBook 5.0 DTD 
pobrana ze strony: http://docbook.org/xml/5.0b3/dtd/docbook.dtd

W tej wersji DTD zmieniono kilka rzeczy i mogą one powodować błedy. Są to:

- Wszystkie wystąpienia słowa EMPTY zamknięte były w nawiasy okrągłe, które teraz 
zostały usunięte (na przykład <!ELEMENT colspec (EMPTY)> to teraz  
<!ELEMENT colspec EMPTY> )

- Podelement info elemtu tabela jest teraz opcjonalny (info?), jego podelementy 
title|titleabbrev są teraz OR zamiast oba wymagane, podelement textobject 
przekształcono w * zmiast wymagane, a także podelement indexterm przekształcono 
w * zamiast wymagane

Jeśli zmiany nie są poprawne, następna wersja narzędzia powinna je poprawic. 
Proszę też zauważyć, że od wersji DocBook 5 zmiany specyfikacji będą uaktualnianie 
w zależności od potrzeb.


