#lang racket
(define (factorial n)
  (if (= n 0)
      1
      (* n (factorial (- n 1)))))
(factorial 3)
(factorial 6)
(factorial 0)