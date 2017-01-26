package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_341 {
    private final Production76_341 production = new Production76_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}