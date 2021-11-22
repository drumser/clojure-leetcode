(ns clojure-leetcode.problem2011-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-leetcode.problem2011 :as p2011]))

(deftest test-cases
  (is (= (p2011/perform-operations (list "++X" "X++" "X++" "X--")) 2))
  (is (= (p2011/perform-operations (list "--X" "X++" "X++")) 1))
  (is (= (p2011/perform-operations (list "++X" "++X" "X++")) 3))
  (is (= (p2011/perform-operations (list "X++" "++X" "--X" "X--")) 0)))


