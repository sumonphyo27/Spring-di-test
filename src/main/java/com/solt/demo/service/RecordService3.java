package com.solt.demo.service;

import com.solt.demo.Reader.DbRecordReader;
import com.solt.demo.bls.DbRecordProcessor;
import com.solt.demo.non_bean.RecordHash;
import com.solt.demo.non_bean.RecordUtil;
import com.solt.demo.non_bean.RecordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordService3 {

    @Autowired
    private  RecordService3(DbRecordReader dbRecordReader, DbRecordProcessor dbRecordProcessor,
                                   Optional<RecordHash>RecordHash , @Nullable RecordUtil recordUtil
                            ){
        System.out.println( getClass().getSimpleName() + "recordReader = "+ dbRecordReader +"\n" +

                getClass().getSimpleName() + "recordProcessor = " + dbRecordProcessor + "\n" +

                getClass().getSimpleName() + "recordHash = " + RecordHash + "\n" +
                getClass().getSimpleName() + "recordUtil = " + recordUtil + "\n"
                );

    }

    @Autowired(required = false)
    public void setRecordReader(DbRecordProcessor dbRecordProcessor, @Nullable RecordUtil recordUtil){
        System.out.println(getClass().getSimpleName() + " DbREcordProcessor = " + dbRecordProcessor +"\n"+
                getClass().getSimpleName() + " REcord Util = " + recordUtil );
    }
}
