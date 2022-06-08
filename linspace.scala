
class Linspace(val start: Double, val end: Double) {
  val len = (end - start)

  def left(n: Int): IndexedSeq[Double] = lala(n, 0)
  def center(n: Int): IndexedSeq[Double] = lala(n, 0.5)
  def right(n: Int): IndexedSeq[Double] = lala(n, 1)

  def lala(n: Int, factor: Double): IndexedSeq[Double] = {
    for (i <- 0 until n) yield start + (i + factor)*len/n
  }
}
