(ns clojure-leetcode.problem1672-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-leetcode.problem1672 :as p1672]))

(deftest test-cases
  (is (= (p1672/richest-customer-wealth [[1 2 3] [3 2 1]]) 6))
  (is (= (p1672/richest-customer-wealth [[1 5] [7 3] [3 5]]) 10))
  (is (= (p1672/richest-customer-wealth [[2 8 7] [7 1 3] [1 9 5]]) 17)))