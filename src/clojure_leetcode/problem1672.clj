(ns clojure-leetcode.problem1672)

;; https://leetcode.com/problems/richest-customer-wealth/
(defn richest-customer-wealth [grid]
  (reduce #(max (reduce + %2) %1) 0 grid))