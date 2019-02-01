UBOOT_VERSION = "v2018.01"
XILINX_RELEASE_VERSION = "v2018.3"

UBRANCH ?= "master"

SRCREV ?= "d8fc4b3b70bccf1577dab69f6ddfd4ada9a93bac"

include u-boot-xlnx.inc
include u-boot-spl-zynq-init.inc

SRC_URI_append_kc705-microblazeel = " file://microblaze-kc705-Convert-microblaze-generic-to-k.patch"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=6;md5=157ab8408beab40cd8ce1dc69f702a6c"

# u-boot-xlnx has support for these
HAS_PLATFORM_INIT ?= " \
		avnet_ultra96_rev1_config \
		zynq_microzed_config \
		zynq_zed_config \
		zynq_zc702_config \
		zynq_zc706_config \
		zynq_zybo_config \
		xilinx_zynqmp_zcu102_rev1_0_config \
		xilinx_zynqmp_zcu106_revA_config \
		xilinx_zynqmp_zcu104_revC_config \
		xilinx_zynqmp_zcu100_revC_config \
		xilinx_zynqmp_zcu111_revA_config \
		xilinx_zynqmp_zc1275_revA_config \
		xilinx_zynqmp_zc1275_revB_config \
		xilinx_zynqmp_zc1254_revA_config \
		"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " file://0001-arm64-zynqmp-Remove-WDT-for-ultra96.patch "

