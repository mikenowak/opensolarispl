# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit kde

DESCRIPTION="KDE Wine KIO Slave"
HOMEPAGE="http://kwine.sourceforge.net/"
SRC_URI="mirror://sourceforge/kwine/kio_wine-${PV}.tar.gz"
RESTRICT="nomirror"
LICENSE="GPL"
SLOT="0"
KEYWORDS="~x86"
IUSE=""
DEPEND=">=kwinetools-0.1"
RDEPEND="${DEPEND}"

need-kde 3.4
