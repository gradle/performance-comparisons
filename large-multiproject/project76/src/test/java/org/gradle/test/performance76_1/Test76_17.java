package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_17 {
    private final Production76_17 production = new Production76_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}