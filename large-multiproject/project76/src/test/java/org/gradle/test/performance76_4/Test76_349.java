package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_349 {
    private final Production76_349 production = new Production76_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}