package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*


@main
def App(): Unit =
  val container = dom.document.getElementById("app")
  render(
    container,
    div(
      "I ❤️ Scala",
    )
  )
end App
