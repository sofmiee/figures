public class krug {
    private double radius;//private - поле не может быть доступно напрямую из других классов

    public krug (double radius) { //private - поле не может быть доступно напрямую из других классов
        if (radius < 0) {
            throw new IllegalArgumentException("There is no figure with such parameters");
        } else {
            this.radius = radius; //присваиваем текущий экземпляр класса
        }
    }
    public double radius() { //возвращает текущее значение радиуса
        return radius;
    }
    public double area() { //возвращает площадь круга
        return Math.PI * radius * radius;
    }
    public double perimeter() { //возвращает периметр
        return 2 * Math.PI * radius;
    }
}