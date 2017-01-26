package org.gradle.test.performance76_4;

import static org.junit.Assert.*;

public class Test76_354 {
    private final Production76_354 production = new Production76_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}