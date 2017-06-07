SUMMARY = "q8-hardware manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://q8-hardwaremgr.c;beginline=4;endline=14;md5=5d4b12b12a74633938423e86c0532669"

inherit module

SRC_URI = "git://github.com/jwrdegoede/q8-hardwaremgr.git;protocol=https;branch=master \
           file://Makefile.patch"
SRCREV = "cd492b3fa8720e13e3d5dc676f04edf8c534f008"

S = "${WORKDIR}/git"

do_install_append(){
	install -d ${D}/etc/modules-load.d/
	echo "q8-hardwaremgr" > ${B}/q8-hardwaremgr.conf
	install -m 644 ${B}/q8-hardwaremgr.conf ${D}/etc/modules-load.d/q8-hardwaremgr.conf
}

#FILES_${PN} += "${bindir}/"

#export KDIR="${STAGING_KERNEL_DIR}/include"

COMPATIBLE_MACHINE = "(a13-q8|a33-q8-1024x600)"
