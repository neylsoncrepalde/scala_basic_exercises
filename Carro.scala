import java.io._

class Carro(val model:String, val poten:Int) {
  val modelo:String = model
  val potencia:Int = poten
  var velocidade:Int = 0

  def acelerar() {
    velocidade += potencia
    println("Acelerando...")
  }

  def frear() {
    if (velocidade == 0) {
      velocidade = 0
    }
    else {
      velocidade -= potencia
    }
    println("Freando...")
  }

  def getVelocidade() {
    println("A velocidade do " + modelo + " é " + velocidade)
  }
}

object Corrida {
  def main(args: Array[String]) {
    val c1 = new Carro("Meriva", 7)
    val c2 = new Carro("Mercedes", 10)

    c1.getVelocidade()
    c2.getVelocidade()

    c1.acelerar()
    c2.acelerar()

    c1.getVelocidade()
    c2.getVelocidade()

    c1.acelerar()
    c2.acelerar()

    c1.getVelocidade()
    c2.getVelocidade()

    c1.frear()
    c1.frear()
    c1.frear()

    c1.getVelocidade()
    c2.getVelocidade()
  }
}
