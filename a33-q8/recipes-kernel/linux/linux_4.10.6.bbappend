FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://defconfig \
"

COMPATIBLE_MACHINE = "a33-q8-1024x600"

require recipes-kernel/linux/linux-mainline-sunxi.inc

