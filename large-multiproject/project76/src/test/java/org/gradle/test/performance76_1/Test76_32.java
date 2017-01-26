package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_32 {
    private final Production76_32 production = new Production76_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}