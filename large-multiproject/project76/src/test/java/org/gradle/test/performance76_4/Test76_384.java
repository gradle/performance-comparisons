package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_384 {
    private final Production76_384 production = new Production76_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}