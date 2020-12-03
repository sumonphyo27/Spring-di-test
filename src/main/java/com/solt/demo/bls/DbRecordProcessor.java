package com.solt.demo.bls;

import com.solt.demo.ds.Record;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class DbRecordProcessor implements RecordProcessor {
    @Override
    public Collection<Record> processRecord(Collection<Record> records) {
        return Collections.emptyList();
    }
}
