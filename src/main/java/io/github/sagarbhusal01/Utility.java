package io.github.sagarbhusal01;

import java.util.HashMap;
import java.util.Map;

  class Utility {
    //
//
//
    Config config=new Config();
    String Horizontal_Line =config.getHorizontal_Line();
    String Lower_Horizontal_Line=config.getLower_Horizontal_Line();
    int Margin=config.getMargin();
//
//
//

      protected void TopHorizontalLine(int Row_Length)
    {
        for (int i = 0; i < Row_Length; i++) {
            if(i==0)
            {
                System.out.print("\n");
                System.out.print(Horizontal_Line);

            } else if(i==Row_Length-1)
            {
                System.out.print(Horizontal_Line);
                System.out.print("\n");

            }
            else
            {
                System.out.print(Horizontal_Line);
            }


        }
    }
      protected void BottomHorizontalLine(int Row_Length)
    {

        for (int i = 0; i <Row_Length; i++) {
            System.out.print(Lower_Horizontal_Line);
        }
    }

      protected void HeaderBottomHorizontalLine(int Row_Length)
    {
        for (int i = 0; i <Row_Length; i++) {
            if(i==Row_Length-1)
            {
                System.out.print(Horizontal_Line);
                System.out.print("\n");

            }
            else {
                System.out.print(Horizontal_Line);
            }
        }
    }
      protected int Find_The_Greatest_length_of_an_Array(String[] DataList)
    {
        String longestName = DataList[0];

        for (String name : DataList) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        return longestName.length();
    }

      protected int CompareDataListAndHeaderName(String[] DataList,String HeaderName)
    {
        return Math.max(Find_The_Greatest_length_of_an_Array(DataList), HeaderName.length());
    }
      protected void PrintMargin(int Margin)
    {
        for (int i = 0; i < Margin; i++) {
            System.out.print(" ");
        }
    }



      protected int CompareMappedDatalistKeyAndColumnOneHeader(
            HashMap<String,String> MappedDataList,
            String ColumnOneHeader
    )
    {
        String LongestName="";

        for(Map.Entry<String, String> entry: MappedDataList.entrySet()) {
            if(entry.getKey().length()>LongestName.length())
            {
                LongestName=entry.getKey();
            }
        }
        return Math.max(LongestName.length(),ColumnOneHeader.length());

    }
      protected int CompareMappedDatalistValueAndColumnTwoHeader(
            HashMap<String,String> MappedDataList,
            String ColumnTwoHeader
    )
    {
        String LongestName="";

        for(Map.Entry<String, String> entry: MappedDataList.entrySet()) {
            if(entry.getValue().length()>LongestName.length())
            {
                LongestName=entry.getValue();
            }
        }
        return Math.max(LongestName.length(),ColumnTwoHeader.length());
    }


}