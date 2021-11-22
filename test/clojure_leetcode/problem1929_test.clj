(ns clojure-leetcode.problem1929-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-leetcode.problem1929 :as puzzle]))

(deftest test-cases
  (is (= (puzzle/concatenate-of-array [1 2 1]) [1 2 1 1 2 1]))
  (is (= (puzzle/concatenate-of-array [1 3 2 1]) [1 3 2 1 1 3 2 1])))