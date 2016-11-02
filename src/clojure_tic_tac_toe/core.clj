(ns clojure-tic-tac-toe.core
  (:gen-class))

(def board [[:x :e :o]
            [:x :o :e]
            [:x :e :o]])
;literal
[1 2 3] 
{:name "Mike"}
'(1 2 3)
#{1 2 3}

;non literal
(vector 1 2 3)
(hash-map :name "Mike")
(list 1 2 3)
(hash-set 1 2 3)

(defn -main [& args]
  (let [[[a b c]
         [d e f]
         [g h i]] board
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [g e c])]
    (cond
      (contains? solutions [:x :x :x])
      (println "X has won!")
      (contains? solutions [:o :o :o])
      (println "O has won!")
      :else
      (println "Nobody won!"))))
             



















