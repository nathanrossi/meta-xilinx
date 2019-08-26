# Add MicroBlaze Patches (only when using MicroBlaze)
FILESEXTRAPATHS_append_microblaze := "${THISDIR}/gcc-9.2:"
SRC_URI_append_microblaze = " file://microblaze-all.patch "
