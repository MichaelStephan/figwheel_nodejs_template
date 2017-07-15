Introduction
======
The intention of this small project is optimizing the project bootstrapping process. Within a few moments one is possible to have a node project based upon:

* clojurescript
* nodejs
* figwheel integration
* vim integration

Usage
------

### Initial
```
./bootstrap.sh
```
Normally you need to run this command only once as it sets up your clojurescript/ nodejs environment.

### from cmd-line
```
lein repl
```

### from repl
```
(use 'figwheel-sidecar.repl-api)
(start-figwheel!)
```

from vim
-----
```
:Piggieback (figwheel-sidecar.repl-api/repl-env)
```
