import cwinter.codecraft.core.api._
import org.scalajs.dom.html
import scala.scalajs.js.annotation.JSExport


@JSExport
object Main {
  @JSExport
  def run(canvas: html.Canvas): Unit = {
    TheGameMaster.canvas = canvas
    TheGameMaster.runLevel1(new exampleai.Mothership)
  }
}

