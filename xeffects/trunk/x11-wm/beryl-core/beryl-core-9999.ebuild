# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit subversion autotools

ESVN_REPO_URI="http://svn.gentoo-xeffects.org/beryl/trunk/${PN}"

DESCRIPTION="Beryl window manager for AiGLX and XGL (svn)"
HOMEPAGE="http://beryl-project.org"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"
IUSE=""

DEPEND=">=x11-base/xorg-server-1.1.1-r1
	>=x11-libs/gtk+-2.8.0
	x11-libs/libXdamage
	x11-libs/libXrandr
	x11-libs/libXcomposite 
	x11-libs/startup-notification"

RDEPEND="${DEPEND}
	x11-apps/xdpyinfo"

PDEPEND="~x11-plugins/beryl-plugins-${PV}"

S="${WORKDIR}/${PN}"
MAKEOPTS="${MAKEOPTS} -j1"

src_unpack() {
	# Unpack beryl-core
	subversion_src_unpack

	# Unpack beryl-mesa
	S="${S}/beryl-mesa"
	ESVN_REPO_URI="http://svn.gentoo-xeffects.org/beryl/trunk/beryl-mesa"
	subversion_src_unpack
}

src_compile() {
	eautoreconf || die "eautoreconf failed"
	glib-gettextize --copy --force || die "glib-gettextize failed"
	intltoolize --automake --copy --force || die "intltoolize failed"

	econf --with-berylmesadir=beryl-mesa || die "econf failed"
	emake || die "make failed"
}

src_install() {
	make DESTDIR="${D}" install || die "make install failed"
}

pkg_postinst() {
	einfo "Please report all bugs to http://bugs.gentoo-xeffects.org"
	einfo "Thank you on behalf of the Gentoo XEffects team"
}
