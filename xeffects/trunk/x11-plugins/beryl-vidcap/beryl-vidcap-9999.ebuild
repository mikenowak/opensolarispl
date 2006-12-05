# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit subversion flag-o-matic autotools multilib

ESVN_REPO_URI="http://svn.gentoo-xeffects.org/beryl/trunk/${PN}"
ESVN_OPTIONS="--ignore-externals"

DESCRIPTION="Beryl Window Decorator Vidcap Plugin (svn)"
HOMEPAGE="http://beryl-project.org"
SRC_URI=""

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"
IUSE=""

DEPEND="=x11-plugins/beryl-plugins-9999
	x11-libs/seom"

S="${WORKDIR}/${PN}"
MAKEOPTS="${MAKEOPTS} -j1"

src_compile() {
	filter-ldflags -znow -z,now
	filter-ldflags -Wl,-znow -Wl,-z,now

	epatch "${FILESDIR}"/${PN}-makefile.patch

	emake || die "make failed"
}

src_install() {
	dodir /usr/share/beryl
	dodir /usr/$(get_libdir)/beryl
	make PREFIX="${D}/usr" LIBDIR="$(get_libdir)" install || die "make install failed"
}

pkg_postinst() {
	einfo "Please report all bugs to http://bugs.gentoo-xeffects.org"
	einfo "Thank you on behalf of the Gentoo XEffects team"
}
