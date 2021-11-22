(ns clojure-leetcode.problem1480-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-leetcode.problem1480 :as p1480]))

(deftest test-cases
  (is (= (p1480/running-sum-of-1d-array [1 2 3 4]) [1 3 6 10]))
  (is (= (p1480/running-sum-of-1d-array [1 1 1 1 1]) [1 2 3 4 5]))
  (is (= (p1480/running-sum-of-1d-array [3 1 2 10 1]) [3 4 6 16 17])))