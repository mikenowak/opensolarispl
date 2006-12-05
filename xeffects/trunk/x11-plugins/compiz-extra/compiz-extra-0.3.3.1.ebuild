# Copyright 1999-2006 Gentoo Foundation
# Distributed under the terms of the GNU General Public License v2
# $Header: $

inherit gnome2

DESCRIPTION="Compiz extra plugins"
HOMEPAGE="http://www.go-compiz.org"
SRC_URI="http://gandalfn.club.fr/ubuntu/compiz-extra/${PN}-${PV}.tar.bz2"
LICENSE="X11"
SLOT="0"
KEYWORDS="~amd64 ~ppc ~x86"
IUSE="3d animation bench border bs copacity crashhandler dock group miniwin neg put showdesktop state trailfocus wallpaper widget"

DEPEND=">=x11-wm/compiz-0.3.2"

src_compile() {
	gnome2_src_compile \
	$(use_enable 3d 3d-plugin) \
	$(use_enable animation animation-plugin) \
	$(use_enable bench bench-plugin) \
	$(use_enable border border-plugin) \
	$(use_enable bs bs-plugin) \
	$(use_enable copacity copacity-plugin) \
	$(use_enable crashhandler crashhandler-plugin) \
	$(use_enable group group-plugin) \
	$(use_enable neg neg-plugin) \
	$(use_enable put put-plugin) \
	$(use_enable showdesktop showdesktop-plugin) \
	$(use_enable state state-plugin) \
	$(use_enable trailfocus trailfocus-plugin) \
	$(use_enable widget widget-plugin) \
	$(use_enable wallpaper wallpaper-plugin) \
	$(use_enable dock dock-plugin) \
	$(use_enable miniwin miniwin-plugin)
}
