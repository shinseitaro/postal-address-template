(ns postal-address-template.events
  (:require
   [re-frame.core :as re-frame]
   [postal-address-template.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
