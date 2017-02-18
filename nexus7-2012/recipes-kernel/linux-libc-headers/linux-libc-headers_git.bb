require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

# Mark archs/machines that this kernel supports
#COMPATIBLE_MACHINE = "grouper"

SRC_URI = " \
  git://github.com/shr-distribution/linux.git;protocol=git;branch=grouper/3.1/master \
"

S = "${WORKDIR}/git"

SRCREV = "0bc115f0e3511c09becce80b044e9b6271955d28"

KV = "3.1.10"
PV = "${KV}+gitr${SRCPV}"

