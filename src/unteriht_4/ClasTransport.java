package unteriht_4;

public class ClasTransport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

//ЕСТЬ КОНСТРУКТОРЫ ПО УМОЛЧАНИЮ (КОНСТРУКТОР КАК МЕТОД!)
// ЧТО БЫ К НЕМУ ДОСТУЧАТЬСЯ НАДО СОЗДАТЬ МОДИФИКАТОР ДОСТУПА
// не нужно указывать (не надо указывать возвращаемый тип int или void)сразу название!
// должны указать то же самое public ClasTransport() что и в 3 стр
    public ClasTransport(float _speed, int _weight, String _color, byte[] _coordinate) {  // конструктор по умолчанию
// если нам нужно подкл к базе данных (прописываем тут код) Join to DB и sout
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());
    }

    public ClasTransport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ".Color: " + this.color;
        String infoCoordinates = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;  //
    }
}
