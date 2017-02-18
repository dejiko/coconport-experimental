SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
COMPATIBLE_MACHINE = "(sun4i|sun5i|sun7i)"

inherit kernel

require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux.inc

# Pull in the devicetree files into the rootfs
RDEPENDS_kernel-base += "kernel-devicetree"

# Default is to use stable kernel version
# If you want to use latest git version set to "1"
#DEFAULT_PREFERENCE = "-1" 

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"
	

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.xz;name=kernel \
           file://defconfig \
           file://sun5i-q8-disable-otg_4.8.patch \
           file://sun5i-q8-gsl1680.patch \
"

S = "${WORKDIR}/linux-${PV}"

SRC_URI[kernel.md5sum] = "b1f36e650857dd0d49b9a55b89d9d317"
SRC_URI[kernel.sha256sum] = "74744e00420856cfc8049fa3b3a55e57a116994226a498ef56801bc9492df36b"

