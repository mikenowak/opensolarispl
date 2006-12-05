# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit eutils

DESCRIPTION="Gnome Macmenu Applet"
HOMEPAGE="http://aquila.deus.googlepages.com"
SRC_URI="http://distfiles.gentoo-xeffects.org/${PN}/${P}.tar.bz2"
RESTRICT="nomirror"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="~x86 ~amd64"
IUSE=""

DEPEND=">=x11-libs/gtk+-2.8.20-r1
	>=gnome-base/gconf-2
	x11-libs/libwnck"

S="${WORKDIR}/${PN}"

pkg_setup() {
	if ! built_with_use x11-libs/gtk+ macmenu ; then
		echo
		eerror "Please rebuild x11-libs/gtk+ with USE=\"macmenu\""
	fi
}

src_unpack() {
	unpack "${A}"

	cd "${S}"
	epatch "${FILESDIR}"/${PN}-location.patch
}

src_compile() {
	cd "${S}"
	gcc -std=c99 -Wall -Werror -fno-strict-aliasing -DFOR_GNOME `pkg-config --cflags --libs gconf-2.0 libwnck-1.0 libpanelapplet-2.0` ${CFLAGS} ${LDFLAGS} -o gnome-macmenu-applet macmenu-applet.c || die "make failed"
}

src_install() {
	exeinto /usr/libexec
	doexe gnome-macmenu-applet
	insinto /usr/lib/bonobo/servers
	doins GNOME_MacMenuApplet.server
}
