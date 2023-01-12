(ns testbed.alpha.api
  (:require [rebel-readline.clojure.main :as main]
            [rebel-readline.core :as core]))

(defn repl
  "Open a rebel-readline REPL. `add-libs` is already preloaded.
   User could use `(add-libs '{com.example/lib {:mvn/version \"RELEASE\"}})` to start testing any library"
  [_]
  (core/ensure-terminal
   (main/repl* 
    {:init (fn []
             (require '[clojure.tools.deps.alpha.repl :refer [add-libs]]))})))