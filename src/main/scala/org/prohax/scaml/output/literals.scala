package org.prohax.scaml.output

import scala.xml._
import org.prohax.scaml.ScamlFile

object literals extends ScamlFile {
  def renderXml() = {
    <div>
      <h1>Test.</h1>
      <p>
        Welcome, Mr
        <span class='bold'>Boldfase</span>
      </p>
    </div>
  }
}