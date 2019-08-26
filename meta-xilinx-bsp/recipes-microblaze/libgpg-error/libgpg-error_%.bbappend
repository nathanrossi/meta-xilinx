
python () {
    if "microblaze" in d.getVar("MACHINEOVERRIDES").split(":"):
        bb.build.addtask("do_generate_lockobj", "do_compile", "do_configure", d)
}

inherit qemu

do_generate_lockobj[dirs] += "${B}"
do_generate_lockobj[depends] += "qemu-native:do_populate_sysroot"
do_generate_lockobj () {
    oe_runmake -C src gen-posix-lock-obj
    ${@qemu_wrapper_cmdline(d, d.getVar("RECIPE_SYSROOT"), [d.expand("${RECIPE_SYSROOT}${libdir}"), d.expand("${RECIPE_SYSROOT}${base_libdir}"),])} \
        ./src/gen-posix-lock-obj > ${S}/src/syscfg/lock-obj-pub.${TARGET_ARCH}-unknown-linux-gnu.h
}

