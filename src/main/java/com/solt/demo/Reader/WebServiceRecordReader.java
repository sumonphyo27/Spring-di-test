package com.solt.demo.Reader;

import com.solt.demo.ds.Record;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.util.Collection;

@Component
@Priority(2) // the same
public class WebServiceRecordReader implements RecordReader {
    @Override
    public Collection<Record> readRecord() {

        return null;
    }
}
