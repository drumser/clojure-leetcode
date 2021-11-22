(ns clojure-leetcode.problem704-test
  (:require
   [clojure.test :refer [deftest is]]
   [clojure-leetcode.problem704 :as p704]))

(deftest test-cases
  (is (= (p704/binary-search [1 5 15 25 30 55 60 70 80 100 150 188 199 200 257 300 560 700] 150) 10))
  (is (= (p704/binary-search [1 5 15 25 30 55 60 70 80 100 150 188 199 200 257 300 560 700] 1) 0))
  (is (= (p704/binary-search [1 5 15 25 30 55 60 70 80 100 150 188 199 200 257 300 560 700] 3) nil)))