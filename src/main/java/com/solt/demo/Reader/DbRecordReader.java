package com.solt.demo.Reader;

import com.solt.demo.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class DbRecordReader implements RecordReader{

    @Override
    public Collection<Record> readRecord() {
        return Collections.emptyList();
    }
}
