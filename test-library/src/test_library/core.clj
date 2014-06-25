(ns test-library.core)

(defn problem1 [n1]
   (reduce + (filter #(zero?  (min(mod % 3) (mod % 5))) (range 1 n1)))
  )

(problem1 10000)

