SUMMARY = "simple test application recipe"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://mytest.c"


S = "${WORKDIR}/build"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    ${CC} -o mytest ${WORKDIR}/mytest.c 
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/mytest ${D}${bindir}
}
