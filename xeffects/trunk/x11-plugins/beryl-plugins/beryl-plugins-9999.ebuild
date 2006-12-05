# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit subversion flag-o-matic autotools

ESVN_REPO_URI="http://svn.gentoo-xeffects.org/beryl/trunk/${PN}"

DESCRIPTION="Beryl Window Decorator Plugins (svn)"
HOMEPAGE="http://beryl-project.org"
SRC_URI=""

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"
IUSE="dbus vidcap"

DEPEND="=x11-wm/beryl-core-9999
	>=gnome-base/librsvg-2.14.0"

PDEPEND="dbus? ( =x11-plugins/beryl-dbus-9999 )
	vidcap? ( =x11-plugins/beryl-vidcap-9999 )"

S="${WORKDIR}/${PN}"
MAKEOPTS="${MAKEOPTS} -j1"

pkg_setup() {
	if ! built_with_use x11-libs/cairo glitz ; then
		einfo "Please rebuild cairo with USE=\"glitz\""
		die "x11-libs/cairo missing glitz support"
	fi
}

src_compile() {
	filter-ldflags -znow -z,now
	filter-ldflags -Wl,-znow -Wl,-z,now

	eautoreconf || die "eautoreconf failed"
	glib-gettextize --copy --force || die "glib-gettextize failed"
	intltoolize --automake --copy --force || die "intloolize failed"

	econf || die "econf failed"
	emake || die "make failed"
}

src_install() {
	make DESTDIR="${D}" install || die "make install failed"
}

pkg_postinst() {
	einfo "Please report all bugs to http://bugs.gentoo-xeffects.org"
	einfo "Thank you on behalf of the Gentoo XEffects team"
}
