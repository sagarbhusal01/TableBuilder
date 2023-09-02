package io.github.sagarbhusal01;

import java.util.HashMap;
import java.util.Map;

  class TwoColumnTableWithID {
      protected TwoColumnTableWithID(HashMap<String,String> MappedDataList, String ColumnOneHeader, String ColumnTwoHeader) {




//      ultimate Goal


//                  =====================================================
//                  ┃          ID         ┃     Data                    ┃
//                  =====================================================
//                  ┃ 1. ┃     four       ┃     what's up ladies!       ┃
//                  ┃ 2. ┃     One        ┃     hello boys!!            ┃
//                  ┃ 3. ┃     Three      ┃     hello Girls             ┃
//                  ┃ 4. ┃     Two        ┃     hello Girls kbv         ┃
//                  ┃ 5. ┃     five       ┃     hello again!            ┃
//                  ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔

//
//
//

//      every variable declaration must be done here.
//
        Utility utils=new Utility();
        Config config =new Config();
        String Vertical_Line= config.getVertical_Line();
        int Margin=config.getMargin();
        int ID=1;

//
//      The SpaceNeeded_For_ColumnOne is calculated by comparing the MappedDataList's key and the ColumnOneHeader
//      the method  called from the utils will return number of length which the largest String Data have
//
        int SpaceNeeded_For_ColumnOne=utils.CompareMappedDatalistKeyAndColumnOneHeader(MappedDataList,ColumnOneHeader);
//
//
//      The SpaceNeeded_For_ColumnTwo is calculated by comparing the MappedDataList's value and the ColumnTwoHeader
//      the method  called from the utils will return number of length which the largest String Data have
//
        int SpaceNeeded_For_ColumnTwo= utils.CompareMappedDatalistValueAndColumnTwoHeader(MappedDataList,ColumnTwoHeader);
//
//
//
//       The Row_Length gives the value needed to iterate a String of Horizontal_Line for the given number of time.
//       the value is calculated as :
//        SpaceNeeded_For_ColumnOne is the space taken by column one
//        SpaceNeeded_For_ColumnTwo is the space taken by column two
//        Margin*4 is the total number of time the Margin is used in a single row
//        3 is the space used by the border in a row
//        5 is the amount of space required by ID column
//
        int Row_Length= ((SpaceNeeded_For_ColumnOne+SpaceNeeded_For_ColumnTwo)+Margin*4)+3+5;
//
//
//
        System.out.println("\n");
        utils.TopHorizontalLine(Row_Length);
        System.out.print(Vertical_Line);
//
//
//

        utils.PrintMargin(Margin+5);
        System.out.print(ColumnOneHeader);
        utils.PrintMargin((SpaceNeeded_For_ColumnOne)-(ColumnOneHeader.length())+ Margin);
//
//
//
        System.out.print(Vertical_Line);
//
//
//
        utils.PrintMargin(Margin);
        System.out.print(ColumnTwoHeader);
        utils.PrintMargin(((SpaceNeeded_For_ColumnTwo)-(ColumnTwoHeader.length())+Margin));
//
//
//
        System.out.println(Vertical_Line);
//
//
//
        utils.HeaderBottomHorizontalLine(Row_Length);
//
//
//
        for (Map.Entry<String ,String> entry:MappedDataList.entrySet())
        {
//
//
//

            System.out.print(Vertical_Line+" "+ID+". "+Vertical_Line);
            ID++;


//
//
//            "" (SpaceNeeded_For_ColumnOne)-(entry.getKey().length())+ Margin ""
//            calculates the space required for the Data with the longest String length so that
//            it can have the ""Margin"" amount of margin on the right side of it.
//
//
            utils.PrintMargin(Margin);
            System.out.print(entry.getKey());
            utils.PrintMargin((SpaceNeeded_For_ColumnOne)-(entry.getKey().length())+ Margin);
//
//
//
            System.out.print(Vertical_Line);
//
//
//
            utils.PrintMargin(Margin);
            System.out.print(entry.getValue());
            utils.PrintMargin(((SpaceNeeded_For_ColumnTwo)-(entry.getValue().length())+Margin));
//
//
//
            System.out.println(Vertical_Line);
//
//
//
        }
//
//
//
        utils.BottomHorizontalLine(Row_Length);
//
//
//


    }
}
