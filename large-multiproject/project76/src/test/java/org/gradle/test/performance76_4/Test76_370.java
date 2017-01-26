package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_370 {
    private final Production76_370 production = new Production76_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}