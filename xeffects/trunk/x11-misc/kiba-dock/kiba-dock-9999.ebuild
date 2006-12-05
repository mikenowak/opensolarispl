# Copyright 1999-2006 Gentoo Foundation 
# Distributed under the terms of the GNU General Public License v2 
# $Header: $ 

inherit gnome2 cvs autotools

ECVS_SERVER="metascape.afraid.org:/cvsroot" 
ECVS_MODULE="kiba-dock" 
ECVS_LOCALNAME="kiba-dock" 

S=${WORKDIR}/${ECVS_LOCALNAME} 

DESCRIPTION="Kiba Dock" 
HOMEPAGE="http://forum.beryl-project.org/forum-17-kiba-dock" 
SRC_URI="" 
LICENSE="GPL" 
SLOT="0" 
KEYWORDS="-*" 
IUSE="glitz svg" 

DEPEND=">=x11-libs/gtk+-2.8
	>=dev-libs/glib-2.8
	gnome-base/gconf
	dev-util/glade
	dev-python/pygtk
	svg? ( gnome-base/librsvg )
	glitz? ( >=media-libs/glitz-0.4 )"

src_compile() {
	eautoreconf
	gnome2_src_compile $(use_enable glitz) $(use_enable svg)
}

pkg_postinst(){ 
	gnome2_pkg_postinst

	echo 
	einfo "To add launchers, run /usr/bin/populate-dock.sh" 
	einfo "or drag shortcuts (from gnome-menu for example) onto the dock" 
	echo 

	einfo "Please report all bugs to http://bugs.gentoo-xeffects.org"
	einfo "Thank you on behalf of the Gentoo XEffects team"
}

