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
lein npm install
```
Normally you need to run this command only once you set up your clojurescript/ nodejs environment or whenever you change the nodejs dependencies.

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
