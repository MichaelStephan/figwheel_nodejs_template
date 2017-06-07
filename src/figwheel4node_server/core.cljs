(ns ^:figwheel-always figwheel4node-server.core
  (:require [cljs.nodejs :as nodejs]))
(nodejs/enable-util-print!)
(println "Hello from the Node!")
(def -main (fn [] nil))
(set! *main-cli-fn* -main)
