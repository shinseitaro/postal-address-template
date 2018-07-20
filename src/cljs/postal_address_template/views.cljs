(ns postal-address-template.views
  (:require
   [re-frame.core :as re-frame]
   [postal-address-template.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
