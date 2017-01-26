package org.gradle.test.performance76_2;

import static org.junit.Assert.*;

public class Test76_113 {
    private final Production76_113 production = new Production76_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}