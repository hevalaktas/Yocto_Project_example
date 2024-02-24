SUMMARY = "A small mylayer image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "packagegroup-mylayer-bbb"
IMAGE_INSTALL += "packagegroup-core-ssh-openssh"
IMAGE_INSTALL += "mytest"

LICENSE = "MIT"

IMAGE_FSTYPES = "tar.xz ext3 wic"

inherit core-image
