package myapp

import org.scalajs.dom

import japgolly.scalajs.react.*
import japgolly.scalajs.react.vdom.html_<^.*

@main
def App(): Unit =
  val container = dom.document.getElementById("app")

  val Component = ScalaFnComponent
    .withHooks[Unit]
    .useState(0)
    .render((props, count) => {
      <.div(
        <.div(
          "I ❤️ Scala"
        )
      )
    })

  ReactDOMClient.createRoot(container).render(Component())

end App
