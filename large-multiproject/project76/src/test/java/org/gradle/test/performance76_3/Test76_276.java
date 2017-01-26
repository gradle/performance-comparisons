package org.gradle.test.performance76_3;

import static org.junit.Assert.*;

public class Test76_276 {
    private final Production76_276 production = new Production76_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}