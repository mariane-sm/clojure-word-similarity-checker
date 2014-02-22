(ns clojure-word-similarity-checker.core
  (:use [clojure-word-similarity-checker.wordSimilarityChecker]))

(defn -main
  [word1 word2 & args]
  (if (isSimilar word1 word2)
    (println "Similar Words")
    (println "Not similar Words")))
