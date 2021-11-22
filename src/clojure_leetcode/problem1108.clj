(ns clojure-leetcode.problem1108
  (:require [clojure.string :as str]))

;; ;; https://leetcode.com/problems/defanging-an-ip-address/
(defn defanging-an-ap-address [ipaddr]
  (str/join "[.]" (str/split ipaddr #"\.")))
