inherit subversion multilib

ESVN_REPO_URI="svn://neopsis.com/big/svn/seom/trunk"

DESCRIPTION="seom video capturing library"
HOMEPAGE="http://neopsis.com/projects/seom"
SRC_URI=""

LICENSE="GPL-2"
SLOT="0"
KEYWORDS="-*"

RDEPEND="x11-base/xorg-server"

S="${WORKDIR}/trunk"

src_compile() {
	epatch "${FILESDIR}"/${PN}-as-needed.patch

        emake || die "emake failed"
}

src_install() {
        make PREFIX="${D}/usr" LIBDIR="$(get_libdir)" install || die "make installed failed"
}

pkg_postinst() {
	einfo "Please report all bugs to http://bugs.gentoo-xeffects.org"
	einfo "Thank you on behalf of the Gentoo XEffects team"
}
