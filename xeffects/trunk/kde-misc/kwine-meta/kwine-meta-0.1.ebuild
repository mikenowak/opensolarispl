# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

DESCRIPTION="KDE Wine - Meta Package"
HOMEPAGE="http://kwine.sourceforge.net/"
RESTRICT="nomirror"
LICENSE="GPL"
SLOT="0"
KEYWORDS="~x86"
IUSE=""
DEPEND=">=kde-misc/kwinetools-0.1
		>=kde-misc/kio_wine-0.1
		>=kde-misc/kwine-0.1
		>=kde-misc/kwinedcop-0.1
		>=kde-misc/kfile_wine-0.1
		>=kde-misc/kwine_startmenu-0.1"
RDEPEND="${DEPEND}"
