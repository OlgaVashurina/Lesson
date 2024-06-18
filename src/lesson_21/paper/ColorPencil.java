package lesson_21.paper;
/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class ColorPencil extends Pencil{
    private String color = "Black";

    @Override
    public void draw(String figure) {
        System.out.println("Рисую цветным карандашом (цвет: " + color + ") " + figure);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
