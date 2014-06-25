(ns test-library.core-test
  (:require [clojure.test :refer :all]
            [test-library.core :refer :all]))

(deftest problem1Test
  (is (=(problem1 1000) 233168)))
