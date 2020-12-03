package com.solt.demo.Reader;

import com.solt.demo.ds.Record;

import java.util.Collection;

public interface RecordReader {
    Collection<Record> readRecord();
}
