(ns clojure-leetcode.problem1108-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-leetcode.problem1108 :as p1108]))

(deftest test-cases
  (is (= (p1108/defanging-an-ap-address "1.1.1.1") "1[.]1[.]1[.]1"))
  (is (= (p1108/defanging-an-ap-address "255.100.50.0") "255[.]100[.]50[.]0")))