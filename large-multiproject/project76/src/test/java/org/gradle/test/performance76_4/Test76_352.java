package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_352 {
    private final Production76_352 production = new Production76_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}