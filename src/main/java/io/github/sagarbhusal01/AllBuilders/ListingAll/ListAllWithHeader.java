package io.github.sagarbhusal01.AllBuilders.ListingAll;


import io.github.sagarbhusal01.Utility.Config;
import io.github.sagarbhusal01.Utility.Utility;

public class ListAllWithHeader {
    public ListAllWithHeader(String[] DataList,String HeaderName) {

//
//        All the object of the classes are created here!
//
        Utility utils = new Utility();
        Config config=new Config();

        String Vertical_Line= config.getVertical_Line();
        String Space=config.getSpace();
        int Margin=config.getMargin();

//
//
//      The SpaceNeeded calls   CompareDataListAndHeaderName method which returns the length
//        of the largest String among all the list of data and Header
//
        int SpaceNeeded= utils.CompareDataListAndHeaderName(DataList,HeaderName);
//
//        Row_length is the calculated integer value after considering all the space
//        that the table can take.
//
        int Row_Length=SpaceNeeded+(Margin*2)+2;
//
//
//
//        Creates a horizontal Line above the Header
        utils.TopHorizontalLine(Row_Length);
//
//
//        Creates a verical Line so that a box can be generated for header
        System.out.print(Vertical_Line);
//
//
//        Creates a necessary space between the Header and Left border
//        so that header is in the center
//

        for (int i = 0; i < Margin; i++) {
            System.out.print(Space);
        }

//
//
//
        System.out.print(HeaderName);
//
//
//        calculated and create the necessary space between the right border and Header
//
        for (int i = 0; i < SpaceNeeded-HeaderName.length()+Margin; i++) {
            System.out.print(Space);
        }
//
//
//
        System.out.println(Vertical_Line);




//  The following code are the exact copy of ListAll method but with differently calculated value
        utils.HeaderBottomHorizontalLine(Row_Length);


        for (int i = 0; i < DataList.length; i++) {
//
//
            System.out.print(Vertical_Line);
//
//
//
//            For creating left side space inside the table . The Margin is used as a fixed spacing between data and the
//            border.
//
            for (int j = 0; j < Margin; j++) {
                System.out.print(Space);
            }
//
//            For Writing the data inside the table after the space is created. The Main loop is used to simply
//            iterate over the data
//
            System.out.print(DataList[i]);

//
//            For Creating the right side space after the Data is written so that a border can be placed making
//            the data in the center. The spaceNeeded -DataList[i].length() calculate the absolute point where the
//            Data with the largest String length ends while Margin is added to make sure the spacing between left and right
//            match properly
//
            for (int j = 0; j < (( SpaceNeeded) - DataList[i].length())+Margin; j++) {
                System.out.print(Space);
            }
            System.out.println(Vertical_Line);

        }
//
        utils.BottomHorizontalLine(Row_Length);
//


    }
}

