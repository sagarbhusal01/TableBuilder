package io.github.sagarbhusal01;

class Config
{


    String Horizontal_Line="=";
    String Vertical_Line="┃";
    String Lower_Horizontal_Line="=";
    String Space=" ";
    int Margin=5;



    protected  String getHorizontal_Line() {
        return this.Horizontal_Line;

    }

    protected String getVertical_Line() {
        return this.Vertical_Line;
    }

    protected String getLower_Horizontal_Line() {

        return this.Lower_Horizontal_Line;
    }


    protected String getSpace() {
        return this.Space;
    }

    protected int getMargin() {
        return this.Margin;
    }
}
