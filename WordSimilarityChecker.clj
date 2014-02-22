
(defn haveAllowedQuantityOfExtraLetters [word1 word2]
  (if (.contains word1 word2)
    (isQuantityOfDifferentLettersAcceptable word1 word2 1)
    (if (.contains word2 word1)
      (isQuantityOfDifferentLettersAcceptable word2 word1 1) false)))

(defn isQuantityOfDifferentLettersAcceptable [word1 word2 maxNumberOfDifferentLetters]
  (<= (- (count word1) (count word2)) maxNumberOfDifferentLetters))

(defn compareSameSizeWordEqualityLetterByLetter [word1 word2]
  (map (fn [letterWord1 letterWord2] 
         (= letterWord1 letterWord2)) (seq word1) (seq word2)))

(defn areSameSizeWordsSimilar [word1 word2]
  (<= (- 
        (count (compareSameSizeWordEqualityLetterByLetter word1 word2))
        (count (filter true? (compareSameSizeWordEqualityLetterByLetter word1 word2)))) 
      1))
  
(defn isSimilar [word1 word2]
  (if (= 
        (count word1) 
        (count word2)) 
    (areSameSizeWordsSimilar word1 word2) 
    (haveAllowedQuantityOfExtraLetters word1 word2)))

