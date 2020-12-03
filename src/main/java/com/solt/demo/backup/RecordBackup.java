package com.solt.demo.backup;

import com.solt.demo.ds.Record;

import java.util.Collection;

public interface RecordBackup {
    void backupRecord(Collection<Record> records);
}
