public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    private String getMake(){
        return make;
    }

    private String getModel(){
        return model;
    }

    private int getYear(){
        return year;
    }

    public void setMake(String make){
        if(make != null && !make.isEmpty()){
            this.make = make;
        } else {
            System.out.println("Марка не может быть пустой.\n");
        }
    }


    public void setModel(String model){
        if(model != null && !model.isEmpty()){
            this.model = model;
        } else {
            System.out.println("Модель не может быть пустой.\n");
        }
    }

    public void setYear(int year){
        if(year < 1970 || year > 2024){
            System.out.println("Некорректный год выпуска \n");
        }else{
            this.year = year;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void accelerate(int increment){
        if (increment < 0){
            System.out.println("Ускорение не должно быть отрицательным \n");
        }else {
            speed = speed + increment;
            System.out.println("Автомобиль ускорился на " + increment + "\n");
        }
    }

    public void brake(int decrement){
        if(decrement < 0){
            System.out.println("Торможение не должно быть отрицательным \n");
        }else{
            speed = speed - decrement;
            System.out.println("Автомобиль замедлился на " + decrement + "\n");
        }
    }

    public void printCarInfo() {
        System.out.println("Марка: " + getMake());
        System.out.println("Модель: " + getModel());
        System.out.println("Год выпуска: " + getYear());
        System.out.println("Текущая скорость: " + getSpeed() + "\n");
    }
}
