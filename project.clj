(defproject viebel/abbinare "1.10.597"
  :description "core.match for self-hosted ClojureScript"

  :jvm-opts ^:replace ["-Xmx512m" "-server"]

  :test-paths ["src/test/clojure"]
  :source-paths ["src/main/clojure"]

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.analyzer.jvm "0.6.5"]
                 [org.clojure/clojurescript "1.10.597" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.1.8"] ]

  :cljsbuild
  {:builds
   [{:id "test"
     :source-paths ["src/test/cljs"]
     :compiler {:output-to "out/test.js"
                :static-fns true
                :optimizations :simple}}
    {:id "test-adv"
     :source-paths ["src/test/cljs"]
     :compiler {:output-to "out/test.js"
                :optimizations :advanced}}]})
