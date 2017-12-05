(ns bob
  (:require clojure.string)
  )

(defn response-for [saying]
  (cond
    (clojure.string/blank? saying) "Fine. Be that way!"
    (re-find #"(?x)^[[A-Z]+[\W\d]*]*[A-Z]+[[A-Z]+[\W\d]*]*$" saying) "Whoa, chill out!"
    (re-find #"^[\w\W\s]+\?$" saying) "Sure."
    :else "Whatever."))