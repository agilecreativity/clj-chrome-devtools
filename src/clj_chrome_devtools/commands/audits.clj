(ns clj-chrome-devtools.commands.audits
  "Audits domain allows investigation of page violations and possible improvements."
  (:require [clj-chrome-devtools.impl.define :refer [define-domain]]))
(define-domain "Audits")