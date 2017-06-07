FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://defconfig \
"

COMPATIBLE_MACHINE = "a13-q8"

require recipes-kernel/linux/linux-mainline-sunxi.inc

