(defproject test "0.1.0-SNAPSHOT"
  :description "Testing project layout for clojure"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                [clj-http "0.5.5"]]
  :main ^:skip-aot test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
