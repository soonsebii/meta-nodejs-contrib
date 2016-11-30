DESCRIPTION = "A Node.js BLE (Bluetooth Low Energy) central module."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=461a4d93dce2e9cff358d977ec302364"

SRC_URI = "https://github.com/sandeepmistry/noble/archive/v${PV}.tar.gz;name=src"
SRC_URI[src.md5sum] = "e26aad98c9ccf9ba6f0634430bbbfbc1"
SRC_URI[src.sha256sum] = "529831bf9a76ceba24d9b6e5a0c8d4c96e1b42022024b5acd4cb26177910b9ba"

do_configure() {
	:
}

# QA issues error out if you remove do_package_qa()
# non -staticdev package contains static .a library: ... usb.a
do_package_qa() {
	:
}

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

PACAKGES += "${PN}"
RDEPENDS_${PN} = "nodejs libudev bash"

inherit npm-install-global
