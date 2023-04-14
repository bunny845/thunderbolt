import com.github.music.of.the.ainur.almaren.Almaren
object Main extends LazyLogging {
  def main(args:Array[String]) : Unit={
    val data = spark.range(10)
    data.count();
    data.show();
  }
