include pmu-firmware.inc

XILINX_RELEASE_VERSION = "v2017.3"
SRCREV = "3c9f0cfde9307c2dc1a298f9f22d492601232821"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI_append = " \
		file://zynqmp_pmufw-pm_binding.c-Enable-embedding-of-PMU-Co.patch \
		"
