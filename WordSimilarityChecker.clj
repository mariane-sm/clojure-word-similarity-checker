


(defn haveAllowedQuantityOfExtraLetters [word1 word2]
  (if (.contains word1 word2)
    (if (<= (- (count word1) (count word2)) 1) true false)
    (if (.contains word2 word1)
      (if (<= (- (count word2) (count word1)) 1) true false) )))  

(defn compareSameSizeWordEqualityLetterByLetter [word1 word2]
  (map (fn [letterWord1 letterWord2] (= letterWord1 letterWord2)) (seq word1) (seq word2)))

(defn areSameSizeWordsSimilar [word1 word2]
  (<= (- 
        (count (compareSameSizeWordEqualityLetterByLetter word1 word2))
        (count (filter true? (compareSameSizeWordEqualityLetterByLetter word1 word2)))) 
      1))
  
(defn isSimilar [word1 word2]
  (if (= (count word1) (count word2)) 
    (areSameSizeWordsSimilar word1 word2) 
    (haveAllowedQuantityOfExtraLetters word1 word2)))

