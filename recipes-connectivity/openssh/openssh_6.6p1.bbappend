FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


SRC_URI += "file://sshd.busybox-init \
            file://sshd.conf \
"


do_install_append() {
    install -d ${D}${sysconfdir}/init.d ${D}${sysconfdir}/ssh
    install -T -m 0755 ${WORKDIR}/sshd.busybox-init ${D}${sysconfdir}/init.d/sshd

    if [ "${@base_contains('DISTRO_FEATURES', 'pam', 'pam', '', d)}" = "pam" ]; then
        install -T -m 0644 ${WORKDIR}/sshd.conf ${D}${sysconfdir}/ssh/sshd_config
    fi
}

