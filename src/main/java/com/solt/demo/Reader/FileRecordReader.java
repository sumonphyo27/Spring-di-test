package com.solt.demo.Reader;

import com.solt.demo.ds.Record;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FileRecordReader implements RecordReader, Ordered {
    @Override
    public Collection<Record> readRecord() {
        return null;
    }

    @Override
    public int getOrder() { // the same
        return 3;
    }
}
