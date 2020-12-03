package com.solt.demo.Writer;

import com.solt.demo.ds.Record;

import java.util.Collection;

public interface RecordWriter {
    void writeRecord(Collection<Record> records);
}
