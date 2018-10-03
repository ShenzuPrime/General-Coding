#lang racket
(define (make-seg-list x y)
  (if (>= x y) (car (cons x y)) (cons x (make-seg-list(+ x 1)y)))) ; function 1

(make-seg-list 1 5)
(make-seg-list 5 1)

(define (make-whole-list x) (make-seg-list 1 x)) ;funciton 2

(make-whole-list 5)
(make-whole-list 3)

(define (list-length x) (length x)) ;function 3

(list-length (list 1 2 3 4))
(list-length (list))

(define (concat-list x y) ; function 4
      (if (null? x) y
          (if (null? y) x
              (cons (car x)(concat-list (cdr x)y)))))
      
(concat-list (list 1 2 3) (list 4 5 6))
(concat-list (list 5 4 3) (list 2 1 0))

(define (merge x y) (sort (concat-list x y)<)) ;function 5

(merge (list 1 5 9) (list 2 6 10))
(merge (list 6 10 20) (list 7 11 21))
