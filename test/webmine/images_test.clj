(ns webmine.images-test
 (:use clojure.test
       webmine.images))
(comment
(deftest extract-hw-test
  (let [s "height: 500px; width: 376px;"]
    (is (= [500 376]
	   (ints (extract-hw s)))))))