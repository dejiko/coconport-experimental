SUMMARY = "gslx68x driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit module

SRC_URI = "git://github.com/onitake/gslx680-acpi.git;protocol=https;branch=master \
           file://makefile.patch"
SRCREV = "667efcef2fa1fa6b24cd043ccb33b4a86a304ee6"

S = "${WORKDIR}/git"


#do_install(){
#	install -d ${D}/lib/modules/${KERNEL_VERSION}
#	install -d ${D}${bindir}
#	install -m 644 ${B}/bin/ar.ko ${D}/lib/modules/${KERNEL_VERSION}/
#	cp -f ${S}/bin/ar_* ${D}${bindir}/ 
#}

#FILES_${PN} += "${bindir}/"

