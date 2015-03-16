(ns sesame_seed.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [sesame_seed.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'sesame_seed.core-test))
    0
    1))
