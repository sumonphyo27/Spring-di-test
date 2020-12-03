package com.solt.demo.service;

import com.solt.demo.Reader.DbRecordReader;
import com.solt.demo.Writer.DbRecordWriter;
import com.solt.demo.backup.DbRecordBackup;
import com.solt.demo.bls.DbRecordProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class RecordService2 {
    @Autowired
    public RecordService2(DbRecordReader dbRecordReader, DbRecordWriter dbRecordWriter, DbRecordProcessor dbRecordProcessor, DbRecordBackup dbRecordBackup){
        System.out.println(getClass().getSimpleName() + "DbRecordReader = " + dbRecordReader + "\n" +
                getClass().getSimpleName() + "DbREcorderWriter = " + dbRecordWriter + "\n"+
                getClass().getSimpleName() + "DbRecordProcessor = " + dbRecordProcessor + "\n" +
                getClass().getSimpleName() + "DbRecordBackup = " + dbRecordBackup );
    }
}
