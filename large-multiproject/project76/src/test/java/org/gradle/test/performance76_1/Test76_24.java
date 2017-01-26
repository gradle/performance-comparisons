package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_24 {
    private final Production76_24 production = new Production76_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}