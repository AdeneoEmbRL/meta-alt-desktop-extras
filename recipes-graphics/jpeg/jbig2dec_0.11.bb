DESCRIPTION = "Decoder implementation of the JBIG2 image compression format"
HOMEPAGE = "http://jbig2dec.sourceforge.net/"
SECTION = "libs"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

BBCLASSEXTEND = "native"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/jbig2dec/${BPN}-${PV}.tar.gz"

inherit autotools

PACKAGES =+ "jbig2dec-tools "
FILES_${PN}-tools = "${bindir}/*"

SRC_URI[md5sum] = "1f61e144852c86563fee6e5ddced63f1"
SRC_URI[sha256sum] = "7e2d8330b36f2765da22043d174827bee0f30db8d78c330904f363275c7dd0b9"
