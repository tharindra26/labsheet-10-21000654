object q1 {
    def calculateAverage(temperaturesCelsius: List[Double]): Double = {
      val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9 / 5) + 32)
      val sumOfTemperatures = temperaturesFahrenheit.reduce((a, b) => a + b)
      val averageTemperature = sumOfTemperatures / temperaturesCelsius.length
      averageTemperature
    }

    def main(args: Array[String]): Unit = {
      val temperaturesCelsius = List(0.0, 10.0, 20.0, 30.0)
      val averageFahrenheit = calculateAverage(temperaturesCelsius)
      println(s"Average Fahrenheit temperature: $averageFahrenheit")
    }
}


