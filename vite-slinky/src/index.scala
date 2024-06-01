package myapp

import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._
@main
def App(): Unit =
  val container = dom.document.getElementById("app")

  ReactDOM.render(
    div(
      "Scala",
    ),
    container
  )

end App
