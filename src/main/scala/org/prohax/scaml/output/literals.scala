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
      <p>
        You are
        <span class='red'>{ 20 + 5 }</span>
        years old.
      </p>
      <p>
        And
        { 6 * 30.5 }
        cm tall.
      </p>
      <p>
        Counting to three:
        <ul>
          { (1 to 3).map(i =>
            <li>{ i }</li>
          ) }
        </ul>
      </p>
    </div>
  }
}