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



Dependencies
------------

None.

Example Playbook
----------------

Including an example of how to use your role (for instance, with variables passed in as parameters) is always nice for users too:

    - hosts: servers
      roles:
         - { role: username.rolename, x: 42 }

License
-------

MIT

Author Information
------------------

https://github.com/SpokeyWheeler
