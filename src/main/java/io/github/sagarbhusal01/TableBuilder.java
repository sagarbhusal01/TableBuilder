package io.github.sagarbhusal01;

import io.github.sagarbhusal01.AllBuilders.ListingAll.ListAll;
import io.github.sagarbhusal01.AllBuilders.ListingAll.ListAllWithHeader;
import io.github.sagarbhusal01.AllBuilders.ListingAll.ListAllWithID;
import io.github.sagarbhusal01.AllBuilders.Tables.TwoColumnTable;
import io.github.sagarbhusal01.AllBuilders.Tables.TwoColumnTableWithID;

import java.util.HashMap;

public class TableBuilder {

    public void ListAll(String[] DataList)
    {
        new ListAll(DataList);
    }
    public void ListAllWithID(String[] DataList)
    {
        new ListAllWithID(DataList);
    }
    public void ListAllWithHeader(String[] DataList,String HeaderName)
    {
        new ListAllWithHeader(DataList,HeaderName);
    }

    public void TwoColumnTable(HashMap<String,String> MappedDataList,String ColumnOneHeader,String ColumnTwoHeader)
    {
        new TwoColumnTable( MappedDataList, ColumnOneHeader, ColumnTwoHeader);
    }
    public void TwoColumnTableWithID(HashMap<String,String> MappedDataList,String ColumnOneHeader,String ColumnTwoHeader)
    {
        new TwoColumnTableWithID( MappedDataList, ColumnOneHeader, ColumnTwoHeader);
    }


}
