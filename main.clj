
(defn hello-world
  ;; print hello world for started
  []
  (println "Hello World!")
  )

(defn sum
  ;; The method is for computing conciliation rectangle
  [x, y]
  (println(* x y))
  )

(defn sum-without-argument
  ;; define variable
  []
  (def x 12)
  (def y 12)
  (println(+ x y))
  )


(defn Example []
  ;; The below code declares a integer variable
  (def x 1)

  ;; The below code declares a float variable
  (def y 1.25)

  ;; The below code declares a string variable
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1)
  )


(defn Example []
   ;; The below code declares a Boolean variable with the name of status
   (def status true)
   
   ;; The below code declares a Boolean variable with the name of STATUS
   (def STATUS false)
   
   ;; The below code declares a variable with an underscore character.
   (def _num1 2))
(Example)

(defn operator[]
  (println(+ 1 2))
  (println(* 2 3))
  (println(/ 4 2))
  (println(- 6 2))
  )



(defn Example []
   (def x 5)
   (def y 5.25)
   (println (type x))
   (println (type y)))
(Example)


;; This program displays Hello World
(defn Example []
   (loop [i 0]
      (when (< i 5)
      (println i)
      (recur (inc i)))))
(Example)

(defn PrintHelloWorldInLoop []
    (loop [i 0]
      (when (< i 10)
        (println "HelloWorld!")
        (recur (inc i))
        )
      )
  )
(PrintHelloWorldInLoop)

;; This program displays Hello World
(defn Example []
   (with-open [rdr (clojure.java.io/reader "Example.txt")]
   (reduce conj [] (line-seq rdr))))
(Example)