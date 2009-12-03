panel(id: "detailPanel") {
    gridLayout(cols: 1, rows: 2)
    label(text: bind{ model.value })
    button(text: "Close", actionPerformed: controller.close)
}
