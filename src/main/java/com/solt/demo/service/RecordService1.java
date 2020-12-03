package com.solt.demo.service;

import com.solt.demo.Reader.DbRecordReader;
import com.solt.demo.Writer.DbRecordWriter;
import com.solt.demo.backup.DbRecordBackup;
import com.solt.demo.bls.DbRecordProcessor;
import com.solt.demo.non_bean.RecordHash;
import com.solt.demo.non_bean.RecordUtil;
import com.solt.demo.non_bean.RecordValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

//@Service
public class RecordService1 {
    @Autowired
    public DbRecordReader dbRecordReader;
    @Autowired
    protected DbRecordBackup dbRecordBackup;
    @Autowired
    private DbRecordProcessor dbRecordProcessor;
    @Autowired
    DbRecordWriter dbrecordWriter;
    @Autowired//1
    private Optional<RecordHash> recordHash;
    @Autowired//2
    @Nullable
    private RecordUtil recoredUtil;
    @Autowired(required = false)//3
    private RecordValidator recordValidator;

    public RecordService1(){ // constructor
        System.out.println(getClass().getSimpleName() + "recordReader = "+ dbRecordReader +"\n" +
                getClass().getSimpleName() + "recordBackup = " + dbRecordReader + "\n" +
                getClass().getSimpleName() + "recordProcessor = " + dbRecordProcessor + "\n" +
                getClass().getSimpleName() + "recordWriter = " + dbrecordWriter + "\n" +
                getClass().getSimpleName() + "recordHash = " + recordHash + "\n" +
                getClass().getSimpleName() + "recordUtil = " + recoredUtil + "\n" +
                getClass().getSimpleName() + "recordValidator = "+ recordValidator + "\n");
    }

    @PostConstruct
    public void init(){
        System.out.println(getClass().getSimpleName() + "recordReader = "+ dbRecordReader +"\n" +
                getClass().getSimpleName() + "recordBackup = " + dbRecordBackup + "\n" +
                getClass().getSimpleName() + "recordProcessor = " + dbRecordProcessor + "\n" +
                getClass().getSimpleName() + "recordWriter = " + dbrecordWriter + "\n" +
                getClass().getSimpleName() + "recordHash = " + recordHash + "\n" +
                getClass().getSimpleName() + "recordUtil = " + recoredUtil + "\n" +
                getClass().getSimpleName() + "recordValidator = "+ recordValidator + "\n");

    }
}
