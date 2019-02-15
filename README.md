[![Build Status](https://travis-ci.com/SpokeyWheeler/jdbc.svg?branch=master)](https://travis-ci.com/SpokeyWheeler/jdbc)[![CodeFactor](https://www.codefactor.io/repository/github/spokeywheeler/csdk/badge)](https://www.codefactor.io/repository/github/spokeywheeler/csdk)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/528c661837544724aa227c6b222d605a)](https://app.codacy.com/app/Zinaida/jdbc)

Role Name
=========

jdbc

Requirements
------------

You need Informix install media and licenses

Role Variables
--------------

Defaults:

*   jdbc_base_path: Starting point for all product installs - multiple versions can be installed
*   jdbc_install_path: Target path for install
*   jdbc_tmp_path: Working directory - will be removed
*   jdbc_version_previously_installed: false 

Vars:

*   vendor: hcl or ibm
*   jdbc_version: version number in full, e.g. 4.10.JC12W1 
*   force_jdbc_install: false or true
*   source_location_of_jdbc_media: Either a path like "</tmp/installs>" or a URL like "<https://artifactory.com/media/hcl/informix/jdbc/4.10.JC12W1>"

Dependencies
------------

None.

Example Playbook
----------------

I expect an inventory group for jdbc in the inventory file. This isn't really needed for this, but it will be needed when I eventually get around to integrating this into an all-encompassing cluster build.

```yaml
- hosts: jdbc
  become: true

  roles:
    - { role: jdbc }
```

License
-------

MIT

Author Information
------------------

<https://github.com/SpokeyWheeler>
