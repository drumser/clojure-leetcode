(ns clojure-leetcode.problem1929)

;; https://leetcode.com/problems/concatenation-of-array/
(defn concatenate-of-array [arr] 
  (concat arr arr))
;; (assert (= (run [1 2 1]) [1 2 1 1 2 1]))
;; (assert (= (run [1 3 2 1]) [1 3 2 1 1 3 2 1]))> 