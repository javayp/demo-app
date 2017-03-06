package com.dap.service;

import com.dap.model.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ME on 3/6/2017.
 */
@Service
public class DataService {

    public List<Data> getLatestData(){
        Data firstDay=new Data("1","First day Records");
        Data secondDay=new Data("2","Second day Records");
        Data thirdDay=new Data("3","Third day Records");

        List<Data> dataList=new ArrayList<>();
        dataList.add(firstDay);
        dataList.add(secondDay);
        dataList.add(thirdDay);

        return dataList;
    }
}
