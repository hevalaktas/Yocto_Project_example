
SUMMARY = "nInvaders is a Space Invaders clone based on ncurses for ASCII output"
HOMEPAGE = "https://nInvaders.sourceforge.net/"
SECTION = "games"
SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BPN}-${PV}.tar.gz"
SRC_URI = "https://yer.dl.sourceforge.net/project/ninvaders/ninvaders/0.1.1/ninvaders-0.1.1.tar.gz"

DEPENDS = "ncurses (>= 5.2)"


do_compile() {
    oe_runmake CC="${CC}" 
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 nInvaders ${D}${bindir}
}