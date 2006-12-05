# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $
inherit cvs eutils gnome2

DESCRIPTION="New Gnome Menu Replacement"

SRC_URI=""

ECVS_SERVER="anoncvs.gnome.org:/cvs/gnome"
ECVS_MODULE="gnome-main-menu"
ECVS_AUTH="pserver"
ECVS_USER="anonymous"
ECVS_PASS=""

S="${WORKDIR}/${ECVS_MODULE}"

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"
IUSE="doc"

RDEPEND=">=net-misc/networkmanager-0.6.3
	>=net-dns/avahi-0.6.10
	>=dev-lang/mono-1.1.10
	>=sys-apps/dbus-0.30
	>=gnome-base/libgtop-2.14.1
	>=sys-apps/hal-0.5.7-r3"

DEPEND="${RDEPEND}
	>=sys-devel/autoconf-2.53
	>=sys-devel/automake-1.9
	>=sys-devel/libtool-1.4.3
	>=dev-libs/glib-2.2.0
	>=dev-util/intltool-0.25.0
	>=dev-util/pkgconfig-0.14
	>=dev-util/gtk-doc-1.0
	doc? (
		app-doc/doxygen
		dev-util/gtk-doc
		mono? ( >=dev-util/monodoc-1.1.8 )
	)
	gnome-base/gnome-common"

src_unpack() {
	cvs_src_unpack
	cd "${S}"

	gnome2_omf_fix
	epatch "${FILESDIR}"/${PN}-control_center.patch

	if ! use doc ; then
		epatch "${FILESDIR}"/${PN}-doc_check.patch
	fi
}

src_compile() {
	eautoreconf || die "eautoreconf failed"
	gnome2_src_compile
}
