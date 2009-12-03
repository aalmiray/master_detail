application {
    title='Master'
    startupGroups = ['master']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "detail"
    'detail' {
        model = 'DetailModel'
        view = 'DetailView'
        controller = 'DetailController'
    }

    // MVC Group for "master"
    'master' {
        model = 'MasterModel'
        controller = 'MasterController'
        view = 'MasterView'
    }
}
