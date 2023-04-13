import com.github.music.of.the.ainur.almaren.Almaren
object Main extends LazyLogging {
  val almaren = Almaren("App Name")
  val spark = almaren.spark.master("local[*]").config("spark.sql.shuffle.partitions", "1").getOrCreate()
  def main(args:Array[String]) : Unit={
    val data = spark.range(10)
    data.count();
    data.show();
  }
