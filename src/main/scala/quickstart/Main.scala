package quickstart

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    Myhtt4squickstartServer.stream[IO].compile.drain.as(ExitCode.Success)
}