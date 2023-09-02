package io.github.sagarbhusal01;

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
