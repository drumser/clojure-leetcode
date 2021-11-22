(ns clojure-leetcode.problem2011)

;; https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
(defn perform-operations [operations]
  (reduce (fn [acc item]
            (cond
              (or (= item "++X") (= item "X++")) (inc acc)
              (or (= item "--X") (= item "X--")) (dec acc))) 0 operations))