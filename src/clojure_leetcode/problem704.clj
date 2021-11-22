(ns clojure-leetcode.problem704)

;; ;; https://leetcode.com/problems/binary-search/
(defn binary-search-iter [nums target left right]
  (let [middle (int (/ (+ left right) 2.0))]
    (cond
      (<= (- right left) 1) nil
      (= (get nums middle) target) middle
      (> (get nums middle) target) (binary-search-iter nums target left middle)
      :else (binary-search-iter nums target middle right))))
(defn binary-search [nums target]
  (binary-search-iter nums target -1 (count nums)))