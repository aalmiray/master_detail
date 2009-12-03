application(title:'master',
  size:[320,320],
  location:[50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {
    borderLayout()
    button(constraints: NORTH, text: "Add detail", actionPerformed: controller.addDetail)
    scrollPane(constraints: CENTER) {
        panel(id: "masterPanel") {
            gridLayout(cols:1, rows: 0)
        }
    }
}
