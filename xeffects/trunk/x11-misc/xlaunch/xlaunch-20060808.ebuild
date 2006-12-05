# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: 

DESCRIPTION="Bash script to launch programs on different displays."
SRC_URI="http://distfiles.gentoo-xeffects.org/xlaunch/${P}.tar.bz2"

KEYWORDS="-*"
RDEPEND=""
DEPEND=""

S=${WORKDIR}

src_install() {
	dobin xlaunch
}

pkg_postinst() {
	ewarn
	ewarn "Use this script at your own risk."
	ewarn "Visit http://forums.gentoo.org/viewtopic-p-3467798.html for more details."
	ewarn
}
