class DetailController {
    def model
    def view
    private mvcId
    private details

    void mvcGroupInit(Map args) {
        mvcId = args.mvcId
        details = args.details 
        model.value = mvcId
        details[mvcId] = view.detailPanel
    }

    def close = { evt = null ->
        destroyMVCGroup(mvcId)
        details.remove(mvcId)
    }
}
