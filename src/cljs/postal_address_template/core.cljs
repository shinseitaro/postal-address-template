(ns postal-address-template.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [postal-address-template.events :as events]
   [postal-address-template.views :as views]
   [postal-address-template.config :as config]
   ))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
