package com.solt.demo.Reader;

import com.solt.demo.ds.Record;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Order(1) // the same
public class SocketRecordReader implements RecordReader{
    @Override
    public Collection<Record> readRecord() {
        return null;
    }
}
