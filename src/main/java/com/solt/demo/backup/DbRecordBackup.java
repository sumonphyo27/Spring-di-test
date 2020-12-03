package com.solt.demo.backup;

import com.solt.demo.ds.Record;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DbRecordBackup implements RecordBackup {
    @Override
    public void backupRecord(Collection<Record> records) {

    }
}
