(ns clojure-leetcode.problem1480)

;; ;; https://leetcode.com/problems/running-sum-of-1d-array/
(defn running-sum-of-1d-array
  ([nums] (running-sum-of-1d-array nums [] 0))
  ([nums result acc]
   (if
    (= (first nums) nil) result
    (let [item (+ acc (first nums))]
      (recur (next nums) (conj result item) item)))))