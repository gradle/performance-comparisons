package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_16 {
    private final Production76_16 production = new Production76_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}