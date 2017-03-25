package com.ld.start;

import com.lmax.disruptor.EventHandler;

import java.util.concurrent.atomic.AtomicLong;

public class LongEventHandler implements EventHandler<LongEvent> {
    private AtomicLong atomicLong = new AtomicLong(0);

    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) {
        System.out.println("Event: " + event + " " + atomicLong.addAndGet(1));
    }
}