import java.beans.PropertyChangeListener

class MasterController {
    def model
    def view

    void mvcGroupInit(Map args) {
        def updateMasterPanel = { cls ->
           cls.delegate = view.masterPanel
           view.masterPanel.with {
               cls()
               revalidate()
               repaint()
           }
        }
        model.details.addPropertyChangeListener({ e ->
            if (!(e instanceof groovy.util.ObservableMap.PropertyEvent)) return
            switch(e.type) {
                case ObservableMap.PropertyEvent.ADDED:
                    updateMasterPanel { add(e.newValue) }
                    break
                case ObservableMap.PropertyEvent.REMOVED:
                    updateMasterPanel { remove(e.oldValue) }
                    break
            }
        } as PropertyChangeListener)
    }

    def addDetail = { evt = null ->
        def mvcId = "detail"+ System.currentTimeMillis()
        createMVCGroup("detail", mvcId, [details: model.details, mvcId: mvcId])
    }
}
