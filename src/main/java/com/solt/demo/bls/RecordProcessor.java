package com.solt.demo.bls;

import com.solt.demo.ds.Record;

import java.util.Collection;

public interface RecordProcessor {
    Collection<Record> processRecord(Collection<Record> records);
}
