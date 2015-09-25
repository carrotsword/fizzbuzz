(ns fizzbuzz.core)

(defn div? [v d] (zero? (mod v d)))

(defn daa [v]
  (cond
    (div? v 15) "FizzBuzz"
    (div? v 3) "Fizz"
    (div? v 5) "Buzz"
    :else v))

(defn fizzbuzz [len]
  (for [x (range 1 (inc len))] (daa x)))
       
          
