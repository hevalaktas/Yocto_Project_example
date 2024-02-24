require ninvaders.inc

LICENSE = "GPLV1"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"
SRC_URI[md5sum] = "97b2c3fb082241ab5c56ab728522622b"
SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/${BPN}-${PV}.tar.gz"

DEPENDS = "ncurses (>= 5.2)"



do_compile() {
    oe_runmake CC="${CC}" ${CFLAGS} ${LDFLAGS} -o ${S}/ninvaders
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 nInvaders ${D}${bindir}
}