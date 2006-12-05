# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit subversion flag-o-matic autotools

ESVN_REPO_URI="http://svn.gentoo-xeffects.org/beryl/trunk/${PN}"

DESCRIPTION="Beryl Window Decorator Dbus Plugin (svn)"
HOMEPAGE="http://beryl-project.org"
SRC_URI=""

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"
IUSE=""

DEPEND="=x11-plugins/beryl-plugins-9999
	sys-apps/dbus"

S="${WORKDIR}/${PN}"
MAKEOPTS="${MAKEOPTS} -j1"

src_compile() {
	filter-ldflags -znow -z,now
	filter-ldflags -Wl,-znow -Wl,-z,now

	eautoreconf || die "eautoreconf failed"
	glib-gettextize --copy --force || die

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
