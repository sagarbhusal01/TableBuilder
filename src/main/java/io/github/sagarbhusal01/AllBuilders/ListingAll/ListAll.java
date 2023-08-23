package io.github.sagarbhusal01.AllBuilders.ListingAll;

import io.github.sagarbhusal01.Utility.Config;
import io.github.sagarbhusal01.Utility.Utility;

public class ListAll
{
    public ListAll(String[] DataList ) {

        Utility utils = new Utility();
        Config config=new Config();

        String Vertical_Line= config.getVertical_Line();
        String Space=config.getSpace();
        int Margin=config.getMargin();


//
//        To find out how much space is form the right side needed for the content to be in center
//        we use  Find_The_Greatest_length_of_an_Array method created in the utility class
//        The function returns the length of the highest String of the array. The Return value alone doesn't
//        make any sense but when we use in the following calculation it will make sense.
//
        int SpaceNeeded=(utils.Find_The_Greatest_length_of_an_Array(DataList));

//
//        The Row_Length gives the value needed to iterate a String of ""_"" for the given number of time.
//        The SpaceNeeded variable is used to calculate the space used by the Data of the array while (Margin*2) is
//        calculated as the spacing of both side the Data and 2 is the space used by the border.
//
        int Row_Length=SpaceNeeded+(Margin*2)+2;

//
//
//
//
        utils.TopHorizontalLine(Row_Length);
//
//
//
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


