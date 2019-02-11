Role Name
=========

informix-jdbc

Requirements
------------

You need Informix install media and licenses

Role Variables
--------------

Defaults:

jdbc_base_path: Starting point for all product installs - multiple versions can be installed
jdbc_install_path: Target path for install
jdbc_tmp_path: Working directory - will be removed

Vars:

vendor: hcl or ibm
jdbc_version: version number in full, e.g. 4.10.FC12W1 
force_jdbc_install: false or true
jdbc_version_previously_installed: false # probably should be a default
source_location_of_jdbc_media: Either a path like "/tmp/installs" or a URL like "https://artifactory.com/media/hcl/informix/jdbc/4.10.FC12W1"

Dependencies
------------

None.

Example Playbook
----------------

TBA:

    - hosts: servers
      roles:
         - { role: username.rolename, x: 42 }

License
-------

MIT

Author Information
------------------

https://github.com/SpokeyWheeler
