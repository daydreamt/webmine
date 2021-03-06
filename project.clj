(defproject org.clojars.daydream/webmine "0.1.11-SNAPSHOT"
  :description "Web data mining library.

               Provides support for mining websites and newsfeeds."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [xerces/xercesImpl "2.9.1"]
                 [org.ccil.cowan.tagsoup/tagsoup "1.2"]
                 [xalan "2.7.1"]
                 [rome "0.9"]
		 [org.clojure/tools.logging "0.2.3"]                 
		 [clj-http "0.5.0"]
		 [clj-time "0.4.3"]
		[org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]
                     [lein-clojars "0.5.0"]]
  :repositories  {"apache" "https://repository.apache.org/content/repositories/releases/"}
  :plugins [[lein-swank "1.4.4"]])
