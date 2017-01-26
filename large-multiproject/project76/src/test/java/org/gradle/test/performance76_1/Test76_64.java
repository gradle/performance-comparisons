package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_64 {
    private final Production76_64 production = new Production76_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}