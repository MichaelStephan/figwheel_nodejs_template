(defproject figwheel_nodejs_template "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]]
  :profiles {:dev {:plugins [[lein-cljfmt "0.5.6"]]}}
  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-figwheel "0.5.10"]]
  :clean-targets ^{:protect false} ["target"]
  :cljsbuild {:builds [{:id "server-dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main figwheel4node-server.core
                                   :output-to "target/server_out/figwheel4node_server_with_figwheel.js"
                                   :output-dir "target/server_out"
                                   :target :nodejs
                                   :optimizations :none
                                   :source-map true}}
                        {:id "server-prod"
                         :source-paths ["src"]
                         :compiler {:main figwheel4node-server.core
                         :output-to "target/server_out/figwheel4node-server.core.js"
                         :target :nodejs
                         :optimizations :simple}}]}
    :figwheel {})
