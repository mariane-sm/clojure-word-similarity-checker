(ns clojure-word-similarity-checker.wordSimilarityChecker-test
  (:require [clojure.test :refer :all]
            [clojure-word-similarity-checker.wordSimilarityChecker :refer :all]))

(deftest same-word-is-similar
  (testing "Similar for two equal words"
    (is (= true (isSimilar "tomato" "tomato")))))

(deftest one-diffent-letter-is-similar
  (testing "Similar when only one different letter"
    (is (= true (isSimilar "tomato" "toXato")))))

(deftest one-letter-missing-is-similar
  (testing "Similar when only one letter is missing"
    (is (= true (isSimilar "tomat" "tomato")))))

(deftest one-extra-letter-is-similar
  (testing "Similar when there is one extra letter"
    (is (= true (isSimilar "tomato" "tomatoX")))))

(deftest two-different-letters-is-NOT-similar
  (testing "NOT similar when there is two different letters"
    (is (= false (isSimilar "toxxto" "tomato")))))

(deftest two-missing-letters-is-NOT-similar
  (testing "NOT Similar when it is missing two letters"
    (is (= false (isSimilar "tomato" "toma")))))

(deftest two-extra-letters-is-NOT-similar
  (testing "NOT Similar when there is two extra letters"
    (is (= false (isSimilar "tomato" "tomatoXX")))))

(deftest work-with-empty-strings
  (testing "Work with empty words"
    (is (= false (isSimilar "" "tomato")))))

;(deftest any-nil-is-NOT-similar
;  (testing "NOT Similar when there is a nil"
;    (is (= false (isSimilar "tomato" nil)))))

;(deftest one-letter-missing-is-similar
;  (testing "Similar when only one letter is missing"
;    (is (= true (isSimilar "tomato" "toato")))))

;(deftest one-extra-letter-is-similar
;  (testing "Similar when there is one extra letter"
;    (is (= true (isSimilar "tXomato" "tomato")))))