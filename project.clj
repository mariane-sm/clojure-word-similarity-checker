(defproject clojure-word-similarity-checker "0.1.0-SNAPSHOT"
  :description "Checks word similarity"
  :url "http://github.com/mariane-sm/clojure-word-similarity-checker"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot clojure-word-similarity-checker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
