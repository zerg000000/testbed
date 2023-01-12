# Testbed

Just make [rebel-readline](https://github.com/bhauman/rebel-readline) could be installed as Clojure Tools

To install, in terminal

```shell
clojure -Ttools install io.github.zerg000000/testbed '{:git/sha "..."}' :as testbed
```

Sometime we might just want a enriched REPL for trying some simple expressions or a new library

```shell
clojure -Ttestbed repl
```

```clojure
; try some fn
=> (range 1 1000)
(1 2 3 ...)
; try a new lib
=> (add-libs '{com.brunobonacci/where {:mvn/version "RELEASE"}})
=> (require '[where.core :refer [where]])
=> (filter (where < 5) (range 10))
(0 1 2 3 4)
; to know more about rebel-readline
=> :repl/help
; to quit
=> :repl/quit
```