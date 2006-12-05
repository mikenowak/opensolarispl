# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

DESCRIPTION="Kiba Dock"
HOMEPAGE="http://www.compiz.net/viewtopic.php?pid=23137#p231372"
SRC_URI="http://distfiles.gentoo-xeffects.org/snapshots/${P}.tar.bz2
         http://distfiles.gentoo-xeffects.org/${PN}/kiba-populate.tar.bz2"
LICENSE="GPL"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE=""

S="${WORKDIR}/${PN}"

DEPEND="x11-libs/cairo
    x11-libs/gtk+
    dev-libs/glib
    gnome-base/gconf"

src_unpack() {
	unpack ${A}
	epatch "${FILESDIR}/kiba-dock-makefile.patch"
}

src_install() {
    dodir /usr/bin
    dodir /etc/gconf/schemas
    make install BINDIR=${D}/usr/bin SCHEMADIR=${D}/etc/gconf/schemas
 }

pkg_postinst() {
	GCONF_CONFIG_SOURCE=xml::/etc/gconf/gconf.xml.defaults gconftool-2 \
		--makefile-install-rule /etc/gconf/schemas/kiba.schemas

	if [ "`ps -A | grep gconfd-2`" ] ; then killall -HUP gconfd-2; fi
    
	echo
	einfo "For adding launchers u can run /usr/bin/populate-dock.sh"
	einfo "or u can drag Shortcuts (from gnome-menu for example) on the dock"
	echo
}

#pkg_prerm() {
#    GCONF_CONFIG_SOURCE=xml::/etc/gconf/gconf.xml.defaults gconftool-2 \
#    --makefile-uninstall-rule /etc/gconf/schemas/kiba.schemas
#    if [ "`ps -A | grep gconfd-2`" ] ; then killall -HUP gconfd-2; fi
#} 

