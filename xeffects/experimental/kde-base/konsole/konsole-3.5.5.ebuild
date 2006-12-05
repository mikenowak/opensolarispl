# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: /var/cvsroot/gentoo-x86/kde-base/konsole/konsole-3.5.5.ebuild,v 1.6 2006/11/16 03:40:13 josejx Exp $

KMNAME=kdebase
MAXKDEVER=$PV
KM_DEPRANGE="$PV $MAXKDEVER"
inherit kde-meta eutils

SRC_URI="${SRC_URI}
	mirror://gentoo/kdebase-3.5-patchset-03.tar.bz2"

DESCRIPTION="X terminal for use with KDE."
KEYWORDS="~alpha amd64 ~ia64 ppc ~ppc64 sparc x86 ~x86-fbsd"
IUSE="transparency"

RDEPEND="
	|| ( (
			x11-libs/libX11
			x11-libs/libXext
			x11-libs/libXrender
			x11-libs/libXtst
		) <virtual/x11-7 )"

DEPEND="${RDEPEND}
	|| ( x11-apps/bdftopcf <virtual/x11-7 )"

# For kcm_konsole module
RDEPEND="${RDEPEND}
	kde-base/kcontrol"

if use transparency ; then
	PATCHES="${FILESDIR}/${P}-transparency.patch"
fi
