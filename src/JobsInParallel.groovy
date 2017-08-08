package org.sample

class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.batchFile "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}
