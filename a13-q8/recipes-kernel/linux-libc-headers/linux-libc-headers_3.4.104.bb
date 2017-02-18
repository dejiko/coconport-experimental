# for sunxi
require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

SRCREV_pn-${PN} = "d47d367036be38c5180632ec8a3ad169a4593a88"

SRC_URI = "git://github.com/linux-sunxi/linux-sunxi.git;branch=sunxi-3.4;protocol=git \
        file://0001-compiler-gcc5.patch \
        file://0002-use-static-inline-in-ARM-ftrace.patch \
        file://0001-gcc5-fixes.patch \        
"

S = "${WORKDIR}/git"
